
package com.commercetools.ml.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import com.commercetools.ml.client.ApiRoot;

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
public class ByProjectKeyRecommendationsProjectCategoriesByProductIdTest {
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
                                .recommendations()
                                .projectCategories()
                                .withProductId("test_productId")
                                .get()
                                .withLimit(7)
                                .createHttpRequest(),
                        "get", "/test_projectKey/recommendations/project-categories/test_productId?limit=7", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .recommendations()
                                .projectCategories()
                                .withProductId("test_productId")
                                .get()
                                .withOffset(3)
                                .createHttpRequest(),
                        "get", "/test_projectKey/recommendations/project-categories/test_productId?offset=3", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .recommendations()
                                .projectCategories()
                                .withProductId("test_productId")
                                .get()
                                .withStaged(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/recommendations/project-categories/test_productId?staged=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .recommendations()
                                .projectCategories()
                                .withProductId("test_productId")
                                .get()
                                .withConfidenceMin(0.7340351)
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/recommendations/project-categories/test_productId?confidenceMin=0.7340351", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .recommendations()
                                .projectCategories()
                                .withProductId("test_productId")
                                .get()
                                .withConfidenceMax(0.30089796)
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/recommendations/project-categories/test_productId?confidenceMax=0.30089796", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .recommendations()
                                .projectCategories()
                                .withProductId("test_productId")
                                .get()
                                .createHttpRequest(),
                        "get", "/test_projectKey/recommendations/project-categories/test_productId", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recommendations()
                        .projectCategories()
                        .withProductId("test_productId")
                        .get()
                        .withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recommendations()
                        .projectCategories()
                        .withProductId("test_productId")
                        .get()
                        .withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recommendations()
                        .projectCategories()
                        .withProductId("test_productId")
                        .get()
                        .withStaged(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recommendations()
                        .projectCategories()
                        .withProductId("test_productId")
                        .get()
                        .withConfidenceMin(0.7340351), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recommendations()
                        .projectCategories()
                        .withProductId("test_productId")
                        .get()
                        .withConfidenceMax(0.30089796), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recommendations()
                        .projectCategories()
                        .withProductId("test_productId")
                        .get(), } };
    }
}
