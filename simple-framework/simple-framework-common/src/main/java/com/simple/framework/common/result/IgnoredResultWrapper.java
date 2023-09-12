package com.simple.framework.common.result;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface IgnoredResultWrapper {
}
