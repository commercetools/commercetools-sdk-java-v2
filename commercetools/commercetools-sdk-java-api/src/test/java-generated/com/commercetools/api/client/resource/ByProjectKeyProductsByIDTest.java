
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
public class ByProjectKeyProductsByIDTest {
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
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "get", "/test_projectKey/products/test_ID?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "get", "/test_projectKey/products/test_ID?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get", "/test_projectKey/products/test_ID?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "get", "/test_projectKey/products/test_ID?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "get", "/test_projectKey/products/test_ID?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .get()
                                .withStoreProjection("storeProjection")
                                .createHttpRequest(),
                        "get", "/test_projectKey/products/test_ID?storeProjection=storeProjection", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "/test_projectKey/products/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .createHttpRequest(), "get", "/test_projectKey/products/test_ID", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .head()
                        .createHttpRequest(), "head", "/test_projectKey/products/test_ID", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "post", "/test_projectKey/products/test_ID?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "post", "/test_projectKey/products/test_ID?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "post", "/test_projectKey/products/test_ID?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "post", "/test_projectKey/products/test_ID?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "post", "/test_projectKey/products/test_ID?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .post(null)
                                .withStoreProjection("storeProjection")
                                .createHttpRequest(),
                        "post", "/test_projectKey/products/test_ID?storeProjection=storeProjection", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(null)
                        .withExpand("expand")
                        .createHttpRequest(), "post", "/test_projectKey/products/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(null)
                        .createHttpRequest(), "post", "/test_projectKey/products/test_ID", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "delete", "/test_projectKey/products/test_ID?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "delete", "/test_projectKey/products/test_ID?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "delete", "/test_projectKey/products/test_ID?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "delete", "/test_projectKey/products/test_ID?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "delete", "/test_projectKey/products/test_ID?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .products()
                                .withId("test_ID")
                                .delete()
                                .withStoreProjection("storeProjection")
                                .createHttpRequest(),
                        "delete", "/test_projectKey/products/test_ID?storeProjection=storeProjection", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withVersion(2)
                        .createHttpRequest(), "delete", "/test_projectKey/products/test_ID?version=2", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withExpand("expand")
                        .createHttpRequest(), "delete", "/test_projectKey/products/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .createHttpRequest(), "delete", "/test_projectKey/products/test_ID", } };
    }

    @DataProvider
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
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withLocaleProjection("localeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .get()
                        .withStoreProjection("storeProjection"), },
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
                        .post(null)
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(null)
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(null)
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(null)
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(null)
                        .withLocaleProjection("localeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(null)
                        .withStoreProjection("storeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .post(null)
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").products().withId("test_ID").post(null), },
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
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withLocaleProjection("localeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .products()
                        .withId("test_ID")
                        .delete()
                        .withStoreProjection("storeProjection"), },
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
