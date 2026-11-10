
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
public class ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDTest {
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
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .withStaged(true)
                                .createHttpRequest(),
                        "get", "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID?staged=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID?priceCustomerGroupAssignments=priceCustomerGroupAssignments", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .withPriceRecurrencePolicy("priceRecurrencePolicy")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID?priceRecurrencePolicy=priceRecurrencePolicy", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .withFilterAttributes("filter[attributes]")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID?filter[attributes]=filter%5Battributes%5D", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .withExpand("expand")
                                .createHttpRequest(),
                        "get",
                        "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .get()
                                .createHttpRequest(),
                        "get", "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .withId("test_ID")
                                .head()
                                .createHttpRequest(),
                        "head", "test_projectKey/in-store/key=test_storeKey/product-projections/test_ID", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get()
                        .withStaged(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get()
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get()
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get()
                        .withPriceCustomerGroupAssignments("priceCustomerGroupAssignments"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get()
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get()
                        .withPriceRecurrencePolicy("priceRecurrencePolicy"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get()
                        .withLocaleProjection("localeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get()
                        .withFilterAttributes("filter[attributes]"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get()
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .withId("test_ID")
                        .head(), } };
    }
}
