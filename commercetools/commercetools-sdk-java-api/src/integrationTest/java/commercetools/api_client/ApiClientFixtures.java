
package commercetools.api_client;

import java.util.function.Consumer;

import com.commercetools.api.models.api_client.ApiClient;
import com.commercetools.api.models.api_client.ApiClientDraft;
import com.commercetools.api.models.api_client.ApiClientDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class ApiClientFixtures {

    public static void withApiClient(final Consumer<ApiClient> consumer) {
        ApiClient apiClient = createApiClient();
        try {
            consumer.accept(apiClient);
        }
        finally {
            deleteApiClient(apiClient.getId());
        }
    }

    public static ApiClient createApiClient() {
        ApiClientDraft apiClientDraft = ApiClientDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .scope("manage_project:" + CommercetoolsTestUtils.getProjectKey())
                .build();

        ApiClient apiClient = CommercetoolsTestUtils.getProjectApiRoot()
                .apiClients()
                .post(apiClientDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(apiClient);

        return apiClient;
    }

    public static ApiClient deleteApiClient(final String id) {
        ApiClient apiClient = CommercetoolsTestUtils.getProjectApiRoot()
                .apiClients()
                .withId(id)
                .delete()
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(apiClient);
        Assertions.assertNotNull(apiClient.getId(), id);

        return apiClient;
    }

}
