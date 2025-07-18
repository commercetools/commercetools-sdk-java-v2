
package com.commercetools.api.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ApiRoot;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.utils.Generated;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductProjectionsSearchTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final static ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @ParameterizedTest
    @MethodSource("requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assertions.assertThat(httpMethod).isEqualTo(request.getMethod().name().toLowerCase());
        Assertions.assertThat(uri).isEqualTo(request.getUri().toString());
    }

    @ParameterizedTest
    @MethodSource("executeMethodParameters")
    public void executeServerException(HttpRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @ParameterizedTest
    @MethodSource("executeMethodParameters")
    public void executeClientException(HttpRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    public static Object[][] requestWithMethodParameters() {
        return new Object[][] { new Object[] {
                apiRoot.withProjectKey("test_projectKey").productProjections().search().post(null).createHttpRequest(),
                "post", "test_projectKey/product-projections/search", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withMarkMatchingVariants(true)
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?markMatchingVariants=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withText("locale", "text.locale")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?text.locale=text.locale", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFuzzy(true)
                        .createHttpRequest(), "get", "test_projectKey/product-projections/search?fuzzy=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFuzzyLevel(9)
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?fuzzyLevel=9", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFilterQuery("filter.query")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?filter.query=filter.query", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFilter("filter")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?filter=filter", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFacet("facet")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?facet=facet", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withFilterFacets("filter.facets")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?filter.facets=filter.facets", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withExpand("expand")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withSort("sort")
                        .createHttpRequest(), "get", "test_projectKey/product-projections/search?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withLimit(7)
                        .createHttpRequest(), "get", "test_projectKey/product-projections/search?limit=7", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withOffset(3)
                        .createHttpRequest(), "get", "test_projectKey/product-projections/search?offset=3", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withStaged(true)
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?staged=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/product-projections/search?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/product-projections/search?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .search()
                                .get()
                                .withStoreProjection("storeProjection")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections/search?storeProjection=storeProjection", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .createHttpRequest(), "get", "test_projectKey/product-projections/search", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().search().post(null), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withMarkMatchingVariants(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withText("locale", "text.locale"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFuzzy(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFuzzyLevel(9), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFilterQuery("filter.query"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFilter("filter"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFacet("facet"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withFilterFacets("filter.facets"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withExpand("expand"), },
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
                        .withStaged(true), },
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
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .search()
                        .get()
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
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
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().search().get(), } };
    }
}
