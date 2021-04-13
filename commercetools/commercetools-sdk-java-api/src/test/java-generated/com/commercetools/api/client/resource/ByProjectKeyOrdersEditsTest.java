
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
public class ByProjectKeyOrdersEditsTest {
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
                new Object[] { apiRoot.withProjectKey("test_projectKey").orders().edits().get().withExpand("expand"),
                        "get", "test_projectKey/orders/edits?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").orders().edits().get().withSort("sort"), "get",
                        "test_projectKey/orders/edits?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").orders().edits().get().withLimit(4), "get",
                        "test_projectKey/orders/edits?limit=4", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").orders().edits().get().withOffset(6), "get",
                        "test_projectKey/orders/edits?offset=6", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").orders().edits().get().withWithTotal(true),
                        "get", "test_projectKey/orders/edits?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").orders().edits().get().withWhere("where"),
                        "get", "test_projectKey/orders/edits?where=where", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .orders()
                                .edits()
                                .get()
                                .withPredicateVar("varName", "var.varName"),
                        "get", "test_projectKey/orders/edits?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").orders().edits().get(), "get",
                        "test_projectKey/orders/edits", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").orders().edits().post(null).withExpand("expand"),
                        "post", "test_projectKey/orders/edits?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").orders().edits().post(null), "post",
                        "test_projectKey/orders/edits", } };
    }

    private Object[] resourcesParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").orders().edits().withKey("test_key"),
                        "test_projectKey/orders/edits/key=test_key", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").orders().edits().withId("test_ID"),
                        "test_projectKey/orders/edits/test_ID", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyOrdersEditsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyOrdersEditsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyOrdersEditsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyOrdersEditsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyOrdersEditsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyOrdersEditsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyOrdersEditsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyOrdersEditsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyOrdersEditsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyOrdersEditsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyOrdersEditsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyOrdersEditsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyOrdersEditsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyOrdersEditsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyOrdersEditsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyOrdersEditsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyOrdersEditsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(),
                    null, null) } };
    }
}
