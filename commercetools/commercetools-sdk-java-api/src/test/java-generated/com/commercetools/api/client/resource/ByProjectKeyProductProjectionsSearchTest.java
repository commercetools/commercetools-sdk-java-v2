
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
public class ByProjectKeyProductProjectionsSearchTest {
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
                apiRoot.withProjectKey("test_projectKey").productProjections().search().post(null).createHttpRequest(),
                "post", "/test_projectKey/product-projections/search", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFuzzy(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?fuzzy=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFuzzyLevel(0.40837085)
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?fuzzyLevel=0.40837085", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withMarkMatchingVariants(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?markMatchingVariants=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withStaged(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?staged=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFilter("filter")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?filter=filter", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFilterFacets("filter.facets")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?filter.facets=filter.facets", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFilterQuery("filter.query")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?filter.query=filter.query", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFacet("facet")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?facet=facet", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withText("locale", "text.locale")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?text.locale=text.locale", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withSort("sort")
                        .createHttpRequest(), "get", "/test_projectKey/product-projections/search?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withLimit(5)
                        .createHttpRequest(), "get", "/test_projectKey/product-projections/search?limit=5", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withOffset(3)
                        .createHttpRequest(), "get", "/test_projectKey/product-projections/search?offset=3", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withWithTotal(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?withTotal=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withStoreProjection("storeProjection")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?storeProjection=storeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withExpand("expand")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .createHttpRequest(), "get", "/test_projectKey/product-projections/search", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] { new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
            new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                    .getUri(),
            null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey, null)
                            .createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest()
                            .getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest()
                            .getUri(),
                    null, null) } };
    }
}
