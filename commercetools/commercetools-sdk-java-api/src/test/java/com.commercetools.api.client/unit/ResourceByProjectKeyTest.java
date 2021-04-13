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
public class ResourceByProjectKeyTest {
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
                   .get(),
                   "get",
                   "test_projectKey",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .post(null),
                   "post",
                   "test_projectKey",
               }
       };
    }

    private Object[] resourcesParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .categories(),
                   "test_projectKey/categories",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .carts(),
                   "test_projectKey/carts",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .cartDiscounts(),
                   "test_projectKey/cart-discounts",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .channels(),
                   "test_projectKey/channels",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customers(),
                   "test_projectKey/customers",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups(),
                   "test_projectKey/customer-groups",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customObjects(),
                   "test_projectKey/custom-objects",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .discountCodes(),
                   "test_projectKey/discount-codes",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .graphql(),
                   "test_projectKey/graphql",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inventory(),
                   "test_projectKey/inventory",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .login(),
                   "test_projectKey/login",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .messages(),
                   "test_projectKey/messages",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .orders(),
                   "test_projectKey/orders",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .payments(),
                   "test_projectKey/payments",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products(),
                   "test_projectKey/products",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productDiscounts(),
                   "test_projectKey/product-discounts",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections(),
                   "test_projectKey/product-projections",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productTypes(),
                   "test_projectKey/product-types",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .reviews(),
                   "test_projectKey/reviews",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .shippingMethods(),
                   "test_projectKey/shipping-methods",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .shoppingLists(),
                   "test_projectKey/shopping-lists",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .states(),
                   "test_projectKey/states",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .subscriptions(),
                   "test_projectKey/subscriptions",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .taxCategories(),
                   "test_projectKey/tax-categories",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .types(),
                   "test_projectKey/types",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .zones(),
                   "test_projectKey/zones",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .me(),
                   "test_projectKey/me",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions(),
                   "test_projectKey/extensions",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .apiClients(),
                   "test_projectKey/api-clients",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .stores(),
                   "test_projectKey/stores",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey"),
                   "test_projectKey/in-store/key=test_storeKey",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   }
       };
    }  
}
