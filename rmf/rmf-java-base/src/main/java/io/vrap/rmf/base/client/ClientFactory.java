package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.HandlerStack;
import io.vrap.rmf.base.client.http.HttpHandler;
import io.vrap.rmf.base.client.http.Middleware;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ClientFactory {
    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, new ArrayList<>());
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            List<Middleware> middlewares
    ) {

        middlewares.addAll(MiddlewareFactory.createDefault(tokenSupplier, LoggerFactory.getLogger("commercetools")));

        final HandlerStack stack = HandlerStack.create(HttpHandler.create(httpClient), middlewares);

        return new ApiHttpClient(
                apiBaseUrl,
                stack
        );
    }
}
