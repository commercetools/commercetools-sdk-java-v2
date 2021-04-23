
package com.commercetools.compat;

import java.util.concurrent.ExecutionException;

import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientConfig;
import io.sphere.sdk.projects.Project;
import io.sphere.sdk.projects.queries.ProjectGet;
import io.sphere.sdk.queries.PagedQueryResult;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CompatSphereClientTest {
    @Test
    public void sphereCompatClient() throws ExecutionException, InterruptedException {
        SphereClientConfig clientConfig = SphereClientConfig.of(CommercetoolsTestUtils.getProjectKey(),
            CommercetoolsTestUtils.getClientId(), CommercetoolsTestUtils.getClientSecret());
        SphereClient client = CompatSphereClient.of(clientConfig);

        Project project = client.execute(ProjectGet.of()).toCompletableFuture().get();

        Assertions.assertThat(project).isInstanceOf(Project.class);
    }

    @Test
    public void sphereCompatClientCategories() throws ExecutionException, InterruptedException {
        SphereClientConfig clientConfig = SphereClientConfig.of(CommercetoolsTestUtils.getProjectKey(),
            CommercetoolsTestUtils.getClientId(), CommercetoolsTestUtils.getClientSecret());
        SphereClient client = CompatSphereClient.of(clientConfig);

        PagedQueryResult<Category> result = client.execute(CategoryQuery.of()).toCompletableFuture().get();

        Assertions.assertThat(result).isInstanceOf(PagedQueryResult.class);
    }
}
