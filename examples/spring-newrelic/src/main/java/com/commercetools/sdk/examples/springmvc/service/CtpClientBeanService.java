
package com.commercetools.sdk.examples.springmvc.service;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.client.ProjectScopedApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;

import com.commercetools.monitoring.newrelic.NewRelicContext;
import com.commercetools.monitoring.newrelic.NewRelicTelemetryMiddleware;
import com.commercetools.monitoring.newrelic.NewrelicResponseSerializer;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

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
    public ApiHttpClient client() {
        return ApiRootBuilder.of()
                .defaultClient(credentials())
                .withTelemetryMiddleware(new NewRelicTelemetryMiddleware())
                .withSerializer(new NewrelicResponseSerializer(ResponseSerializer.of()))
                .buildClient();
    }

    @Bean
    @Trace(dispatcher = true)
    public ProjectScopedApiRoot apiRoot(ApiHttpClient client) {
        ContextApiHttpClient contextClient = ContextApiHttpClient.of(client, new MDCContext(), false)
                .addContext(NewRelicContext.of(NewRelic.getAgent().getTransaction()));
        return ProjectApiRoot.fromClient(projectKey, contextClient);
    }
}
