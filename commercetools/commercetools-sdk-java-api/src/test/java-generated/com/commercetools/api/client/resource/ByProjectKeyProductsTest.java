
package com.commercetools.api.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ApiRoot;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.utils.Generated;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ByProjectKeyProductsTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final static ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @TestTemplate
    @UseDataProvider("requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assertions.assertThat(httpMethod).isEqualTo(request.getMethod().name().toLowerCase());
        Assertions.assertThat(uri).isEqualTo(request.getUri().toString());
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeServerException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    @DataProvider
    public static Object[][] requestWithMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceCurrency("priceCurrency")
                        .createHttpRequest(), "get", "/test_projectKey/products?priceCurrency=priceCurrency", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceCountry("priceCountry")
                        .createHttpRequest(), "get", "/test_projectKey/products?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get", "/test_projectKey/products?priceCustomerGroup=priceCustomerGroup", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceChannel("priceChannel")
                        .createHttpRequest(), "get", "/test_projectKey/products?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .get()
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "get", "/test_projectKey/products?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .get()
                                .withStoreProjection("storeProjection")
                                .createHttpRequest(),
                        "get", "/test_projectKey/products?storeProjection=storeProjection", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "/test_projectKey/products?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().get().withSort("sort").createHttpRequest(),
                        "get", "/test_projectKey/products?sort=sort", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().get().withLimit(7).createHttpRequest(),
                        "get", "/test_projectKey/products?limit=7", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().get().withOffset(3).createHttpRequest(),
                        "get", "/test_projectKey/products?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withWithTotal(true)
                        .createHttpRequest(), "get", "/test_projectKey/products?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withWhere("where")
                        .createHttpRequest(), "get", "/test_projectKey/products?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPredicateVar("varName", "var.varName")
                        .createHttpRequest(), "get", "/test_projectKey/products?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().createHttpRequest(), "get",
                        "/test_projectKey/products", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().head().createHttpRequest(), "head",
                        "/test_projectKey/products", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .post(null)
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "post", "/test_projectKey/products?priceCurrency=priceCurrency", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(null)
                        .withPriceCountry("priceCountry")
                        .createHttpRequest(), "post", "/test_projectKey/products?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .post(null)
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "post", "/test_projectKey/products?priceCustomerGroup=priceCustomerGroup", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(null)
                        .withPriceChannel("priceChannel")
                        .createHttpRequest(), "post", "/test_projectKey/products?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .post(null)
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "post", "/test_projectKey/products?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .post(null)
                                .withStoreProjection("storeProjection")
                                .createHttpRequest(),
                        "post", "/test_projectKey/products?storeProjection=storeProjection", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(null)
                        .withExpand("expand")
                        .createHttpRequest(), "post", "/test_projectKey/products?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().post(null).createHttpRequest(),
                        "post", "/test_projectKey/products", } };
    }

    @DataProvider
    public static Object[][] executeMethodParameters() {
        return new Object[][] { new Object[] {
                apiRoot.withProjectKey("test_projectKey").products().get().withPriceCurrency("priceCurrency"), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().get().withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").products().get().withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withLocaleProjection("localeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withStoreProjection("storeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withSort("sort"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .get()
                        .withPredicateVar("varName", "var.varName"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().head(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(null)
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(null)
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(null)
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(null)
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(null)
                        .withLocaleProjection("localeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .post(null)
                        .withStoreProjection("storeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().post(null).withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().post(null), } };
    }
}
