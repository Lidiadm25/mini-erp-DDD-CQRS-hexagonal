package com.Lidiadm25.mini_erp.configs;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties
@PropertySource(value="classpath:aws.yml")
public class YmlConfig {

}
