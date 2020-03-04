package com.baiwazi.lucene.base;

import org.apache.lucene.analysis.Analyzer;

/**
 * @ClassName IKAnalyzer4Lucene7
 * @Description: 因为Analyzer的createComponents方法API改变了需要重新实现分析器
 * @Author 阳香香
 * @Date 2020/3/2
 **/
public class IKAnalyzer4Lucene7 extends Analyzer {

    private boolean useSmart = false;

    public IKAnalyzer4Lucene7() {
        this(false);
    }

    public IKAnalyzer4Lucene7(boolean useSmart) {
        super();
        this.useSmart = useSmart;
    }

    public boolean isUseSmart() {
        return useSmart;
    }

    public void setUseSmart(boolean useSmart) {
        this.useSmart = useSmart;
    }

    @Override
    protected TokenStreamComponents createComponents(String fieldName) {
        IKTokenizer4Lucene7 tk = new IKTokenizer4Lucene7(this.useSmart);
        return new TokenStreamComponents(tk);
    }
}
