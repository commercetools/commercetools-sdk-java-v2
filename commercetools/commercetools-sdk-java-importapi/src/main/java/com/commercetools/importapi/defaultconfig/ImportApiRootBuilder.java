
package com.commercetools.importapi.defaultconfig;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.commercetools.importapi.client.ApiRoot;
import com.commercetools.importapi.client.ByProjectKeyRequestBuilder;
import com.commercetools.importapi.client.ProjectApiRoot;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;
import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.slf4j.event.Level;

public class ImportApiRootBuilder {
    private final ClientBuilder builder;

    private ImportApiRootBuilder(ClientBuilder builder) {
        this.builder = builder;
    }

    public static ImportApiRootBuilder of() {
        return new ImportApiRootBuilder(ClientBuilder.of());
    }

    public static ImportApiRootBuilder of(final VrapHttpClient httpClient) {
        return new ImportApiRootBuilder(ClientBuilder.of(httpClient));
    }

    public static ImportApiRootBuilder of(final HandlerStack stack) {
        return new ImportApiRootBuilder(ClientBuilder.of(stack));
    }

    public ImportApiRootBuilder withAuthCircuitBreaker() {
        builder.withAuthCircuitBreaker();
        return this;
    }

    public ImportApiRootBuilder withoutAuthCircuitBreaker() {
        builder.withoutAuthCircuitBreaker();
        return this;
    }

    public ImportApiRootBuilder withAuthRetries(final int authRetries) {
        builder.withAuthRetries(authRetries);
        return this;
    }

    public ImportApiRootBuilder withHandlerStack(final HandlerStack stack) {
        builder.withHandlerStack(stack);
        return this;
    }

    public ImportApiRootBuilder withHttpClient(final VrapHttpClient httpClient) {
        builder.withHttpClient(httpClient);
        return this;
    }

    public ImportApiRootBuilder withSerializer(final ResponseSerializer serializer) {
        builder.withSerializer(serializer);
        return this;
    }

    public ImportApiRootBuilder withSerializer(final Supplier<ResponseSerializer> serializer) {
        builder.withSerializer(serializer);
        return this;
    }

    public ImportApiRootBuilder withHttpExceptionFactory(final HttpExceptionFactory factory) {
        builder.withHttpExceptionFactory(factory);
        return this;
    }

    public ImportApiRootBuilder withHttpExceptionFactory(
            final Function<ResponseSerializer, HttpExceptionFactory> factory) {
        builder.withHttpExceptionFactory(factory);
        return this;
    }

    public ImportApiRootBuilder withHttpExceptionFactory(final Supplier<HttpExceptionFactory> factory) {
        builder.withHttpExceptionFactory(factory);
        return this;
    }

    public ImportApiRootBuilder defaultClient(final ClientCredentials credentials) {
        return defaultClient(credentials, ServiceRegion.GCP_EUROPE_WEST1);
    }

    public ImportApiRootBuilder defaultClient(final ClientCredentials credentials, ServiceRegionConfig serviceRegion) {
        builder.defaultClient(credentials, serviceRegion);

        return this;
    }

    public ImportApiRootBuilder defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return this.defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public ImportApiRootBuilder defaultClient(final String apiEndpoint, final ClientCredentials credentials,
            final String tokenEndpoint) {
        return this.defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public ImportApiRootBuilder defaultClient(final String apiEndpoint) {
        return this.defaultClient(URI.create(apiEndpoint));
    }

    public ImportApiRootBuilder defaultClient(final URI apiEndpoint) {
        builder.defaultClient(apiEndpoint);

        return this;
    }

    public ImportApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials,
            final String tokenEndpoint) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint);

        return this;
    }

    public ImportApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials,
            final String tokenEndpoint, final VrapHttpClient httpClient) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public ImportApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials,
            final URI tokenEndpoint) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint);

        return this;
    }

    public ImportApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            final VrapHttpClient httpClient) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public ImportApiRootBuilder withStaticTokenFlow(final AuthenticationToken token) {
        builder.withStaticTokenFlow(token);

        return this;
    }

    public ImportApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials,
            final String tokenEndpoint) {
        builder.withAnonymousSessionFlow(credentials, tokenEndpoint);

        return this;
    }

    public ImportApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials,
            final String tokenEndpoint, final VrapHttpClient httpClient) {
        builder.withAnonymousSessionFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public ImportApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint) {
        builder.withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint);

        return this;
    }

    public ImportApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, final VrapHttpClient httpClient) {
        builder.withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint, httpClient);

        return this;
    }

    public ImportApiRootBuilder addAcceptGZipMiddleware() {
        builder.addAcceptGZipMiddleware();

        return this;
    }

    public ImportApiRootBuilder withErrorMiddleware() {
        builder.withErrorMiddleware();

        return this;
    }

    public ImportApiRootBuilder withErrorMiddleware(final ErrorMiddleware errorMiddleware) {
        builder.withErrorMiddleware(errorMiddleware);

        return this;
    }

    public ImportApiRootBuilder withRetryMiddleware(Supplier<RetryRequestMiddleware> retryMiddleware) {
        builder.withRetryMiddleware(retryMiddleware);

        return this;
    }

    public ImportApiRootBuilder withRetryMiddleware(RetryRequestMiddleware retryMiddleware) {
        builder.withRetryMiddleware(retryMiddleware);

        return this;
    }

    public ImportApiRootBuilder withRetryMiddleware(final int maxRetries) {
        builder.withRetryMiddleware(maxRetries);

        return this;
    }

    public ImportApiRootBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes) {
        builder.withRetryMiddleware(maxRetries, statusCodes);

        return this;
    }

    public ImportApiRootBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        builder.withRetryMiddleware(maxRetries, statusCodes, failures);

        return this;
    }

    public ImportApiRootBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures,
            final FailsafeRetryPolicyBuilderOptions fn) {
        builder.withRetryMiddleware(maxRetries, delay, maxDelay, statusCodes, failures, fn);

        return this;
    }

    public ImportApiRootBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        builder.withRetryMiddleware(maxRetries, delay, maxDelay, fn);

        return this;
    }

    public ImportApiRootBuilder withOAuthMiddleware(final Supplier<OAuthMiddleware> oAuthMiddleware) {
        builder.withOAuthMiddleware(oAuthMiddleware);

        return this;
    }

    public ImportApiRootBuilder withOAuthMiddleware(final OAuthMiddleware oAuthMiddleware) {
        builder.withOAuthMiddleware(oAuthMiddleware);

        return this;
    }

    public ImportApiRootBuilder withTokenSupplier(final TokenSupplier tokenSupplier) {
        builder.withTokenSupplier(tokenSupplier);

        return this;
    }

    public ImportApiRootBuilder withTokenSupplier(final Supplier<TokenSupplier> tokenSupplier) {
        builder.withTokenSupplier(tokenSupplier);

        return this;
    }

    public ImportApiRootBuilder withInternalLoggerMiddleware(final InternalLoggerMiddleware internalLoggerMiddleware) {
        builder.withInternalLoggerMiddleware(internalLoggerMiddleware);

        return this;
    }

    public ImportApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory) {
        builder.withInternalLoggerFactory(internalLoggerFactory);

        return this;
    }

    public ImportApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent) {
        builder.withInternalLoggerFactory(internalLoggerFactory, responseLogEvent, deprecationLogEvent);

        return this;
    }

    public ImportApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents) {
        builder.withInternalLoggerFactory(internalLoggerFactory, responseLogEvent, deprecationLogEvent,
            defaultExceptionLogEvent, exceptionLogEvents);

        return this;
    }

    public ImportApiRootBuilder withApiBaseUrl(String apiBaseUrl) {
        builder.withApiBaseUrl(apiBaseUrl);

        return this;
    }

    public ImportApiRootBuilder withApiBaseUrl(final URI apiBaseUrl) {
        builder.withApiBaseUrl(apiBaseUrl);

        return this;
    }

    public ImportApiRootBuilder withUserAgentSupplier(final Supplier<String> userAgentSupplier) {
        builder.withUserAgentSupplier(userAgentSupplier);

        return this;
    }

    public ImportApiRootBuilder addCorrelationIdProvider(final @Nullable CorrelationIdProvider correlationIdProvider) {
        builder.addCorrelationIdProvider(correlationIdProvider);

        return this;
    }

    public ImportApiRootBuilder withMiddleware(final Middleware middleware, final Middleware... middlewares) {
        builder.withMiddleware(middleware, middlewares);

        return this;
    }

    public ImportApiRootBuilder addMiddleware(final Middleware middleware, final Middleware... middlewares) {
        builder.addMiddleware(middleware, middlewares);

        return this;
    }

    public ImportApiRootBuilder withMiddlewares(final List<Middleware> middlewares) {
        builder.withMiddlewares(middlewares);

        return this;
    }

    public ImportApiRootBuilder addMiddlewares(final List<Middleware> middlewares) {
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
        return ApiRoot.fromClient(builder.build()).withProjectKeyValue(projectKey);
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
