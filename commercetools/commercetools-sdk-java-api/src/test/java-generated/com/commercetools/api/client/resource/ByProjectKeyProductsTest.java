
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
public class ByProjectKeyProductsTest {
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
                apiRoot.withProjectKey("test_projectKey").products().get().withWhere("where").createHttpRequest(),
                "get", "test_projectKey/products?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceCurrency("priceCurrency")
                        .createHttpRequest(), "get", "test_projectKey/products?priceCurrency=priceCurrency", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceCountry("priceCountry")
                        .createHttpRequest(), "get", "test_projectKey/products?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get", "test_projectKey/products?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .get()
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/products?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceChannel("priceChannel")
                        .createHttpRequest(), "get", "test_projectKey/products?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .get()
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "get", "test_projectKey/products?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "test_projectKey/products?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().get().withSort("sort").createHttpRequest(),
                        "get", "test_projectKey/products?sort=sort", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().get().withLimit(7).createHttpRequest(),
                        "get", "test_projectKey/products?limit=7", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().get().withOffset(3).createHttpRequest(),
                        "get", "test_projectKey/products?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withWithTotal(true)
                        .createHttpRequest(), "get", "test_projectKey/products?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPredicateVar("varName", "var.varName")
                        .createHttpRequest(), "get", "test_projectKey/products?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().createHttpRequest(), "get",
                        "test_projectKey/products", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .head()
                        .withWhere("where")
                        .createHttpRequest(), "head", "test_projectKey/products?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().head().createHttpRequest(), "head",
                        "test_projectKey/products", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withPriceCurrency("priceCurrency")
                        .createHttpRequest(), "post", "test_projectKey/products?priceCurrency=priceCurrency", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withPriceCountry("priceCountry")
                        .createHttpRequest(), "post", "test_projectKey/products?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .post(com.commercetools.api.models.product.ProductDraft.of())
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "post", "test_projectKey/products?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .post(com.commercetools.api.models.product.ProductDraft.of())
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "post",
                        "test_projectKey/products?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withPriceChannel("priceChannel")
                        .createHttpRequest(), "post", "test_projectKey/products?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .post(com.commercetools.api.models.product.ProductDraft.of())
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "post", "test_projectKey/products?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withExpand("expand")
                        .createHttpRequest(), "post", "test_projectKey/products?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .createHttpRequest(), "post", "test_projectKey/products", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceCurrency("priceCurrency"), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().get().withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().get().withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withSort("sort"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPredicateVar("varName", "var.varName"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().head().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().head(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of())
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(com.commercetools.api.models.product.ProductDraft.of()), } };
    }
}
