
package com.commercetools.checkout.defaultconfig;

import java.net.URI;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import javax.annotation.Nullable;

import com.commercetools.checkout.client.ApiRoot;
import com.commercetools.checkout.client.ByProjectKeyRequestBuilder;
import com.commercetools.checkout.client.CheckoutCorrelationIdProvider;
import com.commercetools.checkout.client.ProjectApiRoot;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;
import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.slf4j.event.Level;

import dev.failsafe.spi.Scheduler;

public class CheckoutApiRootBuilder {
    private final ClientBuilder builder;

    private CheckoutApiRootBuilder(ClientBuilder builder) {
        this.builder = builder;
    }

    public static CheckoutApiRootBuilder of() {
        return new CheckoutApiRootBuilder(ClientBuilder.of());
    }

    public static CheckoutApiRootBuilder of(final VrapHttpClient httpClient) {
        return new CheckoutApiRootBuilder(ClientBuilder.of(httpClient));
    }

    public static CheckoutApiRootBuilder of(final HandlerStack stack) {
        return new CheckoutApiRootBuilder(ClientBuilder.of(stack));
    }

    public CheckoutApiRootBuilder withAuthCircuitBreaker() {
        builder.withAuthCircuitBreaker();
        return this;
    }

    public CheckoutApiRootBuilder withoutAuthCircuitBreaker() {
        builder.withoutAuthCircuitBreaker();
        return this;
    }

    public CheckoutApiRootBuilder withAuthRetries(final int authRetries) {
        builder.withAuthRetries(authRetries);
        return this;
    }

    public CheckoutApiRootBuilder withHandlerStack(final HandlerStack stack) {
        builder.withHandlerStack(stack);
        return this;
    }

    public CheckoutApiRootBuilder withHttpClient(final VrapHttpClient httpClient) {
        builder.withHttpClient(httpClient);
        return this;
    }

    public CheckoutApiRootBuilder withSerializer(final ResponseSerializer serializer) {
        builder.withSerializer(serializer);
        return this;
    }

    public CheckoutApiRootBuilder withSerializer(final Supplier<ResponseSerializer> serializer) {
        builder.withSerializer(serializer);
        return this;
    }

    public CheckoutApiRootBuilder withHttpExceptionFactory(final HttpExceptionFactory factory) {
        builder.withHttpExceptionFactory(factory);
        return this;
    }

    public CheckoutApiRootBuilder withHttpExceptionFactory(
            final Function<ResponseSerializer, HttpExceptionFactory> factory) {
        builder.withHttpExceptionFactory(factory);
        return this;
    }

    public CheckoutApiRootBuilder withHttpExceptionFactory(final Supplier<HttpExceptionFactory> factory) {
        builder.withHttpExceptionFactory(factory);
        return this;
    }

    public CheckoutApiRootBuilder defaultClient(final ClientCredentials credentials) {
        return defaultClient(credentials, ServiceRegion.GCP_EUROPE_WEST1);
    }

    public CheckoutApiRootBuilder defaultClient(final ClientCredentials credentials,
            ServiceRegionConfig serviceRegion) {
        builder.defaultClient(credentials, serviceRegion);

        return this;
    }

    public CheckoutApiRootBuilder defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return this.defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public CheckoutApiRootBuilder defaultClient(final String apiEndpoint, final ClientCredentials credentials,
            final String tokenEndpoint) {
        return this.defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public CheckoutApiRootBuilder defaultClient(final String apiEndpoint) {
        return this.defaultClient(URI.create(apiEndpoint));
    }

    public CheckoutApiRootBuilder defaultClient(final URI apiEndpoint) {
        builder.defaultClient(apiEndpoint);

        return this;
    }

    public CheckoutApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials,
            final String tokenEndpoint) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint);

        return this;
    }

    public CheckoutApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials,
            final String tokenEndpoint, final VrapHttpClient httpClient) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public CheckoutApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials,
            final URI tokenEndpoint) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint);

        return this;
    }

    public CheckoutApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials,
            final URI tokenEndpoint, final VrapHttpClient httpClient) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public CheckoutApiRootBuilder withStaticTokenFlow(final AuthenticationToken token) {
        builder.withStaticTokenFlow(token);

        return this;
    }

    public CheckoutApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials,
            final String tokenEndpoint) {
        builder.withAnonymousSessionFlow(credentials, tokenEndpoint);

        return this;
    }

    public CheckoutApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials,
            final String tokenEndpoint, final VrapHttpClient httpClient) {
        builder.withAnonymousSessionFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public CheckoutApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials,
            final String email, final String password, final String tokenEndpoint) {
        builder.withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint);

        return this;
    }

    public CheckoutApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials,
            final String email, final String password, final String tokenEndpoint, final VrapHttpClient httpClient) {
        builder.withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint, httpClient);

        return this;
    }

    public CheckoutApiRootBuilder addAcceptGZipMiddleware() {
        builder.addAcceptGZipMiddleware();

        return this;
    }

    public CheckoutApiRootBuilder withErrorMiddleware() {
        builder.withErrorMiddleware();

        return this;
    }

    public CheckoutApiRootBuilder withErrorMiddleware(final ErrorMiddleware errorMiddleware) {
        builder.withErrorMiddleware(errorMiddleware);

        return this;
    }

    public CheckoutApiRootBuilder withPolicies(final Function<PolicyBuilder, PolicyBuilder> fn) {
        return with(clientBuilder -> clientBuilder.withPolicies(fn));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withRetryMiddleware(Supplier<RetryRequestMiddleware> retryMiddleware) {
        builder.withRetryMiddleware(retryMiddleware);

        return this;
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withRetryMiddleware(RetryRequestMiddleware retryMiddleware) {
        builder.withRetryMiddleware(retryMiddleware);

        return this;
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withRetryMiddleware(final int maxRetries) {
        builder.withRetryMiddleware(maxRetries);

        return this;
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes) {
        builder.withRetryMiddleware(maxRetries, statusCodes);

        return this;
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        builder.withRetryMiddleware(maxRetries, statusCodes, failures);

        return this;
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures,
            final FailsafeRetryPolicyBuilderOptions fn) {
        builder.withRetryMiddleware(maxRetries, delay, maxDelay, statusCodes, failures, fn);

        return this;
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        builder.withRetryMiddleware(maxRetries, delay, maxDelay, fn);

        return this;
    }

    public CheckoutApiRootBuilder withOAuthMiddleware(final Supplier<OAuthMiddleware> oAuthMiddleware) {
        builder.withOAuthMiddleware(oAuthMiddleware);

        return this;
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withQueueMiddleware(final Supplier<QueueRequestMiddleware> queueMiddleware) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(queueMiddleware));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withQueueMiddleware(final QueueRequestMiddleware queueMiddleware) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(queueMiddleware));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withQueueMiddleware(final int maxRequests, final Duration maxWaitTime) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(maxRequests, maxWaitTime));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withQueueMiddleware(final Scheduler scheduler, final int maxRequests,
            final Duration maxWaitTime) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(scheduler, maxRequests, maxWaitTime));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withQueueMiddleware(final ScheduledExecutorService executorService,
            final int maxRequests, final Duration maxWaitTime) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(executorService, maxRequests, maxWaitTime));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public CheckoutApiRootBuilder withQueueMiddleware(final ExecutorService executorService, final int maxRequests,
            final Duration maxWaitTime) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(executorService, maxRequests, maxWaitTime));
    }

    public CheckoutApiRootBuilder withOAuthMiddleware(final OAuthMiddleware oAuthMiddleware) {
        builder.withOAuthMiddleware(oAuthMiddleware);

        return this;
    }

    public CheckoutApiRootBuilder withTokenSupplier(final TokenSupplier tokenSupplier) {
        builder.withTokenSupplier(tokenSupplier);

        return this;
    }

    public CheckoutApiRootBuilder withTokenSupplier(final Supplier<TokenSupplier> tokenSupplier) {
        builder.withTokenSupplier(tokenSupplier);

        return this;
    }

    public CheckoutApiRootBuilder withInternalLoggerMiddleware(
            final InternalLoggerMiddleware internalLoggerMiddleware) {
        builder.withInternalLoggerMiddleware(internalLoggerMiddleware);

        return this;
    }

    public CheckoutApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory) {
        builder.withInternalLoggerFactory(internalLoggerFactory);

        return this;
    }

    public CheckoutApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent) {
        builder.withInternalLoggerFactory(internalLoggerFactory, responseLogEvent, deprecationLogEvent);

        return this;
    }

    public CheckoutApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents) {
        builder.withInternalLoggerFactory(internalLoggerFactory, responseLogEvent, deprecationLogEvent,
            defaultExceptionLogEvent, exceptionLogEvents);

        return this;
    }

    public CheckoutApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents,
            final ResponseLogFormatter responseLogFormatter, final ErrorLogFormatter errorLogFormatter) {
        return with(clientBuilder -> clientBuilder.withInternalLoggerFactory(internalLoggerFactory, responseLogEvent,
            deprecationLogEvent, defaultExceptionLogEvent, exceptionLogEvents, responseLogFormatter,
            errorLogFormatter));
    }

    public CheckoutApiRootBuilder withApiBaseUrl(String apiBaseUrl) {
        builder.withApiBaseUrl(apiBaseUrl);

        return this;
    }

    public CheckoutApiRootBuilder withApiBaseUrl(final URI apiBaseUrl) {
        builder.withApiBaseUrl(apiBaseUrl);

        return this;
    }

    public CheckoutApiRootBuilder withUserAgentSupplier(final Supplier<String> userAgentSupplier) {
        builder.withUserAgentSupplier(userAgentSupplier);

        return this;
    }

    public CheckoutApiRootBuilder addCorrelationIdProvider(
            final @Nullable CorrelationIdProvider correlationIdProvider) {
        return addCorrelationIdProvider(correlationIdProvider, true);
    }

    private CheckoutApiRootBuilder addCorrelationIdProvider(final @Nullable CorrelationIdProvider correlationIdProvider,
            final boolean replace) {
        builder.addCorrelationIdProvider(correlationIdProvider, replace);

        return this;
    }

    public CheckoutApiRootBuilder withMiddleware(final Middleware middleware, final Middleware... middlewares) {
        builder.withMiddleware(middleware, middlewares);

        return this;
    }

    public CheckoutApiRootBuilder addMiddleware(final Middleware middleware, final Middleware... middlewares) {
        builder.addMiddleware(middleware, middlewares);

        return this;
    }

    public CheckoutApiRootBuilder withMiddlewares(final List<Middleware> middlewares) {
        builder.withMiddlewares(middlewares);

        return this;
    }

    public CheckoutApiRootBuilder addMiddlewares(final List<Middleware> middlewares) {
        builder.addMiddlewares(middlewares);

        return this;
    }

    public CheckoutApiRootBuilder with(UnaryOperator<ClientBuilder> builderUnaryOperator) {
        builderUnaryOperator.apply(builder);

        return this;
    }

    public ApiRoot build() {
        return ApiRoot.fromClient(clientSupplier().get());
    }

    public ApiHttpClient buildClient() {
        return clientSupplier().get();
    }

    public Supplier<ApiHttpClient> clientSupplier() {
        return builder::build;
    }

    /**
     * @deprecated use {@link #build(String)}  instead
     */
    @Deprecated
    public ByProjectKeyRequestBuilder buildForProject(final String projectKey) {
        addCorrelationIdProvider(new CheckoutCorrelationIdProvider(projectKey), false);
        return ApiRoot.fromClient(builder.build()).withProjectKey(projectKey);
    }

    /**
     * @deprecated use {@link #build(String)}  instead
     */
    @Deprecated
    public ProjectApiRoot buildProjectRoot(final String projectKey) {
        addCorrelationIdProvider(new CheckoutCorrelationIdProvider(projectKey), false);
        return ProjectApiRoot.fromClient(projectKey, builder.build());
    }

    public ProjectApiRoot build(final String projectKey) {
        addCorrelationIdProvider(new CheckoutCorrelationIdProvider(projectKey), false);
        return ProjectApiRoot.fromClient(projectKey, builder.build());
    }
}
