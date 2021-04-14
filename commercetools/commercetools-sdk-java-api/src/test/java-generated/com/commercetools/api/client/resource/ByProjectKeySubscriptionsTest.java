
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
public class ByProjectKeySubscriptionsTest {
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
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .subscriptions()
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "/test_projectKey/subscriptions?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .subscriptions()
                        .get()
                        .withSort("sort")
                        .createHttpRequest(), "get", "/test_projectKey/subscriptions?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .subscriptions()
                        .get()
                        .withLimit(7)
                        .createHttpRequest(), "get", "/test_projectKey/subscriptions?limit=7", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .subscriptions()
                        .get()
                        .withOffset(3)
                        .createHttpRequest(), "get", "/test_projectKey/subscriptions?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .subscriptions()
                        .get()
                        .withWithTotal(true)
                        .createHttpRequest(), "get", "/test_projectKey/subscriptions?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .subscriptions()
                        .get()
                        .withWhere("where")
                        .createHttpRequest(), "get", "/test_projectKey/subscriptions?where=where", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .subscriptions()
                                .get()
                                .withPredicateVar("varName", "var.varName")
                                .createHttpRequest(),
                        "get", "/test_projectKey/subscriptions?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").subscriptions().get().createHttpRequest(),
                        "get", "/test_projectKey/subscriptions", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .subscriptions()
                        .post(null)
                        .withExpand("expand")
                        .createHttpRequest(), "post", "/test_projectKey/subscriptions?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").subscriptions().post(null).createHttpRequest(),
                        "post", "/test_projectKey/subscriptions", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeySubscriptionsGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeySubscriptionsGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeySubscriptionsGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeySubscriptionsGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeySubscriptionsGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeySubscriptionsGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeySubscriptionsGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeySubscriptionsGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeySubscriptionsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeySubscriptionsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeySubscriptionsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeySubscriptionsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeySubscriptionsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeySubscriptionsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeySubscriptionsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeySubscriptionsPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeySubscriptionsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(),
                    null, null) } };
    }
}
