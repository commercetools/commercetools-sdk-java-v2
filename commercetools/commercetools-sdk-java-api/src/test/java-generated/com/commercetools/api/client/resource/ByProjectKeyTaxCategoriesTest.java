
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
public class ByProjectKeyTaxCategoriesTest {
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
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withExpand("expand"),
                        "get", "test_projectKey/tax-categories?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withSort("sort"), "get",
                        "test_projectKey/tax-categories?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withLimit(1), "get",
                        "test_projectKey/tax-categories?limit=1", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withOffset(3), "get",
                        "test_projectKey/tax-categories?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withWithTotal(true),
                        "get", "test_projectKey/tax-categories?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withWhere("where"),
                        "get", "test_projectKey/tax-categories?where=where", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .taxCategories()
                                .get()
                                .withPredicateVar("varName", "var.varName"),
                        "get", "test_projectKey/tax-categories?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get(), "get",
                        "test_projectKey/tax-categories", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").taxCategories().post(null).withExpand("expand"),
                        "post", "test_projectKey/tax-categories?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().post(null), "post",
                        "test_projectKey/tax-categories", } };
    }

    private Object[] resourcesParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().withKey("test_key"),
                        "test_projectKey/tax-categories/key=test_key", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().withId("test_ID"),
                        "test_projectKey/tax-categories/test_ID", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyTaxCategoriesGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyTaxCategoriesGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyTaxCategoriesGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyTaxCategoriesGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyTaxCategoriesGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyTaxCategoriesGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyTaxCategoriesGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.GET,
                            new ByProjectKeyTaxCategoriesGet(apiHttpClientMock, projectKey).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyTaxCategoriesPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyTaxCategoriesPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyTaxCategoriesPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyTaxCategoriesPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyTaxCategoriesPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyTaxCategoriesPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyTaxCategoriesPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] {
                        new ApiHttpRequest(ApiHttpMethod.POST,
                            new ByProjectKeyTaxCategoriesPost(apiHttpClientMock, projectKey, null).createHttpRequest()
                                    .getUri(),
                            null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyTaxCategoriesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(),
                    null, null) } };
    }
}
