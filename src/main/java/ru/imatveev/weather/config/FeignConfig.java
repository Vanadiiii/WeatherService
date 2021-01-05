package ru.imatveev.weather.config;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public RequestInterceptor requestInterceptor(@Value("${security.key}") String key,
                                                 @Value("${security.value}") String value) {
        return requestTemplate -> requestTemplate.header(key, value);
    }
}
