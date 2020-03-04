package com.baiwazi.lucene;

import com.baiwazi.lucene.gateway.LuceneFunction;
import com.baiwazi.lucene.gateway.impl.DefaultLuceneGateway;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.WordlistLoader;
import org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.util.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;

/**
 * @ClassName LuceneWay
 * @Description: Lucene使用入口
 * @Author 阳香香
 * @Date 2020/3/3
 **/
public class LuceneWay<T> extends DefaultLuceneGateway implements LuceneFunction<T> {

    private String indexDir;

    private String stopwords;

    public LuceneWay() {
    }

    public LuceneWay(String indexDir) {
        this.indexDir = indexDir;
    }

    public LuceneWay(String indexDir, String stopwords) {
        this.indexDir = indexDir;
        this.stopwords = stopwords;
    }

    @Override
    public String addIndexDir() {
        return this.indexDir;
    }

    @Override
    public Analyzer addAnalyzer() {
        CharArraySet charArraySet = null;
        try {
            charArraySet = CharArraySet.unmodifiableSet(WordlistLoader.getWordSet(IOUtils
                    .getDecodingReader(SmartChineseAnalyzer.class, this.stopwords,
                            StandardCharsets.UTF_8)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new SmartChineseAnalyzer(charArraySet);
    }

    @Override
    public void insert(Function<List<T>, List<Document>> function, List<T> t) throws IOException {
        this.insert(function.apply(t));
    }

    @Override
    public void update(Function<List<T>, List<Document>> function, String primaryName, List<T> t) throws IOException {
        this.update(primaryName, function.apply(t));
    }

    @Override
    public void delete(Function<List<T>, List<Term>> function, List<T> t) throws IOException {
        this.delete(function.apply(t));
    }

    @Override
    public <E> TopDocs search(Function<E, Query> function, E e) throws IOException {
        return this.search(function.apply(e));
    }

    @Override
    public List<T> getDocument(Function<List<Document>, List<T>> function, List<Integer> primaryIds) throws IOException {
        List<Document> documents = this.getDocument(primaryIds);
        return function.apply(documents);
    }
}
