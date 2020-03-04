import com.baiwazi.lucene.LuceneWay;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName LuceneUtils
 * @Description:
 * @Author 阳香香
 * @Date 2020/3/3
 **/
public class LuceneUtils {

    public static final String INDEX_PATH = "F:\\lucene"; // 存放Lucene索引文件的位置

    public static final String STOP_WORDS = "/stopwords.txt"; //

    private static LuceneWay<Goods> luceneWay = new LuceneWay<>(INDEX_PATH, STOP_WORDS);

    public static void update(String primayName, List<Goods> goods) throws IOException {
        luceneWay.update((goodss) -> goodss.stream()
                .filter(g -> g.getId() != null)
                .map(g -> {
                    Document document = new Document();
                    document.add(new StringField("id", String.valueOf(g.getId()), Field.Store.YES));
                    document.add(new TextField("goodsName", g.getGoodsName(), Field.Store.YES));
                    document.add(new TextField("caption", g.getCaption(), Field.Store.YES));
                    document.add(new StoredField("smallPic", g.getSmallPic()));
                    document.add(new StoredField("price", g.getPrice()));
                    document.add(new NumericDocValuesField("price", g.getPrice()));
                    document.add(new NumericDocValuesField("createTime", g.getCreateTime().getTime()));
                    return document;
                }).collect(Collectors.toList()), primayName, goods);
    }

    public static void delete(List<Goods> goods) throws IOException {
        luceneWay.delete((goodss) -> goodss.stream()
                .filter(g -> g.getId() != null)
                .map(g -> {
                    Term term = new Term("id", String.valueOf(g.getId()));
                    return term;
                }).collect(Collectors.toList()), goods);
    }

    public static <T extends Goods> void insert(List<T> goods) throws IOException {
        luceneWay.insert((goodss) -> goodss.stream()
                .filter(g -> g.getId() != null)
                .map(g -> {
                    Document document = new Document();
                    document.add(new StringField("id", String.valueOf(g.getId()), Field.Store.YES));
                    document.add(new TextField("goodsName", g.getGoodsName(), Field.Store.YES));
                    document.add(new TextField("caption", g.getCaption(), Field.Store.YES));
                    document.add(new StoredField("smallPic", g.getSmallPic()));
                    document.add(new StoredField("price", g.getPrice()));
                    document.add(new NumericDocValuesField("price", g.getPrice()));
                    document.add(new NumericDocValuesField("createTime", g.getCreateTime().getTime()));
                    return document;
                }).collect(Collectors.toList()), (List<Goods>) goods);
    }

    public static TopDocs search(Goods goods) throws IOException {
        TopDocs topDocs = luceneWay.search((g) -> {
            Analyzer analyzer = luceneWay.addAnalyzer();
            String[] fields = {"goodsName", "caption"};
            // MUST 表示and，MUST_NOT 表示not ，SHOULD表示or
            BooleanClause.Occur[] clauses = {BooleanClause.Occur.SHOULD, BooleanClause.Occur.SHOULD};
            // MultiFieldQueryParser表示多个域解析， 同时可以解析含空格的字符串，如果我们搜索"上海 中国"
            Query multiFieldQuery = null;
            try {
                multiFieldQuery = MultiFieldQueryParser.parse(goods.getGoodsName(), fields, clauses, analyzer);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return multiFieldQuery;
        }, goods);
        return topDocs;
    }

    public static List<Goods> getDocuments(List<Integer> primaryIds) throws IOException {
        return luceneWay.getDocument((documents -> documents.stream()
                .map(document -> {
                    Goods goods = new Goods();
                    goods.setId(Long.valueOf(document.get("id")));
                    goods.setGoodsName(document.get("goodsName"));
                    goods.setCaption(document.get("caption"));
                    return goods;
                }).collect(Collectors.toList())), primaryIds);
    }
}
