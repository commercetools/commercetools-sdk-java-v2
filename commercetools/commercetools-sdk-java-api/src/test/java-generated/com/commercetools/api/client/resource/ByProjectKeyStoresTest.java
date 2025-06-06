
package com.commercetools.api.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ApiRoot;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.utils.Generated;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStoresTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final static ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @ParameterizedTest
    @MethodSource("requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assertions.assertThat(httpMethod).isEqualTo(request.getMethod().name().toLowerCase());
        Assertions.assertThat(uri).isEqualTo(request.getUri().toString());
    }

    @ParameterizedTest
    @MethodSource("executeMethodParameters")
    public void executeServerException(HttpRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @ParameterizedTest
    @MethodSource("executeMethodParameters")
    public void executeClientException(HttpRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    public static Object[][] requestWithMethodParameters() {
        return new Object[][] { new Object[] {
                apiRoot.withProjectKey("test_projectKey").stores().get().withExpand("expand").createHttpRequest(),
                "get", "test_projectKey/stores?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").stores().get().withSort("sort").createHttpRequest(),
                        "get", "test_projectKey/stores?sort=sort", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").stores().get().withLimit(7).createHttpRequest(),
                        "get", "test_projectKey/stores?limit=7", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").stores().get().withOffset(3).createHttpRequest(),
                        "get", "test_projectKey/stores?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .stores()
                        .get()
                        .withWithTotal(true)
                        .createHttpRequest(), "get", "test_projectKey/stores?withTotal=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").stores().get().withWhere("where").createHttpRequest(),
                        "get", "test_projectKey/stores?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .stores()
                        .get()
                        .withPredicateVar("varName", "var.varName")
                        .createHttpRequest(), "get", "test_projectKey/stores?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().get().createHttpRequest(), "get",
                        "test_projectKey/stores", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .stores()
                        .head()
                        .withWhere("where")
                        .createHttpRequest(), "head", "test_projectKey/stores?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().head().createHttpRequest(), "head",
                        "test_projectKey/stores", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .stores()
                        .post(com.commercetools.api.models.store.StoreDraft.of())
                        .withExpand("expand")
                        .createHttpRequest(), "post", "test_projectKey/stores?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .stores()
                        .post(com.commercetools.api.models.store.StoreDraft.of())
                        .createHttpRequest(), "post", "test_projectKey/stores", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().get().withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().get().withSort("sort"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().get().withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().get().withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().get().withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().get().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .stores()
                        .get()
                        .withPredicateVar("varName", "var.varName"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().head().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").stores().head(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .stores()
                        .post(com.commercetools.api.models.store.StoreDraft.of())
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .stores()
                        .post(com.commercetools.api.models.store.StoreDraft.of()), } };
    }
}
