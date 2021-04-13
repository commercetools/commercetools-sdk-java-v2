
package io.vrap.rmf.base.client.oauth2;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.InternalLogger;
import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public class GlobalCustomerPasswordTokenSupplier extends AutoCloseableService implements TokenSupplier {
    private final InternalLogger logger = InternalLogger.getLogger(LOGGER_AUTH);

    private final VrapHttpClient vrapHttpClient;
    private final ApiHttpRequest apiHttpRequest;

    public GlobalCustomerPasswordTokenSupplier(final String clientId, final String clientSecret, final String email,
            final String password, final String scope, final String tokenEndpoint,
            final VrapHttpClient vrapHttpClient) {
        this.vrapHttpClient = vrapHttpClient;
        this.apiHttpRequest = constructApiHttpRequest(clientId, clientSecret, email, password, scope, tokenEndpoint);
    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        return vrapHttpClient.execute(apiHttpRequest).whenComplete((response, throwable) -> {
            if (throwable != null) {
                logger.error(() -> response, throwable);
            }
            else {
                logger.debug(() -> response);
            }
        }).thenApply(apiHttpResponse -> {
            if (apiHttpResponse.getStatusCode() < 200 || apiHttpResponse.getStatusCode() > 299) {
                throw new CompletionException(new Throwable(new String(apiHttpResponse.getBody())));
            }
            return apiHttpResponse;
        })
                .thenApply(Utils.wrapToCompletionException((ApiHttpResponse<byte[]> response) -> JsonUtils
                        .fromJsonByteArray(response.getBody(), AuthenticationToken.class)));
    }

    private static ApiHttpRequest constructApiHttpRequest(final String clientId, final String clientSecret,
            final String email, final String password, final String scope, final String tokenEndpoint) {
        String auth = Base64.getEncoder()
                .encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));

        final String body;
        if (scope == null || scope.isEmpty()) {
            body = "grant_type=password&username=" + email + "&password=" + password;
        }
        else {
            body = "grant_type=password&username=" + email + "&password=" + password + "&scope=" + scope;
        }
        ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders().withHeader("Authorization", "Basic " + auth)
                .withHeader("Content-Type", "application/x-www-form-urlencoded");
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(tokenEndpoint), apiHttpHeaders,
            body.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    protected void internalClose() {
        if (vrapHttpClient instanceof AutoCloseable)
            closeQuietly((AutoCloseable) vrapHttpClient);
    }
}
