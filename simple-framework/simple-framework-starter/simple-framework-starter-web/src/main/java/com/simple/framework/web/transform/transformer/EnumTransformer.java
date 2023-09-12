package com.simple.framework.web.transform.transformer;

import com.simple.framework.common.model.IDict;
import com.simple.framework.web.transform.annotation.TransformEnum;

import javax.annotation.Nonnull;


public class EnumTransformer<T> implements Transformer<T, TransformEnum> {

    @Override
    @SuppressWarnings("unchecked")
    public String transform(@Nonnull T enumCode, @Nonnull TransformEnum annotation) {
        return IDict.getTextByCode((Class<? extends IDict<T>>) annotation.value(), enumCode);
    }


}
