package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.HandlerStack;
import io.vrap.rmf.base.client.http.HttpHandler;
import io.vrap.rmf.base.client.http.Middleware;
import io.vrap.rmf.base.client.middlewares.OAuthHandler;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;
import org.apache.commons.lang3.SystemUtils;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MiddlewareFactory {
    private final static String userAgent = buildUserAgent();

    public static HandlerStack createDefault(final VrapHttpClient httpClient, final TokenSupplier tokenSupplier, final Logger logger)
    {
        final HandlerStack stack = HandlerStack.create(HttpHandler.create(httpClient));

        final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier);
        stack.addMiddleware(Middleware.mapRequest(oAuthHandler::invoke));
        stack.addMiddleware(reauthMiddleware(oAuthHandler, 1));
        stack.addMiddleware(Middleware.mapRequest(request -> {
            request.addHeader(ApiHttpHeaders.USER_AGENT, userAgent);
            return request;
        }));
        stack.addMiddleware(Middleware.log(logger, Level.INFO));

        return stack;
    }

    private static String buildUserAgent() {
        String runtimeVersion = SystemUtils.JAVA_RUNTIME_VERSION;
        String osName = SystemUtils.OS_NAME;
        String osArch = SystemUtils.OS_ARCH;
        String sdkVersion = BuildInfo.VERSION;
        return "commercetools-java-sdks/" + sdkVersion + " " + " Java/" + runtimeVersion + " (" + osName + "; " + osArch + ")";
    }

    private static Function<BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>, BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>> reauthMiddleware(OAuthHandler oAuthHandler, Integer maxRetries)
    {
        return (BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>> handler) ->
                (BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>) (ApiHttpRequest request, Map<String, Object> options) -> handler.apply(request, options).handle(
                        (response, throwable) -> {
                            if (response.getStatusCode() == 401) {
                                Integer retries = Optional.ofNullable((Integer)options.get("retries")).orElse(0);
                                AuthenticationToken token = oAuthHandler.refreshToken();
                                request.setHeaders(request.getHeaders().withHeader(ApiHttpHeaders.AUTHORIZATION, "Bearer " + token.getAccessToken()));
                                if (retries < maxRetries) {
                                    retries++;
                                    options.put("retries", retries);
                                    try {
                                        return handler.apply(request, options).get();
                                    } catch (InterruptedException | ExecutionException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            return response;
                        }
                );
    }
}
