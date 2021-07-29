
package com.commercetools.importapi.defaultconfig;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.commercetools.importapi.client.ApiRoot;
import com.commercetools.importapi.client.ByProjectKeyRequestBuilder;
import com.commercetools.importapi.client.ImportCorrelationIdProvider;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.CorrelationIdProvider;
import io.vrap.rmf.base.client.http.Middleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class ImportApiFactory {

    public static ByProjectKeyRequestBuilder createForProject(final String projectKey,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint) {
        return createForProject(projectKey, () -> defaultClient(HttpClientSupplier.of(), credentials, tokenEndpoint,
            apiEndpoint, new ArrayList<>(), new ImportCorrelationIdProvider(projectKey)));
    }

    public static ByProjectKeyRequestBuilder createForProject(final String projectKey,
            final Supplier<ApiHttpClient> clientSupplier) {
        return create(clientSupplier).withProjectKeyValue(projectKey);
    }

    public static ApiRoot create(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return create(() -> defaultClient(HttpClientSupplier.of(), credentials, tokenEndpoint, apiEndpoint,
            new ArrayList<>(), null));
    }

    public static ApiRoot create(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint) {
        return create(
            () -> defaultClient(() -> httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null));
    }

    public static ApiRoot create(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final List<Middleware> middlewares) {
        return create(
            () -> defaultClient(() -> httpClient, credentials, tokenEndpoint, apiEndpoint, middlewares, null));
    }

    public static ApiRoot create(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return create(() -> defaultClient(HttpClientSupplier.of(), credentials, tokenEndpoint, apiEndpoint,
            new ArrayList<>(), correlationIdProvider));
    }

    public static ApiRoot create(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return create(() -> defaultClient(() -> httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(),
            correlationIdProvider));
    }

    public static ApiRoot create(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider) {
        return create(() -> defaultClient(() -> httpClient, credentials, tokenEndpoint, apiEndpoint, middlewares,
            correlationIdProvider));
    }

    public static ApiRoot create(final Supplier<ApiHttpClient> clientSupplier) {
        return ApiRoot.fromClient(clientSupplier.get());
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return defaultClient(HttpClientSupplier.of(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null);
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final List<Middleware> middlewares) {
        return defaultClient(HttpClientSupplier.of(), credentials, tokenEndpoint, apiEndpoint, middlewares, null);
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint) {
        return defaultClient(() -> httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null);
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return defaultClient(HttpClientSupplier.of(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(),
            correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint, final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider) {
        return defaultClient(HttpClientSupplier.of(), credentials, tokenEndpoint, apiEndpoint, middlewares,
            correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final CorrelationIdProvider correlationIdProvider) {
        return defaultClient(() -> httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(),
            correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final List<Middleware> middlewares) {
        return defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, middlewares, null);
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider) {
        return defaultClient(() -> httpClient, credentials, tokenEndpoint, apiEndpoint, middlewares,
            correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(final VrapHttpClient httpClient, final ClientCredentials credentials,
            final String tokenEndpoint, final String apiEndpoint, final Supplier<String> userAgentSupplier,
            final List<Middleware> middlewares, @Nullable final CorrelationIdProvider correlationIdProvider) {
        return defaultClient(() -> httpClient, credentials, tokenEndpoint, apiEndpoint, userAgentSupplier, middlewares,
            correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(final Supplier<VrapHttpClient> httpClientSupplier,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint,
            final List<Middleware> middlewares, @Nullable final CorrelationIdProvider correlationIdProvider) {
        return ImportApiRootBuilder.of(httpClientSupplier.get())
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .addMiddlewares(middlewares)
                .buildClient();
    }

    public static ApiHttpClient defaultClient(final Supplier<VrapHttpClient> httpClientSupplier,
            final ClientCredentials credentials, final String tokenEndpoint, final String apiEndpoint,
            final Supplier<String> userAgentSupplier, final List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider) {
        return ImportApiRootBuilder.of(httpClientSupplier.get())
                .defaultClient(apiEndpoint, credentials, tokenEndpoint)
                .addCorrelationIdProvider(correlationIdProvider)
                .withUserAgentSupplier(userAgentSupplier)
                .addMiddlewares(middlewares)
                .buildClient();
    }
}
