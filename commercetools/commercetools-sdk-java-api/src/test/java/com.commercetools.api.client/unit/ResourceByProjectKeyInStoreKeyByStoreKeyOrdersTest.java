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
public class ResourceByProjectKeyInStoreKeyByStoreKeyOrdersTest {
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
                   .orders()
                   .get()
                   .withExpand("expand"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/orders?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .get()
                   .withSort("sort"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/orders?sort=sort",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .get()
                   .withLimit(9),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/orders?limit=9",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .get()
                   .withOffset(1),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/orders?offset=1",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .get()
                   .withWithTotal(true),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/orders?withTotal=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .get()
                   .withWhere("where"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/orders?where=where",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .get()
                   .withPredicateVar("varName", "var.varName"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/orders?var.varName=var.varName",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .get(),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/orders",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .post(null)
                   .withExpand("expand"),
                   "post",
                   "test_projectKey/in-store/key=test_storeKey/orders?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .post(null),
                   "post",
                   "test_projectKey/in-store/key=test_storeKey/orders",
               }
       };
    }

    private Object[] resourcesParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .withOrderNumber("test_orderNumber"),
                   "test_projectKey/in-store/key=test_storeKey/orders/order-number=test_orderNumber",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .orders()
                   .withId("test_ID"),
                   "test_projectKey/in-store/key=test_storeKey/orders/test_ID",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   }
       };
    }  
}
