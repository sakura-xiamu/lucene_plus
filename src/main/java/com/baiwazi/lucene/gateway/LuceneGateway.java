package com.baiwazi.lucene.gateway;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName LuceneGateway
 * @Description: lucene入口操作
 * @Author 阳香香
 * @Date 2020/3/3
 **/
public interface LuceneGateway {

    String INDEX_PATH = "/"; // 存放Lucene索引文件的位置

    int insert(List<Document> documents) throws IOException;

    int update(String primaryKey, List<Document> documents) throws IOException;

    TopDocs search(Query query) throws IOException;

    int delete(List<Term> terms) throws IOException;

    List<Document> getDocument(List<Integer> primaryIds) throws IOException;
}
