
package com.commercetools.history.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import com.commercetools.history.client.ApiRoot;

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
public class ByProjectKeyTest {
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
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .get()
                        .withResourceType(
                            com.commercetools.history.models.ChangeHistoryResourceType.findEnum("resourceType"))
                        .createHttpRequest(), "get", "/test_projectKey?resourceType=resourceType", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .get()
                        .withDateFrom("date.from")
                        .createHttpRequest(), "get", "/test_projectKey?date.from=date.from", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey").get().withDateTo("date.to").createHttpRequest(),
                        "get", "/test_projectKey?date.to=date.to", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withLimit(7).createHttpRequest(),
                        "get", "/test_projectKey?limit=7", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withOffset(3).createHttpRequest(),
                        "get", "/test_projectKey?offset=3", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey").get().withUserId("userId").createHttpRequest(),
                        "get", "/test_projectKey?userId=userId", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey").get().withType("type").createHttpRequest(),
                        "get", "/test_projectKey?type=type", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .get()
                        .withClientId("clientId")
                        .createHttpRequest(), "get", "/test_projectKey?clientId=clientId", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .get()
                        .withResourceId("resourceId")
                        .createHttpRequest(), "get", "/test_projectKey?resourceId=resourceId", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey").get().withSource("source").createHttpRequest(),
                        "get", "/test_projectKey?source=source", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey").get().withChanges("changes").createHttpRequest(),
                        "get", "/test_projectKey?changes=changes", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .get()
                        .withCustomerId("customerId")
                        .createHttpRequest(), "get", "/test_projectKey?customerId=customerId", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey").get().withExpand(true).createHttpRequest(),
                        "get", "/test_projectKey?expand=true", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().createHttpRequest(), "get",
                        "/test_projectKey", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .get()
                                .withResourceType(com.commercetools.history.models.ChangeHistoryResourceType
                                        .findEnum("resourceType")), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withDateFrom("date.from"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withDateTo("date.to"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withLimit(7), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withOffset(3), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withUserId("userId"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withType("type"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withClientId("clientId"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withResourceId("resourceId"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withSource("source"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withChanges("changes"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withCustomerId("customerId"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get().withExpand(true), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey").get(), } };
    }
}
