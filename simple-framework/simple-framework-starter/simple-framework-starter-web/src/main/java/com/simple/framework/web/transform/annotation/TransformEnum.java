package com.simple.framework.web.transform.annotation;

import com.simple.framework.common.model.IDict;
import com.simple.framework.web.transform.transformer.EnumTransformer;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.FIELD})

@Transform(transformer = EnumTransformer.class)
public @interface TransformEnum {

    @AliasFor(annotation = Transform.class)
    String from() default "";

    Class<? extends IDict<?>> value();

}
