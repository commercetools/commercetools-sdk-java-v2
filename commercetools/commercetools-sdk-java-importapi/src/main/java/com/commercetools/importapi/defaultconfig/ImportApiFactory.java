package com.commercetools.importapi.defaultconfig;

import com.commercetools.importapi.client.ApiRoot;
import com.commercetools.importapi.client.ByProjectKeyRequestBuilder;
import com.commercetools.importapi.client.ImportCorrelationIdProvider;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ClientFactory;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.http.CorrelationIdProvider;
import io.vrap.rmf.base.client.http.Middleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.okhttp.VrapOkHttpClient;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ImportApiFactory {

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return createForProject(projectKey, () -> defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), new ImportCorrelationIdProvider(projectKey)));
    }

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final Supplier<ApiHttpClient> clientSupplier
    ) {
        return create(clientSupplier).withProjectKeyValue(projectKey);
    }

    public static ApiRoot create(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(() -> defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null));
    }

    public static ApiRoot create(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(() -> defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null));
    }

    public static ApiRoot create(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ) {
        return create(() -> defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, middlewares, null));
    }

    public static ApiRoot create(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final CorrelationIdProvider correlationIdProvider
    ) {
        return create(() -> defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), correlationIdProvider));
    }

    public static ApiRoot create(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final CorrelationIdProvider correlationIdProvider
    ) {
        return create(() -> defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), correlationIdProvider));
    }

    public static ApiRoot create(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider
    ) {
        return create(() -> defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, middlewares, correlationIdProvider));
    }

    public static ApiRoot create(final Supplier<ApiHttpClient> clientSupplier) {
        return ApiRoot.fromClient(clientSupplier.get());
    }

    public static ApiHttpClient defaultClient(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ){
        return defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null);
    }

    public static ApiHttpClient defaultClient(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ){
        return defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, middlewares, null);
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ){
        return defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null);
    }

    public static ApiHttpClient defaultClient(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final CorrelationIdProvider correlationIdProvider
    ){
        return defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider
    ){
        return defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, middlewares, correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final CorrelationIdProvider correlationIdProvider
    ){
        return defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ) {
        return defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, middlewares, null);
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider
            ) {
        return ClientFactory.create(
                apiEndpoint,
                httpClient,
                new ClientCredentialsTokenSupplier(
                        credentials.getClientId(),
                        credentials.getClientSecret(),
                        credentials.getScopes(),
                        tokenEndpoint,
                        httpClient
                ),
                middlewares,
                correlationIdProvider
        );
    }
}
