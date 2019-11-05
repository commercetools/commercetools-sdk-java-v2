package com.commercetools.api.defaultconfig;

import com.commercetools.api.generated.client.ApiRoot;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.middlewares.HttpMiddleware;
import io.vrap.rmf.base.client.middlewares.LoggerMiddleware;
import io.vrap.rmf.base.client.middlewares.Middleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;

import java.util.ArrayList;
import java.util.List;

public class DefaultApiRoot {

    private static final VrapHttpClient vrapHttpClient = new VrapOkhttpClient();

    public static ApiRoot create(
            final String clientId,
            final String clientSecret,
            final String scopes,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        List<Middleware> middlewares = new ArrayList<>();
        middlewares.add(new HttpMiddleware(
                apiEndpoint,
                vrapHttpClient,
                new ClientCredentialsTokenSupplier(
                        clientId,
                        clientSecret,
                        scopes,
                        tokenEndpoint
                        , vrapHttpClient
                )
        ));
        String runningOnTravis = System.getenv("RUNNING_ON_TRAVIS");
        if(runningOnTravis == null){
            middlewares.add(new LoggerMiddleware());
        }
        return ApiRoot.fromMiddlewares(middlewares);
    }
}