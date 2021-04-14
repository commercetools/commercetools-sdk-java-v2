
package com.commercetools.api.client.resource;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import com.commercetools.api.client.*;
import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpMethod;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.utils.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@RunWith(JUnitParamsRunner.class)
public class ByProjectKeyInventoryTest {
    private final ApiHttpClient apiHttpClientMock = Mockito.mock(ApiHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = createClient();

    private ApiRoot createClient() {
        return ApiFactory.create(
            ClientCredentials.of()
                    .withClientId("your-client-id")
                    .withClientSecret("your-client-secret")
                    .withScopes("your-scopes")
                    .build(),
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
    }

    @Test
    @Parameters(method = "requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().name().toLowerCase());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeWithNullPointerException(ApiHttpRequest httpRequest) throws Exception {
        Mockito.when(apiHttpClientMock.execute(httpRequest)).thenThrow(NullPointerException.class);
    }

    private Object[] requestWithMethodParameters() {
        return new Object[] { new Object[] {
                apiRoot.withProjectKey("test_projectKey").inventory().get().withExpand("expand").createHttpRequest(),
                "get", "/test_projectKey/inventory?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .get()
                        .withSort("sort")
                        .createHttpRequest(), "get", "/test_projectKey/inventory?sort=sort", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").inventory().get().withLimit(7).createHttpRequest(),
                        "get", "/test_projectKey/inventory?limit=7", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").inventory().get().withOffset(3).createHttpRequest(),
                        "get", "/test_projectKey/inventory?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .get()
                        .withWithTotal(true)
                        .createHttpRequest(), "get", "/test_projectKey/inventory?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .get()
                        .withWhere("where")
                        .createHttpRequest(), "get", "/test_projectKey/inventory?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .get()
                        .withPredicateVar("varName", "var.varName")
                        .createHttpRequest(), "get", "/test_projectKey/inventory?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").inventory().get().createHttpRequest(), "get",
                        "/test_projectKey/inventory", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .post(null)
                        .withExpand("expand")
                        .createHttpRequest(), "post", "/test_projectKey/inventory?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").inventory().post(null).createHttpRequest(),
                        "post", "/test_projectKey/inventory", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInventoryGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInventoryGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInventoryGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInventoryGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInventoryGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInventoryGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInventoryGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInventoryGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyInventoryPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyInventoryPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyInventoryPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyInventoryPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyInventoryPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyInventoryPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyInventoryPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyInventoryPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInventoryPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(),
                    null, null) } };
    }
}
