package com.simple.framework.web.transform.unwrapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.simple.framework.common.result.ResultWrapper;


public class ResultUnWrapper implements UnWrapper<ResultWrapper<?>> {
    @Override
    public Object unWrap(ResultWrapper<?> source) {
        Object data = source.getData();
        if (data instanceof IPage) {
            return ((IPage<?>) data).getRecords();
        }
        // List或bean直接返回
        return data;
    }
}