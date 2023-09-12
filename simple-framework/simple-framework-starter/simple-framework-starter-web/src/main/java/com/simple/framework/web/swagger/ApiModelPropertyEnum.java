package com.simple.framework.web.swagger;

import com.simple.framework.common.model.IDict;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiModelPropertyEnum {

    /**
     * 属性对应的字段枚举
     */
    Class<? extends IDict<?>> dictEnum();

}
