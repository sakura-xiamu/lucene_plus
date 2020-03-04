package com.baiwazi.lucene.gateway.impl;

import cn.hutool.core.util.StrUtil;
import com.baiwazi.lucene.gateway.LuceneGateway;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.*;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DefaultLuceneGateway
 * @Description:
 * @Author 阳香香
 * @Date 2020/3/3
 **/
public abstract class DefaultLuceneGateway implements LuceneGateway {

    // 创建使用的分词器
    private Analyzer analyzer;
    // 索引存放目录
    // 存放到文件系统中
    private Directory directory;
    // 创建索引写对象
    private IndexWriter indexWriter;
    // 创建索引读对象
    private IndexReader indexReader;

    // 请在本方法给我索引路径，不传使用默认路径
    public abstract String addIndexDir();

    public abstract Analyzer addAnalyzer();

    @Override
    public int insert(List<Document> documents) throws IOException {
        this.init();

        // 索引配置对象
        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(analyzer);
        indexWriter = new IndexWriter(directory, indexWriterConfig);
        indexWriter.addDocuments(documents);
        indexWriter.commit();

        this.close();
        return 0;
    }

    @Override
    public int update(String primaryName, List<Document> documents) throws IOException {
        this.init();

        // 索引配置对象
        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(analyzer);
        indexWriter = new IndexWriter(directory, indexWriterConfig);
        for (Document document : documents) {
            Term term = new Term(primaryName, document.get(primaryName));
            indexWriter.updateDocument(term, document);
            indexWriter.flush();
            indexWriter.commit();
        }

        this.close();
        return 0;
    }

    @Override
    public TopDocs search(Query query) throws IOException {
        this.init();

        // 索引读取器
        indexReader = DirectoryReader.open(directory);
        // 索引搜索器
        IndexSearcher indexSearcher = new IndexSearcher(indexReader);
        // 搜索，得到TopN的结果（结果中有命中总数，topN的scoreDocs（评分文档（文档id，评分）））
        TopDocs topDocs = indexSearcher.search(query, 10); // 前10条

        this.close();
        return topDocs;
    }

    @Override
    public int delete(List<Term> terms) throws IOException {
        this.init();

        // 索引配置对象
        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(analyzer);
        indexWriter = new IndexWriter(directory, indexWriterConfig);
        indexWriter.deleteDocuments(terms.toArray(new Term[terms.size()]));
        indexWriter.flush();
        indexWriter.commit();

        this.close();
        return 0;
    }

    @Override
    public List<Document> getDocument(List<Integer> primaryIds) throws IOException {
        this.init();

        indexReader = DirectoryReader.open(directory);
        IndexSearcher indexSearcher = new IndexSearcher(indexReader);

        List<Document> documents = new ArrayList<>();
        for (Integer primaryId : primaryIds) {
            Document document = indexSearcher.doc(primaryId);
            documents.add(document);
        }

        this.close();
        return documents;
    }

    private void init() throws IOException {
        analyzer = this.addAnalyzer();
        if (analyzer == null) {
            analyzer = new SmartChineseAnalyzer();
        }
        String indexDir = this.addIndexDir();
        if (StrUtil.isBlank(indexDir)) {
            indexDir = INDEX_PATH;
        }
        directory = FSDirectory.open((new File(indexDir)).toPath());
    }

    private void close() throws IOException {
        if (indexWriter != null) {
            indexWriter.close();
        }
        if (indexReader != null) {
            indexReader.close();
        }
        if (analyzer != null) {
            analyzer.close();
        }
        if (directory != null) {
            directory.close();
        }
    }
}
