
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
public class ByProjectKeyProductsByIDTest {
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
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "get", "test_projectKey/products/test_ID?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "get", "test_projectKey/products/test_ID?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get", "test_projectKey/products/test_ID?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/products/test_ID?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "get", "test_projectKey/products/test_ID?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "get", "test_projectKey/products/test_ID?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "test_projectKey/products/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .createHttpRequest(), "get", "test_projectKey/products/test_ID", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .head()
                        .createHttpRequest(), "head", "test_projectKey/products/test_ID", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "post", "test_projectKey/products/test_ID?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "post", "test_projectKey/products/test_ID?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "post", "test_projectKey/products/test_ID?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "post",
                        "test_projectKey/products/test_ID?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "post", "test_projectKey/products/test_ID?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "post", "test_projectKey/products/test_ID?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withExpand("expand")
                        .createHttpRequest(), "post", "test_projectKey/products/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .createHttpRequest(), "post", "test_projectKey/products/test_ID", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "delete", "test_projectKey/products/test_ID?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "delete", "test_projectKey/products/test_ID?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "delete", "test_projectKey/products/test_ID?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "delete",
                        "test_projectKey/products/test_ID?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "delete", "test_projectKey/products/test_ID?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "delete", "test_projectKey/products/test_ID?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withVersion(2)
                        .createHttpRequest(), "delete", "test_projectKey/products/test_ID?version=2", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withExpand("expand")
                        .createHttpRequest(), "delete", "test_projectKey/products/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .createHttpRequest(), "delete", "test_projectKey/products/test_ID", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withId("test_ID").get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withId("test_ID").head(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(com.commercetools.api.models.product.ProductUpdate.of()), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withVersion(2), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withId("test_ID").delete(), } };
    }
}
