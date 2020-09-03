package com.commercetools.api.defaultconfig;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ClientFactory;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.middlewares.HttpMiddleware;
import io.vrap.rmf.base.client.middlewares.LoggerMiddleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;

public class ApiFactory {

    private static final VrapHttpClient vrapHttpClient = new VrapOkhttpClient();

    @Deprecated
    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final LoggerMiddleware.LogLevel logLevel
    ) {
        return create(credentials, tokenEndpoint, apiEndpoint, logLevel).withProjectKey(projectKey);
    }

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(credentials, tokenEndpoint, apiEndpoint).withProjectKey(projectKey);
    }

    @Deprecated
    public static ApiRoot create(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final LoggerMiddleware.LogLevel logLevel
    ) {
        final ApiHttpClient client = ClientFactory.create(
                apiEndpoint,
                vrapHttpClient,
                new ClientCredentialsTokenSupplier(
                        credentials.getClientId(),
                        credentials.getClientSecret(),
                        credentials.getScopes(),
                        tokenEndpoint,
                        vrapHttpClient
                )
        );
        return ApiRoot.fromClient(client);

//        return ApiRoot.fromMiddlewares(new HttpMiddleware(
//                apiEndpoint,
//                vrapHttpClient,
//                new ClientCredentialsTokenSupplier(
//                        credentials.getClientId(),
//                        credentials.getClientSecret(),
//                        credentials.getScopes(),
//                        tokenEndpoint,
//                        vrapHttpClient
//                )
//        ), new LoggerMiddleware(logLevel));
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
        final ApiHttpClient client = ClientFactory.create(
                apiEndpoint,
                vrapHttpClient,
                new ClientCredentialsTokenSupplier(
                        clientId,
                        clientSecret,
                        scopes,
                        tokenEndpoint,
                        vrapHttpClient
                )
        );
        return ApiRoot.fromClient(client);
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
