import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.WordlistLoader;
import org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.IOUtils;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;

/**
 * @ClassName LuceneSpring
 * @Description:
 * @Author 阳香香
 * @Date 2020/3/3
 **/
public class LuceneSpring {

    public static final String INDEX_PATH = "F:\\lucene"; // 存放Lucene索引文件的位置

    /**
     * 创建索引
     */
    @Test
    public void creatIndexDB() {
        IndexWriter indexWriter = null;
        try {
            Directory directory = FSDirectory.open(FileSystems.getDefault().getPath(INDEX_PATH));
            //Analyzer analyzer = new StandardAnalyzer();
//            Analyzer analyzer = new IKAnalyzer4Lucene7(true);
            Analyzer analyzer = new SmartChineseAnalyzer(CharArraySet.unmodifiableSet(WordlistLoader.getWordSet(IOUtils
                    .getDecodingReader(SmartChineseAnalyzer.class, "/stopwords.txt",
                            StandardCharsets.UTF_8))));
            IndexWriterConfig indexWriterConfig = new IndexWriterConfig(analyzer);
            indexWriter = new IndexWriter(directory, indexWriterConfig);
            indexWriter.deleteAll();// 清除以前的index

//            List<GoodsDTO> goodsDTOS = goodsManager.listSelective(null);
//            for (GoodsDTO goodsDTO : goodsDTOS) {
//                Document document = new Document();
//                document.add(new Field("id", goodsDTO.getId().toString(), StringField.TYPE_STORED));
//                document.add(new Field("goodsName", goodsDTO.getGoodsName(), TextField.TYPE_STORED));
//                document.add(new Field("caption", goodsDTO.getCaption(), TextField.TYPE_STORED));
//                indexWriter.addDocument(document);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (indexWriter != null) indexWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
