package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.AuthenticationToken;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Function;

/**
 * @deprecated use io.vrap.rmf.base.client.http.OAuthMiddleware instead
 */
@Deprecated
public class ReAuthMiddleware implements Middleware {
    private final OAuthHandler oAuthHandler;
    private final Integer maxRetries;

    public ReAuthMiddleware(final OAuthHandler oAuthHandler, final Integer maxRetries) {
        this.oAuthHandler = oAuthHandler;
        this.maxRetries = maxRetries;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request, final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return next.apply(request).thenCompose(response -> execute(request, response, next, 0));
    }

    private CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest request, final ApiHttpResponse<byte[]> apiResponse, final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next, final int retryCount) {
        if (apiResponse.getStatusCode() == 401) {
            final int retries = retryCount + 1;
            if (retries > maxRetries) {
                return CompletableFuture.supplyAsync(() -> {
                    throw new CompletionException("Stopped after " + retryCount + " retries with response: " + new String(apiResponse.getBody()), null);
                });
            }

            AuthenticationToken token = oAuthHandler.refreshToken();
            final ApiHttpRequest reauthRequest = request.withHeader(ApiHttpHeaders.AUTHORIZATION, OAuthHandler.authHeader(token));

            return next.apply(reauthRequest).thenCompose((response -> execute(reauthRequest, response, next, retries)));
        }
        return CompletableFuture.completedFuture(apiResponse);
    }
}
