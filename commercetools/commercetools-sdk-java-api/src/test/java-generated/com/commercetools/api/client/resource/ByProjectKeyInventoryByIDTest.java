
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
public class ByProjectKeyInventoryByIDTest {
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

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    private Object[] requestWithMethodParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "/test_projectKey/inventory/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .get()
                        .createHttpRequest(), "get", "/test_projectKey/inventory/test_ID", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .post(null)
                        .withExpand("expand")
                        .createHttpRequest(), "post", "/test_projectKey/inventory/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .post(null)
                        .createHttpRequest(), "post", "/test_projectKey/inventory/test_ID", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .delete()
                        .withVersion(2)
                        .createHttpRequest(), "delete", "/test_projectKey/inventory/test_ID?version=2", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .delete()
                        .withExpand("expand")
                        .createHttpRequest(), "delete", "/test_projectKey/inventory/test_ID?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .delete()
                        .createHttpRequest(), "delete", "/test_projectKey/inventory/test_ID", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] { new Object[] {
                apiRoot.withProjectKey("test_projectKey").inventory().withId("test_ID").get().withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").inventory().withId("test_ID").get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .post(null)
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").inventory().withId("test_ID").post(null), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .delete()
                        .withVersion(2), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inventory()
                        .withId("test_ID")
                        .delete()
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").inventory().withId("test_ID").delete(), } };
    }
}
