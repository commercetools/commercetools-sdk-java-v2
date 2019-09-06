package commercetools.api_client;

import com.commercetools.models.ApiClient.ApiClient;
import com.commercetools.models.ApiClient.ApiClientDraft;
import com.commercetools.models.ApiClient.ApiClientDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;

import java.util.function.Consumer;

public class ApiClientFixtures {
    
    public static void withApiClient(final Consumer<ApiClient> consumer) {
        ApiClient apiClient = createApiClient();
        consumer.accept(apiClient);
        deleteApiClient(apiClient.getId());
    }
    
    public static ApiClient createApiClient() {
        ApiClientDraft apiClientDraft = ApiClientDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .scope("manage_project:" + CommercetoolsTestUtils.getProjectKey())
                .build();
        
        ApiClient apiClient = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .apiClients()
                .post(apiClientDraft)
                .executeBlocking();
        
        Assertions.assertNotNull(apiClient);
        
        return apiClient;
    }
    
    public static ApiClient deleteApiClient(final String id) {
        ApiClient apiClient = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .apiClients()
                .withId(id)
                .delete()
                .executeBlocking();

        Assertions.assertNotNull(apiClient);
        Assertions.assertNotNull(apiClient.getId(), id);
        
        return apiClient;
    }
    
}
