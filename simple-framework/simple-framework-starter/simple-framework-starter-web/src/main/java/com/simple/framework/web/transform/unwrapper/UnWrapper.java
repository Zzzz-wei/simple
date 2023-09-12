package com.simple.framework.web.transform.unwrapper;

import org.springframework.core.convert.converter.Converter;

import javax.annotation.Nonnull;

public interface UnWrapper<T> extends Converter<T, Object> {

    /**
     * 解包
     *
     * @param source 源
     * @return 包装类内的实际对象
     */
    Object unWrap(T source);

    /**
     * 将convert更名为unWrap，语义化更好
     *
     * @param source 源
     * @return 目标对象
     */
    @Override
    default Object convert(@Nonnull T source) {
        return unWrap(source);
    }
}
