
package com.commercetools.sdk.examples.spring.service;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;

import com.commercetools.monitoring.dynatrace.DynatraceResponseSerializer;
import com.commercetools.monitoring.dynatrace.DynatraceTelemetryMiddleware;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Value(value = "${dynatrace.base.url}")
    private String dynatraceBaseUrl;

    @Value(value = "${dynatrace.api.token}")
    private String dynatraceApiToken;

    private ClientCredentials credentials() {
        return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
    }

    @Bean
    public ApiHttpClient client() {
        return ApiRootBuilder.of()
                .defaultClient(credentials())
                .withTelemetryMiddleware(new DynatraceTelemetryMiddleware(
                        dynatraceBaseUrl, dynatraceApiToken))
                .withSerializer(new DynatraceResponseSerializer(ResponseSerializer.of(),
                        dynatraceBaseUrl, dynatraceApiToken))
                .buildClient();
    }

    @Bean
    @Autowired
    public ProjectApiRoot apiRoot(ApiHttpClient client) {
        final ProjectApiRoot build = ProjectApiRoot.fromClient(projectKey, client);
        return build;
    }
}
