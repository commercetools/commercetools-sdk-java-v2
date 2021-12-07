
package example;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.client.ByProjectKeyTaxCategoriesGet;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.client.QueryUtils;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.category.*;
import com.commercetools.api.models.common.LocalizedStringBuilder;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.project.Project;
import com.commercetools.api.models.tax_category.TaxCategoryPagedQueryResponse;
import com.commercetools.http.okhttp4.CtOkHttp4Client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.apache.commons.lang3.tuple.Pair;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ExamplesTest {

    private ProjectApiRoot createProjectClient() {
        return ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .build("my-project");
    }

    public void instance() {
        // ApiRoot config for Europe projects
        ApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .build();

        // Project scoped ApiRoot config for Europe projects
        ProjectApiRoot projectApiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .build("my-project");
    }

    public void customHttpClient() {
        ApiRootBuilder builder = ApiRootBuilder.of(new CtOkHttp4Client());
    }

    public void wrappedClient() {
        ApiHttpClient client = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .buildClient();

        ProjectApiRoot projectApiRoot = ApiRootBuilder.of(client)
                .withApiBaseUrl(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withMiddleware((request, next) -> {
                    return next.apply(request.addHeader("x-custom-header", "custom-header-value"));
                })
                .build("my-project-key");
    }

    public void performRequest() {
        ProjectApiRoot apiRoot = createProjectClient();
        final CompletableFuture<ApiHttpResponse<TaxCategoryPagedQueryResponse>> future = apiRoot.taxCategories()
                .get()
                .withWhere("name = :name")
                .withPredicateVar("name", "de19")
                .execute();
    }

    public CategoryDraft draftBuilder() {
        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .name(LocalizedStringBuilder.of().addValue("en", "name").build())
                .slug(LocalizedStringBuilder.of().addValue("en", "slug").build())
                .description(LocalizedStringBuilder.of().addValue("en", "description").build())
                .externalId("random-id")
                .key("random-key")
                .metaDescription(LocalizedStringBuilder.of().addValue("en", "metaDescription").build())
                .orderHint("hint")
                .build();

        Assertions.assertThat(categoryDraft).isInstanceOf(CategoryDraft.class);

        return categoryDraft;
    }

    public void usage() {
        ProjectApiRoot apiRoot = createProjectClient();

        // Use in the previous step configured ApiRoot instance to send and receive a newly created Category
        Category category = apiRoot.categories().post(draftBuilder()).executeBlocking().getBody();

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

        // Update Category
        Category updatedCategory = apiRoot.categories()
                .withId(category.getId())
                .post(CategoryUpdateBuilder.of()
                        .version(category.getVersion())
                        .actions(CategoryChangeNameActionBuilder.of()
                                .name(LocalizedStringBuilder.of().addValue("key-Temp", "value-Temp").build())
                                .build())
                        .build())
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

    public void queryPredicateVariable() {
        ProjectApiRoot apiRoot = createProjectClient();
        apiRoot.customers()
                .get()
                .withWhere("firstName = :firstName and lastName = :lastName",
                    Arrays.asList(Pair.of("firstName", "John"), Pair.of("lastName", "Doe")));

        apiRoot.customers()
                .get()
                .withWhere("firstName = :firstName", "firstName", "John")
                .addWhere("lastName = :lastName", "lastName", "John");

        apiRoot.customers()
                .get()
                .withWhere("firstName = :firstName")
                .addWhere("lastName = :lastName")
                .withPredicateVar("firstName", "John")
                .withPredicateVar("lastName", "Doe");
    }

    public void queryPredicateVariableArray() {
        ProjectApiRoot apiRoot = createProjectClient();
        apiRoot.productProjections()
                .get()
                .withWhere("masterVariant(sku in :skus)",
                    Collections.singletonMap("skus", Arrays.asList("abc", "def")));

        apiRoot.productProjections()
                .get()
                .withWhere("masterVariant(sku in :skus)",
                    Arrays.asList(Pair.of("skus", "abc"), Pair.of("skus", "def")));

        apiRoot.productProjections()
                .get()
                .withWhere("masterVariant(sku in :skus)")
                .withPredicateVar("skus", Arrays.asList("abc", "def"));

        apiRoot.productProjections()
                .get()
                .withWhere("masterVariant(sku in :skus)")
                .withPredicateVar("skus", "abc")
                .addPredicateVar("skus", "def");
    }

    public void getByIdOrKey() {
        ProjectApiRoot apiRoot = createProjectClient();
        apiRoot.productProjections().withKey("product-key").get();

        apiRoot.productProjections().withId("product-key").get();
    }

    public void queryAll() {
        ProjectApiRoot apiRoot = createProjectClient();
        List<String> ids = QueryUtils.queryAll(apiRoot.productProjections().get(), (productProjections) -> {
            return productProjections.stream().map(ProductProjection::getId).collect(Collectors.toList());
        }, 100)
                .thenApply(lists -> lists.stream().flatMap(List::stream).collect(Collectors.toList()))
                .toCompletableFuture()
                .join();
    }

    public void middleware() {
        ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .withScopes("your-scopes")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .addMiddleware((request, next) -> next.apply(request.addHeader("X-FOO", "Bar")))
                .build("my-project");
    }

    public void retry() {
        ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of().withClientId("clientId").withClientSecret("clientSecret").build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .withRetryMiddleware(5, Arrays.asList(502, 503, 504))
                .build("my-project");
    }

    public void executeBlocking() {
        ProjectApiRoot apiRoot = createProjectClient();
        Project project = apiRoot.get().executeBlocking().getBody();
    }

    public void proxy() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy", 8080));
        VrapHttpClient httpClient = new CtOkHttp4Client(builder -> builder.proxy(proxy));

        ProjectApiRoot apiRoot = ApiRootBuilder.of(httpClient)
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .withScopes("your-scopes")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .build("my-project");
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