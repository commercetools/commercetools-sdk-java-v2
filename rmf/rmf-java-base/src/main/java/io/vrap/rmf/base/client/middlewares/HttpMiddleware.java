package io.vrap.rmf.base.client.middlewares;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;
import io.vrap.rmf.base.client.utils.Utils;
import org.apache.commons.lang3.SystemUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class HttpMiddleware implements Middleware {

    private static final String USER_AGENT = "User-Agent";

    private final TokenSupplier tokenSupplier;
    private final String apiBaseUrl;
    private CompletableFuture<AuthenticationToken> authenticationToken;
    private final VrapHttpClient httpClient;

    public HttpMiddleware(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier
    ) {
        this.apiBaseUrl = removeTrailingSlash(apiBaseUrl);
        this.tokenSupplier = tokenSupplier;
        this.httpClient = httpClient;
    }

    @Override
    public CompletableFuture<MiddlewareArg> next(MiddlewareArg arg) {
        if (arg.getError() != null) {
            return arg.getNext().next(arg);
        }
        ApiHttpRequest request = arg.getRequest();
        request.addHeader(USER_AGENT, getUserAgent());
        request.setBaseUrl(apiBaseUrl);
        return execute(request, null, 0)
                .thenApply(response ->
                        MiddlewareArg.from(arg.getRequest(), response, null, arg.getNext())
                )
                .thenCompose(middlewareArg -> arg.getNext().next(middlewareArg));
    }

    private CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest apiHttpRequest, final ApiHttpResponse<byte[]> apiHttpResponse, Integer numberOfRetries) {

        if (numberOfRetries > 2) {
            return CompletableFuture.supplyAsync(() -> {
                throw new CompletionException("Stopped after " + numberOfRetries + " retries with response: " + new String(apiHttpResponse.getBody()), null);
            });
        }

        if (apiHttpResponse != null) {
            if (apiHttpResponse.getStatusCode() == 401) {
                final String body = Utils.bytesToString(apiHttpResponse.getBody());
                if (body.contains("invalid_token")) {
                    invalidateToken();
                }
            }
            return CompletableFuture.completedFuture(apiHttpResponse);
        }

        return getAuthenticationToken()
                .thenApply(token -> {
                            apiHttpRequest.addHeader("Authorization", " Bearer " + token.getAccessToken());
                            return apiHttpRequest;
                        }
                )
                .thenCompose(httpClient::execute)
                .thenCompose(response -> execute(apiHttpRequest, response, numberOfRetries + 1));

    }

    private synchronized CompletableFuture<AuthenticationToken> getAuthenticationToken() {
        if (authenticationToken == null) {
            authenticationToken = tokenSupplier.getToken();
            return authenticationToken;
        } else {
            return authenticationToken;
        }
    }

    private synchronized void invalidateToken() {
        authenticationToken = null;
    }

    private String removeTrailingSlash(String url) {
        if (url.charAt(url.length() - 1) == '/') {
            return url.substring(0, url.length() - 1);
        }
        return url;
    }

    private String getUserAgent() {
        String runtimeVersion = SystemUtils.JAVA_RUNTIME_VERSION;
        String osName = SystemUtils.OS_NAME;
        String osArch = SystemUtils.OS_ARCH;
        String sdkVersion = BuildInfo.VERSION;
        return "commercetools-java-sdks/" + sdkVersion + " " + " Java/" + runtimeVersion + " (" + osName + "; " + osArch + ")";
    }
}
