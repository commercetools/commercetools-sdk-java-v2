
package com.commercetools.compat;

import java.util.Collections;
import java.util.concurrent.ExecutionException;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;

import io.sphere.sdk.carts.Cart;
import io.sphere.sdk.carts.CartDraft;
import io.sphere.sdk.carts.commands.CartCreateCommand;
import io.sphere.sdk.carts.queries.CartByKeyGet;
import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.client.NotFoundException;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientConfig;
import io.sphere.sdk.models.DefaultCurrencyUnits;
import io.sphere.sdk.projects.Project;
import io.sphere.sdk.projects.queries.ProjectGet;
import io.sphere.sdk.queries.PagedQueryResult;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpMethod;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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

    @Test
    public void sphereCompatClientCart() throws ExecutionException, InterruptedException {
        SphereClientConfig clientConfig = SphereClientConfig.of(CommercetoolsTestUtils.getProjectKey(),
            CommercetoolsTestUtils.getClientId(), CommercetoolsTestUtils.getClientSecret());
        SphereClient client = CompatSphereClient.of(clientConfig);

        Cart result = client.execute(CartCreateCommand.of(CartDraft.of(DefaultCurrencyUnits.EUR)))
                .toCompletableFuture()
                .get();

        Assertions.assertThat(result).isInstanceOf(Cart.class);
        Assertions.assertThat(result.getTotalPrice().getNumber().intValueExact()).isEqualTo(0);
    }

    @Test
    public void compatApiHttpClient() throws ExecutionException, InterruptedException {
        final String projectKey = CommercetoolsTestUtils.getProjectKey();
        final ApiHttpClient apiHttpClient = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build())
                .buildClient();

        SphereClient client = CompatSphereClient.of(apiHttpClient, projectKey);

        Project v1Project = client.execute(ProjectGet.of()).toCompletableFuture().get();

        Assertions.assertThat(v1Project).isInstanceOf(Project.class);
        Assertions.assertThat(v1Project.getKey()).isEqualTo(projectKey);

        final ProjectApiRoot apiRoot = ProjectApiRoot.fromClient(projectKey, apiHttpClient);
        com.commercetools.api.models.project.Project v2Project = apiRoot.get().executeBlocking().getBody();

        Assertions.assertThat(v2Project).isInstanceOf(com.commercetools.api.models.project.Project.class);
        Assertions.assertThat(v2Project.getKey()).isEqualTo(projectKey);
    }

    @Test
    public void compatApiRoot() throws ExecutionException, InterruptedException {
        final String projectKey = CommercetoolsTestUtils.getProjectKey();
        final ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build())
                .build(projectKey);

        SphereClient client = CompatSphereClient.of(apiRoot);

        Project v1Project = client.execute(ProjectGet.of()).toCompletableFuture().get();

        Assertions.assertThat(v1Project).isInstanceOf(Project.class);
        Assertions.assertThat(v1Project.getKey()).isEqualTo(projectKey);

        com.commercetools.api.models.project.Project v2Project = apiRoot.get().executeBlocking().getBody();

        Assertions.assertThat(v2Project).isInstanceOf(com.commercetools.api.models.project.Project.class);
        Assertions.assertThat(v2Project.getKey()).isEqualTo(projectKey);
    }

    @Test
    public void compatApiHttpClientExceptions() {
        final String projectKey = CommercetoolsTestUtils.getProjectKey();
        final ApiHttpClient apiHttpClient = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build())
                .buildClient();

        SphereClient client = CompatSphereClient.of(apiHttpClient, projectKey);

        Assertions.assertThatThrownBy(() -> {
            client.execute(CartByKeyGet.of("non-existant")).toCompletableFuture().get();
        }).hasCauseInstanceOf(NotFoundException.class);
    }

    @Test
    public void compatApiHttpClientNull() throws ExecutionException, InterruptedException {
        final String projectKey = CommercetoolsTestUtils.getProjectKey();
        final ApiHttpClient apiHttpClient = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build())
                .addNotFoundExceptionMiddleware(Collections.singleton(ApiHttpMethod.GET))
                .buildClient();

        SphereClient client = CompatSphereClient.of(apiHttpClient, projectKey);

        Assertions.assertThat(client.execute(CartByKeyGet.of("non-existant")).toCompletableFuture().get()).isNull();
    }

    @Test
    public void compatApiHttpClientExceptionsV2() {
        final String projectKey = CommercetoolsTestUtils.getProjectKey();
        final ApiHttpClient apiHttpClient = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build())
                .buildClient();

        SphereClient client = CompatSphereClient.of(apiHttpClient, projectKey, CompatSphereClient.ExceptionMode.SDK_V2);

        Assertions.assertThatThrownBy(() -> {
            client.execute(CartByKeyGet.of("non-existant")).toCompletableFuture().get();
        }).hasCauseInstanceOf(io.vrap.rmf.base.client.error.NotFoundException.class);
    }
}
