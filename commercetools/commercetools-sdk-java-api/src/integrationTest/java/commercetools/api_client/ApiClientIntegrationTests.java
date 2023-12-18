
package commercetools.api_client;

import static commercetools.api_client.ApiClientFixtures.*;
import static java.util.Collections.singletonList;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.models.api_client.ApiClient;
import com.commercetools.api.models.api_client.ApiClientPagedQueryResponse;
import com.commercetools.api.models.product.ProductPagedQueryResponse;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.http.ErrorMiddleware;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
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

    @Test
    @Disabled("This test is disabled because it requires a valid static token")
    public void apiRootWithStaticAuthToken() {
        AuthenticationToken authenticationToken = new AuthenticationToken();
        authenticationToken.setAccessToken("access token");
        authenticationToken.setTokenType("Bearer");
        authenticationToken.setExpiresIn(172800L);
        authenticationToken.setScope("manage_project:your-project-key");

        ApiRootBuilder builder = ApiRootBuilder.of()
                .withProjectKey("your-project-key")
                .withApiBaseUrl("https://api.europe-west1.gcp.commercetools.com")
                .withStaticTokenFlow(authenticationToken)
                .addConcurrentModificationMiddleware()
                .withPolicies(
                    policyBuilder -> policyBuilder.withRetry(b -> b.maxRetries(5).statusCodes(singletonList(503))))
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION);
        ProjectApiRoot projectApiRoot = builder.buildProjectRoot();
        ApiHttpResponse<ProductPagedQueryResponse> productPagedQueryResponseApiHttpResponse = projectApiRoot.products()
                .get()
                .executeBlocking();

        Assertions.assertEquals(productPagedQueryResponseApiHttpResponse.getStatusCode(), 200);
    }
}
