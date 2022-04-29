
package com.commercetools.history.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.history.client.ApiRoot;
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
public class ByProjectKeyByResourceTypeTest {
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
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .withResourceTypeValue("test_resourceType")
                                .get()
                                .withDateFrom("date.from")
                                .createHttpRequest(),
                        "get", "/test_projectKey/test_resourceType?date.from=date.from", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withDateTo("date.to")
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType?date.to=date.to", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withLimit(7)
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType?limit=7", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withOffset(3)
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType?offset=3", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withUserId("userId")
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType?userId=userId", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withType("type")
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType?type=type", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withClientId("clientId")
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType?clientId=clientId", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .withResourceTypeValue("test_resourceType")
                                .get()
                                .withResourceId("resourceId")
                                .createHttpRequest(),
                        "get", "/test_projectKey/test_resourceType?resourceId=resourceId", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withSource("source")
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType?source=source", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withChanges("changes")
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType?changes=changes", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withStores("stores")
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType?stores=stores", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .withResourceTypeValue("test_resourceType")
                                .get()
                                .withCustomerId("customerId")
                                .createHttpRequest(),
                        "get", "/test_projectKey/test_resourceType?customerId=customerId", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .withResourceTypeValue("test_resourceType")
                                .get()
                                .withExcludePlatformInitiatedChanges(
                                    com.commercetools.history.models.change_history.PlatformInitiatedChange
                                            .findEnum("excludePlatformInitiatedChanges"))
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/test_resourceType?excludePlatformInitiatedChanges=excludePlatformInitiatedChanges", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withExpand(true)
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType?expand=true", },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .createHttpRequest(), "get", "/test_projectKey/test_resourceType", } };
    }

    @DataProvider
    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withDateFrom("date.from"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withDateTo("date.to"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withLimit(7), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withOffset(3), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withUserId("userId"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withType("type"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withClientId("clientId"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withResourceId("resourceId"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withSource("source"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withChanges("changes"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withStores("stores"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withCustomerId("customerId"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withExcludePlatformInitiatedChanges(
                            com.commercetools.history.models.change_history.PlatformInitiatedChange
                                    .findEnum("excludePlatformInitiatedChanges")), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get()
                        .withExpand(true), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .withResourceTypeValue("test_resourceType")
                        .get(), } };
    }
}
