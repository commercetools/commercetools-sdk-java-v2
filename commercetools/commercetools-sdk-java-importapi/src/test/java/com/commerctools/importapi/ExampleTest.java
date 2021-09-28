
package com.commerctools.importapi;

import com.commercetools.importapi.client.ApiRoot;
import com.commercetools.importapi.defaultconfig.ImportApiRootBuilder;
import com.commercetools.importapi.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class ExampleTest {

    public void createApiRootUS() {
        // ApiRoot config for United States projects
        ApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .withScopes("your-scopes")
                        .build(),
                    ServiceRegion.GCP_US_CENTRAL1)
                .build();
    }

    public void createApiRootEU() {
        // ApiRoot config for United States projects
        ApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .withScopes("your-scopes")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .build();
    }
}
