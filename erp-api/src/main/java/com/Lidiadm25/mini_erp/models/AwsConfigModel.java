package com.Lidiadm25.mini_erp.models;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "aws.s3")
public record AwsConfigModel(String endpoint, String region, String accessKey,
                             String secretKey, String bucketName, Boolean pathStyleEnabled
                             ) {
    public String getBucketUrl(){
        return String.format("%s/%s", endpoint, bucketName);
    }
}

