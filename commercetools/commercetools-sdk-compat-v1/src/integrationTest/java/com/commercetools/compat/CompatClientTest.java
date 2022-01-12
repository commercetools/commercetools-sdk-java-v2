
package com.commercetools.compat;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.models.product.ProductProjectionPagedSearchResponse;
import com.commercetools.api.models.project.Project;

import io.sphere.sdk.carts.CartDraft;
import io.sphere.sdk.carts.commands.CartCreateCommand;
import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.models.DefaultCurrencyUnits;
import io.sphere.sdk.products.search.ProductProjectionSearch;
import io.sphere.sdk.projects.queries.ProjectGet;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompatClientTest {
    @Test
    public void compatClient() {
        final ApiHttpClient apiHttpClient = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build())
                .buildClient();
        final String projectKey = CommercetoolsTestUtils.getProjectKey();

        CompatClient client = CompatClient.of(apiHttpClient, projectKey);

        Project project = client.executeBlocking(ProjectGet.of(), Project.class).getBody();

        Assertions.assertThat(project).isInstanceOf(Project.class);
        Assertions.assertThat(project.getKey()).isEqualTo(projectKey);
    }

    @Test
    public void compatClientCategories() {
        CompatClient client = CompatClient.of(CommercetoolsTestUtils.getClient(),
            CommercetoolsTestUtils.getProjectKey());

        CategoryPagedQueryResponse response = client
                .executeBlocking(CategoryQuery.of(), CategoryPagedQueryResponse.class)
                .getBody();
        Assertions.assertThat(response).isInstanceOf(CategoryPagedQueryResponse.class);
    }

    @Test
    public void compatClientCart() {
        CompatClient client = CompatClient.of(CommercetoolsTestUtils.getClient(),
            CommercetoolsTestUtils.getProjectKey());

        Cart cart = client.executeBlocking(CartCreateCommand.of(CartDraft.of(DefaultCurrencyUnits.EUR)), Cart.class)
                .getBody();
        Assertions.assertThat(cart).isInstanceOf(Cart.class);
    }

    @Test
    public void compatClientSearch() {
        CompatClient client = CompatClient.of(CommercetoolsTestUtils.getClient(),
            CommercetoolsTestUtils.getProjectKey());

        ProductProjectionPagedSearchResponse response = client
                .executeBlocking(ProductProjectionSearch.ofCurrent().withFacets(m -> m.categories().id().allTerms()),
                    ProductProjectionPagedSearchResponse.class)
                .getBody();
        Assertions.assertThat(response).isInstanceOf(ProductProjectionPagedSearchResponse.class);
    }

    @Test
    public void compatClientWithApiRoot() {
        ApiRoot root = ApiRoot.fromClient(
            CompatClient.of(CommercetoolsTestUtils.getClient(), CommercetoolsTestUtils.getProjectKey()));

        Project project = root.withProjectKey(CommercetoolsTestUtils.getProjectKey()).get().executeBlocking().getBody();
        Assertions.assertThat(project).isInstanceOf(Project.class);
        Assertions.assertThat(project.getKey()).isEqualTo(CommercetoolsTestUtils.getProjectKey());
    }

    @Test
    public void compatClientWithApiRootCategories() {
        ApiRoot root = ApiRoot.fromClient(
            CompatClient.of(CommercetoolsTestUtils.getClient(), CommercetoolsTestUtils.getProjectKey()));

        CategoryPagedQueryResponse response = root.withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .categories()
                .get()
                .executeBlocking()
                .getBody();
        Assertions.assertThat(response).isInstanceOf(CategoryPagedQueryResponse.class);
    }
}
