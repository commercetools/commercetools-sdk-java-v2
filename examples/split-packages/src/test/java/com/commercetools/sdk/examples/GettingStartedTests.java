package com.commercetools.sdk.examples;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.models.project.Project;
import com.commercetools.api.models.common.LocalizedString;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

public class GettingStartedTests {

    @Test
    public void project() {
        ProjectApiRoot apiRoot = ApiRootBuilder.of().defaultClient(
                ClientCredentials.of().withClientId(System.getenv("CTP_CLIENT_ID"))
                        .withClientSecret(System.getenv("CTP_CLIENT_SECRET"))
                        .build(),
                ServiceRegion.valueOf(Optional.ofNullable(System.getenv("CTP_SERVICE_REGION")).orElse("GCP_EUROPE_WEST1"))).build(System.getenv("CTP_PROJECT_KEY"));

        Project response = apiRoot
                .get()
                .executeBlocking().getBody();

        Assertions.assertEquals(System.getenv("CTP_PROJECT_KEY"), response.getKey());
    }

    @Test
    public void category() {
        ProjectApiRoot apiRoot = ApiRootBuilder.of().defaultClient(
                ClientCredentials.of().withClientId(System.getenv("CTP_CLIENT_ID"))
                        .withClientSecret(System.getenv("CTP_CLIENT_SECRET"))
                        .build(),
                ServiceRegion.valueOf(Optional.ofNullable(System.getenv("CTP_SERVICE_REGION")).orElse("GCP_EUROPE_WEST1")))
                .addNotFoundExceptionMiddleware()
                .build(System.getenv("CTP_PROJECT_KEY"));

        Category cat1 = apiRoot.categories().withKey("cat1").get().executeBlocking().getBody();
        if (cat1 == null) {
            cat1 = apiRoot.categories().create(b -> b
                    .key("cat1")
                    .name(LocalizedString.ofEnglish("cat1"))
                    .slug(LocalizedString.ofEnglish("cat1" + UUID.randomUUID().toString()))
            ).executeBlocking().getBody();
        }
        Category cat2 = apiRoot.categories().withKey("cat2").get().executeBlocking().getBody();
        if (cat2 == null) {
            Category finalCat1 = cat1;
            apiRoot.categories().create(b -> b
                    .key("cat2")
                    .name(LocalizedString.ofEnglish("cat2"))
                    .slug(LocalizedString.ofEnglish("cat2" + UUID.randomUUID().toString()))
                    .parent(finalCat1.toResourceIdentifier())
            ).executeBlocking();
        }

        CategoryPagedQueryResponse response = apiRoot
                .categories()
                .get()
                .addLimit(500)
                .withWhere("key = \"cat1\" or key = \"cat2\"")
                .executeBlocking().getBody();

        Assertions.assertNotNull(response);

        List<String> categories = response.getResults().stream().map(Category::getKey).collect(Collectors.toList());
        Assertions.assertTrue(categories.contains("cat1"));
        Assertions.assertTrue(categories.contains("cat2"));
    }
}
