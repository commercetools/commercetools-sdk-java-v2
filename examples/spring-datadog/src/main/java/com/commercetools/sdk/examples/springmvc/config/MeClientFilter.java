package com.commercetools.sdk.examples.springmvc.config;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;

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

    private ClientCredentials credentials() {
        return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
    }

    @Autowired
    public MeClientFilter(ApiHttpClient client) {
        this.client = client;
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
                .withApiBaseUrl(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withProjectKey(projectKey)
                .withAnonymousRefreshFlow(credentials(), ServiceRegion.GCP_EUROPE_WEST1, storage);

        return builder.build(projectKey);
    }

    private ProjectApiRoot contextRoot(ContextApiHttpClient apiHttpClient) {
        return ProjectApiRoot.fromClient(projectKey, apiHttpClient);
    }

    private ContextApiHttpClient contextClient(ApiHttpClient client, Context context) {
        return ContextApiHttpClient.of(client, context);
    }
}
