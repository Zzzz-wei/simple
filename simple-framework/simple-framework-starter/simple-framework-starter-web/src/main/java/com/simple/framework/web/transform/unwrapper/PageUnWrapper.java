package com.simple.framework.web.transform.unwrapper;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;


public class PageUnWrapper<T> implements UnWrapper<IPage<T>> {

    @Override
    public List<T> unWrap(IPage<T> source) {
        return source.getRecords();
    }
}

