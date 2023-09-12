package com.simple.demo.dubbo;

import com.simple.demo.api.TestDubboService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author : zhangwei
 * @date : 2023/9/6
 */
@DubboService
public class TestDubboServiceImpl implements TestDubboService {
    @Override
    public String test() {
        return "TestDubboServiceImpl";
    }
    @Override
    public String doadmin() {
        return "doadmin";
    }
}
