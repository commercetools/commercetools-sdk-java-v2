package commercetools.api_client;



import com.commercetools.api.models.api_client.ApiClient;
import com.commercetools.api.models.api_client.ApiClientDraft;
import com.commercetools.api.models.api_client.ApiClientDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.AnonymousSessionTokenSupplier;
import io.vrap.rmf.okhttp.VrapOkHttpClient;
import org.junit.Assert;

import java.util.function.Consumer;

import static commercetools.utils.CommercetoolsTestUtils.*;

public class ApiClientFixtures {

    private static final VrapHttpClient vrapHttpClient = new VrapOkHttpClient();

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

        ApiClient apiClient = CommercetoolsTestUtils.getProjectRoot()
                .apiClients()
                .post(apiClientDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(apiClient);

        return apiClient;
    }

//    public static void withAnonymousApiClient(final Consumer<ApiClient> consumer) {
//        ApiClient apiClient = createAnonymousApiClient();
//        consumer.accept(apiClient);
//        deleteApiClient(apiClient.getId());
//    }

    public static ApiClient createAnonymousApiClient() {

        ApiClientDraft apiClientDraft = ApiClientDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .scope("create_anonymous_token:" + CommercetoolsTestUtils.getProjectKey())
                .build();

        ApiClient apiClient = CommercetoolsTestUtils.getProjectRoot()
                .apiClients()
                .post(apiClientDraft)
                .executeBlocking().getBody();


        Assert.assertNotNull(apiClient);

        return apiClient;
    }

    public static ApiClient deleteApiClient(final String id) {
        ApiClient apiClient = CommercetoolsTestUtils.getProjectRoot()
                .apiClients()
                .withId(id)
                .delete()
                .executeBlocking().getBody();

        Assert.assertNotNull(apiClient);
        Assert.assertNotNull(apiClient.getId(), id);

        return apiClient;
    }

}
