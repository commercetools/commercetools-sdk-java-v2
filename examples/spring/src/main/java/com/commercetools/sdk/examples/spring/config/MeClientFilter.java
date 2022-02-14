package com.commercetools.sdk.examples.spring.config;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.ApiHttpClient;
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
        return ClientCredentials.of()
                .withClientId(clientId)
                .withClientSecret(clientSecret)
                .build();
    }


    @Autowired
    public MeClientFilter(ApiHttpClient client) {
        this.client = client;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        final ProjectApiRoot meClient = exchange.getAttributeOrDefault("meClient",
                meClient(client, exchange.getSession()));
        exchange.getAttributes().put("meClient", meClient);
        return chain.filter(exchange);
    }

    private ProjectApiRoot meClient(
            ApiHttpClient client,
            Mono<WebSession> session) {
        TokenStorage storage = new SessionTokenStorage(session);

        ApiRootBuilder builder = ApiRootBuilder.of(client)
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withProjectKey(projectKey)
                .withAnonymousRefreshFlow(credentials(), ServiceRegion.GCP_EUROPE_WEST1, storage);

        return builder.build(projectKey);
    }

}
