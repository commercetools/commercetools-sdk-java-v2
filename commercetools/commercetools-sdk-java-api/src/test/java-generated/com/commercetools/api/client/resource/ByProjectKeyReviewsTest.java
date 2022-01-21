
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
public class ByProjectKeyReviewsTest {
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
        return new Object[][] { new Object[] {
                apiRoot.withProjectKey("test_projectKey").reviews().get().withExpand("expand").createHttpRequest(),
                "get", "/test_projectKey/reviews?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").reviews().get().withSort("sort").createHttpRequest(),
                        "get", "/test_projectKey/reviews?sort=sort", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").reviews().get().withLimit(7).createHttpRequest(),
                        "get", "/test_projectKey/reviews?limit=7", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").reviews().get().withOffset(3).createHttpRequest(),
                        "get", "/test_projectKey/reviews?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .reviews()
                        .get()
                        .withWithTotal(true)
                        .createHttpRequest(), "get", "/test_projectKey/reviews?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .reviews()
                        .get()
                        .withWhere("where")
                        .createHttpRequest(), "get", "/test_projectKey/reviews?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .reviews()
                        .get()
                        .withPredicateVar("varName", "var.varName")
                        .createHttpRequest(), "get", "/test_projectKey/reviews?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().get().createHttpRequest(), "get",
                        "/test_projectKey/reviews", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .reviews()
                        .post(null)
                        .withExpand("expand")
                        .createHttpRequest(), "post", "/test_projectKey/reviews?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().post(null).createHttpRequest(),
                        "post", "/test_projectKey/reviews", } };
    }

    @DataProvider
    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().get().withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().get().withSort("sort"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().get().withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().get().withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().get().withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().get().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .reviews()
                        .get()
                        .withPredicateVar("varName", "var.varName"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().post(null).withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").reviews().post(null), } };
    }
}
