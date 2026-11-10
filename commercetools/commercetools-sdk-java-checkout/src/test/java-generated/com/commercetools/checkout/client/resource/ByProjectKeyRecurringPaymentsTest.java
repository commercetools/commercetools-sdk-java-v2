
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
public class ByProjectKeyRecurringPaymentsTest {
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
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recurringPayments()
                        .get()
                        .withSort("sort")
                        .createHttpRequest(), "get", "test_projectKey/recurring-payments?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recurringPayments()
                        .get()
                        .withLimit(7)
                        .createHttpRequest(), "get", "test_projectKey/recurring-payments?limit=7", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recurringPayments()
                        .get()
                        .withOffset(3)
                        .createHttpRequest(), "get", "test_projectKey/recurring-payments?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recurringPayments()
                        .get()
                        .withWithTotal(true)
                        .createHttpRequest(), "get", "test_projectKey/recurring-payments?withTotal=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .recurringPayments()
                                .get()
                                .withRecurringOrderId("recurringOrderId")
                                .createHttpRequest(),
                        "get", "test_projectKey/recurring-payments?recurringOrderId=recurringOrderId", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").recurringPayments().get().createHttpRequest(),
                        "get", "test_projectKey/recurring-payments", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recurringPayments()
                        .post(com.commercetools.checkout.models.recurring_payment.RecurringPaymentDraft.of())
                        .createHttpRequest(), "post", "test_projectKey/recurring-payments", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").recurringPayments().get().withSort("sort"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").recurringPayments().get().withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").recurringPayments().get().withOffset(3), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").recurringPayments().get().withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recurringPayments()
                        .get()
                        .withRecurringOrderId("recurringOrderId"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").recurringPayments().get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .recurringPayments()
                        .post(com.commercetools.checkout.models.recurring_payment.RecurringPaymentDraft.of()), } };
    }
}
