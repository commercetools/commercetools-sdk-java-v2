
package io.vrap.rmf.base.client;

import static java.util.Objects.requireNonNull;

import java.net.URI;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.apache.commons.lang3.SystemUtils;

public class ClientBuilder {
    private URI apiBaseUrl;
    private ErrorMiddleware errorMiddleware;
    private InternalLoggerMiddleware internalLoggerMiddleware;
    private List<Middleware> middlewares;
    private final HandlerStack stack;
    private ResponseSerializer serializer;

    public static ClientBuilder of() {
        return of(HttpClientSupplier.of().get());
    }

    public static ClientBuilder of(VrapHttpClient httpClient) {
        return of(HandlerStack.create(HttpHandler.create(httpClient)));
    }

    public static ClientBuilder of(HandlerStack stack) {
        return new ClientBuilder(stack);
    }

    private ClientBuilder(HandlerStack stack) {
        this.stack = stack;
        this.middlewares = new ArrayList<>();
    }

    public ClientBuilder withSerializer(ResponseSerializer serializer) {
        this.serializer = serializer;
        return this;
    }

    public ClientBuilder addAcceptGZipMiddleware() {
        return addMiddleware(AcceptGZipMiddleware.of());
    }

    public ClientBuilder addErrorMiddleware() {
        requireNonNull(serializer);
        return addErrorMiddleware(ErrorMiddleware.of(serializer));
    }

    public ClientBuilder addErrorMiddleware(ErrorMiddleware errorMiddleware) {
        return withMiddlewares(setDefaultMiddlewares(errorMiddleware, internalLoggerMiddleware, middlewares));
    }

    public ClientBuilder addOAuthMiddleware(OAuthMiddleware oAuthMiddleware) {
        return addMiddleware(oAuthMiddleware);
    }

    public ClientBuilder addTokenSupplier(TokenSupplier tokenSupplier) {
        final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier);
        return addOAuthMiddleware(OAuthMiddleware.of(oAuthHandler));
    }

    public ClientBuilder addInternalLoggerMiddleware(InternalLoggerMiddleware internalLoggerMiddleware) {
        return withMiddlewares(setDefaultMiddlewares(errorMiddleware, internalLoggerMiddleware, middlewares));
    }

    private List<Middleware> setDefaultMiddlewares(ErrorMiddleware errorMiddleware,
            InternalLoggerMiddleware internalLoggerMiddleware, List<Middleware> middlewares) {
        this.errorMiddleware = errorMiddleware;
        this.internalLoggerMiddleware = internalLoggerMiddleware;
        List<Middleware> m = new ArrayList<>();
        if (errorMiddleware != null)
            m.add(errorMiddleware);
        if (internalLoggerMiddleware != null)
            m.add(internalLoggerMiddleware);
        m.addAll(middlewares.stream()
                .filter(middleware -> !(middleware instanceof ErrorMiddleware
                        || middleware instanceof InternalLoggerMiddleware))
                .collect(Collectors.toList()));
        return m;
    }

    public ClientBuilder addInternalLoggerFactory(InternalLoggerFactory internalLoggerFactory) {
        return addInternalLoggerMiddleware(InternalLoggerMiddleware.of(internalLoggerFactory));
    }

    public ClientBuilder withApiBaseUrl(String apiBaseUrl) {
        return withApiBaseUrl(URI.create(apiBaseUrl));
    }

    public ClientBuilder withApiBaseUrl(URI apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
        return this;
    }

    public ClientBuilder addUserAgentSupplier(Supplier<String> userAgentSupplier) {
        return addMiddleware(
            (request, next) -> next.apply(request.withHeader(ApiHttpHeaders.USER_AGENT, userAgentSupplier.get())));
    }

    public ClientBuilder addCorrelationIdProvider(@Nullable CorrelationIdProvider correlationIdProvider) {
        if (correlationIdProvider != null) {
            return addMiddleware((request, next) -> next.apply(
                request.withHeader(ApiHttpHeaders.X_CORRELATION_ID, correlationIdProvider.getCorrelationId())));
        }
        return this;
    }

    public ClientBuilder withMiddlewares(List<Middleware> middlewares) {
        this.middlewares = new ArrayList<>(middlewares);
        return this;
    }

    public ClientBuilder withMiddleware(Middleware middleware, Middleware... middlewares) {
        this.middlewares = new ArrayList<>(Collections.singletonList(middleware));
        if (middlewares.length > 0) {
            this.middlewares.addAll(Arrays.asList(middlewares));
        }
        return this;
    }

    public ClientBuilder addMiddlewares(List<Middleware> middlewares) {
        this.middlewares.addAll(middlewares);
        return this;
    }

    public ClientBuilder addMiddleware(Middleware middleware, Middleware... middlewares) {
        this.middlewares.add(middleware);
        if (middlewares.length > 0) {
            this.middlewares.addAll(Arrays.asList(middlewares));
        }
        return this;
    }

    public ApiHttpClient build() {
        requireNonNull(apiBaseUrl);
        requireNonNull(stack);
        requireNonNull(serializer);
        stack.addMiddlewares(middlewares);

        return ApiHttpClient.of(apiBaseUrl, stack, serializer);
    }

    public static String buildDefaultUserAgent() {
        String runtimeVersion = SystemUtils.JAVA_RUNTIME_VERSION;
        String osName = SystemUtils.OS_NAME;
        String osArch = SystemUtils.OS_ARCH;
        String sdkVersion = BuildInfo.VERSION;
        return "commercetools-java-sdks/" + sdkVersion + " " + " Java/" + runtimeVersion + " (" + osName + "; " + osArch
                + ")";
    }
}
