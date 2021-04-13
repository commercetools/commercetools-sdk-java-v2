
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
public class ByProjectKeyProductsByIDTest {
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
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceCurrency("priceCurrency"),
                        "get", "test_projectKey/products/test_ID?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceCountry("priceCountry"),
                        "get", "test_projectKey/products/test_ID?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup"),
                        "get", "test_projectKey/products/test_ID?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceChannel("priceChannel"),
                        "get", "test_projectKey/products/test_ID?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withLocaleProjection("localeProjection"),
                        "get", "test_projectKey/products/test_ID?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withStoreProjection("storeProjection"),
                        "get", "test_projectKey/products/test_ID?storeProjection=storeProjection", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withExpand("expand"), "get", "test_projectKey/products/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withId("test_ID").get(), "get",
                        "test_projectKey/products/test_ID", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withPriceCurrency("priceCurrency"),
                        "post", "test_projectKey/products/test_ID?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withPriceCountry("priceCountry"),
                        "post", "test_projectKey/products/test_ID?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withPriceCustomerGroup("priceCustomerGroup"),
                        "post", "test_projectKey/products/test_ID?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withPriceChannel("priceChannel"),
                        "post", "test_projectKey/products/test_ID?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withLocaleProjection("localeProjection"),
                        "post", "test_projectKey/products/test_ID?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withStoreProjection("storeProjection"),
                        "post", "test_projectKey/products/test_ID?storeProjection=storeProjection", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(null)
                        .withExpand("expand"), "post", "test_projectKey/products/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withId("test_ID").post(null),
                        "post", "test_projectKey/products/test_ID", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceCurrency("priceCurrency"),
                        "delete", "test_projectKey/products/test_ID?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceCountry("priceCountry"),
                        "delete", "test_projectKey/products/test_ID?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceCustomerGroup("priceCustomerGroup"),
                        "delete", "test_projectKey/products/test_ID?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceChannel("priceChannel"),
                        "delete", "test_projectKey/products/test_ID?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withLocaleProjection("localeProjection"),
                        "delete", "test_projectKey/products/test_ID?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withStoreProjection("storeProjection"),
                        "delete", "test_projectKey/products/test_ID?storeProjection=storeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().withId("test_ID").delete().withVersion(4L),
                        "delete", "test_projectKey/products/test_ID?version=4L", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withExpand("expand"), "delete", "test_projectKey/products/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withId("test_ID").delete(),
                        "delete", "test_projectKey/products/test_ID", } };
    }

    private Object[] resourcesParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withId("test_ID").images(),
                        "test_projectKey/products/test_ID/images", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyProductsByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyProductsByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyProductsByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyProductsByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyProductsByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyProductsByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyProductsByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyProductsByIDGet(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductsByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductsByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductsByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductsByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductsByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductsByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductsByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductsByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductsByIDPost(apiHttpClientMock, projectKey, null, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductsByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductsByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductsByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductsByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductsByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductsByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductsByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductsByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyProductsByIDDelete(apiHttpClientMock, projectKey, null).createHttpRequest()
                            .getUri(),
                    null, null) } };
    }
}
