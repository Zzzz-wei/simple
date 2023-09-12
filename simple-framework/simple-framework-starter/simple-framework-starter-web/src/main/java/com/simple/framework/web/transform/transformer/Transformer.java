package com.simple.framework.web.transform.transformer;

import org.springframework.lang.NonNull;

import java.lang.annotation.Annotation;


public interface Transformer<T, A extends Annotation> {


    /**
     * 翻译
     *
     * @param originalValue 转换之前的原始值
     * @param annotation    自定义注解
     * @return 翻译后的值
     */
    String transform(@NonNull T originalValue, A annotation);
}
