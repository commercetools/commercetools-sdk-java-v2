
package com.commercetools.sdk.examples.springmvc.service;

import com.commercetools.api.client.ProjectScopedApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.monitoring.datadog.statsd.DatadogMiddleware;
import com.commercetools.monitoring.datadog.statsd.DatadogResponseSerializer;
import com.timgroup.statsd.NonBlockingStatsDClientBuilder;
import com.timgroup.statsd.StatsDClient;
import io.vrap.rmf.base.client.ResponseSerializer;
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

    private ClientCredentials credentials() {
        return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
    }

    @Bean
    public ProjectScopedApiRoot apiRoot() {
        StatsDClient statsd = new NonBlockingStatsDClientBuilder()
                .hostname("localhost")
                .build();

        ApiRootBuilder builder = ApiRootBuilder.of()
                .defaultClient(credentials())
                .withSerializer(new DatadogResponseSerializer(ResponseSerializer.of(), statsd))
                .withTelemetryMiddleware(new DatadogMiddleware(statsd));
        return builder.build(projectKey);
    }
}
