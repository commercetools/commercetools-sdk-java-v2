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
public class ResourceByProjectKeyProductsKeyByKeyTest {
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
                   .products()
                   .withKey("test_key")
                   .get()
                   .withPriceCurrency("priceCurrency"),
                   "get",
                   "test_projectKey/products/key=test_key?priceCurrency=priceCurrency",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .get()
                   .withPriceCountry("priceCountry"),
                   "get",
                   "test_projectKey/products/key=test_key?priceCountry=priceCountry",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .get()
                   .withPriceCustomerGroup("priceCustomerGroup"),
                   "get",
                   "test_projectKey/products/key=test_key?priceCustomerGroup=priceCustomerGroup",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .get()
                   .withPriceChannel("priceChannel"),
                   "get",
                   "test_projectKey/products/key=test_key?priceChannel=priceChannel",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .get()
                   .withLocaleProjection("localeProjection"),
                   "get",
                   "test_projectKey/products/key=test_key?localeProjection=localeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .get()
                   .withStoreProjection("storeProjection"),
                   "get",
                   "test_projectKey/products/key=test_key?storeProjection=storeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .get()
                   .withExpand("expand"),
                   "get",
                   "test_projectKey/products/key=test_key?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .get(),
                   "get",
                   "test_projectKey/products/key=test_key",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .post(null)
                   .withPriceCurrency("priceCurrency"),
                   "post",
                   "test_projectKey/products/key=test_key?priceCurrency=priceCurrency",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .post(null)
                   .withPriceCountry("priceCountry"),
                   "post",
                   "test_projectKey/products/key=test_key?priceCountry=priceCountry",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .post(null)
                   .withPriceCustomerGroup("priceCustomerGroup"),
                   "post",
                   "test_projectKey/products/key=test_key?priceCustomerGroup=priceCustomerGroup",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .post(null)
                   .withPriceChannel("priceChannel"),
                   "post",
                   "test_projectKey/products/key=test_key?priceChannel=priceChannel",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .post(null)
                   .withLocaleProjection("localeProjection"),
                   "post",
                   "test_projectKey/products/key=test_key?localeProjection=localeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .post(null)
                   .withStoreProjection("storeProjection"),
                   "post",
                   "test_projectKey/products/key=test_key?storeProjection=storeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .post(null)
                   .withExpand("expand"),
                   "post",
                   "test_projectKey/products/key=test_key?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .post(null),
                   "post",
                   "test_projectKey/products/key=test_key",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .delete()
                   .withPriceCurrency("priceCurrency"),
                   "delete",
                   "test_projectKey/products/key=test_key?priceCurrency=priceCurrency",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .delete()
                   .withPriceCountry("priceCountry"),
                   "delete",
                   "test_projectKey/products/key=test_key?priceCountry=priceCountry",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .delete()
                   .withPriceCustomerGroup("priceCustomerGroup"),
                   "delete",
                   "test_projectKey/products/key=test_key?priceCustomerGroup=priceCustomerGroup",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .delete()
                   .withPriceChannel("priceChannel"),
                   "delete",
                   "test_projectKey/products/key=test_key?priceChannel=priceChannel",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .delete()
                   .withLocaleProjection("localeProjection"),
                   "delete",
                   "test_projectKey/products/key=test_key?localeProjection=localeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .delete()
                   .withStoreProjection("storeProjection"),
                   "delete",
                   "test_projectKey/products/key=test_key?storeProjection=storeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .delete()
                   .withVersion(9L),
                   "delete",
                   "test_projectKey/products/key=test_key?version=9L",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .delete()
                   .withExpand("expand"),
                   "delete",
                   "test_projectKey/products/key=test_key?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key")
                   .delete(),
                   "delete",
                   "test_projectKey/products/key=test_key",
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
                      new ByProjectKeyProductsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsKeyByKeyGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsKeyByKeyPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsKeyByKeyPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsKeyByKeyPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsKeyByKeyPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsKeyByKeyPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsKeyByKeyPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsKeyByKeyPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsKeyByKeyPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsKeyByKeyPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyProductsKeyByKeyDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyProductsKeyByKeyDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyProductsKeyByKeyDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyProductsKeyByKeyDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyProductsKeyByKeyDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyProductsKeyByKeyDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyProductsKeyByKeyDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyProductsKeyByKeyDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.DELETE,
                      new ByProjectKeyProductsKeyByKeyDelete(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   }
       };
    }  
}
