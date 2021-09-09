
package example;

import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.importapi.client.ApiRoot;
import com.commercetools.importapi.defaultconfig.ImportApiRootBuilder;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class ImportExamplesTest {
    public void instance() {
        ApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId("your-client-id")
                            .withClientSecret("your-client-secret")
                            .withScopes("your-scopes")
                            .build(),
                    ServiceRegion.GCP_US_CENTRAL1.getOAuthTokenUrl(), ServiceRegion.GCP_US_CENTRAL1.getApiUrl())
                .build();
    }

    public void euInstance() {
        ApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId("your-client-id")
                            .withClientSecret("your-client-secret")
                            .withScopes("your-scopes")
                            .build(),
                    ServiceRegion.GCP_US_CENTRAL1.getOAuthTokenUrl(), ServiceRegion.GCP_US_CENTRAL1.getApiUrl())
                .build();
    }
}
