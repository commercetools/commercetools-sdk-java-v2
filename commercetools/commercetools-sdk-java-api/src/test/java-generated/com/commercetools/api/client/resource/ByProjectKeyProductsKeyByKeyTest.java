
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
public class ByProjectKeyProductsKeyByKeyTest {
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
                                .withKey("test_key")
                                .get()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "get", "test_projectKey/products/key=test_key?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .get()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "get", "test_projectKey/products/key=test_key?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get", "test_projectKey/products/key=test_key?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .get()
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/products/key=test_key?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .get()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "get", "test_projectKey/products/key=test_key?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .get()
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "get", "test_projectKey/products/key=test_key?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "test_projectKey/products/key=test_key?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .get()
                        .createHttpRequest(), "get", "test_projectKey/products/key=test_key", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .head()
                        .createHttpRequest(), "head", "test_projectKey/products/key=test_key", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "post", "test_projectKey/products/key=test_key?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "post", "test_projectKey/products/key=test_key?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "post", "test_projectKey/products/key=test_key?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "post",
                        "test_projectKey/products/key=test_key?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "post", "test_projectKey/products/key=test_key?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .post(com.commercetools.api.models.product.ProductUpdate.of())
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "post", "test_projectKey/products/key=test_key?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withExpand("expand")
                        .createHttpRequest(), "post", "test_projectKey/products/key=test_key?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .createHttpRequest(), "post", "test_projectKey/products/key=test_key", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .delete()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "delete", "test_projectKey/products/key=test_key?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .delete()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "delete", "test_projectKey/products/key=test_key?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .delete()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "delete", "test_projectKey/products/key=test_key?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .delete()
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "delete",
                        "test_projectKey/products/key=test_key?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .delete()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "delete", "test_projectKey/products/key=test_key?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .delete()
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "delete",
                        "test_projectKey/products/key=test_key?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .delete()
                        .withVersion(2)
                        .createHttpRequest(), "delete", "test_projectKey/products/key=test_key?version=2", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withKey("test_key")
                                .delete()
                                .withExpand("expand")
                                .createHttpRequest(),
                        "delete", "test_projectKey/products/key=test_key?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .delete()
                        .createHttpRequest(), "delete", "test_projectKey/products/key=test_key", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .get()
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .get()
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .get()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .get()
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .get()
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .get()
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .get()
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withKey("test_key").get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withKey("test_key").head(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .post(com.commercetools.api.models.product.ProductUpdate.of())
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .post(com.commercetools.api.models.product.ProductUpdate.of()), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .delete()
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .delete()
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .delete()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .delete()
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .delete()
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .delete()
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .delete()
                        .withVersion(2), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withKey("test_key")
                        .delete()
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withKey("test_key").delete(), } };
    }
}
