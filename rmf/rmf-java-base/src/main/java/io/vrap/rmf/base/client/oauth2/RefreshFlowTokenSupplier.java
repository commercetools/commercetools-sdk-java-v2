
package io.vrap.rmf.base.client.oauth2;

import static io.vrap.rmf.base.client.ApiHttpHeaders.headerEntry;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.InternalLogger;
import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public class RefreshFlowTokenSupplier extends AutoCloseableService implements RefreshableTokenSupplier {
    private final InternalLogger logger = InternalLogger.getLogger(LOGGER_AUTH);

    private final VrapHttpClient vrapHttpClient;
    private final ApiHttpRequest apiHttpRequest;

    private final TokenStorage tokenStorage;

    public RefreshFlowTokenSupplier(final String clientId, final String clientSecret, final String tokenEndpoint,
            final TokenStorage tokenStorage, final VrapHttpClient vrapHttpClient) {
        this.vrapHttpClient = vrapHttpClient;
        this.apiHttpRequest = constructApiHttpRequest(clientId, clientSecret, tokenEndpoint);
        this.tokenStorage = tokenStorage;
    }

    @Override
    public CompletableFuture<AuthenticationToken> refreshToken() {
        final AuthenticationToken token = tokenStorage.getToken();
        if (token.getRefreshToken() == null) {
            throw new AuthException(400, "No refresh_token given", null);
        }
        final String body = "grant_type=refresh_token&refresh_token=" + token.getRefreshToken();
        final ApiHttpRequest request = apiHttpRequest.withBody(body);
        logger.debug(() -> request);
        return vrapHttpClient.execute(request).whenComplete((response, throwable) -> {
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

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        return refreshToken();
    }

    private static ApiHttpRequest constructApiHttpRequest(final String clientId, final String clientSecret,
            final String tokenEndpoint) {
        String auth = Base64.getEncoder()
                .encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));
        final ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders(
            headerEntry(ApiHttpHeaders.AUTHORIZATION, "Basic " + auth),
            headerEntry(ApiHttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded"));
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(tokenEndpoint), apiHttpHeaders, null);
    }

    @Override
    protected void internalClose() {
        if (vrapHttpClient instanceof AutoCloseable)
            closeQuietly((AutoCloseable) vrapHttpClient);
    }
}
