
package com.commercetools.compat;

import io.sphere.sdk.client.SphereClientConfig;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ClientBuilder;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class CompatClientFactory {
    public static ApiHttpClient of(SphereClientConfig clientConfig) {
        return ClientBuilder.of()
                .defaultClient(clientConfig.getApiUrl())
                .withClientCredentialsFlow(ClientCredentials.of()
                        .withClientId(clientConfig.getClientId())
                        .withClientSecret(clientConfig.getClientSecret())
                        .build(),
                    clientConfig.getAuthUrl())
                .build();
    }

    public static CompatClient ofCompat(SphereClientConfig clientConfig) {
        return CompatClient.of(ClientBuilder.of()
                .defaultClient(clientConfig.getApiUrl())
                .withClientCredentialsFlow(ClientCredentials.of()
                        .withClientId(clientConfig.getClientId())
                        .withClientSecret(clientConfig.getClientSecret())
                        .build(),
                    clientConfig.getAuthUrl())
                .build(),
            clientConfig.getProjectKey());
    }
}
