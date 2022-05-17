
package com.commercetools.compat;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.commercetools.api.client.ByProjectKeyCustomersGet;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.project.Project;

import io.sphere.sdk.client.SphereClientConfig;
import io.sphere.sdk.projects.queries.ProjectGet;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.HttpStatusCode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CompatibilityTest {
    @Test
    public void compatClientExecute() throws ExecutionException, InterruptedException {
        String projectJson = "{\"key\" : \"foo\"}";
        VrapHttpClient httpClient = Mockito.mock(VrapHttpClient.class);
        Mockito.when(httpClient.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(HttpStatusCode.OK_200, null, projectJson.getBytes(StandardCharsets.UTF_8))));
        ApiHttpClient client = ClientBuilder.of(httpClient).defaultClient("https://api.commercetools.com").build();

        CompatClient compatClient = CompatClient.of(client, "test");
        Project project = compatClient.execute(ProjectGet.of(), Project.class).get().getBody();
        Assertions.assertThat(project).isInstanceOf(Project.class);
        Assertions.assertThat(project.getKey()).isEqualTo("foo");
    }

    @Test
    public void compatRequest() {
        String projectJson = "{\"key\" : \"foo\"}";
        VrapHttpClient httpClient = Mockito.mock(VrapHttpClient.class);
        Mockito.when(httpClient.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(HttpStatusCode.OK_200, null, projectJson.getBytes(StandardCharsets.UTF_8))));

        ApiHttpClient client = ClientBuilder.of(httpClient).defaultClient("https://api.commercetools.com").build();

        CompatRequest<Project> request = CompatRequest.of(client, "test", ProjectGet.of(), Project.class);
        Project project = request.executeBlocking().getBody();

        Assertions.assertThat(project).isInstanceOf(Project.class);
        Assertions.assertThat(project.getKey()).isEqualTo("foo");
    }

    @Test
    public void compatFactory() {
        SphereClientConfig clientConfig = SphereClientConfig.of("abc", "123", "456");

        ApiHttpClient client = CompatClientFactory.of(clientConfig);
        Assertions.assertThat(client).isInstanceOf(ApiHttpClient.class);
    }

    @Test
    public void queryPredicate() {
        ProjectApiRoot root = ProjectApiRoot.of("test");

        ByProjectKeyCustomersGet request = Query.customer(root, customerQuery -> customerQuery.withLimit(1));

        String query = request.createHttpRequest().getUri().getQuery();
        Assertions.assertThat(query).isEqualTo("limit=1");

        ByProjectKeyCustomersGet request2 = new Query(root).customer(customerQuery -> customerQuery.withLimit(1)));
        String query2 = request2.createHttpRequest().getUri().getQuery();
        Assertions.assertThat(query2).isEqualTo("limit=1");
    }
}
