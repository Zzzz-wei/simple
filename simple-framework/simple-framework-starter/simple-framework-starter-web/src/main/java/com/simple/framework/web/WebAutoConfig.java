package com.simple.framework.web;

import com.simple.framework.web.config.DateTimeConfig;
import com.simple.framework.web.config.DateTimeConvertPrimaryConfig;
import com.simple.framework.web.exception.GlobalExceptionHandler;
import com.simple.framework.web.exception.SentinelBlockExceptionHandler;
import com.simple.framework.web.result.InitializingAdviceDecorator;
import com.simple.framework.web.swagger.SwaggerConfiguration;
import com.simple.framework.web.swagger.SwaggerShortcutController;
import com.simple.framework.web.transform.TransformConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.simple.framework.web")
@Import({SwaggerConfiguration.class, InitializingAdviceDecorator.class,
        GlobalExceptionHandler.class, SentinelBlockExceptionHandler.class,
        DateTimeConfig.class, SwaggerShortcutController.class, TransformConfig.class, DateTimeConvertPrimaryConfig.class})
public class WebAutoConfig {

}
