package com.simple.demo.dubbo;

import com.simple.demo.api.UserDubboService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author : zhangwei
 * @date : 2023/9/6
 */
@DubboService
public class UserDubboServiceImpl implements UserDubboService {
    @Override
    public String user() {
        return "user";
    }
}
