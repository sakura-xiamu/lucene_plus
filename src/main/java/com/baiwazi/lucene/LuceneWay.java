package com.baiwazi.lucene;

import com.common.lucene.gateway.LuceneFunction;
import com.common.lucene.gateway.impl.DefaultLuceneGateway;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;

/**
 * @ClassName LuceneWay
 * @Description: Lucene使用入口 一次封装，如需更改请进行继承
 * @Author 阳香香
 * @Date 2020/3/3
 **/
public class LuceneWay<T> extends DefaultLuceneGateway implements LuceneFunction<T> {

    private String indexDir;


    public LuceneWay() {
    }

    public LuceneWay(String indexDir) {
        this.indexDir = indexDir;
    }

    @Override
    protected String addIndexDir() {
        return this.indexDir;
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
