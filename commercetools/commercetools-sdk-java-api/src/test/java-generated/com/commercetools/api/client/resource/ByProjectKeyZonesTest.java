
package com.commercetools.api.client.resource;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import com.commercetools.api.client.*;
import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpMethod;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.utils.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@RunWith(JUnitParamsRunner.class)
public class ByProjectKeyZonesTest {
    private final ApiHttpClient apiHttpClientMock = Mockito.mock(ApiHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = createClient();

    private ApiRoot createClient() {
        return ApiFactory.create(
            ClientCredentials.of()
                    .withClientId("your-client-id")
                    .withClientSecret("your-client-secret")
                    .withScopes("your-scopes")
                    .build(),
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
    }

    @Test
    @Parameters(method = "requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().name().toLowerCase());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeWithNullPointerException(ApiHttpRequest httpRequest) throws Exception {
        Mockito.when(apiHttpClientMock.execute(httpRequest)).thenThrow(NullPointerException.class);
    }

    private Object[] requestWithMethodParameters() {
        return new Object[] { new Object[] {
                apiRoot.withProjectKey("test_projectKey").zones().get().withExpand("expand").createHttpRequest(), "get",
                "/test_projectKey/zones?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").zones().get().withSort("sort").createHttpRequest(),
                        "get", "/test_projectKey/zones?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").zones().get().withLimit(7).createHttpRequest(),
                        "get", "/test_projectKey/zones?limit=7", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").zones().get().withOffset(3).createHttpRequest(),
                        "get", "/test_projectKey/zones?offset=3", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").zones().get().withWithTotal(true).createHttpRequest(),
                        "get", "/test_projectKey/zones?withTotal=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").zones().get().withWhere("where").createHttpRequest(),
                        "get", "/test_projectKey/zones?where=where", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .zones()
                        .get()
                        .withPredicateVar("varName", "var.varName")
                        .createHttpRequest(), "get", "/test_projectKey/zones?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").zones().get().createHttpRequest(), "get",
                        "/test_projectKey/zones", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .zones()
                        .post(null)
                        .withExpand("expand")
                        .createHttpRequest(), "post", "/test_projectKey/zones?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").zones().post(null).createHttpRequest(), "post",
                        "/test_projectKey/zones", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyZonesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyZonesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyZonesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyZonesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyZonesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyZonesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyZonesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyZonesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyZonesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyZonesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyZonesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyZonesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyZonesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyZonesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyZonesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyZonesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyZonesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) } };
    }
}
