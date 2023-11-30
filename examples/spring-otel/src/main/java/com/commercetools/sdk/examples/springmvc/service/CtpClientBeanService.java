
package com.commercetools.sdk.examples.springmvc.service;

import com.commercetools.api.client.ProjectScopedApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;

import com.commercetools.monitoring.opentelemetry.OpenTelemetryResponseSerializer;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class CtpClientBeanService {

    @Value(value = "${ctp.client.id}")
    private String clientId;

    @Value(value = "${ctp.client.secret}")
    private String clientSecret;

    @Value(value = "${ctp.project.key}")
    private String projectKey;

    @Value(value = "${ctp.enable.histogram:true}")
    private boolean enableHistogram;

    private ClientCredentials credentials() {
        return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
    }

    @Bean
    public ProjectScopedApiRoot apiRoot() {
        if (enableHistogram){
            return ApiRootBuilder.of()
                    .defaultClient(credentials())
                    .withSerializer(new OpenTelemetryResponseSerializer(ResponseSerializer.of(), GlobalOpenTelemetry.get()))
                    .withTelemetryMiddleware(new OpenTelemetryMiddleware(GlobalOpenTelemetry.get()))
                    .build(projectKey);
        } else {
            return ApiRootBuilder.of()
                    .defaultClient(credentials())
                    .withTelemetryMiddleware(new OpenTelemetryMiddleware(GlobalOpenTelemetry.get(), false))
                    .build(projectKey);
        }

    }
}
