
package com.commercetools.compat;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.models.project.Project;

import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.projects.queries.ProjectGet;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CompatClientTest {
    @Test
    public void compatClient() {
        CompatClient client = CompatClient.of(CommercetoolsTestUtils.getClient(),
            CommercetoolsTestUtils.getProjectKey());

        Project project = client.executeBlocking(ProjectGet.of(), Project.class).getBody();
        Assertions.assertThat(project).isInstanceOf(Project.class);
        Assertions.assertThat(project.getKey()).isEqualTo(CommercetoolsTestUtils.getProjectKey());
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
