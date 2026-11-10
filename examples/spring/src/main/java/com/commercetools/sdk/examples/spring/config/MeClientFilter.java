
package com.commercetools.sdk.examples.spring.config;

import java.util.Map;
import java.util.Optional;

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

@Component
public class MeClientFilter implements WebFilter {
    private final ApiHttpClient client;

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

    private final ServiceRegion serviceRegion;

    private ClientCredentials credentials() {
        return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
    }

    @Autowired
    public MeClientFilter(ApiHttpClient client, ServiceRegion serviceRegion) {
        this.client = client;
        this.serviceRegion = serviceRegion;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        final ContextApiHttpClient contextClient = contextClient(client,
            new MDCContext(Map.of("requestId", exchange.getRequest().getId())));
        final ProjectApiRoot meClient = exchange.getAttributeOrDefault("meClient",
            meClient(contextClient, exchange.getSession()));
        exchange.getAttributes().put("meClient", meClient);
        exchange.getAttributes().put("contextRoot", contextRoot(contextClient));

        return chain.filter(exchange);
    }

    private ProjectApiRoot meClient(ApiHttpClient client, Mono<WebSession> session) {
        final TokenStorage storage = new SessionTokenStorage(session);
        ApiRootBuilder builder = ApiRootBuilder.of(client)
                .withApiBaseUrl(apiBaseUrl != null ? apiBaseUrl : serviceRegion.getApiUrl())
                .withProjectKey(projectKey);

        if (authUrl != null) {
            builder = builder.withAnonymousRefreshFlow(credentials(),
                authUrl + "/oauth/" + projectKey + "/anonymous/token", authUrl + "/oauth/token", storage);
        }
        else {
            builder = builder.withAnonymousRefreshFlow(credentials(), serviceRegion, storage);
        }

        return builder.build(projectKey);
    }

    private ProjectApiRoot contextRoot(ContextApiHttpClient apiHttpClient) {
        return ProjectApiRoot.fromClient(projectKey, apiHttpClient);
    }

    private ContextApiHttpClient contextClient(ApiHttpClient client, Context context) {
        return ContextApiHttpClient.of(client, context);
    }
}
