package com.example.demo;

import java.time.Duration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ApplicationConfigクラス.
 */
@Configuration
public class ApplicationConfig {

  /** RestTemplate. */
  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplateBuilder().setConnectTimeout(Duration.ofSeconds(10))
        .setReadTimeout(Duration.ofSeconds(10)).build();
  }
}
