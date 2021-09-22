
package com.commercetools.migration;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ServiceRegion;

import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientFactory;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class Configuration implements MigrateExample {
    @Override
    public void v1() {
        final SphereClient sphereClient = SphereClientFactory.of()
                .createClient("projectKey", "clientId", "clientSecret");
    }

    @Override
    public void v2() {
        final ProjectApiRoot projectRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of().withClientId("clientId").withClientSecret("clientSecret").build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .buildProjectRoot("projectKey");
    }
}
