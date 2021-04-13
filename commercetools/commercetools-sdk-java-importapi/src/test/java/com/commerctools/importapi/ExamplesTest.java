
package com.commerctools.importapi;

import com.commercetools.importapi.client.ApiRoot;
import com.commercetools.importapi.defaultconfig.ImportApiFactory;
import com.commercetools.importapi.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class ExamplesTest {

    public void createApiRootUS() {
        // ApiRoot config for United States projects
        ApiRoot apiRoot = ImportApiFactory.create(
            ClientCredentials.of()
                    .withClientId("your-client-id")
                    .withClientSecret("your-client-secret")
                    .withScopes("your-scopes")
                    .build(),
            ServiceRegion.GCP_US_CENTRAL1.getOAuthTokenUrl(), ServiceRegion.GCP_US_CENTRAL1.getApiUrl());
    }

    public void createApiRootEU() {
        // ApiRoot config for United States projects
        ApiRoot apiRoot = ImportApiFactory.create(
            ClientCredentials.of()
                    .withClientId("your-client-id")
                    .withClientSecret("your-client-secret")
                    .withScopes("your-scopes")
                    .build(),
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
    }
}
