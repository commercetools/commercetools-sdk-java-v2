package com.commercetools;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.category.*;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringBuilder;
import com.commercetools.api.models.tax_category.TaxCategoryPagedQueryResponse;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ExamplesTest {

    public ApiRoot createClient() {
        ApiRoot apiRoot = ApiFactory.create(
                ClientCredentials.of().withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .withScopes("your-scopes")
                        .build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
                ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());

        return apiRoot;
    }

    public void performRequest() {
        ApiRoot apiRoot = createClient();
        final CompletableFuture<ApiHttpResponse<TaxCategoryPagedQueryResponse>> future = apiRoot
                .withProjectKey("my-project")
                .taxCategories()
                .get()
                .withWhere("name = :name")
                .withQueryParam("name", "de19")
                .execute();
    }

    public void usage() {
        ApiRoot apiRoot = ApiFactory.create(
                ClientCredentials.of().withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .withScopes("your-scopes")
                        .build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
                ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());

        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .name(
                    LocalizedStringBuilder.of().addValue("en", "name").build()
                )
                .slug(
                    LocalizedStringBuilder.of().addValue("en", "slug").build()
                )
                .description(
                    LocalizedStringBuilder.of().addValue("en", "description").build()
                )
                .externalId("random-id")
                .key("random-key")
                .metaDescription(
                    LocalizedStringBuilder.of().addValue("en", "metaDescription").build()
                )
                .orderHint("hint")
                .build();

        // Use in the previous step configured ApiRoot instance to send and receive a newly created Category
        Category category = apiRoot.withProjectKey("project-key")
                .categories()
                .post(categoryDraft)
                .executeBlocking()
                .getBody();

        // Get Category by id
        Category queriedCategory = apiRoot.withProjectKey("project-key")
                .categories()
                .withId(category.getId())
                .get()
                .executeBlocking()
                .getBody();

        // Get Category by key
        Category queriedCategoryByKey = apiRoot.withProjectKey("project-key")
                .categories()
                .withKey(category.getKey())
                .get()
                .executeBlocking()
                .getBody();

        // Query Categories
        CategoryPagedQueryResponse response = apiRoot.withProjectKey("project-key")
                .categories()
                .get()
                .withWhere("id=" + "\"" + category.getId() + "\"")
                .executeBlocking().getBody();

        // Delete Category by id
        Long version = 1L;
        Category deletedCategory = apiRoot.withProjectKey("project-key")
                .categories()
                .withId(category.getId())
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        // Update Category
        List<CategoryUpdateAction> updateActions = new ArrayList<>();
        LocalizedString newName = LocalizedString.of();
        newName.setValue("key-Temp", "value-Temp");
        updateActions.add(CategoryChangeNameActionBuilder.of()
                .name(newName)
                .build());

        CategoryUpdate categoryUpdate = CategoryUpdateBuilder.of()
                .version(category.getVersion())
                .actions(updateActions)
                .build();

        Category updatedCategory = apiRoot.withProjectKey("project-key")
                .categories()
                .withId(category.getId())
                .post(categoryUpdate)
                .executeBlocking()
                .getBody();

        // Delete Category by key
        Category deletedCategoryByKey = apiRoot.withProjectKey("project-key")
                .categories()
                .withKey(category.getKey())
                .delete()
                .withVersion(category.getVersion())
                .executeBlocking().getBody();
    }
}
