import org.apache.lucene.search.TopDocs;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName LuceneJava
 * @Description:
 * @Author 阳香香
 * @Date 2020/3/3
 **/
public class LuceneJava {

    @Test
    public void search2() throws Exception {
        Goods goods = new Goods();
        goods.setGoodsName("网红");
        TopDocs search = LuceneUtils.search(goods);
        System.out.println(search.totalHits.value);
        List<Goods> goodsList = LuceneUtils.getDocuments(Arrays.stream(search.scoreDocs)
                .map(scoreDoc -> scoreDoc.doc)
                .collect(Collectors.toList()));
        for (Goods goods1 : goodsList) {
            System.out.println("--------------------------");
            System.out.println(goods1.getGoodsName());
            System.out.println(goods1.getCaption());
            System.out.println("--------------------------");
        }
    }

}
