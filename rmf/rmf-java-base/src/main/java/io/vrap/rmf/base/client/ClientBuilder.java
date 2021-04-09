
package io.vrap.rmf.base.client;

import static java.util.Objects.requireNonNull;

import java.net.URI;
import java.util.*;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.apache.commons.lang3.SystemUtils;

public class ClientBuilder {
    public static final String COMMERCETOOLS = "commercetools";

    private URI apiBaseUrl;
    private Supplier<ErrorMiddleware> errorMiddleware;
    private Supplier<OAuthMiddleware> oAuthMiddleware;
    private InternalLoggerMiddleware internalLoggerMiddleware;
    private UserAgentMiddleware userAgentMiddleware;
    private List<Middleware> middlewares = new ArrayList<>();
    private Supplier<HandlerStack> stack;
    private VrapHttpClient httpClient;
    private ResponseSerializer serializer;

    public static ClientBuilder of() {
        return new ClientBuilder();
    }

    public static ClientBuilder of(final VrapHttpClient httpClient) {
        return new ClientBuilder(httpClient);
    }

    public static ClientBuilder of(final HandlerStack stack) {
        return new ClientBuilder(stack);
    }

    private ClientBuilder(final HandlerStack stack) {
        this.stack = () -> stack;
        this.serializer = ResponseSerializer.of();
    }

    private ClientBuilder() {
        this.httpClient = HttpClientSupplier.of().get();
        this.stack = stackSupplier();
        this.serializer = ResponseSerializer.of();
    }

    private Supplier<HandlerStack> stackSupplier() {
        return () -> {
            final List<Middleware> middlewareStack = new ArrayList<>();
            Optional.ofNullable(errorMiddleware).map(m -> middlewareStack.add(m.get()));
            Optional.ofNullable(internalLoggerMiddleware).map(middlewareStack::add);
            Optional.ofNullable(userAgentMiddleware).map(middlewareStack::add);
            Optional.ofNullable(oAuthMiddleware).map(m -> middlewareStack.add(m.get()));
            middlewareStack.addAll(middlewares);
            return HandlerStack.create(HttpHandler.create(requireNonNull(httpClient)), middlewareStack);
        };
    }

    private ClientBuilder(final VrapHttpClient httpClient) {
        this.httpClient = httpClient;
        this.stack = stackSupplier();
        this.serializer = ResponseSerializer.of();
    }

    public ClientBuilder withHandlerStack(final HandlerStack stack) {
        this.stack = () -> stack;
        return this;
    }

    public ClientBuilder withHttpClient(final VrapHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    public ClientBuilder withSerializer(final ResponseSerializer serializer) {
        this.serializer = serializer;
        return this;
    }

    public ClientBuilder defaultClient(final String apiBaseUrl) {
        return withApiBaseUrl(apiBaseUrl).withErrorMiddleware()
                .withSerializer(ResponseSerializer.of())
                .withInternalLoggerFactory((request, topic) -> InternalLogger.getLogger(COMMERCETOOLS + "." + topic))
                .withUserAgentSupplier(ClientBuilder::buildDefaultUserAgent)
                .addAcceptGZipMiddleware();
    }

    public ClientBuilder defaultClient(final String apiBaseUrl, final ClientCredentials credentials,
            final String tokenEndpoint) {
        return defaultClient(apiBaseUrl).withClientCredentials(credentials, tokenEndpoint);
    }

    public ClientBuilder withClientCredentials(final ClientCredentials credentials, final String tokenEndpoint) {
        this.oAuthMiddleware = () -> {
            final TokenSupplier tokenSupplier = createClientCredentialsTokenSupplier(credentials, tokenEndpoint,
                requireNonNull(httpClient));
            final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier);
            return OAuthMiddleware.of(oAuthHandler);
        };

        return this;
    }

    public ClientBuilder withClientCredentials(final ClientCredentials credentials, final String tokenEndpoint,
            VrapHttpClient httpClient) {
        return withTokenSupplier(createClientCredentialsTokenSupplier(credentials, tokenEndpoint, httpClient));
    }

    private TokenSupplier createClientCredentialsTokenSupplier(final ClientCredentials credentials,
            final String tokenEndpoint, final VrapHttpClient httpClient) {
        return new ClientCredentialsTokenSupplier(credentials.getClientId(), credentials.getClientSecret(),
            credentials.getScopes(), tokenEndpoint, httpClient);
    }

    public ClientBuilder addAcceptGZipMiddleware() {
        return addMiddleware(AcceptGZipMiddleware.of());
    }

    public ClientBuilder withErrorMiddleware(final Supplier<ErrorMiddleware> errorMiddleware) {
        this.errorMiddleware = errorMiddleware;
        return this;
    }

    public ClientBuilder withErrorMiddleware() {
        return withErrorMiddleware(() -> ErrorMiddleware.of(serializer));
    }

    public ClientBuilder withErrorMiddleware(final ErrorMiddleware errorMiddleware) {
        return withErrorMiddleware(() -> errorMiddleware);
    }

    public ClientBuilder withOAuthMiddleware(final Supplier<OAuthMiddleware> oAuthMiddleware) {
        this.oAuthMiddleware = oAuthMiddleware;
        return this;
    }

    public ClientBuilder withOAuthMiddleware(final OAuthMiddleware oAuthMiddleware) {
        return withOAuthMiddleware(() -> oAuthMiddleware);
    }

    public ClientBuilder withTokenSupplier(final TokenSupplier tokenSupplier) {
        final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier);
        return withOAuthMiddleware(OAuthMiddleware.of(oAuthHandler));
    }

    public ClientBuilder withInternalLoggerMiddleware(final InternalLoggerMiddleware internalLoggerMiddleware) {
        this.internalLoggerMiddleware = internalLoggerMiddleware;
        return this;
    }

    public ClientBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory) {
        return withInternalLoggerMiddleware(InternalLoggerMiddleware.of(internalLoggerFactory));
    }

    public ClientBuilder withApiBaseUrl(String apiBaseUrl) {
        return withApiBaseUrl(URI.create(apiBaseUrl));
    }

    public ClientBuilder withApiBaseUrl(final URI apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
        return this;
    }

    public ClientBuilder withUserAgentSupplier(final Supplier<String> userAgentSupplier) {
        return withUserAgentMiddleware(new UserAgentMiddleware(userAgentSupplier.get()));
    }

    private ClientBuilder withUserAgentMiddleware(final UserAgentMiddleware userAgentMiddleware) {
        this.userAgentMiddleware = userAgentMiddleware;
        return this;
    }

    public ClientBuilder addCorrelationIdProvider(final @Nullable CorrelationIdProvider correlationIdProvider) {
        if (correlationIdProvider != null) {
            return addMiddleware((request, next) -> next.apply(
                request.withHeader(ApiHttpHeaders.X_CORRELATION_ID, correlationIdProvider.getCorrelationId())));
        }
        return this;
    }

    public ClientBuilder withMiddlewares(final List<Middleware> middlewares) {
        this.middlewares = new ArrayList<>(middlewares);
        return this;
    }

    public ClientBuilder withMiddleware(final Middleware middleware, final Middleware... middlewares) {
        this.middlewares = new ArrayList<>(Collections.singletonList(middleware));
        if (middlewares.length > 0) {
            this.middlewares.addAll(Arrays.asList(middlewares));
        }
        return this;
    }

    public ClientBuilder addMiddlewares(final List<Middleware> middlewares) {
        this.middlewares.addAll(middlewares);
        return this;
    }

    public ClientBuilder addMiddleware(final Middleware middleware, final Middleware... middlewares) {
        this.middlewares.add(middleware);
        if (middlewares.length > 0) {
            this.middlewares.addAll(Arrays.asList(middlewares));
        }
        return this;
    }

    public ApiHttpClient build() {
        return ApiHttpClient.of(requireNonNull(apiBaseUrl), requireNonNull(stack.get()), requireNonNull(serializer));
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
