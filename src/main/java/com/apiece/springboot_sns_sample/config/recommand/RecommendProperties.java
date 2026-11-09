package com.apiece.springboot_sns_sample.config.recommand;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "recommend")
public record RecommendProperties(
    String baseUrl,
    Duration connectTimeout,
    Duration timeout
) {

}
