
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
public class ByProjectKeyProductProjectionsSearchTest {
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
                                .withFuzzyLevel(0.110830665)
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/search?fuzzyLevel=0.110830665", },
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
                        .withLimit(7)
                        .createHttpRequest(), "get", "/test_projectKey/product-projections/search?limit=7", },
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
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().search().post(null), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFuzzy(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFuzzyLevel(0.110830665), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withMarkMatchingVariants(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withStaged(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFilter("filter"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFilterFacets("filter.facets"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFilterQuery("filter.query"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFacet("facet"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withText("locale", "text.locale"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withSort("sort"), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productProjections().search().get().withLimit(7), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productProjections().search().get().withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withLocaleProjection("localeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withStoreProjection("storeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().search().get(), } };
    }
}
