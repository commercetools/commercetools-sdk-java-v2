
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
public class ByProjectKeyInventoryByIDTest {
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
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "/test_projectKey/inventory/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .get()
                        .createHttpRequest(), "get", "/test_projectKey/inventory/test_ID", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .post(null)
                        .withExpand("expand")
                        .createHttpRequest(), "post", "/test_projectKey/inventory/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .post(null)
                        .createHttpRequest(), "post", "/test_projectKey/inventory/test_ID", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .delete()
                        .withVersion(2)
                        .createHttpRequest(), "delete", "/test_projectKey/inventory/test_ID?version=2", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .delete()
                        .withExpand("expand")
                        .createHttpRequest(), "delete", "/test_projectKey/inventory/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .delete()
                        .createHttpRequest(), "delete", "/test_projectKey/inventory/test_ID", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyInventoryByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyInventoryByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyInventoryByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyInventoryByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyInventoryByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyInventoryByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyInventoryByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyInventoryByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInventoryByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInventoryByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInventoryByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInventoryByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInventoryByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInventoryByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInventoryByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInventoryByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInventoryByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInventoryByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInventoryByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInventoryByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInventoryByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInventoryByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInventoryByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInventoryByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInventoryByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInventoryByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) } };
    }
}
