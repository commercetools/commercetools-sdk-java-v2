package com.commercetools.api.client.unit;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpMethod;
import com.commercetools.api.client.*;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@RunWith(JUnitParamsRunner.class)
public class ResourceByProjectKeyTypesTest {
    private final ApiHttpClient apiHttpClientMock = Mockito.mock(ApiHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = createClient();

    private ApiRoot createClient() {  
        return ApiFactory.create(
           ClientCredentials.of().withClientId("your-client-id").withClientSecret("your-client-secret").withScopes("your-scopes").build(),
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
    public void executeWithNullPointerException(ApiHttpRequest httpRequest) throws Exception{
        Mockito.when(apiHttpClientMock.execute(httpRequest)).thenThrow(NullPointerException.class);   
    }

    private Object[] requestWithMethodParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .get()
                   .withExpand("expand"),
                   "get",
                   "test_projectKey/types?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .get()
                   .withSort("sort"),
                   "get",
                   "test_projectKey/types?sort=sort",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .get()
                   .withLimit(5),
                   "get",
                   "test_projectKey/types?limit=5",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .get()
                   .withOffset(8),
                   "get",
                   "test_projectKey/types?offset=8",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .get()
                   .withWithTotal(true),
                   "get",
                   "test_projectKey/types?withTotal=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .get()
                   .withWhere("where"),
                   "get",
                   "test_projectKey/types?where=where",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .get()
                   .withPredicateVar("varName", "var.varName"),
                   "get",
                   "test_projectKey/types?var.varName=var.varName",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .get(),
                   "get",
                   "test_projectKey/types",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .post(null)
                   .withExpand("expand"),
                   "post",
                   "test_projectKey/types?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .post(null),
                   "post",
                   "test_projectKey/types",
               }
       };
    }

    private Object[] resourcesParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .withKey("test_key"),
                   "test_projectKey/types/key=test_key",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types()
                   .withId("test_ID"),
                   "test_projectKey/types/test_ID",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyTypesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyTypesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyTypesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyTypesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyTypesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyTypesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyTypesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyTypesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyTypesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyTypesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyTypesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyTypesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyTypesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyTypesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyTypesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyTypesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyTypesPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   }
       };
    }  
}
