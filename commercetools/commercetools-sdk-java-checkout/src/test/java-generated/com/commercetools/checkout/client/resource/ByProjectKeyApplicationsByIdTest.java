
package com.commercetools.checkout.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.checkout.client.ApiRoot;

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
public class ByProjectKeyApplicationsByIdTest {
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
                apiRoot.withProjectKey("test_projectKey").applications().withId("test_id").get().createHttpRequest(),
                "get", "test_projectKey/applications/test_id", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .applications()
                        .withId("test_id")
                        .head()
                        .createHttpRequest(), "head", "test_projectKey/applications/test_id", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .applications()
                        .withId("test_id")
                        .post(com.commercetools.checkout.models.application.ApplicationUpdateActions.of())
                        .createHttpRequest(), "post", "test_projectKey/applications/test_id", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .applications()
                        .withId("test_id")
                        .delete()
                        .withVersion(2)
                        .createHttpRequest(), "delete", "test_projectKey/applications/test_id?version=2", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .applications()
                        .withId("test_id")
                        .delete()
                        .createHttpRequest(), "delete", "test_projectKey/applications/test_id", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").applications().withId("test_id").get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").applications().withId("test_id").head(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .applications()
                        .withId("test_id")
                        .post(com.commercetools.checkout.models.application.ApplicationUpdateActions.of()), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .applications()
                        .withId("test_id")
                        .delete()
                        .withVersion(2), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").applications().withId("test_id").delete(), } };
    }
}
