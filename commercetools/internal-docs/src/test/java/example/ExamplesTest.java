
package example;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ByProjectKeyTaxCategoriesGet;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.category.*;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringBuilder;
import com.commercetools.api.models.project.Project;
import com.commercetools.api.models.tax_category.TaxCategoryPagedQueryResponse;
import com.commercetools.http.okhttp4.CtOkHttp4Client;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ExamplesTest {

    private ProjectApiRoot createProjectClient() {
        return ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId("your-client-id")
                            .withClientSecret("your-client-secret")
                            .withScopes("your-scopes")
                            .build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .buildProjectRoot("my-project");
    }

    public void instance() {
        // ApiRoot config for Europe projects
        ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId("your-client-id")
                            .withClientSecret("your-client-secret")
                            .withScopes("your-scopes")
                            .build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .buildProjectRoot("my-project");
    }

    public void performRequest() {
        ProjectApiRoot apiRoot = createProjectClient();
        final CompletableFuture<ApiHttpResponse<TaxCategoryPagedQueryResponse>> future = apiRoot.taxCategories()
                .get()
                .withWhere("name = :name")
                .withPredicateVar("name", "de19")
                .execute();
    }

    public void usage() {
        ProjectApiRoot apiRoot = createProjectClient();

        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .name(LocalizedStringBuilder.of().addValue("en", "name").build())
                .slug(LocalizedStringBuilder.of().addValue("en", "slug").build())
                .description(LocalizedStringBuilder.of().addValue("en", "description").build())
                .externalId("random-id")
                .key("random-key")
                .metaDescription(LocalizedStringBuilder.of().addValue("en", "metaDescription").build())
                .orderHint("hint")
                .build();

        // Use in the previous step configured ApiRoot instance to send and receive a newly created Category
        Category category = apiRoot.categories().post(categoryDraft).executeBlocking().getBody();

        // Get Category by id
        Category queriedCategory = apiRoot.categories().withId(category.getId()).get().executeBlocking().getBody();

        // Get Category by key
        Category queriedCategoryByKey = apiRoot.categories()
                .withKey(category.getKey())
                .get()
                .executeBlocking()
                .getBody();

        // Query Categories
        CategoryPagedQueryResponse response = apiRoot.categories()
                .get()
                .withWhere("id = :catId")
                .withPredicateVar("catId", category.getId())
                .executeBlocking()
                .getBody();

        // Delete Category by id
        Category deletedCategory = apiRoot.categories()
                .withId(category.getId())
                .delete()
                .withVersion(1)
                .executeBlocking()
                .getBody();

        // Update Category
        List<CategoryUpdateAction> updateActions = new ArrayList<>();
        LocalizedString newName = LocalizedString.of();
        newName.setValue("key-Temp", "value-Temp");
        updateActions.add(CategoryChangeNameActionBuilder.of().name(newName).build());

        CategoryUpdate categoryUpdate = CategoryUpdateBuilder.of()
                .version(category.getVersion())
                .actions(updateActions)
                .build();

        Category updatedCategory = apiRoot.categories()
                .withId(category.getId())
                .post(categoryUpdate)
                .executeBlocking()
                .getBody();

        // Delete Category by key
        Category deletedCategoryByKey = apiRoot.categories()
                .withKey(category.getKey())
                .delete()
                .withVersion(category.getVersion())
                .executeBlocking()
                .getBody();
    }

    public void middleware() {
        ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId("your-client-id")
                            .withClientSecret("your-client-secret")
                            .withScopes("your-scopes")
                            .build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .addMiddleware((request, next) -> next.apply(request.addHeader("X-FOO", "Bar")))
                .buildProjectRoot("my-project");
    }

    public void retry() {
        ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl(),
                    ClientCredentials.of().withClientId("clientId").withClientSecret("clientSecret").build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl())
                .withRetryMiddleware(5, Arrays.asList(502, 503, 504))
                .buildProjectRoot("my-project");
    }

    public void executeBlocking() {
        ProjectApiRoot apiRoot = createProjectClient();
        Project project = apiRoot.get().executeBlocking().getBody();
    }

    public void proxy() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy", 8080));
        VrapHttpClient httpClient = new CtOkHttp4Client(builder -> builder.proxy(proxy));

        ProjectApiRoot apiRoot = ApiRootBuilder.of(httpClient)
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId("your-client-id")
                            .withClientSecret("your-client-secret")
                            .withScopes("your-scopes")
                            .build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .buildProjectRoot("my-project");
    }

    @Test
    public void immutableRequest() {
        ProjectApiRoot apiRoot = createProjectClient();
        final ByProjectKeyTaxCategoriesGet taxCategoriesGet = apiRoot.taxCategories()
                .get()
                .withWhere("name = :name")
                .withPredicateVar("name", "de19");

        final ByProjectKeyTaxCategoriesGet taxCategoriesGet2 = taxCategoriesGet.withPredicateVar("name", "de07");

        Assertions.assertThat(taxCategoriesGet.getQueryParam("var.name").get(0)).isEqualTo("de19");
        Assertions.assertThat(taxCategoriesGet2.getQueryParam("var.name").get(0)).isEqualTo("de07");
    }
}
