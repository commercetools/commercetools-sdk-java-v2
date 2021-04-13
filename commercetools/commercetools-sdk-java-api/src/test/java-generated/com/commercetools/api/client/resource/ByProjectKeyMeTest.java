
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
public class ByProjectKeyMeTest {
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
        Assert.assertEquals(httpMethod, request.getMethod().toString());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "resourcesParameters")
    public void resources(ApiHttpRequest request, String uri) {
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeWithNullPointerException(ApiHttpRequest httpRequest) throws Exception {
        Mockito.when(apiHttpClientMock.execute(httpRequest)).thenThrow(NullPointerException.class);
    }

    private Object[] requestWithMethodParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().get().withSort("sort"), "get",
                        "test_projectKey/me?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().get().withLimit(9), "get",
                        "test_projectKey/me?limit=9", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().get().withOffset(4), "get",
                        "test_projectKey/me?offset=4", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().get().withWithTotal(true), "get",
                        "test_projectKey/me?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().get().withExpand("expand"), "get",
                        "test_projectKey/me?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().get().withWhere("where"), "get",
                        "test_projectKey/me?where=where", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").me().get().withPredicateVar("varName", "var.varName"),
                        "get", "test_projectKey/me?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().get(), "get", "test_projectKey/me", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().post(null), "post",
                        "test_projectKey/me", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().delete().withVersion(3L), "delete",
                        "test_projectKey/me?version=3L", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().delete(), "delete",
                        "test_projectKey/me", } };
    }

    private Object[] resourcesParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().emailConfirm(),
                        "test_projectKey/me/email/confirm", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().password(),
                        "test_projectKey/me/password", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().signup(), "test_projectKey/me/signup", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().login(), "test_projectKey/me/login", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().activeCart(),
                        "test_projectKey/me/active-cart", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().carts(), "test_projectKey/me/carts", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().orders(), "test_projectKey/me/orders", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().payments(),
                        "test_projectKey/me/payments", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").me().shoppingLists(),
                        "test_projectKey/me/shopping-lists", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyMeGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyMeGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyMeGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyMeGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyMeGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyMeGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyMeGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyMeGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyMePost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyMePost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyMePost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyMePost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyMePost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyMePost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyMePost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyMePost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null,
                    null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyMeDelete(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyMeDelete(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyMeDelete(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyMeDelete(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyMeDelete(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyMeDelete(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyMeDelete(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyMeDelete(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyMeDelete(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null,
                    null) } };
    }
}
