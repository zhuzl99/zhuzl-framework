package com.zhuzl.framework.xxl;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author : zhuzl
 * @date : 2022/7/1
 * @description : 自动配置类，
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Configuration
@Import(XxlJobConfiguration.class)
@EnableConfigurationProperties(XxlConfig.class)
public @interface EnableXxlJobAutoConfig {
}
