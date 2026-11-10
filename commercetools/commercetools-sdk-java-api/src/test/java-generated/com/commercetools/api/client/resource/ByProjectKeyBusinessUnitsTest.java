
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
public class ByProjectKeyBusinessUnitsTest {
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
                        .businessUnits()
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "test_projectKey/business-units?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .get()
                        .withSort("sort")
                        .createHttpRequest(), "get", "test_projectKey/business-units?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .get()
                        .withLimit(7)
                        .createHttpRequest(), "get", "test_projectKey/business-units?limit=7", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .get()
                        .withOffset(3)
                        .createHttpRequest(), "get", "test_projectKey/business-units?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .get()
                        .withWithTotal(true)
                        .createHttpRequest(), "get", "test_projectKey/business-units?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .get()
                        .withWhere("where")
                        .createHttpRequest(), "get", "test_projectKey/business-units?where=where", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .businessUnits()
                                .get()
                                .withPredicateVar("varName", "var.varName")
                                .createHttpRequest(),
                        "get", "test_projectKey/business-units?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().get().createHttpRequest(),
                        "get", "test_projectKey/business-units", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .head()
                        .withWhere("where")
                        .createHttpRequest(), "head", "test_projectKey/business-units?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().head().createHttpRequest(),
                        "head", "test_projectKey/business-units", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .post(com.commercetools.api.models.business_unit.CompanyDraft.of())
                        .withExpand("expand")
                        .createHttpRequest(), "post", "test_projectKey/business-units?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .post(com.commercetools.api.models.business_unit.CompanyDraft.of())
                        .createHttpRequest(), "post", "test_projectKey/business-units", } };
    }

    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().get().withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().get().withSort("sort"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().get().withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().get().withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().get().withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().get().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .get()
                        .withPredicateVar("varName", "var.varName"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().get(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().head().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").businessUnits().head(), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .post(com.commercetools.api.models.business_unit.CompanyDraft.of())
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .businessUnits()
                        .post(com.commercetools.api.models.business_unit.CompanyDraft.of()), } };
    }
}
