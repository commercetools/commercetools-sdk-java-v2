
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
public class ByProjectKeyCartsTest {
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
        Assert.assertEquals(httpMethod, request.getMethod().toString());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "resourcesParameters")
    public void resources(ApiHttpRequest request, String uri) {
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeWithNullPointerException(ApiHttpRequest httpRequest) throws Exception {
        Mockito.when(apiHttpClientMock.execute(httpRequest)).thenThrow(NullPointerException.class);
    }

    private Object[] requestWithMethodParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withCustomerId("customerId"),
                        "get", "test_projectKey/carts?customerId=customerId", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withExpand("expand"), "get",
                        "test_projectKey/carts?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withSort("sort"), "get",
                        "test_projectKey/carts?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withLimit(8), "get",
                        "test_projectKey/carts?limit=8", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withOffset(1), "get",
                        "test_projectKey/carts?offset=1", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withWithTotal(true), "get",
                        "test_projectKey/carts?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get().withWhere("where"), "get",
                        "test_projectKey/carts?where=where", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .carts()
                                .get()
                                .withPredicateVar("varName", "var.varName"),
                        "get", "test_projectKey/carts?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().get(), "get",
                        "test_projectKey/carts", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().post(null).withExpand("expand"),
                        "post", "test_projectKey/carts?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().post(null), "post",
                        "test_projectKey/carts", } };
    }

    private Object[] resourcesParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().replicate(),
                        "test_projectKey/carts/replicate", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().withCustomerId("test_customerId"),
                        "test_projectKey/carts/customer-id=test_customerId", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().withKey("test_key"),
                        "test_projectKey/carts/key=test_key", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").carts().withId("test_ID"),
                        "test_projectKey/carts/test_ID", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyCartsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyCartsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyCartsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyCartsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyCartsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyCartsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyCartsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyCartsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyCartsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyCartsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyCartsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyCartsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyCartsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyCartsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyCartsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyCartsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyCartsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) } };
    }
}
