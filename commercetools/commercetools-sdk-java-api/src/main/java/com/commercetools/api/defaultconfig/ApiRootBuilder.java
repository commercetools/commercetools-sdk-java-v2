
package com.commercetools.api.defaultconfig;

import java.net.URI;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import javax.annotation.Nullable;

import com.commercetools.api.client.ApiInternalLoggerFactory;
import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

public class ApiRootBuilder {
    private final ClientBuilder builder;

    private ApiRootBuilder(ClientBuilder builder) {
        this.builder = builder;
    }

    public static ApiRootBuilder of() {
        return new ApiRootBuilder(ClientBuilder.of());
    }

    public static ApiRootBuilder of(final VrapHttpClient httpClient) {
        return new ApiRootBuilder(ClientBuilder.of(httpClient));
    }

    public static ApiRootBuilder of(final HandlerStack stack) {
        return new ApiRootBuilder(ClientBuilder.of(stack));
    }

    public ApiRootBuilder withHandlerStack(final HandlerStack stack) {
        builder.withHandlerStack(stack);
        return this;
    }

    public ApiRootBuilder withHttpClient(final VrapHttpClient httpClient) {
        builder.withHttpClient(httpClient);
        return this;
    }

    public ApiRootBuilder withSerializer(final ResponseSerializer serializer) {
        builder.withSerializer(serializer);
        return this;
    }

    public ApiRootBuilder defaultClient(final ClientCredentials credentials) {
        return defaultClient(credentials, ServiceRegion.GCP_EUROPE_WEST1);
    }

    public ApiRootBuilder defaultClient(final ClientCredentials credentials, ServiceRegion serviceRegion) {
        return defaultClient(URI.create(serviceRegion.getApiUrl())).withClientCredentialsFlow(credentials,
            serviceRegion.getOAuthTokenUrl());
    }

    public ApiRootBuilder defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public ApiRootBuilder defaultClient(final String apiEndpoint, final ClientCredentials credentials,
            final String tokenEndpoint) {
        return defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public ApiRootBuilder defaultClient(final String apiEndpoint) {
        return defaultClient(URI.create(apiEndpoint));
    }

    public ApiRootBuilder defaultClient(final URI apiEndpoint) {
        builder.defaultClient(apiEndpoint).withInternalLoggerFactory(ApiInternalLoggerFactory::get);

        return this;
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint);

        return this;
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint);

        return this;
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            final VrapHttpClient httpClient) {
        builder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public ApiRootBuilder withStaticTokenFlow(final AuthenticationToken token) {
        builder.withStaticTokenFlow(token);

        return this;
    }

    public ApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        builder.withAnonymousSessionFlow(credentials, tokenEndpoint);

        return this;
    }

    public ApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient) {
        builder.withAnonymousSessionFlow(credentials, tokenEndpoint, httpClient);

        return this;
    }

    public ApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint) {
        builder.withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint);

        return this;
    }

    public ApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, final VrapHttpClient httpClient) {
        builder.withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint, httpClient);

        return this;
    }

    public ApiRootBuilder addAcceptGZipMiddleware() {
        builder.addAcceptGZipMiddleware();

        return this;
    }

    public ApiRootBuilder withErrorMiddleware() {
        builder.withErrorMiddleware();

        return this;
    }

    public ApiRootBuilder withErrorMiddleware(final ErrorMiddleware errorMiddleware) {
        builder.withErrorMiddleware(errorMiddleware);

        return this;
    }

    public ApiRootBuilder withRetryMiddleware(Supplier<RetryMiddleware> retryMiddleware) {
        builder.withRetryMiddleware(retryMiddleware);

        return this;
    }

    public ApiRootBuilder withRetryMiddleware(RetryMiddleware retryMiddleware) {
        builder.withRetryMiddleware(retryMiddleware);

        return this;
    }

    public ApiRootBuilder withRetryMiddleware(final int maxRetries) {
        builder.withRetryMiddleware(maxRetries);

        return this;
    }

    public ApiRootBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes) {
        builder.withRetryMiddleware(maxRetries, statusCodes);

        return this;
    }

    public ApiRootBuilder withOAuthMiddleware(final Supplier<OAuthMiddleware> oAuthMiddleware) {
        builder.withOAuthMiddleware(oAuthMiddleware);

        return this;
    }

    public ApiRootBuilder withOAuthMiddleware(final OAuthMiddleware oAuthMiddleware) {
        builder.withOAuthMiddleware(oAuthMiddleware);

        return this;
    }

    public ApiRootBuilder withTokenSupplier(final TokenSupplier tokenSupplier) {
        builder.withTokenSupplier(tokenSupplier);

        return this;
    }

    public ApiRootBuilder withInternalLoggerMiddleware(final InternalLoggerMiddleware internalLoggerMiddleware) {
        builder.withInternalLoggerMiddleware(internalLoggerMiddleware);

        return this;
    }

    public ApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory) {
        builder.withInternalLoggerFactory(internalLoggerFactory);

        return this;
    }

    public ApiRootBuilder withApiBaseUrl(String apiBaseUrl) {
        builder.withApiBaseUrl(apiBaseUrl);

        return this;
    }

    public ApiRootBuilder withApiBaseUrl(final URI apiBaseUrl) {
        builder.withApiBaseUrl(apiBaseUrl);

        return this;
    }

    public ApiRootBuilder withUserAgentSupplier(final Supplier<String> userAgentSupplier) {
        builder.withUserAgentSupplier(userAgentSupplier);

        return this;
    }

    public ApiRootBuilder addCorrelationIdProvider(final @Nullable CorrelationIdProvider correlationIdProvider) {
        builder.addCorrelationIdProvider(correlationIdProvider);

        return this;
    }

    public ApiRootBuilder withMiddleware(final Middleware middleware, final Middleware... middlewares) {
        builder.withMiddleware(middleware, middlewares);

        return this;
    }

    public ApiRootBuilder addMiddleware(final Middleware middleware, final Middleware... middlewares) {
        builder.addMiddleware(middleware, middlewares);

        return this;
    }

    public ApiRootBuilder withMiddlewares(final List<Middleware> middlewares) {
        builder.withMiddlewares(middlewares);

        return this;
    }

    public ApiRootBuilder addMiddlewares(final List<Middleware> middlewares) {
        builder.addMiddlewares(middlewares);

        return this;
    }

    public ApiRootBuilder with(UnaryOperator<ClientBuilder> builderUnaryOperator) {
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

    public ByProjectKeyRequestBuilder buildForProject(final String projectKey) {
        return ApiRoot.fromClient(builder.build()).withProjectKey(projectKey);
    }

    public static ByProjectKeyRequestBuilder createForProject(final String projectKey,
            final ApiHttpClient clientSupplier) {
        return ApiRoot.fromClient(clientSupplier).withProjectKey(projectKey);
    }
}
