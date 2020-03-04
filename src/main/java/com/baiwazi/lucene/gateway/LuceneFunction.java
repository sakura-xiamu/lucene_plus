package com.baiwazi.lucene.gateway;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;

/**
 * @ClassName LuceneFunction
 * @Description:
 * @Author 阳香香
 * @Date 2020/3/3
 **/
public interface LuceneFunction<T> {

    void insert(Function<List<T>, List<Document>> function, List<T> t) throws IOException;

    void update(Function<List<T>, List<Document>> function, String primaryName, List<T> t) throws IOException;

    void delete(Function<List<T>, List<Term>> function, List<T> t) throws IOException;

    <E> TopDocs search(Function<E, Query> function, E e) throws IOException;

    List<T> getDocument(Function<List<Document>, List<T>> function, List<Integer> primaryIds) throws IOException;
}
