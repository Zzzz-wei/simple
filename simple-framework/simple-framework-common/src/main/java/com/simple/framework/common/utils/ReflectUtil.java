package com.simple.framework.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


@Slf4j
public class ReflectUtil {

    private static final String GET = "get";

    private static final String SET = "set";

    private ReflectUtil() {
    }

    public static void invokeSet(Object obj, Field field, Object param) {
        invokeSet(obj, field.getName(), param);
    }

    public static void invokeSet(Object obj, String fieldName, Object param) {
        String setMethodName = SET.concat(fieldName.substring(0, 1).toUpperCase().concat(fieldName.substring(1)));
        Method setMethod = getMethod(obj.getClass(), setMethodName, param.getClass());
        try {
            setMethod.invoke(obj, param);
        } catch (IllegalAccessException | InvocationTargetException e) {
            log.error("invoke set exception", e);
            throw new RuntimeException("invoke set exception");
        }
    }


    public static Object invokeGet(Object obj, Field field) {
        return invokeGet(obj, field.getName());
    }

    public static Object invokeGet(Object obj, String fieldName) {
        String getMethodName = GET.concat(fieldName.substring(0, 1).toUpperCase().concat(fieldName.substring(1)));
        Method getMethod = getMethod(obj.getClass(), getMethodName);
        try {
            return getMethod.invoke(obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            log.error("invoke get exception", e);
            throw new RuntimeException("invoke get exception");
        }
    }

    public static List<Field> getFieldList(Class<?> classType) {
        if (classType != null) {
            List<Field> fieldList = new LinkedList<>();
            Field[] fields = classType.getDeclaredFields();
            if (fields != null && fields.length > 0) {
                for (Field field : fields) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        fieldList.add(field);
                    }
                }
            }
            Class<?> superClass = classType.getSuperclass();
            if (superClass != null && !superClass.equals(Object.class)) {
                List<Field> superFieldList = getFieldList(superClass);
                if (superFieldList != null && !superFieldList.isEmpty()) {
                    fieldList.addAll(superFieldList);
                }
            }
            return fieldList;
        }
        return Collections.emptyList();
    }

    public static Field[] getFields(Class<?> classType) {
        List<Field> fieldList = getFieldList(classType);
        return fieldList.toArray(new Field[fieldList.size()]);
    }

    public static Method getMethod(Class<?> classType, String methodName, Class<?>... parameterTypes) {
        try {
            return classType.getDeclaredMethod(methodName, parameterTypes);
        } catch (NoSuchMethodException | SecurityException e) {
            Class<?> superclass = classType.getSuperclass();
            if (superclass != null) {
                return getMethod(superclass, methodName, parameterTypes);
            }
        }
        log.error("no such method by set");
        throw new RuntimeException("no such method by set");
    }

}
