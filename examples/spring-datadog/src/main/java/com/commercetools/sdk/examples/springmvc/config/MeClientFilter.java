package com.commercetools.sdk.examples.springmvc.config;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;

import com.commercetools.monitoring.datadog.DatadogMiddleware;
import com.commercetools.monitoring.datadog.DatadogResponseSerializer;
import com.datadog.api.client.ApiClient;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.TokenStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

import java.util.Map;

@Component
public class MeClientFilter implements WebFilter {
    private final ApiHttpClient client;

    @Value(value = "${ctp.client.id}")
    private String clientId;

    @Value(value = "${ctp.client.secret}")
    private String clientSecret;

    @Value(value = "${ctp.project.key}")
    private String projectKey;

    private final ServiceRegion serviceRegion;

    private ClientCredentials credentials() {
        return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
    }

    @Autowired
    public MeClientFilter(final ApiHttpClient client, final ServiceRegion serviceRegion) {
        this.client = client;
        this.serviceRegion = serviceRegion;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        final ContextApiHttpClient contextClient = contextClient(client, new MDCContext(Map.of("requestId", exchange.getRequest().getId())));
        final ProjectApiRoot meClient = exchange.getAttributeOrDefault("meClient",
            meClient(contextClient, exchange.getSession()));
        exchange.getAttributes().put("meClient", meClient);
        exchange.getAttributes().put("contextRoot", contextRoot(contextClient));

        return chain.filter(exchange);
    }

    private ProjectApiRoot meClient(ApiHttpClient client, Mono<WebSession> session) {
        TokenStorage storage = new SessionTokenStorage(session);

        ApiRootBuilder builder = ApiRootBuilder.of(client)
                .withApiBaseUrl(serviceRegion.getApiUrl())
                .withProjectKey(projectKey)
                .withAnonymousRefreshFlow(credentials(), serviceRegion, storage)
                .withTelemetryMiddleware(new DatadogMiddleware(ApiClient.getDefaultApiClient()))
                .withSerializer(new DatadogResponseSerializer(ResponseSerializer.of(), ApiClient.getDefaultApiClient()));

        return builder.build(projectKey);
    }

    private ProjectApiRoot contextRoot(ContextApiHttpClient apiHttpClient) {
        return ProjectApiRoot.fromClient(projectKey, apiHttpClient);
    }

    private ContextApiHttpClient contextClient(ApiHttpClient client, Context context) {
        return ContextApiHttpClient.of(client, context);
    }
}
