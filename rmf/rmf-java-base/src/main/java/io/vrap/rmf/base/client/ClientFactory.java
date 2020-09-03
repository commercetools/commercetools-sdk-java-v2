package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.HandlerStack;
import io.vrap.rmf.base.client.http.HttpHandler;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import java.util.logging.Logger;

public class ClientFactory {
    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier
    ) {
        final HandlerStack stack = HandlerStack.create(
                HttpHandler.create(httpClient),
                MiddlewareFactory.createDefault(tokenSupplier, Logger.getLogger(ApiHttpClient.class.getName()))
        );

        return new ApiHttpClient(
            apiBaseUrl,
            stack
        );
    }
}
