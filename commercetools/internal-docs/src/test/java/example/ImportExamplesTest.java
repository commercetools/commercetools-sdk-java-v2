
package example;

import com.commercetools.importapi.client.ApiRoot;
import com.commercetools.importapi.client.ProjectApiRoot;
import com.commercetools.importapi.defaultconfig.ImportApiRootBuilder;
import com.commercetools.importapi.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class ImportExamplesTest {
    public void usInstance() {
        ProjectApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .build(),
                    ServiceRegion.GCP_US_CENTRAL1)
                .buildProjectRoot("my-projectkey");
    }

    public void instance() {
        ApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                                .withClientId("your-client-id")
                                .withClientSecret("your-client-secret")
                                .build(),
                        ServiceRegion.GCP_EUROPE_WEST1)
                .build();

        ProjectApiRoot projectApiRoot = ImportApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .buildProjectRoot("my-projectkey");
    }
}
