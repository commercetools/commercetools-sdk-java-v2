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
public class ResourceByProjectKeyOrdersOrderNumberByOrderNumberTest {
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
                   .orders()
                   .withOrderNumber("test_orderNumber")
                   .get()
                   .withExpand("expand"),
                   "get",
                   "test_projectKey/orders/order-number=test_orderNumber?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .orders()
                   .withOrderNumber("test_orderNumber")
                   .get(),
                   "get",
                   "test_projectKey/orders/order-number=test_orderNumber",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .orders()
                   .withOrderNumber("test_orderNumber")
                   .post(null)
                   .withExpand("expand"),
                   "post",
                   "test_projectKey/orders/order-number=test_orderNumber?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .orders()
                   .withOrderNumber("test_orderNumber")
                   .post(null),
                   "post",
                   "test_projectKey/orders/order-number=test_orderNumber",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .orders()
                   .withOrderNumber("test_orderNumber")
                   .delete()
                   .withDataErasure(true),
                   "delete",
                   "test_projectKey/orders/order-number=test_orderNumber?dataErasure=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .orders()
                   .withOrderNumber("test_orderNumber")
                   .delete()
                   .withVersion(9L),
                   "delete",
                   "test_projectKey/orders/order-number=test_orderNumber?version=9L",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .orders()
                   .withOrderNumber("test_orderNumber")
                   .delete()
                   .withExpand("expand"),
                   "delete",
                   "test_projectKey/orders/order-number=test_orderNumber?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .orders()
                   .withOrderNumber("test_orderNumber")
                   .delete(),
                   "delete",
                   "test_projectKey/orders/order-number=test_orderNumber",
               }
       };
    }

    private Object[] resourcesParameters() {
       return new Object [] {
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   }
       };
    }  
}
