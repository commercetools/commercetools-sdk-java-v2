package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import java.util.logging.Logger;

public class ClientFactory {
    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier
    ) {
        return new ApiHttpClient(
            apiBaseUrl,
            MiddlewareFactory.createDefault(httpClient, tokenSupplier, Logger.getLogger(ApiHttpClient.class.getName()))
        );
    }
}
