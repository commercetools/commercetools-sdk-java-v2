
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
public class ByProjectKeyCartsTest {
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
                apiRoot.withProjectKey("test_projectKey").carts().get().withExpand("expand").createHttpRequest(), "get",
                "test_projectKey/carts?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").carts().get().withSort("sort").createHttpRequest(),
                        "get", "test_projectKey/carts?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withLimit(7).createHttpRequest(),
                        "get", "test_projectKey/carts?limit=7", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").carts().get().withOffset(3).createHttpRequest(),
                        "get", "test_projectKey/carts?offset=3", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").carts().get().withWithTotal(true).createHttpRequest(),
                        "get", "test_projectKey/carts?withTotal=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").carts().get().withWhere("where").createHttpRequest(),
                        "get", "test_projectKey/carts?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .carts()
                        .get()
                        .withPredicateVar("varName", "var.varName")
                        .createHttpRequest(), "get", "test_projectKey/carts?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().createHttpRequest(), "get",
                        "test_projectKey/carts", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").carts().head().withWhere("where").createHttpRequest(),
                        "head", "test_projectKey/carts?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().head().createHttpRequest(), "head",
                        "test_projectKey/carts", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .carts()
                        .post(com.commercetools.api.models.cart.CartDraft.of())
                        .withExpand("expand")
                        .createHttpRequest(), "post", "test_projectKey/carts?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .carts()
                        .post(com.commercetools.api.models.cart.CartDraft.of())
                        .createHttpRequest(), "post", "test_projectKey/carts", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withSort("sort"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .carts()
                        .get()
                        .withPredicateVar("varName", "var.varName"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().head().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().head(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .carts()
                        .post(com.commercetools.api.models.cart.CartDraft.of())
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .carts()
                        .post(com.commercetools.api.models.cart.CartDraft.of()), } };
    }
}
