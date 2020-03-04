package com.baiwazi.lucene.field;

import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.NumericUtils;

/**
 * @ClassName IntegerField
 * @Description:
 * @Author 阳香香
 * @Date 2020/3/3
 **/
public class IntegerField extends Field {

    public IntegerField(String fieldName, int value, FieldType type) {
        super(fieldName, type);
        this.fieldsData = Integer.valueOf(value);
    }

    @Override
    public BytesRef binaryValue() {
        byte[] bs = new byte[Integer.BYTES];
        NumericUtils.intToSortableBytes((Integer) this.fieldsData, bs, 0);
        return new BytesRef(bs);
    }
}
