package com.commercetools.sdk.examples.springmvc.service;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.monitoring.datadog.DatadogMiddleware;
import com.commercetools.monitoring.datadog.DatadogResponseSerializer;
import com.datadog.api.client.ApiClient;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
@EnableAutoConfiguration
public class CtpClientBeanService {

    @Value(value = "${ctp.client.id}")
    private String clientId;

    @Value(value = "${ctp.client.secret}")
    private String clientSecret;

    @Value(value = "${ctp.project.key}")
    private String projectKey;

    @Value(value = "${ctp.service.region:#{null}}")
    private String serviceRegion;

    @Bean
    public ServiceRegion serviceRegion() {
        return ServiceRegion.valueOf(Optional.ofNullable(this.serviceRegion).orElse("GCP_EUROPE_WEST1"));
    }

    private ClientCredentials credentials() {
        return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
    }

    @Bean
    public ApiHttpClient client() {
        ApiRootBuilder builder = ApiRootBuilder.of()
                .defaultClient(credentials(), serviceRegion())
                .withTelemetryMiddleware(new DatadogMiddleware(ApiClient.getDefaultApiClient()))
                .withSerializer(new DatadogResponseSerializer(ResponseSerializer.of(), ApiClient.getDefaultApiClient()));
        return builder.buildClient();
    }

    @Bean
    public ProjectApiRoot apiRoot(ApiHttpClient client) {

        final ProjectApiRoot build = ProjectApiRoot.fromClient(projectKey, client);

        return build;
    }
}
