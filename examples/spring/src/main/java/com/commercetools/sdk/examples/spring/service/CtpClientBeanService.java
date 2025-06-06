
package com.commercetools.sdk.examples.spring.service;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;

import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

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

    @Value(value = "${ctp.project.api.base.url:#{null}}")
    private String apiBaseUrl;

    @Value(value = "${ctp.project.auth.url:#{null}}")
    private String authUrl;

    @Value(value = "${ctp.service.region:#{null}}")
    private String serviceRegion;

    private ClientCredentials credentials() {
        return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
    }

    @Bean
    public ServiceRegion serviceRegion() {
        return ServiceRegion.valueOf(Optional.ofNullable(this.serviceRegion).orElse("GCP_EUROPE_WEST1"));
    }

    @Bean
    public ApiHttpClient client() {
        ApiRootBuilder builder;
        if (authUrl != null) {
            builder = ApiRootBuilder.of().defaultClient(credentials(), authUrl + "/oauth/token", apiBaseUrl);
        }
        else {
            builder = ApiRootBuilder.of().defaultClient(credentials(), serviceRegion());
        }

        return builder.buildClient();
    }

    @Bean
    public ProjectApiRoot apiRoot(ApiHttpClient client) {

        final ProjectApiRoot build = ProjectApiRoot.fromClient(projectKey, client);

        return build;
    }
}
