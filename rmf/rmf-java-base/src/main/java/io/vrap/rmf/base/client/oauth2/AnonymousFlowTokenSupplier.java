
package io.vrap.rmf.base.client.oauth2;

import static io.vrap.rmf.base.client.ApiHttpHeaders.headerEntry;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.ClientUtils;

public class AnonymousFlowTokenSupplier extends BaseAuthTokenSupplier implements RefreshableTokenSupplier {
    private final RefreshFlowTokenSupplier refreshFlowTokenSupplier;

    public AnonymousFlowTokenSupplier(final String clientId, final String clientSecret, final String scope,
            final String tokenEndpoint, final RefreshFlowTokenSupplier refreshFlowTokenSupplier,
            final VrapHttpClient vrapHttpClient) {
        super(vrapHttpClient, constructApiHttpRequest(clientId, clientSecret, scope, tokenEndpoint));
        this.refreshFlowTokenSupplier = refreshFlowTokenSupplier;
    }

    @Override
    public CompletableFuture<AuthenticationToken> refreshToken() {
        return refreshFlowTokenSupplier.refreshToken().exceptionally(throwable -> {
            logger.error(() -> throwable);
            return ClientUtils.blockingWait(getToken(), Duration.ofSeconds(5));
        });
    }

    private static ApiHttpRequest constructApiHttpRequest(final String clientId, final String clientSecret,
            final String scope, final String tokenEndpoint) {
        String auth = Base64.getEncoder()
                .encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));
        final ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders(
            headerEntry(ApiHttpHeaders.AUTHORIZATION, String.format("Basic %s", auth)),
            headerEntry(ApiHttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded"));
        final String body;
        if (scope == null || scope.isEmpty()) {
            body = "grant_type=client_credentials";
        }
        else {
            body = String.format("grant_type=client_credentials&scope=%s", urlEncode(scope));
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(tokenEndpoint), apiHttpHeaders,
            body.getBytes(StandardCharsets.UTF_8));
    }
}
