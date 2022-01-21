
package commercetools.api_client;

import static commercetools.api_client.ApiClientFixtures.*;

import com.commercetools.api.models.api_client.ApiClient;
import com.commercetools.api.models.api_client.ApiClientPagedQueryResponse;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiClientIntegrationTests {

    @Test
    public void createAndDeleteById() {
        ApiClient apiClient = createApiClient();
        ApiClient deletedApiClient = deleteApiClient(apiClient.getId());

        Assertions.assertEquals(apiClient.getId(), deletedApiClient.getId());
    }

    @Test
    public void getById() {
        withApiClient(apiClient -> {
            ApiClient queriedApiClient = CommercetoolsTestUtils.getProjectApiRoot()
                    .apiClients()
                    .withId(apiClient.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedApiClient);
            Assertions.assertEquals(queriedApiClient.getId(), apiClient.getId());
        });
    }

    @Test
    public void query() {
        withApiClient(apiClient -> {
            ApiClientPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .apiClients()
                    .get()
                    .withWhere("id=" + "\"" + apiClient.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), apiClient.getId());
        });
    }
}
