
package com.commercetools.api.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import com.commercetools.api.client.ApiRoot;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.utils.Generated;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@RunWith(JUnitParamsRunner.class)
public class ByProjectKeyProductProjectionsSuggestTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @Test
    @Parameters(method = "requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().name().toLowerCase());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeServerException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    private Object[] requestWithMethodParameters() {
        return new Object[] {
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .suggest()
                                .get()
                                .withFuzzy(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/suggest?fuzzy=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .suggest()
                                .get()
                                .withStaged(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/suggest?staged=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .suggest()
                                .get()
                                .withSearchKeywords("locale", "searchKeywords.locale")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/product-projections/suggest?searchKeywords.locale=searchKeywords.locale", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .suggest()
                                .get()
                                .withSort("sort")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/suggest?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .suggest()
                        .get()
                        .withLimit(7)
                        .createHttpRequest(), "get", "/test_projectKey/product-projections/suggest?limit=7", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .suggest()
                        .get()
                        .withOffset(3)
                        .createHttpRequest(), "get", "/test_projectKey/product-projections/suggest?offset=3", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .suggest()
                                .get()
                                .withWithTotal(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/suggest?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .suggest()
                        .get()
                        .createHttpRequest(), "get", "/test_projectKey/product-projections/suggest", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] { new Object[] {
                apiRoot.withProjectKey("test_projectKey").productProjections().suggest().get().withFuzzy(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .suggest()
                        .get()
                        .withStaged(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .suggest()
                        .get()
                        .withSearchKeywords("locale", "searchKeywords.locale"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .suggest()
                        .get()
                        .withSort("sort"), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productProjections().suggest().get().withLimit(7), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productProjections().suggest().get().withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .suggest()
                        .get()
                        .withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().suggest().get(), } };
    }
}
