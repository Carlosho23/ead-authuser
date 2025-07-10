package com.ead.authuser.configs;

import org.springframework.boot.http.client.ClientHttpRequestFactoryBuilder;
import org.springframework.boot.http.client.ClientHttpRequestFactorySettings;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

import java.time.Duration;

@Configuration
public class RestClientConfig {

    static final int TIMEOUT = 5000;

    @Bean
    public ClientHttpRequestFactory customRequestFactory(ClientHttpRequestFactoryBuilder<?> builder) {
        ClientHttpRequestFactorySettings settings = ClientHttpRequestFactorySettings.defaults()
                .withConnectTimeout(Duration.ofMillis(TIMEOUT))
                .withReadTimeout(Duration.ofMillis(TIMEOUT));

        return builder.build(settings);
    }

    @LoadBalanced
    @Bean
    public RestClient.Builder restClientBuilder(ClientHttpRequestFactory factory) {
        return RestClient.builder().requestFactory(factory);
    }
}
