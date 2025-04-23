
package io.vrap.rmf.base.client;

import static java.util.Objects.requireNonNull;

import java.net.URI;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.error.HttpExceptionFactory;
import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.*;

import org.slf4j.event.Level;

import dev.failsafe.spi.Scheduler;

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
    private PolicyBuilder policyBuilder;
    private RequestPolicyBuilder requestPolicyBuilder;
    private Supplier<PolicyMiddleware> policyMiddleware;
    private Supplier<QueueRequestMiddleware> queueMiddleware;
    private Supplier<Middleware> correlationIdMiddleware;
    private InternalLoggerMiddleware internalLoggerMiddleware;
    private UserAgentMiddleware userAgentMiddleware;

    private Supplier<TelemetryMiddleware> telemetryMiddleware;
    private List<Middleware> middlewares = new ArrayList<>();
    private Supplier<HandlerStack> stack;
    private VrapHttpClient httpClient;
    private VrapHttpClient oauthHttpClient;
    private Supplier<ResponseSerializer> serializer;
    private Supplier<HttpExceptionFactory> httpExceptionFactory;

    private Supplier<ExecutorService> oauthExecutorService = ForkJoinPool::new;
    /**
     * <p>Creates a default client builder</p>
     * @return ClientBuilder instance
     */
    public static ClientBuilder of() {
        return new ClientBuilder();
    }

    public static ClientBuilder of(ExecutorService httpClientExecutorService) {
        return new ClientBuilder(httpClientExecutorService);
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
        this.serializer = ResponseSerializer::of;
        this.httpExceptionFactory = () -> HttpExceptionFactory.of(this.serializer.get());
        this.useAuthCircuitBreaker = false;
        this.authRetries = 1;
    }

    private ClientBuilder() {
        this.httpClient = HttpClientSupplier.of(new ForkJoinPool()).get();
        this.oauthHttpClient = httpClient;
        this.stack = stackSupplier();
        this.serializer = ResponseSerializer::of;
        this.httpExceptionFactory = () -> HttpExceptionFactory.of(this.serializer.get());
        this.useAuthCircuitBreaker = false;
        this.authRetries = 1;
    }

    private ClientBuilder(ExecutorService httpClientExecutorService) {
        this.httpClient = HttpClientSupplier.of(httpClientExecutorService).get();
        this.oauthHttpClient = httpClient;
        this.stack = stackSupplier();
        this.serializer = ResponseSerializer::of;
        this.httpExceptionFactory = () -> HttpExceptionFactory.of(this.serializer.get());
        this.useAuthCircuitBreaker = false;
        this.authRetries = 1;
    }

    private ClientBuilder(final ApiHttpClient httpClient) {
        this.httpClient = httpClient;
        this.oauthHttpClient = HttpClientSupplier.of(new ForkJoinPool()).get();
        this.stack = stackSupplier();
        this.serializer = ResponseSerializer::of;
        this.httpExceptionFactory = () -> HttpExceptionFactory.of(this.serializer.get());
        this.authRetries = 1;
    }

    private ClientBuilder(final VrapHttpClient httpClient) {
        this.httpClient = httpClient;
        this.oauthHttpClient = httpClient;
        this.stack = stackSupplier();
        this.serializer = ResponseSerializer::of;
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
            Optional.ofNullable(telemetryMiddleware).map(m -> middlewareStack.add(m.get()));
            Optional.ofNullable(errorMiddleware).map(m -> middlewareStack.add(m.get()));
            Optional.ofNullable(internalLoggerMiddleware).map(middlewareStack::add);
            Optional.ofNullable(userAgentMiddleware).map(middlewareStack::add);
            Optional.ofNullable(oAuthMiddleware).map(m -> middlewareStack.add(m.get()));
            Optional.ofNullable(policyMiddleware).map(m -> middlewareStack.add(m.get()));
            Optional.ofNullable(retryMiddleware).map(m -> middlewareStack.add(m.get()));
            Optional.ofNullable(queueMiddleware).map(m -> middlewareStack.add(m.get()));
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

    /**
     * deactivates the circuit breaker for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withoutAuthCircuitBreaker() {
        this.useAuthCircuitBreaker = false;
        return this;
    }

    /**
     * activates the circuit breaker for authentication. Upon erroneous authentication e.g. the authentication
     * middleware will open the circuit breaker and retry regularly.
     * @return ClientBuilder instance
     */
    public ClientBuilder withAuthCircuitBreaker() {
        this.useAuthCircuitBreaker = true;
        return this;
    }

    /**
     * @param authRetries number of retries for authentication before giving up.
     * @return ClientBuilder instance
     */
    public ClientBuilder withAuthRetries(final int authRetries) {
        this.authRetries = authRetries;
        return this;
    }

    /**
     * @param stack {@link HandlerStack} to be used for the HTTP requests
     * @return ClientBuilder instance
     */
    public ClientBuilder withHandlerStack(final HandlerStack stack) {
        this.stack = () -> stack;
        return this;
    }

    /**
     * @param httpClient {@link VrapHttpClient} to be used for the HTTP requests
     * @return ClientBuilder instance
     */
    public ClientBuilder withHttpClient(final VrapHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /**
     * @param httpClient {@link VrapHttpClient} to be used for the OAuth requests
     * @return ClientBuilder instance
     */
    public ClientBuilder withOAuthHttpClient(final VrapHttpClient httpClient) {
        this.oauthHttpClient = httpClient;
        return this;
    }

    /**
     * @param serializer {@link ResponseSerializer} to be used for de-/serialization
     * @return ClientBuilder instance
     */
    public ClientBuilder withSerializer(final ResponseSerializer serializer) {
        this.serializer = () -> serializer;
        return this;
    }

    /**
     * @param serializer {@link ResponseSerializer} to be used for de-/serialization
     * @return ClientBuilder instance
     */
    public ClientBuilder withSerializer(final Supplier<ResponseSerializer> serializer) {
        this.serializer = serializer;
        return this;
    }

    /**
     * @param factory {@link HttpExceptionFactory} to be used for creating Exceptions based on response status code
     * @return ClientBuilder instance
     */
    public ClientBuilder withHttpExceptionFactory(final HttpExceptionFactory factory) {
        this.httpExceptionFactory = () -> factory;
        return this;
    }

    /**
     * @param factory function to create {@link HttpExceptionFactory} to be used for creating Exceptions based on response
     * status code with the configured {@link ResponseSerializer}
     * @return ClientBuilder instance
     */
    public ClientBuilder withHttpExceptionFactory(final Function<ResponseSerializer, HttpExceptionFactory> factory) {
        this.httpExceptionFactory = () -> factory.apply(serializer.get());
        return this;
    }

    /**
     * configures the Factory for HTTP exception in case.
     * @param factory {@link HttpExceptionFactory} to be used for creating Exceptions based on response status code
     * @return ClientBuilder instance
     */
    public ClientBuilder withHttpExceptionFactory(final Supplier<HttpExceptionFactory> factory) {
        this.httpExceptionFactory = factory;
        return this;
    }

    /**
     * configures an ExecutorService to be used for the Middlewares
     * @param executorService supplier of the executor service to be used
     * @return ClientBuilder instance
     */
    public ClientBuilder withOAuthExecutorService(final Supplier<ExecutorService> executorService) {
        this.oauthExecutorService = executorService;
        return this;
    }

    /**
     * configures an ExecutorService to be used for the Middlewares
     * @param executorService executor service to be used
     * @return ClientBuilder instance
     */
    public ClientBuilder withOAuthExecutorService(final ExecutorService executorService) {
        this.oauthExecutorService = () -> executorService;
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
                .withSerializer(ResponseSerializer::of)
                .withInternalLoggerFactory((request, topic) -> InternalLogger.getLogger(COMMERCETOOLS + "." + topic))
                .withUserAgentSupplier(ClientBuilder::buildDefaultUserAgent)
                .addAcceptGZipMiddleware();
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
    public ClientBuilder defaultClient(final String apiBaseUrl) {
        return defaultClient(URI.create(apiBaseUrl));
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
     * @param credentials {@link ClientCredentials} to be used
     * @param tokenEndpoint token endpoint URI to be used for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder defaultClient(final String apiBaseUrl, final ClientCredentials credentials,
            final String tokenEndpoint) {
        return defaultClient(apiBaseUrl).withClientCredentialsFlow(credentials, tokenEndpoint);
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
     * @param credentials {@link ClientCredentials} to be used
     * @param serviceRegionConfig {@link ServiceRegionConfig} to be used
     * @return ClientBuilder instance
     */
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
            final VrapHttpClient httpClient) {
        return withClientCredentialsFlow(credentials, tokenEndpoint, httpClient);
    }

    /**
     * configure the client to use client credentials flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint) {
        return withClientCredentialsFlow(credentials, tokenEndpoint.toString());
    }

    /**
     * configure the client to use client credentials flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @param httpClientSupplier {@link HandlerStack} to use for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            final Supplier<HandlerStack> httpClientSupplier) {
        return withClientCredentialsFlow(credentials, tokenEndpoint.toString(), httpClientSupplier);
    }

    /**
     * configure the client to use client credentials flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @param httpClient {@link VrapHttpClient} to use for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            final VrapHttpClient httpClient) {
        return withClientCredentialsFlow(credentials, tokenEndpoint.toString(), httpClient);
    }

    private TokenSupplier createClientCredentialsTokenSupplier(final ClientCredentials credentials,
            final String tokenEndpoint, final VrapHttpClient httpClient, final ResponseSerializer serializer) {
        return new ClientCredentialsTokenSupplier(credentials.getClientId(), credentials.getClientSecret(),
            credentials.getScopes(), tokenEndpoint, httpClient, serializer);
    }

    /**
     * configure the client to use client credentials flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        return withClientCredentialsFlow(credentials, tokenEndpoint, oauthHandlerSupplier());
    }

    /**
     * configure the client to use client credentials flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @param httpClientSupplier {@link VrapHttpClient} to use for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final Supplier<HandlerStack> httpClientSupplier) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(createClientCredentialsTokenSupplier(credentials,
            tokenEndpoint, httpClientSupplier.get(), serializer.get())));
    }

    /**
     * configure the client to use client credentials flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @param httpClient {@link VrapHttpClient} to use for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(
            createClientCredentialsTokenSupplier(credentials, tokenEndpoint, httpClient, serializer.get())));
    }

    /**
     * configure the client to use client credentials flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @param httpClient {@link VrapHttpClient} to use for authentication
     * @param serializer {@link ResponseSerializer} to be used for token deserialization
     * @return ClientBuilder instance
     */
    public ClientBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient, final ResponseSerializer serializer) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(
            createClientCredentialsTokenSupplier(credentials, tokenEndpoint, httpClient, serializer)));
    }

    /**
     * configure the client to use client credentials flow
     * @param token {@link AuthenticationToken} to be used requests
     * @return ClientBuilder instance
     */
    public ClientBuilder withStaticTokenFlow(final AuthenticationToken token) {
        return withTokenSupplier(new StaticTokenSupplier(token));
    }

    /**
     * configure the client to use anonymous session flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        return withAnonymousSessionFlow(credentials, tokenEndpoint, oauthHandlerSupplier());
    }

    /**
     * configure the client to use anonymous session flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @param httpClientSupplier {@link HandlerStack} to use for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final Supplier<HandlerStack> httpClientSupplier) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(createAnonymousSessionTokenSupplier(credentials,
            tokenEndpoint, httpClientSupplier.get(), serializer.get())));
    }

    /**
     * configure the client to use anonymous session flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @param httpClient {@link VrapHttpClient} to use for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(
            createAnonymousSessionTokenSupplier(credentials, tokenEndpoint, httpClient, serializer.get())));
    }

    /**
     * configure the client to use anonymous session flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for authentication
     * @param httpClient {@link VrapHttpClient} to use for authentication
     * @param serializer {@link ResponseSerializer} to be used for token deserialization
     * @return ClientBuilder instance
     */
    public ClientBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient, final ResponseSerializer serializer) {
        return withTokenSupplier(() -> createInMemoryTokenSupplier(
            createAnonymousSessionTokenSupplier(credentials, tokenEndpoint, httpClient, serializer)));
    }

    private TokenSupplier createAnonymousSessionTokenSupplier(final ClientCredentials credentials,
            final String tokenEndpoint, final VrapHttpClient httpClient, final ResponseSerializer serializer) {
        return new AnonymousSessionTokenSupplier(credentials.getClientId(), credentials.getClientSecret(),
            credentials.getScopes(), tokenEndpoint, httpClient, serializer);
    }

    /**
     * configure the client to use anonymous & refresh token flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param anonTokenEndpoint URI to be used for anonymous token authentication
     * @param refreshTokenEndpoint URI to be used for refresh token authentication
     * @param storage {@link TokenStorage} for the authentication tokens
     * @return ClientBuilder instance
     */
    public ClientBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage) {
        return withAnonymousRefreshFlow(credentials, anonTokenEndpoint, refreshTokenEndpoint, storage,
            oauthHandlerSupplier());
    }

    /**
     * configure the client to use anonymous & refresh token flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param anonTokenEndpoint URI to be used for anonymous token authentication
     * @param refreshTokenEndpoint URI to be used for refresh token authentication
     * @param storage {@link TokenStorage} for the authentication tokens
     * @param httpClientSupplier {@link HandlerStack} to be used for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage,
            final Supplier<HandlerStack> httpClientSupplier) {
        return withTokenSupplier(() -> createAnonymousRefreshFlowSupplier(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage, httpClientSupplier.get(), serializer.get()));
    }

    /**
     * configure the client to use anonymous & refresh token flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param anonTokenEndpoint URI to be used for anonymous token authentication
     * @param refreshTokenEndpoint URI to be used for refresh token authentication
     * @param storage {@link TokenStorage} for the authentication tokens
     * @param httpClient {@link VrapHttpClient} to be used for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage, final VrapHttpClient httpClient) {
        return withTokenSupplier(() -> createAnonymousRefreshFlowSupplier(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage, httpClient, serializer.get()));
    }

    /**
     * configure the client to use anonymous & refresh token flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param anonTokenEndpoint URI to be used for anonymous token authentication
     * @param refreshTokenEndpoint URI to be used for refresh token authentication
     * @param storage {@link TokenStorage} for the authentication tokens
     * @param httpClient {@link VrapHttpClient} to be used for authentication
     * @param serializer {@link ResponseSerializer} to be used for token deserialization
     * @return ClientBuilder instance
     */
    public ClientBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage, final VrapHttpClient httpClient,
            final ResponseSerializer serializer) {
        return withTokenSupplier(() -> createAnonymousRefreshFlowSupplier(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage, httpClient, serializer));
    }

    private TokenSupplier createInMemoryTokenSupplier(final TokenSupplier tokenSupplier) {
        return Optional.ofNullable(oauthExecutorService)
                .map(executorService -> new InMemoryTokenSupplier(executorService.get(), tokenSupplier))
                .orElse(new InMemoryTokenSupplier(tokenSupplier));
    }

    private TokenSupplier createAnonymousRefreshFlowSupplier(final ClientCredentials credentials,
            final String anonTokenEndpoint, final String refreshTokenEndpoint, final TokenStorage tokenStorage,
            final VrapHttpClient httpClient, final ResponseSerializer serializer) {
        final RefreshFlowTokenSupplier refreshFlowTokenSupplier = createRefreshFlowSupplier(credentials,
            refreshTokenEndpoint, tokenStorage, httpClient, serializer);

        final AnonymousFlowTokenSupplier anonymousFlowTokenSupplier = new AnonymousFlowTokenSupplier(
            credentials.getClientId(), credentials.getClientSecret(), credentials.getScopes(), anonTokenEndpoint,
            refreshFlowTokenSupplier, httpClient, serializer);

        return new TokenStorageSupplier(tokenStorage, anonymousFlowTokenSupplier);
    }

    private RefreshFlowTokenSupplier createRefreshFlowSupplier(final ClientCredentials credentials,
            final String tokenEndpoint, final TokenStorage tokenStorage, final VrapHttpClient httpClient,
            final ResponseSerializer serializer) {
        return new RefreshFlowTokenSupplier(credentials.getClientId(), credentials.getClientSecret(), tokenEndpoint,
            tokenStorage, httpClient, serializer);
    }

    /**
     * configure the client to use password flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for password flow authentication
     * @param email customer email
     * @param password customer password
     * @return ClientBuilder instance
     */
    public ClientBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint) {
        return withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint, oauthHandlerSupplier());
    }

    /**
     * configure the client to use password flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for password flow authentication
     * @param email customer email
     * @param password customer password
     * @param httpClientSupplier {@link HandlerStack} to use for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, final Supplier<HandlerStack> httpClientSupplier) {
        return withTokenSupplier(
            () -> createInMemoryTokenSupplier(createGlobalCustomerPasswordTokenSupplier(credentials, email, password,
                tokenEndpoint, httpClientSupplier.get(), serializer.get())));
    }

    /**
     * configure the client to use password flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for password flow authentication
     * @param email customer email
     * @param password customer password
     * @param httpClient {@link VrapHttpClient} to use for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, final VrapHttpClient httpClient) {
        return withTokenSupplier(
            () -> createInMemoryTokenSupplier(createGlobalCustomerPasswordTokenSupplier(credentials, email, password,
                tokenEndpoint, httpClient, serializer.get())));
    }

    /**
     * configure the client to use password flow
     * @param credentials {@link ClientCredentials} to be used for authentication
     * @param tokenEndpoint URI to be used for password flow authentication
     * @param email customer email
     * @param password customer password
     * @param httpClient {@link VrapHttpClient} to use for authentication
     * @param serializer {@link ResponseSerializer} to be used for token deserialization
     * @return ClientBuilder instance
     */
    public ClientBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, final VrapHttpClient httpClient,
            final ResponseSerializer serializer) {
        return withTokenSupplier(
            () -> createInMemoryTokenSupplier(createGlobalCustomerPasswordTokenSupplier(credentials, email, password,
                tokenEndpoint, httpClient, serializer)));
    }

    private TokenSupplier createGlobalCustomerPasswordTokenSupplier(final ClientCredentials credentials,
            final String email, final String password, final String tokenEndpoint, final VrapHttpClient httpClient,
            final ResponseSerializer serializer) {
        return new GlobalCustomerPasswordTokenSupplier(credentials.getClientId(), credentials.getClientSecret(), email,
            password, credentials.getScopes(), tokenEndpoint, httpClient, serializer);
    }

    /**
     * add middleware to inject an <i>Accept: gzip</i> header
     * @return ClientBuilder instance
     */
    public ClientBuilder addAcceptGZipMiddleware() {
        return addMiddleware(AcceptGZipMiddleware.of());
    }

    /**
     * add middleware to create Exceptions for responses with error status code
     * @param errorMiddleware {@link ErrorMiddleware} to be used
     * @return ClientBuilder instance
     */
    public ClientBuilder withErrorMiddleware(final Supplier<ErrorMiddleware> errorMiddleware) {
        this.errorMiddleware = errorMiddleware;
        return this;
    }

    /**
     * add middleware to create Exceptions for responses with error status code
     * @return ClientBuilder instance
     */
    public ClientBuilder withErrorMiddleware() {
        return withErrorMiddleware(() -> ErrorMiddleware.of(httpExceptionFactory.get()));
    }

    /**
     * add middleware to create Exceptions for responses with error status code
     * @param errorMiddleware {@link ErrorMiddleware} to be used
     * @return ClientBuilder instance
     */
    public ClientBuilder withErrorMiddleware(final ErrorMiddleware errorMiddleware) {
        return withErrorMiddleware(() -> errorMiddleware);
    }

    /**
     * add middleware to create Exceptions for responses with error status code
     * @param exceptionMode either use CompletionExceptions or unwrap the Exception. See {@link ErrorMiddleware.ExceptionMode}
     * @return ClientBuilder instance
     */
    public ClientBuilder withErrorMiddleware(ErrorMiddleware.ExceptionMode exceptionMode) {
        return withErrorMiddleware(() -> ErrorMiddleware.of(httpExceptionFactory.get(), exceptionMode));
    }

    /**
     * add middleware to collect and report telemetry data
     * @param telemetryMiddleware {@link TelemetryMiddleware} to be used
     * @return ClientBuilder instance
     */
    public ClientBuilder withTelemetryMiddleware(final Supplier<TelemetryMiddleware> telemetryMiddleware) {
        this.telemetryMiddleware = telemetryMiddleware;
        return this;
    }

    /**
     * add middleware to collect and report telemetry data
     * @param telemetryMiddleware {@link TelemetryMiddleware} to be used
     * @return ClientBuilder instance
     */
    public ClientBuilder withTelemetryMiddleware(final TelemetryMiddleware telemetryMiddleware) {
        return withTelemetryMiddleware(() -> telemetryMiddleware);
    }

    /**
     * add Middleware to convert a {@link io.vrap.rmf.base.client.error.NotFoundException} to a response with a null body value
     * @return ClientBuilder instance
     */
    public ClientBuilder addNotFoundExceptionMiddleware() {
        return addNotFoundExceptionMiddleware(NotFoundExceptionMiddleware.of());
    }

    /**
     * add Middleware to convert a {@link io.vrap.rmf.base.client.error.NotFoundException} to a response with a null body value
     * @param methods HTTP methods to convert on {@link io.vrap.rmf.base.client.error.NotFoundException}
     * @return ClientBuilder instance
     */
    public ClientBuilder addNotFoundExceptionMiddleware(final Set<ApiHttpMethod> methods) {
        return addNotFoundExceptionMiddleware(NotFoundExceptionMiddleware.of(methods));
    }

    /**
     * add Middleware to convert a {@link io.vrap.rmf.base.client.error.NotFoundException} to a response with a null body value
     * @param requestPredicate predicate to match for converting {@link io.vrap.rmf.base.client.error.NotFoundException}
     * @return ClientBuilder instance
     */
    public ClientBuilder addNotFoundExceptionMiddleware(final Predicate<ApiHttpRequest> requestPredicate) {
        return addNotFoundExceptionMiddleware(NotFoundExceptionMiddleware.of(requestPredicate));
    }

    /**
     * add Middleware to convert a {@link io.vrap.rmf.base.client.error.NotFoundException} to a response with a null body value
     * @param exceptionMiddleware middleware to be used
     * @return ClientBuilder instance
     */
    public ClientBuilder addNotFoundExceptionMiddleware(final NotFoundExceptionMiddleware exceptionMiddleware) {
        return addMiddleware(exceptionMiddleware);
    }

    /**
     * add middleware to retry failed requests
     * @param retryMiddleware {@link RetryRequestMiddleware} to be used
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final Supplier<RetryRequestMiddleware> retryMiddleware) {
        this.retryMiddleware = retryMiddleware;
        return this;
    }

    /**
     * add middleware to retry failed requests
     * @param retryMiddleware {@link RetryRequestMiddleware} to be used
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final RetryRequestMiddleware retryMiddleware) {
        return withRetryMiddleware(() -> retryMiddleware);
    }

    /**
     * add middleware to retry failed requests. By default, status code 500 & 503 will be retried. Between each retry
     * an incremental backoff strategy is applied
     * @param maxRetries number of retries before giving uo
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)}} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final int maxRetries) {
        return withPolicies(policies -> policies.withRetry(retry -> retry.maxRetries(maxRetries)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param maxRetries number of retries before giving uo
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)}} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes) {
        return withPolicies(
            policies -> policies.withRetry(retry -> retry.maxRetries(maxRetries).statusCodes(statusCodes)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param maxRetries number of retries before giving uo
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @param failures {@link Throwable}s to be retried
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        return withPolicies(policies -> policies
                .withRetry(retry -> retry.maxRetries(maxRetries).statusCodes(statusCodes).failures(failures)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param maxRetries number of retries before giving uo
     * @param delay the initial delay for a retry
     * @param maxDelay the maximum delay between each retry
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @param failures {@link Throwable}s to be retried
     * @param fn additional configuration for the {@link dev.failsafe.RetryPolicy} to be applied
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return withPolicies(policies -> policies.withRetry(retry -> retry.maxRetries(maxRetries)
                .initialDelay(delay)
                .maxDelay(maxDelay)
                .statusCodes(statusCodes)
                .failures(failures)
                .options(fn)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param maxRetries number of retries before giving uo
     * @param delay the initial delay for a retry
     * @param maxDelay the maximum delay between each retry
     * @param fn additional configuration for the {@link dev.failsafe.RetryPolicy} to be applied
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return withPolicies(policies -> policies
                .withRetry(retry -> retry.maxRetries(maxRetries).initialDelay(delay).maxDelay(maxDelay).options(fn)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param executorService {@link ExecutorService} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries) {
        return withPolicies(
            policies -> policies.withScheduler(executorService).withRetry(retry -> retry.maxRetries(maxRetries)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param executorService {@link ExecutorService} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes) {
        return withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(retry -> retry.maxRetries(maxRetries).statusCodes(statusCodes)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param executorService {@link ExecutorService} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @param failures {@link Throwable}s to be retried
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(retry -> retry.maxRetries(maxRetries).statusCodes(statusCodes).failures(failures)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param executorService {@link ExecutorService} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param delay the initial delay for a retry
     * @param maxDelay the maximum delay between each retry
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @param failures {@link Throwable}s to be retried
     * @param fn additional configuration for the {@link dev.failsafe.RetryPolicy} to be applied
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures, final FailsafeRetryPolicyBuilderOptions fn) {
        return withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(retry -> retry.maxRetries(maxRetries)
                        .initialDelay(delay)
                        .maxDelay(maxDelay)
                        .statusCodes(statusCodes)
                        .failures(failures)
                        .options(fn)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param executorService {@link ExecutorService} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param delay the initial delay for a retry
     * @param maxDelay the maximum delay between each retry
     * @param fn additional configuration for the {@link dev.failsafe.RetryPolicy} to be applied
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(retry -> retry.maxRetries(maxRetries).initialDelay(delay).maxDelay(maxDelay).options(fn)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param executorService {@link ScheduledExecutorService} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries) {
        return withPolicies(
            policies -> policies.withScheduler(executorService).withRetry(retry -> retry.maxRetries(maxRetries)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param executorService {@link ScheduledExecutorService} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes) {
        return withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(retry -> retry.maxRetries(maxRetries).statusCodes(statusCodes)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param executorService {@link ScheduledExecutorService} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @param failures {@link Throwable}s to be retried
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(retry -> retry.maxRetries(maxRetries).statusCodes(statusCodes).failures(failures)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param executorService {@link ScheduledExecutorService} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param delay the initial delay for a retry
     * @param maxDelay the maximum delay between each retry
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @param failures {@link Throwable}s to be retried
     * @param fn additional configuration for the {@link dev.failsafe.RetryPolicy} to be applied
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures, final FailsafeRetryPolicyBuilderOptions fn) {
        return withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(retry -> retry.maxRetries(maxRetries)
                        .initialDelay(delay)
                        .maxDelay(maxDelay)
                        .statusCodes(statusCodes)
                        .failures(failures)
                        .options(fn)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param executorService {@link ScheduledExecutorService} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param delay the initial delay for a retry
     * @param maxDelay the maximum delay between each retry
     * @param fn additional configuration for the {@link dev.failsafe.RetryPolicy} to be applied
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(retry -> retry.maxRetries(maxRetries).initialDelay(delay).maxDelay(maxDelay).options(fn)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param scheduler {@link Scheduler} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries) {
        return withPolicies(
            policies -> policies.withScheduler(scheduler).withRetry(retry -> retry.maxRetries(maxRetries)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param scheduler {@link Scheduler} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries,
            List<Integer> statusCodes) {
        return withPolicies(policies -> policies.withScheduler(scheduler)
                .withRetry(retry -> retry.maxRetries(maxRetries).statusCodes(statusCodes)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param scheduler {@link Scheduler} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @param failures {@link Throwable}s to be retried
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        return withPolicies(policies -> policies.withScheduler(scheduler)
                .withRetry(retry -> retry.maxRetries(maxRetries).statusCodes(statusCodes).failures(failures)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param scheduler {@link Scheduler} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param delay the initial delay for a retry
     * @param maxDelay the maximum delay between each retry
     * @param statusCodes HTTP status codes to retry a failed request e.g. 500 & 503
     * @param failures {@link Throwable}s to be retried
     * @param fn additional configuration for the {@link dev.failsafe.RetryPolicy} to be applied
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries, final long delay,
            final long maxDelay, List<Integer> statusCodes, final List<Class<? extends Throwable>> failures,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return withPolicies(policies -> policies.withScheduler(scheduler)
                .withRetry(retry -> retry.maxRetries(maxRetries)
                        .initialDelay(delay)
                        .maxDelay(maxDelay)
                        .statusCodes(statusCodes)
                        .failures(failures)
                        .options(fn)));
    }

    /**
     * add middleware to retry failed requests. Between each retry an incremental backoff strategy is applied
     * @param scheduler {@link Scheduler} to be used for the retry handler
     * @param maxRetries number of retries before giving uo
     * @param delay the initial delay for a retry
     * @param maxDelay the maximum delay between each retry
     * @param fn additional configuration for the {@link dev.failsafe.RetryPolicy} to be applied
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries, final long delay,
            final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return withPolicies(policies -> policies.withScheduler(scheduler)
                .withRetry(retry -> retry.maxRetries(maxRetries).initialDelay(delay).maxDelay(maxDelay).options(fn)));
    }

    /**
     * add middleware to limit the concurrent requests to be executed
     * @param queueMiddleware {@link QueueRequestMiddleware} to be used
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withQueueMiddleware(final Supplier<QueueRequestMiddleware> queueMiddleware) {
        this.queueMiddleware = queueMiddleware;
        return this;
    }

    /**
     * add middleware to limit the concurrent requests to be executed
     * @param queueMiddleware {@link QueueRequestMiddleware} to be used
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withQueueMiddleware(final QueueRequestMiddleware queueMiddleware) {
        return withQueueMiddleware(() -> queueMiddleware);
    }

    /**
     * add middleware to limit the concurrent requests to be executed
     * @param maxRequests maximum number of concurrent requests
     * @param maxWaitTime maximum time to wait before giving up
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withQueueMiddleware(final int maxRequests, final Duration maxWaitTime) {
        return withQueueMiddleware(() -> QueueRequestMiddleware.of(maxRequests, maxWaitTime));
    }

    /**
     * add middleware to limit the concurrent requests to be executed
     * @param scheduler {@link Scheduler} to be used for handling the queue
     * @param maxRequests maximum number of concurrent requests
     * @param maxWaitTime maximum time to wait before giving up
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withQueueMiddleware(final Scheduler scheduler, final int maxRequests,
            final Duration maxWaitTime) {
        return withQueueMiddleware(() -> QueueRequestMiddleware.of(scheduler, maxRequests, maxWaitTime));
    }

    /**
     * add middleware to limit the concurrent requests to be executed
     * @param executorService {@link ScheduledExecutorService} to be used for handling the queue
     * @param maxRequests maximum number of concurrent requests
     * @param maxWaitTime maximum time to wait before giving up
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withQueueMiddleware(final ScheduledExecutorService executorService, final int maxRequests,
            final Duration maxWaitTime) {
        return withQueueMiddleware(() -> QueueRequestMiddleware.of(executorService, maxRequests, maxWaitTime));
    }

    /**
     * add middleware to limit the concurrent requests to be executed
     * @param executorService {@link ExecutorService} to be used for handling the queue
     * @param maxRequests maximum number of concurrent requests
     * @param maxWaitTime maximum time to wait before giving up
     * @return ClientBuilder instance
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ClientBuilder withQueueMiddleware(final ExecutorService executorService, final int maxRequests,
            final Duration maxWaitTime) {
        return withQueueMiddleware(() -> QueueRequestMiddleware.of(executorService, maxRequests, maxWaitTime));
    }

    /**
     * add middleware for safe handling of failed requests
     * @param policyBuilder the policy builder
     * @return ClientBuilder instance
     */
    public ClientBuilder withPolicies(PolicyBuilder policyBuilder) {
        this.policyBuilder = policyBuilder;
        this.policyMiddleware = policyBuilder::build;
        return this;
    }

    /**
     * add middleware for safe handling of failed requests
     * @param fn the policy builder function
     * @return ClientBuilder instance
     */
    public ClientBuilder withPolicies(Function<PolicyBuilder, PolicyBuilder> fn) {
        this.policyBuilder = fn.apply(Optional.ofNullable(policyBuilder).orElse(PolicyBuilder.of()));
        this.policyMiddleware = policyBuilder::build;
        return this;
    }

    /**
     * add middleware for safe handling of failed requests
     * @param requestPolicyBuilder the policy builder
     * @return ClientBuilder instance
     */
    public ClientBuilder withRequestPolicies(RequestPolicyBuilder requestPolicyBuilder) {
        this.requestPolicyBuilder = requestPolicyBuilder;
        this.policyMiddleware = requestPolicyBuilder::build;
        return this;
    }

    public ClientBuilder withRequestPolicies(Function<RequestPolicyBuilder, RequestPolicyBuilder> fn) {
        this.requestPolicyBuilder = fn
                .apply(Optional.ofNullable(requestPolicyBuilder).orElse(RequestPolicyBuilder.of()));
        this.policyMiddleware = requestPolicyBuilder::build;
        return this;
    }

    /**
     * add middleware for safe handling of failed requests
     * @param policyMiddleware {@link PolicyMiddleware} to be used
     * @return ClientBuilder
     */
    public ClientBuilder withPolicyMiddleware(PolicyMiddleware policyMiddleware) {
        return withPolicyMiddleware(() -> policyMiddleware);
    }

    /**
     * add middleware for safe handling of failed requests
     * @param policyMiddleware {@link PolicyMiddleware} to be used
     * @return ClientBuilder
     */
    public ClientBuilder withPolicyMiddleware(Supplier<PolicyMiddleware> policyMiddleware) {
        this.policyMiddleware = policyMiddleware;
        return this;
    }

    /**
     * add authenticator middleware
     * @param oAuthMiddleware {@link OAuthMiddleware} to be used for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withOAuthMiddleware(final Supplier<OAuthMiddleware> oAuthMiddleware) {
        this.oAuthMiddleware = oAuthMiddleware;
        return this;
    }

    /**
     * add authenticator middleware
     * @param oAuthMiddleware {@link OAuthMiddleware} to be used for authentication
     * @return ClientBuilder instance
     */
    public ClientBuilder withOAuthMiddleware(final OAuthMiddleware oAuthMiddleware) {
        return withOAuthMiddleware(() -> oAuthMiddleware);
    }

    /**
     * use supplier for authentication tokens
     * @param tokenSupplier {@link TokenSupplier} for retrieving authentication tokens
     * @return ClientBuilder instance
     */
    public ClientBuilder withTokenSupplier(final Supplier<TokenSupplier> tokenSupplier) {
        return withOAuthMiddleware(() -> {
            final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier.get());
            return Optional.ofNullable(oauthExecutorService)
                    .map(executorService -> OAuthMiddleware.of(executorService.get(), oAuthHandler, authRetries,
                        useAuthCircuitBreaker))
                    .orElseGet(() -> OAuthMiddleware.of(oAuthHandler, authRetries, useAuthCircuitBreaker));
        });
    }

    /**
     * use supplier for authentication tokens
     * @param tokenSupplier {@link TokenSupplier} for retrieving authentication tokens
     * @return ClientBuilder instance
     */
    public ClientBuilder withTokenSupplier(final TokenSupplier tokenSupplier) {
        return withTokenSupplier(() -> tokenSupplier);
    }

    /**
     * @param internalLoggerMiddleware {@link InternalLoggerMiddleware} used for logging requests and responses
     * @return ClientBuilder instance
     */
    public ClientBuilder withInternalLoggerMiddleware(final InternalLoggerMiddleware internalLoggerMiddleware) {
        this.internalLoggerMiddleware = internalLoggerMiddleware;
        return this;
    }

    /**
     * @param internalLoggerFactory {@link InternalLoggerFactory} creates the logger for request & responses
     * @return ClientBuilder instance
     */
    public ClientBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory) {
        return withInternalLoggerMiddleware(InternalLoggerMiddleware.of(internalLoggerFactory));
    }

    /**
     * @param internalLoggerFactory {@link InternalLoggerFactory} creates the logger for request & responses
     * @param responseLogEvent {@link Level} for logging responses.
     * @param deprecationLogEvent {@link Level} for logging {@link ApiHttpHeaders#X_DEPRECATION_NOTICE}
     * @return ClientBuilder instance
     */
    public ClientBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent) {
        return withInternalLoggerMiddleware(
            InternalLoggerMiddleware.of(internalLoggerFactory, responseLogEvent, deprecationLogEvent));
    }

    /**
     * @param internalLoggerFactory {@link InternalLoggerFactory} creates the logger for request & responses
     * @param responseLogEvent {@link Level} for logging responses.
     * @param deprecationLogEvent {@link Level} for logging {@link ApiHttpHeaders#X_DEPRECATION_NOTICE}
     * @param defaultExceptionLogEvent {@link Level} for logging errors
     * @param exceptionLogEvents {@link Level} for logging by exception class
     * @return ClientBuilder instance
     */
    public ClientBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents) {
        return withInternalLoggerMiddleware(InternalLoggerMiddleware.of(internalLoggerFactory, responseLogEvent,
            deprecationLogEvent, defaultExceptionLogEvent, exceptionLogEvents));
    }

    /**
     * @param internalLoggerFactory {@link InternalLoggerFactory} creates the logger for request & responses
     * @param responseLogEvent {@link Level} for logging responses.
     * @param deprecationLogEvent {@link Level} for logging {@link ApiHttpHeaders#X_DEPRECATION_NOTICE}
     * @param defaultExceptionLogEvent {@link Level} for logging errors
     * @param exceptionLogEvents {@link Level} for logging by exception class
     * @param responseLogFormatter {@link ResponseLogFormatter} response log formatter
     * @return ClientBuilder instance
     */
    public ClientBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents,
            final ResponseLogFormatter responseLogFormatter, final ErrorLogFormatter errorLogFormatter) {
        return withInternalLoggerMiddleware(
            InternalLoggerMiddleware.of(internalLoggerFactory, responseLogEvent, deprecationLogEvent,
                defaultExceptionLogEvent, exceptionLogEvents, responseLogFormatter, errorLogFormatter));
    }

    /**
     * @param apiBaseUrl base URI for calling the API
     * @return ClientBuilder instance
     */
    public ClientBuilder withApiBaseUrl(String apiBaseUrl) {
        return withApiBaseUrl(URI.create(apiBaseUrl));
    }

    /**
     * @param apiBaseUrl base URI for calling the API
     * @return ClientBuilder instance
     */
    public ClientBuilder withApiBaseUrl(final URI apiBaseUrl) {
        if (!apiBaseUrl.getPath().endsWith("/")) {
            this.apiBaseUrl = URI.create(apiBaseUrl + "/");
            return this;
        }
        this.apiBaseUrl = apiBaseUrl;
        return this;
    }

    /**
     * @param userAgentSupplier user agent to be sent with the requests
     * @return ClientBuilder instance
     */
    public ClientBuilder withUserAgentSupplier(final Supplier<String> userAgentSupplier) {
        return withUserAgentMiddleware(new UserAgentMiddleware(userAgentSupplier.get()));
    }

    private ClientBuilder withUserAgentMiddleware(final UserAgentMiddleware userAgentMiddleware) {
        this.userAgentMiddleware = userAgentMiddleware;
        return this;
    }

    /**
     * @param correlationIdProvider provider to create correlation IDs for each request
     * @param replace replace any existing correlation id provider
     * @return ClientBuilder instance
     */
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

    /**
     * @param correlationIdProvider provider to create correlation IDs for each request
     * @return ClientBuilder instance
     */
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
     * @param middleware {@link Middleware} instance
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
     * @param middleware {@link Middleware} instance
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

    /**
     * build the {@link ApiHttpClient} with the configured values
     * @return {@link ApiHttpClient}
     */
    public ApiHttpClient build() {
        return ApiHttpClient.of(requireNonNull(apiBaseUrl), requireNonNull(stack.get()),
            requireNonNull(serializer.get()));
    }

    /**
     * default user agent provider
     * @return user agent string
     */
    public static String buildDefaultUserAgent() {
        return UserAgentUtils.obtainUserAgent();
    }
}
