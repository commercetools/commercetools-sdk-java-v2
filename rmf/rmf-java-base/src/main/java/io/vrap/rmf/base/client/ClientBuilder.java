
package io.vrap.rmf.base.client;

import static java.util.Objects.requireNonNull;

import java.net.URI;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import dev.failsafe.spi.Scheduler;

import io.vrap.rmf.base.client.error.HttpExceptionFactory;
import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.*;

import org.apache.commons.lang3.SystemUtils;
import org.slf4j.event.Level;

/**
    <p>The ClientBuilder is used to configure and create an {@link ApiHttpClient}. As the ApiHttpClient uses a {@link HandlerStack stack}
    of middlewares the Builder comes with methods to configure and attach new middlewares. Also it ensures that some default
    used middlewares are instantiated at the correct location in the middleware stack.</p>

    <p>The default middlewares and services are added as Supplier to be able to override the ones provided by e.g.: {@link #defaultClient(URI)}</p>
 */
public class ClientBuilder implements Builder<ApiHttpClient> {
    public static final String COMMERCETOOLS = "commercetools";
    static final String userAgent = "commercetools-sdk-java-v2/";

    private URI apiBaseUrl;
    private boolean useAuthCircuitBreaker;
    private int authRetries;
    private Supplier<ErrorMiddleware> errorMiddleware;
    private Supplier<OAuthMiddleware> oAuthMiddleware;
    private Supplier<RetryRequestMiddleware> retryMiddleware;
    private Supplier<Middleware> correlationIdMiddleware;
    private InternalLoggerMiddleware internalLoggerMiddleware;
    private UserAgentMiddleware userAgentMiddleware;
    private List<Middleware> middlewares = new ArrayList<>();
    private Supplier<HandlerStack> stack;
    private VrapHttpClient httpClient;
    private VrapHttpClient oauthHttpClient;
    private Supplier<ResponseSerializer> serializer;
    private Supplier<HttpExceptionFactory> httpExceptionFactory;

    /**
     * <p>Creates a default client builder</p>
     * @return ClientBuilder instance
     */
    public static ClientBuilder of() {
        return new ClientBuilder();
    }

    /**
     * <p>Creates a client builder with a specific or preconfigured {@link VrapHttpClient} instance. Uses defaults for
     * the {@link HandlerStack}</p>
     * @param httpClient the HTTP client to be used
     * @return ClientBuilder instance
     */
    public static ClientBuilder of(final VrapHttpClient httpClient) {
        return new ClientBuilder(httpClient);
    }

    /**
     * <p>Creates a client builder with a specific or preconfigured {@link ApiHttpClient} instance. Uses defaults for
     * the {@link HandlerStack}</p>
     * @param httpClient the HTTP client to be used
     * @return ClientBuilder instance
     */
    public static ClientBuilder of(final ApiHttpClient httpClient) {
        return new ClientBuilder(httpClient);
    }

    /**
     * <p>Creates a client builder with a specifig {@link HandlerStack}</p>
     * @param stack the HandlerStack to be used
     * @return ClientBuilder instance
     */
    public static ClientBuilder of(final HandlerStack stack) {
        return new ClientBuilder(stack);
    }

    private ClientBuilder(final HandlerStack stack) {
        this.stack = () -> stack;
        ResponseSerializer serializer = ResponseSerializer.of();
        this.serializer = () -> serializer;
        this.httpExceptionFactory = () -> HttpExceptionFactory.of(this.serializer.get());
        this.useAuthCircuitBreaker = false;
        this.authRetries = 1;
    }

    private ClientBuilder() {
        this.httpClient = HttpClientSupplier.of().get();
        this.oauthHttpClient = httpClient;
        this.stack = stackSupplier();
        ResponseSerializer serializer = ResponseSerializer.of();
        this.serializer = () -> serializer;
        this.httpExceptionFactory = () -> HttpExceptionFactory.of(this.serializer.get());
        this.useAuthCircuitBreaker = false;
        this.authRetries = 1;
    }

    private ClientBuilder(final ApiHttpClient httpClient) {
        this.httpClient = httpClient;
        this.oauthHttpClient = HttpClientSupplier.of().get();
        this.stack = stackSupplier();
        ResponseSerializer serializer = ResponseSerializer.of();
        this.serializer = () -> serializer;
        this.httpExceptionFactory = () -> HttpExceptionFactory.of(this.serializer.get());
        this.authRetries = 1;
    }

    private ClientBuilder(final VrapHttpClient httpClient) {
        this.httpClient = httpClient;
        this.oauthHttpClient = httpClient;
        this.stack = stackSupplier();
        ResponseSerializer serializer = ResponseSerializer.of();
        this.serializer = () -> serializer;
        this.httpExceptionFactory = () -> HttpExceptionFactory.of(this.serializer.get());
        this.authRetries = 1;
    }

    /**
     * Ensures the order of default middlewares to create a {@link HandlerStack}
     * @return HandlerStack supplier method
     */
    private Supplier<HandlerStack> stackSupplier() {
        return () -> {
            final List<Middleware> middlewareStack = new ArrayList<>();
            Optional.ofNullable(errorMiddleware).map(m -> middlewareStack.add(m.get()));
            Optional.ofNullable(internalLoggerMiddleware).map(middlewareStack::add);
            Optional.ofNullable(userAgentMiddleware).map(middlewareStack::add);
            Optional.ofNullable(oAuthMiddleware).map(m -> middlewareStack.add(m.get()));
            Optional.ofNullable(retryMiddleware).map(m -> middlewareStack.add(m.get()));
            Optional.ofNullable(correlationIdMiddleware).map(m -> middlewareStack.add(m.get()));
            middlewareStack.addAll(middlewares);
            return HandlerStack.create(HttpHandler.create(requireNonNull(httpClient)), middlewareStack);
        };
    }

    /**
     * Ensures the order of default middlewares to create a {@link HandlerStack}
     * @return HandlerStack supplier method
     */
    private Supplier<HandlerStack> oauthHandlerSupplier() {
        return () -> {
            final List<Middleware> middlewareStack = new ArrayList<>();
            Optional.ofNullable(userAgentMiddleware).map(middlewareStack::add);
            Optional.ofNullable(correlationIdMiddleware).map(m -> middlewareStack.add(m.get()));
            return HandlerStack.create(HttpHandler.create(requireNonNull(oauthHttpClient)), middlewareStack);
        };
    }

    public ClientBuilder withoutAuthCircuitBreaker() {
        this.useAuthCircuitBreaker = false;
        return this;
    }

    public ClientBuilder withAuthCircuitBreaker() {
        this.useAuthCircuitBreaker = true;
        return this;
    }

    public ClientBuilder withAuthRetries(final int authRetries) {
        this.authRetries = authRetries;
        return this;
    }

    public ClientBuilder withHandlerStack(final HandlerStack stack) {
        this.stack = () -> stack;
        return this;
    }

    public ClientBuilder withHttpClient(final VrapHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    public ClientBuilder withOAuthHttpClient(final VrapHttpClient httpClient) {
        this.oauthHttpClient = httpClient;
        return this;
    }

    public ClientBuilder withSerializer(final ResponseSerializer serializer) {
        this.serializer = () -> serializer;
        return this;
    }

    public ClientBuilder withSerializer(final Supplier<ResponseSerializer> serializer) {
        this.serializer = serializer;
        return this;
    }

    public ClientBuilder withHttpExceptionFactory(final HttpExceptionFactory factory) {
        this.httpExceptionFactory = () -> factory;
        return this;
    }

    public ClientBuilder withHttpExceptionFactory(final Function<ResponseSerializer, HttpExceptionFactory> factory) {
        this.httpExceptionFactory = () -> factory.apply(serializer.get());
        return this;
    }

    /**
     * configures the Factory for HTTP exception in case.
     * @param factory
     * @return
     */
    public ClientBuilder withHttpExceptionFactory(final Supplier<HttpExceptionFactory> factory) {
        this.httpExceptionFactory = factory;
        return this;
    }

    /**
     * <p>Configures a client with the default middlewares and the given baseUrl</p>
     * <p>The following middlewares and services are configured:
     * <ul>
     *     <li>{@link ErrorMiddleware}</li>
     *     <li>{@link ResponseSerializer}</li>
     *     <li>{@link InternalLoggerFactory}</li>
     *     <li>{@link UserAgentMiddleware}</li>
     *     <li>{@link AcceptGZipMiddleware}</li>
     * </ul>
     * </p>
     * @param apiBaseUrl base URI for the API
     * @return ClientBuilder instance
     */
    public ClientBuilder defaultClient(final URI apiBaseUrl) {
        return withApiBaseUrl(apiBaseUrl).withErrorMiddleware()
                .withSerializer(ResponseSerializer.of())
                .withInternalLoggerFactory((request, topic) -> InternalLogger.getLogger(COMMERCETOOLS + "." + topic))
                .withUserAgentSupplier(ClientBuilder::buildDefaultUserAgent)
                .addAcceptGZipMiddleware();
    }

    public ClientBuilder defaultClient(final String apiBaseUrl) {
        return defaultClient(URI.create(apiBaseUrl));
    }

    public ClientBuilder defaultClient(final String apiBaseUrl, final ClientCredentials credentials,
            final String tokenEndpoint) {
        return defaultClient(apiBaseUrl).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public ClientBuilder defaultClient(final ClientCredentials credentials,
            final ServiceRegionConfig serviceRegionConfig) {
        return defaultClient(serviceRegionConfig.getApiUrl()).withClientCredentialsFlow(credentials,
            serviceRegionConfig.getOAuthTokenUrl());
    }

    /**
     * @deprecated use {@link #withClientCredentialsFlow(ClientCredentials, String)} instead
     * @param credentials OAuth credentials
     * @param tokenEndpoint OAuth endpoint
     * @return client builder
     */
    @Deprecated
    public ClientBuilder withClientCredentials(final ClientCredentials credentials, final String tokenEndpoint) {
        return withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    /**
     * @deprecated use {@link #withClientCredentialsFlow(ClientCredentials, String, VrapHttpClient)} instead
     * @param credentials OAuth credentials
     * @param tokenEndpoint OAuth endpoint
     * @param httpClient HTTP client to be used
     * @return client builder
     */
    @Deprecated
    public ClientBuilder withClientCredentials(final ClientCredentials credentials, final String tokenEndpoint,
            VrapHttpClient httpClient) {
        return withClientCredentialsFlow(credentials, tokenEndpoint, httpClient);
    }

    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint) {
        return withClientCredentialsFlow(credentials, tokenEndpoint.toString());
    }

    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            Supplier<HandlerStack> httpClientSupplier) {
        return withClientCredentialsFlow(credentials, tokenEndpoint.toString(), httpClientSupplier);
    }

    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            VrapHttpClient httpClient) {
        return withClientCredentialsFlow(credentials, tokenEndpoint.toString(), httpClient);
    }

    private TokenSupplier createClientCredentialsTokenSupplier(final ClientCredentials credentials,
            final String tokenEndpoint, final VrapHttpClient httpClient) {
        return new ClientCredentialsTokenSupplier(credentials.getClientId(), credentials.getClientSecret(),
            credentials.getScopes(), tokenEndpoint, httpClient);
    }

    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        return withClientCredentialsFlow(credentials, tokenEndpoint, oauthHandlerSupplier());
    }

    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            Supplier<HandlerStack> httpClientSupplier) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(
            createClientCredentialsTokenSupplier(credentials, tokenEndpoint, httpClientSupplier.get())));
    }

    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            VrapHttpClient httpClient) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(
            createClientCredentialsTokenSupplier(credentials, tokenEndpoint, httpClient)));
    }

    public ClientBuilder withStaticTokenFlow(final AuthenticationToken token) {
        return withTokenSupplier(new StaticTokenSupplier(token));
    }

    public ClientBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        return withAnonymousSessionFlow(credentials, tokenEndpoint, oauthHandlerSupplier());
    }

    public ClientBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            Supplier<HandlerStack> httpClientSupplier) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(
            createAnonymousSessionTokenSupplier(credentials, tokenEndpoint, httpClientSupplier.get())));
    }

    public ClientBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            VrapHttpClient httpClient) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(
            createAnonymousSessionTokenSupplier(credentials, tokenEndpoint, httpClient)));
    }

    private TokenSupplier createAnonymousSessionTokenSupplier(final ClientCredentials credentials,
            final String tokenEndpoint, final VrapHttpClient httpClient) {
        return new AnonymousSessionTokenSupplier(credentials.getClientId(), credentials.getClientSecret(),
            credentials.getScopes(), tokenEndpoint, httpClient);
    }

    public ClientBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage) {
        return withAnonymousRefreshFlow(credentials, anonTokenEndpoint, refreshTokenEndpoint, storage,
            oauthHandlerSupplier());
    }

    public ClientBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage, Supplier<HandlerStack> httpClientSupplier) {
        return withTokenSupplier(() -> createAnonymousRefreshFlowSupplier(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage, httpClientSupplier.get()));
    }

    public ClientBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage, VrapHttpClient httpClient) {
        return withTokenSupplier(() -> createAnonymousRefreshFlowSupplier(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage, httpClient));
    }

    private TokenSupplier createInMemoryTokenSupplier(TokenSupplier tokenSupplier) {
        return new InMemoryTokenSupplier(tokenSupplier);
    }

    private TokenSupplier createAnonymousRefreshFlowSupplier(final ClientCredentials credentials,
            final String anonTokenEndpoint, final String refreshTokenEndpoint, final TokenStorage tokenStorage,
            final VrapHttpClient httpClient) {
        final RefreshFlowTokenSupplier refreshFlowTokenSupplier = createRefreshFlowSupplier(credentials,
            refreshTokenEndpoint, tokenStorage, httpClient);

        final AnonymousFlowTokenSupplier anonymousFlowTokenSupplier = new AnonymousFlowTokenSupplier(
            credentials.getClientId(), credentials.getClientSecret(), credentials.getScopes(), anonTokenEndpoint,
            refreshFlowTokenSupplier, httpClient);

        return new TokenStorageSupplier(tokenStorage, anonymousFlowTokenSupplier);
    }

    private RefreshFlowTokenSupplier createRefreshFlowSupplier(final ClientCredentials credentials,
            final String tokenEndpoint, final TokenStorage tokenStorage, final VrapHttpClient httpClient) {
        return new RefreshFlowTokenSupplier(credentials.getClientId(), credentials.getClientSecret(), tokenEndpoint,
            tokenStorage, httpClient);
    }

    public ClientBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint) {
        return withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint, oauthHandlerSupplier());
    }

    public ClientBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, Supplier<HandlerStack> httpClientSupplier) {
        return withTokenSupplier(
            () -> createInMemoryTokenSupplier(createGlobalCustomerPasswordTokenSupplier(credentials, email, password,
                tokenEndpoint, httpClientSupplier.get())));
    }

    public ClientBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, VrapHttpClient httpClient) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(
            createGlobalCustomerPasswordTokenSupplier(credentials, email, password, tokenEndpoint, httpClient)));
    }

    private TokenSupplier createGlobalCustomerPasswordTokenSupplier(final ClientCredentials credentials,
            final String email, final String password, final String tokenEndpoint, final VrapHttpClient httpClient) {
        return new GlobalCustomerPasswordTokenSupplier(credentials.getClientId(), credentials.getClientSecret(), email,
            password, credentials.getScopes(), tokenEndpoint, httpClient);
    }

    public ClientBuilder addAcceptGZipMiddleware() {
        return addMiddleware(AcceptGZipMiddleware.of());
    }

    public ClientBuilder withErrorMiddleware(final Supplier<ErrorMiddleware> errorMiddleware) {
        this.errorMiddleware = errorMiddleware;
        return this;
    }

    public ClientBuilder withErrorMiddleware() {
        return withErrorMiddleware(() -> ErrorMiddleware.of(httpExceptionFactory.get()));
    }

    public ClientBuilder withErrorMiddleware(final ErrorMiddleware errorMiddleware) {
        return withErrorMiddleware(() -> errorMiddleware);
    }

    public ClientBuilder withErrorMiddleware(ErrorMiddleware.ExceptionMode exceptionMode) {
        return withErrorMiddleware(() -> ErrorMiddleware.of(httpExceptionFactory.get(), exceptionMode));
    }

    public ClientBuilder addNotFoundExceptionMiddleware() {
        return addNotFoundExceptionMiddleware(NotFoundExceptionMiddleware.of());
    }

    public ClientBuilder addNotFoundExceptionMiddleware(final Set<ApiHttpMethod> methods) {
        return addNotFoundExceptionMiddleware(NotFoundExceptionMiddleware.of(methods));
    }

    public ClientBuilder addNotFoundExceptionMiddleware(final Predicate<ApiHttpRequest> requestPredicate) {
        return addNotFoundExceptionMiddleware(NotFoundExceptionMiddleware.of(requestPredicate));
    }

    public ClientBuilder addNotFoundExceptionMiddleware(final NotFoundExceptionMiddleware exceptionMiddleware) {
        return addMiddleware(exceptionMiddleware);
    }

    public ClientBuilder withRetryMiddleware(final Supplier<RetryRequestMiddleware> retryMiddleware) {
        this.retryMiddleware = retryMiddleware;
        return this;
    }

    public ClientBuilder withRetryMiddleware(final RetryRequestMiddleware retryMiddleware) {
        return withRetryMiddleware(() -> retryMiddleware);
    }

    public ClientBuilder withRetryMiddleware(final int maxRetries) {
        return withRetryMiddleware(RetryRequestMiddleware.of(maxRetries));
    }

    public ClientBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes) {
        return withRetryMiddleware(RetryRequestMiddleware.of(maxRetries, statusCodes));
    }

    public ClientBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        return withRetryMiddleware(RetryRequestMiddleware.of(maxRetries, statusCodes, failures));
    }

    public ClientBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return withRetryMiddleware(
            RetryRequestMiddleware.of(maxRetries, delay, maxDelay, RetryRequestMiddleware.handleFailures(failures)
                    .andThen(RetryRequestMiddleware.handleStatusCodes(statusCodes).andThen(fn))));
    }

    public ClientBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return withRetryMiddleware(RetryRequestMiddleware.of(maxRetries, delay, maxDelay, fn));
    }

    public ClientBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries) {
        return withRetryMiddleware(RetryRequestMiddleware.of(executorService, maxRetries));
    }

    public ClientBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes) {
        return withRetryMiddleware(RetryRequestMiddleware.of(executorService, maxRetries, statusCodes));
    }

    public ClientBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return withRetryMiddleware(RetryRequestMiddleware.of(executorService, maxRetries, statusCodes, failures));
    }

    public ClientBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures, final FailsafeRetryPolicyBuilderOptions fn) {
        return withRetryMiddleware(RetryRequestMiddleware.of(executorService, maxRetries, delay, maxDelay,
            RetryRequestMiddleware.handleFailures(failures)
                    .andThen(RetryRequestMiddleware.handleStatusCodes(statusCodes).andThen(fn))));
    }

    public ClientBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return withRetryMiddleware(RetryRequestMiddleware.of(executorService, maxRetries, delay, maxDelay, fn));
    }

    public ClientBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries) {
        return withRetryMiddleware(RetryRequestMiddleware.of(executorService, maxRetries));
    }

    public ClientBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes) {
        return withRetryMiddleware(RetryRequestMiddleware.of(executorService, maxRetries, statusCodes));
    }

    public ClientBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return withRetryMiddleware(RetryRequestMiddleware.of(executorService, maxRetries, statusCodes, failures));
    }

    public ClientBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures, final FailsafeRetryPolicyBuilderOptions fn) {
        return withRetryMiddleware(RetryRequestMiddleware.of(executorService, maxRetries, delay, maxDelay,
            RetryRequestMiddleware.handleFailures(failures)
                    .andThen(RetryRequestMiddleware.handleStatusCodes(statusCodes).andThen(fn))));
    }

    public ClientBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return withRetryMiddleware(RetryRequestMiddleware.of(executorService, maxRetries, delay, maxDelay, fn));
    }

    public ClientBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries) {
        return withRetryMiddleware(RetryRequestMiddleware.of(scheduler, maxRetries));
    }

    public ClientBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries,
            List<Integer> statusCodes) {
        return withRetryMiddleware(RetryRequestMiddleware.of(scheduler, maxRetries, statusCodes));
    }

    public ClientBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        return withRetryMiddleware(RetryRequestMiddleware.of(scheduler, maxRetries, statusCodes, failures));
    }

    public ClientBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries, final long delay,
            final long maxDelay, List<Integer> statusCodes, final List<Class<? extends Throwable>> failures,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return withRetryMiddleware(RetryRequestMiddleware.of(scheduler, maxRetries, delay, maxDelay,
            RetryRequestMiddleware.handleFailures(failures)
                    .andThen(RetryRequestMiddleware.handleStatusCodes(statusCodes).andThen(fn))));
    }

    public ClientBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries, final long delay,
            final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return withRetryMiddleware(RetryRequestMiddleware.of(scheduler, maxRetries, delay, maxDelay, fn));
    }

    public ClientBuilder withOAuthMiddleware(final Supplier<OAuthMiddleware> oAuthMiddleware) {
        this.oAuthMiddleware = oAuthMiddleware;
        return this;
    }

    public ClientBuilder withOAuthMiddleware(final OAuthMiddleware oAuthMiddleware) {
        return withOAuthMiddleware(() -> oAuthMiddleware);
    }

    public ClientBuilder withTokenSupplier(final Supplier<TokenSupplier> tokenSupplier) {
        return withOAuthMiddleware(() -> {
            final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier.get());
            return OAuthMiddleware.of(oAuthHandler, authRetries, useAuthCircuitBreaker);
        });
    }

    public ClientBuilder withTokenSupplier(final TokenSupplier tokenSupplier) {
        return withTokenSupplier(() -> tokenSupplier);
    }

    public ClientBuilder withInternalLoggerMiddleware(final InternalLoggerMiddleware internalLoggerMiddleware) {
        this.internalLoggerMiddleware = internalLoggerMiddleware;
        return this;
    }

    public ClientBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory) {
        return withInternalLoggerMiddleware(InternalLoggerMiddleware.of(internalLoggerFactory));
    }

    public ClientBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent) {
        return withInternalLoggerMiddleware(
            InternalLoggerMiddleware.of(internalLoggerFactory, responseLogEvent, deprecationLogEvent));
    }

    public ClientBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents) {
        return withInternalLoggerMiddleware(InternalLoggerMiddleware.of(internalLoggerFactory, responseLogEvent,
            deprecationLogEvent, defaultExceptionLogEvent, exceptionLogEvents));
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

    public ClientBuilder addCorrelationIdProvider(final @Nullable CorrelationIdProvider correlationIdProvider,
            final boolean replace) {
        if (!replace && correlationIdMiddleware != null) {
            return this;
        }
        if (correlationIdProvider != null) {
            correlationIdMiddleware = () -> (request, next) -> {
                if (request.getHeaders().getFirst(ApiHttpHeaders.X_CORRELATION_ID) != null) {
                    return next.apply(request);
                }
                return next.apply(
                    request.withHeader(ApiHttpHeaders.X_CORRELATION_ID, correlationIdProvider.getCorrelationId()));
            };
        }
        return this;
    }

    public ClientBuilder addCorrelationIdProvider(final @Nullable CorrelationIdProvider correlationIdProvider) {
        return addCorrelationIdProvider(correlationIdProvider, true);
    }

    /**
     * sets the middlewares to be configured for the client.
     * @param middlewares {@link Middleware} instances
     * @return ClientBuilder instance
     */
    public ClientBuilder withMiddlewares(final List<Middleware> middlewares) {
        this.middlewares = new ArrayList<>(middlewares);
        return this;
    }

    /**
     * sets the middlewares to be configured for the client.
     * @param middlewares {@link Middleware} instances
     * @return ClientBuilder instance
     */
    public ClientBuilder withMiddleware(final Middleware middleware, final Middleware... middlewares) {
        this.middlewares = new ArrayList<>(Collections.singletonList(middleware));
        if (middlewares.length > 0) {
            this.middlewares.addAll(Arrays.asList(middlewares));
        }
        return this;
    }

    /**
     * adds the middlewares to be configured for the client.
     * @param middlewares {@link Middleware} instances
     * @return ClientBuilder instance
     */
    public ClientBuilder addMiddlewares(final List<Middleware> middlewares) {
        this.middlewares.addAll(middlewares);
        return this;
    }

    /**
     * adds the middlewares to be configured for the client.
     * @param middlewares {@link Middleware} instances
     * @return ClientBuilder instance
     */
    public ClientBuilder addMiddleware(final Middleware middleware, final Middleware... middlewares) {
        this.middlewares.add(middleware);
        if (middlewares.length > 0) {
            this.middlewares.addAll(Arrays.asList(middlewares));
        }
        return this;
    }

    public ApiHttpClient build() {
        return ApiHttpClient.of(requireNonNull(apiBaseUrl), requireNonNull(stack.get()),
            requireNonNull(serializer.get()));
    }

    public static String buildDefaultUserAgent() {
        String runtimeVersion = SystemUtils.JAVA_RUNTIME_VERSION;
        String osName = SystemUtils.OS_NAME;
        String osArch = SystemUtils.OS_ARCH;
        String sdkVersion = BuildInfo.VERSION;
        return userAgent + sdkVersion + " " + " Java/" + runtimeVersion + " (" + osName + "; " + osArch + ")";
    }
}
