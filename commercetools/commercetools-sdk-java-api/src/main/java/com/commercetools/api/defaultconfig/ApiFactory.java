package com.commercetools.api.defaultconfig;

import com.commercetools.api.client.ApiInternalLogger;
import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import io.vrap.rmf.base.client.http.InternalLoggerMiddleware;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ClientFactory;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.http.Middleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.okhttp.VrapOkHttpClient;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ApiFactory {

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return createForProject(projectKey, () -> defaultClient(credentials, tokenEndpoint, apiEndpoint));
    }

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ) {
        return createForProject(projectKey, () -> defaultClient(credentials, tokenEndpoint, apiEndpoint, middlewares));
    }

    public static ByProjectKeyRequestBuilder createForProject(
            final VrapHttpClient httpClient,
            final String projectKey,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ) {
        return createForProject(projectKey, () -> defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, middlewares));
    }

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final Supplier<ApiHttpClient> clientSupplier
    ) {
        return create(clientSupplier).withProjectKey(projectKey);
    }

    public static ApiRoot create(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(() -> defaultClient(credentials, tokenEndpoint, apiEndpoint));
    }

    public static ApiRoot create(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ) {
        return create(() -> defaultClient(credentials, tokenEndpoint, apiEndpoint, middlewares));
    }

    public static ApiRoot create(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(() -> defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint));
    }

    public static ApiRoot create(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ) {
        return create(() -> defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, middlewares));
    }

    public static ApiRoot create(final Supplier<ApiHttpClient> clientSupplier) {
        return ApiRoot.fromClient(clientSupplier.get());
    }

    public static ApiHttpClient defaultClient(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ){
        return defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint);
    }

    public static ApiHttpClient defaultClient(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ){
        return defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, middlewares);
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ){
        return defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>());
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ) {
        middlewares.add(new InternalLoggerMiddleware(ApiInternalLogger::getLogger));
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
                middlewares
        );
    }
}
