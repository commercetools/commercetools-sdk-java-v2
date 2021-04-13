
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
public class ByProjectKeyProductDiscountsKeyByKeyTest {
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
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productDiscounts()
                                .withKey("test_key")
                                .get()
                                .withExpand("expand"),
                        "get", "test_projectKey/product-discounts/key=test_key?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").productDiscounts().withKey("test_key").get(),
                        "get", "test_projectKey/product-discounts/key=test_key", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productDiscounts()
                                .withKey("test_key")
                                .post(null)
                                .withExpand("expand"),
                        "post", "test_projectKey/product-discounts/key=test_key?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productDiscounts().withKey("test_key").post(null),
                        "post", "test_projectKey/product-discounts/key=test_key", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productDiscounts()
                                .withKey("test_key")
                                .delete()
                                .withVersion(2L),
                        "delete", "test_projectKey/product-discounts/key=test_key?version=2L", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productDiscounts()
                                .withKey("test_key")
                                .delete()
                                .withExpand("expand"),
                        "delete", "test_projectKey/product-discounts/key=test_key?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productDiscounts().withKey("test_key").delete(),
                        "delete", "test_projectKey/product-discounts/key=test_key", } };
    }

    private Object[] resourcesParameters() {
        return new Object[] {};
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClientMock, projectKey, null, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClientMock, projectKey, null, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClientMock, projectKey, null, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClientMock, projectKey, null, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClientMock, projectKey, null, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClientMock, projectKey, null, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClientMock, projectKey, null, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClientMock, projectKey, null, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClientMock, projectKey, null, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) } };
    }
}
