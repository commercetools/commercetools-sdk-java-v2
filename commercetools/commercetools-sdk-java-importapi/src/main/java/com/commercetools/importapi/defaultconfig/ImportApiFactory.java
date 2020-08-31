package com.commercetools.importapi.defaultconfig;

import com.commercetools.importapi.client.ApiRoot;
import com.commercetools.importapi.client.ByProjectKeyRequestBuilder;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.middlewares.HttpMiddleware;
import io.vrap.rmf.base.client.middlewares.LoggerMiddleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;

public class ImportApiFactory {

    private static final VrapHttpClient vrapHttpClient = new VrapOkhttpClient();

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final LoggerMiddleware.LogLevel logLevel
    ) {
        return create(credentials, tokenEndpoint, apiEndpoint, logLevel).withProjectKeyValue(projectKey);
    }

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(credentials, tokenEndpoint, apiEndpoint).withProjectKeyValue(projectKey);
    }

    public static ApiRoot create(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final LoggerMiddleware.LogLevel logLevel
    ) {
        return ApiRoot.fromMiddlewares(new HttpMiddleware(
                apiEndpoint,
                vrapHttpClient,
                new ClientCredentialsTokenSupplier(
                        credentials.getClientId(),
                        credentials.getClientSecret(),
                        credentials.getScopes(),
                        tokenEndpoint
                        , vrapHttpClient
                )
        ), new LoggerMiddleware(logLevel));
    }

    public static ApiRoot create(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(credentials,tokenEndpoint,apiEndpoint, LoggerMiddleware.LogLevel.NONE);
    }

    @Deprecated
    public static ApiRoot create(
            final String clientId,
            final String clientSecret,
            final String scopes,
            final String tokenEndpoint,
            final String apiEndpoint,
            final LoggerMiddleware.LogLevel logLevel
    ) {
        return ApiRoot.fromMiddlewares(new HttpMiddleware(
                apiEndpoint,
                vrapHttpClient,
                new ClientCredentialsTokenSupplier(
                        clientId,
                        clientSecret,
                        scopes,
                        tokenEndpoint
                        , vrapHttpClient
                )
        ), new LoggerMiddleware(logLevel));
    }

    @Deprecated
    public static ApiRoot create(
            final String clientId,
            final String clientSecret,
            final String scopes,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(clientId, clientSecret, scopes,tokenEndpoint,apiEndpoint, LoggerMiddleware.LogLevel.NONE);
    }
}
