
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
public class ByProjectKeyProductProjectionsTest {
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
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withStaged(true)
                        .createHttpRequest(), "get", "test_projectKey/product-projections?staged=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .get()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .get()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .get()
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/product-projections?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .get()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .get()
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .get()
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .get()
                                .withStoreProjection("storeProjection")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections?storeProjection=storeProjection", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "test_projectKey/product-projections?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withSort("sort")
                        .createHttpRequest(), "get", "test_projectKey/product-projections?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withLimit(7)
                        .createHttpRequest(), "get", "test_projectKey/product-projections?limit=7", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withOffset(3)
                        .createHttpRequest(), "get", "test_projectKey/product-projections?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withWithTotal(true)
                        .createHttpRequest(), "get", "test_projectKey/product-projections?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withWhere("where")
                        .createHttpRequest(), "get", "test_projectKey/product-projections?where=where", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .get()
                                .withPredicateVar("varName", "var.varName")
                                .createHttpRequest(),
                        "get", "test_projectKey/product-projections?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().get().createHttpRequest(),
                        "get", "test_projectKey/product-projections", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .head()
                        .withWhere("where")
                        .createHttpRequest(), "head", "test_projectKey/product-projections?where=where", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productProjections().head().createHttpRequest(),
                        "head", "test_projectKey/product-projections", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().get().withStaged(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withLocaleProjection("localeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withStoreProjection("storeProjection"), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productProjections().get().withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().get().withSort("sort"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().get().withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().get().withOffset(3), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productProjections().get().withWithTotal(true), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productProjections().get().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .get()
                        .withPredicateVar("varName", "var.varName"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().get(), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productProjections().head().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").productProjections().head(), } };
    }
}
