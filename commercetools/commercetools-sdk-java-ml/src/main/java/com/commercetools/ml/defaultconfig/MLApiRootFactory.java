
package com.commercetools.ml.defaultconfig;

import java.util.List;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.commercetools.ml.client.ApiRoot;
import com.commercetools.ml.client.ByProjectKeyRequestBuilder;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.CorrelationIdProvider;
import io.vrap.rmf.base.client.http.Middleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class MLApiRootFactory {

    public static ByProjectKeyRequestBuilder createForProject(final String projectKey,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint) {
        return MLApiRootBuilder.of().defaultClient(apiEndpoint, credentials, tokenEndpoint).buildForProject(projectKey);
    }

    public static ByProjectKeyRequestBuilder createForProject(final String projectKey,
            final Supplier<ApiHttpClient> clientSupplier) {
        return create(clientSupplier).withProjectKey(projectKey);
    }

    public static ApiRoot create(final ClientCredentials credentials) {
        return MLApiRootBuilder.of().defaultClient(credentials).build();
    }

    public static ApiRoot create(final ClientCredentials credentials, ServiceRegion serviceRegion) {
        return MLApiRootBuilder.of().defaultClient(credentials, serviceRegion).build();
    }

    public static ApiRoot create(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return MLApiRootBuilder.of().defaultClient(apiEndpoint, credentials, tokenEndpoint).build();
    }

    public static ApiRoot create(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint) {
        return MLApiRootBuilder.of(httpClient).defaultClient(apiEndpoint, credentials, tokenEndpoint).build();
    }

    public static ApiRoot create(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return MLApiRootBuilder.of()
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .build();
    }

    public static ApiRoot create(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return MLApiRootBuilder.of(httpClient)
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .build();
    }

    public static ApiRoot create(final Supplier<ApiHttpClient> clientSupplier) {
        return ApiRoot.fromClient(clientSupplier.get());
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials) {
        return MLApiRootBuilder.of().defaultClient(credentials).buildClient();
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return MLApiRootBuilder.of().defaultClient(apiEndpoint, credentials, tokenEndpoint).buildClient();
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final List<Middleware> middlewares) {
        return MLApiRootBuilder.of()
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint) {
        return MLApiRootBuilder.of(httpClient).defaultClient(apiEndpoint, credentials, tokenEndpoint).buildClient();
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return MLApiRootBuilder.of()
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider) {
        return MLApiRootBuilder.of()
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return MLApiRootBuilder.of(httpClient)
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final List<Middleware> middlewares) {
        return MLApiRootBuilder.of(httpClient)
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider) {
        return MLApiRootBuilder.of(httpClient)
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final Supplier<String> userAgentSupplier,
            final List<Middleware> middlewares, @Nullable final CorrelationIdProvider correlationIdProvider) {
        return MLApiRootBuilder.of(httpClient)
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .withUserAgentSupplier(userAgentSupplier)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final Supplier<VrapHttpClient> httpClientSupplier,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint,
            final List<Middleware> middlewares, @Nullable final CorrelationIdProvider correlationIdProvider) {
        return MLApiRootBuilder.of(httpClientSupplier.get())
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final Supplier<VrapHttpClient> httpClientSupplier,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint,
            final Supplier<String> userAgentSupplier, final List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider) {
        return MLApiRootBuilder.of(httpClientSupplier.get())
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .withUserAgentSupplier(userAgentSupplier)
                .addMiddlewares(middlewares)
                .buildClient();
    }
}
