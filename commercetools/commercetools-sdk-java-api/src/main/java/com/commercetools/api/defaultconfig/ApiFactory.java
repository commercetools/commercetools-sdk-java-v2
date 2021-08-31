
package com.commercetools.api.defaultconfig;

import java.util.List;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.commercetools.api.client.*;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.http.CorrelationIdProvider;
import io.vrap.rmf.base.client.http.Middleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class ApiFactory {

    public static ByProjectKeyRequestBuilder createForProject(final String projectKey,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint) {
        return ApiRootBuilder.of()
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .withInternalLoggerFactory(ApiInternalLoggerFactory::get)
                .addCorrelationIdProvider(new ApiCorrelationIdProvider(projectKey))
                .buildForProject(projectKey);
    }

    public static ByProjectKeyRequestBuilder createForProject(final String projectKey,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint,
            final List<Middleware> middlewares) {
        return ApiRootBuilder.of()
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .withInternalLoggerFactory(ApiInternalLoggerFactory::get)
                .addCorrelationIdProvider(new ApiCorrelationIdProvider(projectKey))
                .addMiddlewares(middlewares)
                .buildForProject(projectKey);
    }

    public static ByProjectKeyRequestBuilder createForProject(final VrapHttpClient httpClient, final String projectKey,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint,
            final List<Middleware> middlewares) {
        return ApiRootBuilder.of(httpClient)
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .withInternalLoggerFactory(ApiInternalLoggerFactory::get)
                .addCorrelationIdProvider(new ApiCorrelationIdProvider(projectKey))
                .addMiddlewares(middlewares)
                .buildForProject(projectKey);
    }

    public static ByProjectKeyRequestBuilder createForProject(final VrapHttpClient httpClient, final String projectKey,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint,
            final List<Middleware> middlewares, CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of(httpClient)
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .withInternalLoggerFactory(ApiInternalLoggerFactory::get)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .buildForProject(projectKey);
    }

    public static ByProjectKeyRequestBuilder createForProject(final String projectKey,
            final Supplier<ApiHttpClient> clientSupplier) {
        return create(clientSupplier).withProjectKey(projectKey);
    }

    public static ApiRoot create(final ClientCredentials credentials) {
        return ApiRootBuilder.of().defaultClient(credentials).build();
    }

    public static ApiRoot create(final ClientCredentials credentials, ServiceRegion serviceRegion) {
        return ApiRootBuilder.of().defaultClient(credentials, serviceRegion).build();
    }

    public static ApiRoot create(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return ApiRootBuilder.of().defaultClient(credentials, tokenEndpoint, apiEndpoint).build();
    }

    public static ApiRoot create(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of()
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .build();
    }

    public static ApiRoot create(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final List<Middleware> middlewares) {
        return ApiRootBuilder.of()
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addMiddlewares(middlewares)
                .build();
    }

    public static ApiRoot create(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of()
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .build();
    }

    public static ApiRoot create(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint) {
        return ApiRootBuilder.of(httpClient).defaultClient(credentials, tokenEndpoint, apiEndpoint).build();
    }

    public static ApiRoot create(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of(httpClient)
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .build();
    }

    public static ApiRoot create(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final List<Middleware> middlewares) {
        return ApiRootBuilder.of(httpClient)
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addMiddlewares(middlewares)
                .build();
    }

    public static ApiRoot create(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of(httpClient)
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .build();
    }

    public static ApiRoot create(final Supplier<ApiHttpClient> clientSupplier) {
        return ApiRoot.fromClient(clientSupplier.get());
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials) {
        return ApiRootBuilder.of().defaultClient(credentials).buildClient();
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return ApiRootBuilder.of().defaultClient(credentials, tokenEndpoint, apiEndpoint).buildClient();
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of()
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final List<Middleware> middlewares) {
        return ApiRootBuilder.of()
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint) {
        return ApiRootBuilder.of(httpClient).defaultClient(credentials, tokenEndpoint, apiEndpoint).buildClient();
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of(httpClient)
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final List<Middleware> middlewares) {
        return ApiRootBuilder.of(httpClient)
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of(httpClient)
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final Supplier<String> userAgentSupplier,
            final List<Middleware> middlewares, @Nullable final CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of(httpClient)
                .defaultClient(credentials, tokenEndpoint, apiEndpoint)
                .withUserAgentSupplier(userAgentSupplier)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final Supplier<VrapHttpClient> httpClientSupplier,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint,
            final List<Middleware> middlewares, @Nullable final CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of(httpClientSupplier.get())
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .withInternalLoggerFactory(ApiInternalLoggerFactory::get)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final Supplier<VrapHttpClient> httpClientSupplier,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint,
            final Supplier<String> userAgentSupplier, final List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider) {
        return ApiRootBuilder.of(httpClientSupplier.get())
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .withInternalLoggerFactory(ApiInternalLoggerFactory::get)
                .withUserAgentSupplier(userAgentSupplier)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .buildClient();
    }
}
