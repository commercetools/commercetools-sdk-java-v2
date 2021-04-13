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
public class ResourceByProjectKeyInStoreKeyByStoreKeyCartsTest {
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
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .get()
                   .withCustomerId("customerId"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/carts?customerId=customerId",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .get()
                   .withExpand("expand"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/carts?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .get()
                   .withSort("sort"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/carts?sort=sort",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .get()
                   .withLimit(4),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/carts?limit=4",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .get()
                   .withOffset(5),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/carts?offset=5",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .get()
                   .withWithTotal(true),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/carts?withTotal=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .get()
                   .withWhere("where"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/carts?where=where",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .get()
                   .withPredicateVar("varName", "var.varName"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/carts?var.varName=var.varName",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .get(),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/carts",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .post(null)
                   .withExpand("expand"),
                   "post",
                   "test_projectKey/in-store/key=test_storeKey/carts?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .post(null),
                   "post",
                   "test_projectKey/in-store/key=test_storeKey/carts",
               }
       };
    }

    private Object[] resourcesParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .withCustomerId("test_customerId"),
                   "test_projectKey/in-store/key=test_storeKey/carts/customer-id=test_customerId",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .withKey("test_key"),
                   "test_projectKey/in-store/key=test_storeKey/carts/key=test_key",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .replicate(),
                   "test_projectKey/in-store/key=test_storeKey/carts/replicate",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .carts()
                   .withId("test_ID"),
                   "test_projectKey/in-store/key=test_storeKey/carts/test_ID",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   }
       };
    }  
}
