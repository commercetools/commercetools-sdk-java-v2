
package com.commercetools.ml.defaultconfig;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.commercetools.ml.client.ApiRoot;
import com.commercetools.ml.client.ByProjectKeyRequestBuilder;
import com.commercetools.ml.client.ProjectApiRoot;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;
import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.slf4j.event.Level;

public class MLApiRootBuilder {
    private final ClientBuilder builder;

    private MLApiRootBuilder(ClientBuilder builder) {
        this.builder = builder;
    }

    public static MLApiRootBuilder of() {
        return new MLApiRootBuilder(ClientBuilder.of());
    }

    public static MLApiRootBuilder of(final VrapHttpClient httpClient) {
        return new MLApiRootBuilder(ClientBuilder.of(httpClient));
    }

    public static MLApiRootBuilder of(final HandlerStack stack) {
        return new MLApiRootBuilder(ClientBuilder.of(stack));
    }

    public MLApiRootBuilder withAuthCircuitBreaker() {
        builder.withAuthCircuitBreaker();
        return this;
    }

    public MLApiRootBuilder withoutAuthCircuitBreaker() {
        builder.withoutAuthCircuitBreaker();
        return this;
    }

    public MLApiRootBuilder withAuthRetries(final int authRetries) {
        builder.withAuthRetries(authRetries);
        return this;
    }

    public MLApiRootBuilder withHandlerStack(final HandlerStack stack) {
        builder.withHandlerStack(stack);
        return this;
    }

    public MLApiRootBuilder withHttpClient(final VrapHttpClient httpClient) {
        builder.withHttpClient(httpClient);
        return this;
    }

    public MLApiRootBuilder withSerializer(final ResponseSerializer serializer) {
        builder.withSerializer(serializer);
        return this;
    }

    public MLApiRootBuilder withSerializer(final Supplier<ResponseSerializer> serializer) {
        builder.withSerializer(serializer);
        return this;
    }

    public MLApiRootBuilder withHttpExceptionFactory(final HttpExceptionFactory factory) {
        builder.withHttpExceptionFactory(factory);
        return this;
    }

    public MLApiRootBuilder withHttpExceptionFactory(final Function<ResponseSerializer, HttpExceptionFactory> factory) {
        builder.withHttpExceptionFactory(factory);
        return this;
    }

    public MLApiRootBuilder withHttpExceptionFactory(final Supplier<HttpExceptionFactory> factory) {
        builder.withHttpExceptionFactory(factory);
        return this;
    }

    public MLApiRootBuilder defaultClient(final ClientCredentials credentials) {
        return defaultClient(credentials, ServiceRegion.GCP_EUROPE);
    }

    public MLApiRootBuilder defaultClient(final ClientCredentials credentials, ServiceRegionConfig serviceRegion) {
        builder.defaultClient(credentials, serviceRegion);

        return this;
    }

    public MLApiRootBuilder defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return this.defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public MLApiRootBuilder defaultClient(final String apiEndpoint, final ClientCredentials credentials,
            final String tokenEndpoint) {
        return this.defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public MLApiRootBuilder defaultClient(final String apiEndpoint) {
        return this.defaultClient(URI.create(apiEndpoint));
    }

    public MLApiRootBuilder defaultClient(final URI apiEndpoint) {
        builder.defaultClient(apiEndpoint);

        return this;
    }

    public MLApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint);

        return this;
    }

    public MLApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public MLApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint);

        return this;
    }

    public MLApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            final VrapHttpClient httpClient) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public MLApiRootBuilder withStaticTokenFlow(final AuthenticationToken token) {
        builder.withStaticTokenFlow(token);

        return this;
    }

    public MLApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        builder.withAnonymousSessionFlow(credentials, tokenEndpoint);

        return this;
    }

    public MLApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient) {
        builder.withAnonymousSessionFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public MLApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint) {
        builder.withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint);

        return this;
    }

    public MLApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, final VrapHttpClient httpClient) {
        builder.withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint, httpClient);

        return this;
    }

    public MLApiRootBuilder addAcceptGZipMiddleware() {
        builder.addAcceptGZipMiddleware();

        return this;
    }

    public MLApiRootBuilder withErrorMiddleware() {
        builder.withErrorMiddleware();

        return this;
    }

    public MLApiRootBuilder withErrorMiddleware(final ErrorMiddleware errorMiddleware) {
        builder.withErrorMiddleware(errorMiddleware);

        return this;
    }

    public MLApiRootBuilder withRetryMiddleware(Supplier<RetryRequestMiddleware> retryMiddleware) {
        builder.withRetryMiddleware(retryMiddleware);

        return this;
    }

    public MLApiRootBuilder withRetryMiddleware(RetryRequestMiddleware retryMiddleware) {
        builder.withRetryMiddleware(retryMiddleware);

        return this;
    }

    public MLApiRootBuilder withRetryMiddleware(final int maxRetries) {
        builder.withRetryMiddleware(maxRetries);

        return this;
    }

    public MLApiRootBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes) {
        builder.withRetryMiddleware(maxRetries, statusCodes);

        return this;
    }

    public MLApiRootBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        builder.withRetryMiddleware(maxRetries, statusCodes, failures);

        return this;
    }

    public MLApiRootBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures,
            final FailsafeRetryPolicyBuilderOptions fn) {
        builder.withRetryMiddleware(maxRetries, delay, maxDelay, statusCodes, failures, fn);

        return this;
    }

    public MLApiRootBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        builder.withRetryMiddleware(maxRetries, delay, maxDelay, fn);

        return this;
    }

    public MLApiRootBuilder withOAuthMiddleware(final Supplier<OAuthMiddleware> oAuthMiddleware) {
        builder.withOAuthMiddleware(oAuthMiddleware);

        return this;
    }

    public MLApiRootBuilder withOAuthMiddleware(final OAuthMiddleware oAuthMiddleware) {
        builder.withOAuthMiddleware(oAuthMiddleware);

        return this;
    }

    public MLApiRootBuilder withTokenSupplier(final TokenSupplier tokenSupplier) {
        builder.withTokenSupplier(tokenSupplier);

        return this;
    }

    public MLApiRootBuilder withTokenSupplier(final Supplier<TokenSupplier> tokenSupplier) {
        builder.withTokenSupplier(tokenSupplier);

        return this;
    }

    public MLApiRootBuilder withInternalLoggerMiddleware(final InternalLoggerMiddleware internalLoggerMiddleware) {
        builder.withInternalLoggerMiddleware(internalLoggerMiddleware);

        return this;
    }

    public MLApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory) {
        builder.withInternalLoggerFactory(internalLoggerFactory);

        return this;
    }

    public MLApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent) {
        builder.withInternalLoggerFactory(internalLoggerFactory, responseLogEvent, deprecationLogEvent);

        return this;
    }

    public MLApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents) {
        builder.withInternalLoggerFactory(internalLoggerFactory, responseLogEvent, deprecationLogEvent,
            defaultExceptionLogEvent, exceptionLogEvents);

        return this;
    }

    public MLApiRootBuilder withApiBaseUrl(String apiBaseUrl) {
        builder.withApiBaseUrl(apiBaseUrl);

        return this;
    }

    public MLApiRootBuilder withApiBaseUrl(final URI apiBaseUrl) {
        builder.withApiBaseUrl(apiBaseUrl);

        return this;
    }

    public MLApiRootBuilder withUserAgentSupplier(final Supplier<String> userAgentSupplier) {
        builder.withUserAgentSupplier(userAgentSupplier);

        return this;
    }

    public MLApiRootBuilder addCorrelationIdProvider(final @Nullable CorrelationIdProvider correlationIdProvider) {
        builder.addCorrelationIdProvider(correlationIdProvider);

        return this;
    }

    public MLApiRootBuilder withMiddleware(final Middleware middleware, final Middleware... middlewares) {
        builder.withMiddleware(middleware, middlewares);

        return this;
    }

    public MLApiRootBuilder addMiddleware(final Middleware middleware, final Middleware... middlewares) {
        builder.addMiddleware(middleware, middlewares);

        return this;
    }

    public MLApiRootBuilder withMiddlewares(final List<Middleware> middlewares) {
        builder.withMiddlewares(middlewares);

        return this;
    }

    public MLApiRootBuilder addMiddlewares(final List<Middleware> middlewares) {
        builder.addMiddlewares(middlewares);

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
        return ApiRoot.fromClient(builder.build()).withProjectKey(projectKey);
    }

    /**
     * @deprecated use {@link #build(String)}  instead
     */
    @Deprecated
    public ProjectApiRoot buildProjectRoot(final String projectKey) {
        return ProjectApiRoot.fromClient(projectKey, builder.build());
    }

    public ProjectApiRoot build(final String projectKey) {
        return ProjectApiRoot.fromClient(projectKey, builder.build());
    }
}
