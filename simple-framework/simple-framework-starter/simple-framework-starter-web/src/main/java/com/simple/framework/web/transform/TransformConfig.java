package com.simple.framework.web.transform;

import com.simple.framework.web.transform.transformer.EnumTransformer;
import com.simple.framework.web.transform.unwrapper.PageUnWrapper;
import com.simple.framework.web.transform.unwrapper.ResultUnWrapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.**.transformer")
@Import({EnumTransformer.class, PageUnWrapper.class, ResultUnWrapper.class})
public class TransformConfig {


}
