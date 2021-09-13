
package example;

import com.commercetools.importapi.defaultconfig.ImportApiRootBuilder;
import com.commercetools.importapi.defaultconfig.ProjectApiRoot;
import com.commercetools.importapi.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class ImportExamplesTest {
    public void instance() {
        ProjectApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId("your-client-id")
                            .withClientSecret("your-client-secret")
                            .withScopes("your-scopes")
                            .build(),
                    ServiceRegion.GCP_US_CENTRAL1.getOAuthTokenUrl(), ServiceRegion.GCP_US_CENTRAL1.getApiUrl())
                .buildProjectRoot("my-projectkey");
    }

    public void euInstance() {
        ProjectApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId("your-client-id")
                            .withClientSecret("your-client-secret")
                            .withScopes("your-scopes")
                            .build(),
                    ServiceRegion.GCP_US_CENTRAL1.getOAuthTokenUrl(), ServiceRegion.GCP_US_CENTRAL1.getApiUrl())
                .buildProjectRoot("my-projectkey");
    }
}
