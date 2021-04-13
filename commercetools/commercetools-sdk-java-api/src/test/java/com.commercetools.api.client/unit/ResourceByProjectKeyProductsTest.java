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
public class ResourceByProjectKeyProductsTest {
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
                   .get()
                   .withPriceCurrency("priceCurrency"),
                   "get",
                   "test_projectKey/products?priceCurrency=priceCurrency",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withPriceCountry("priceCountry"),
                   "get",
                   "test_projectKey/products?priceCountry=priceCountry",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withPriceCustomerGroup("priceCustomerGroup"),
                   "get",
                   "test_projectKey/products?priceCustomerGroup=priceCustomerGroup",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withPriceChannel("priceChannel"),
                   "get",
                   "test_projectKey/products?priceChannel=priceChannel",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withLocaleProjection("localeProjection"),
                   "get",
                   "test_projectKey/products?localeProjection=localeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withStoreProjection("storeProjection"),
                   "get",
                   "test_projectKey/products?storeProjection=storeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withExpand("expand"),
                   "get",
                   "test_projectKey/products?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withSort("sort"),
                   "get",
                   "test_projectKey/products?sort=sort",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withLimit(2),
                   "get",
                   "test_projectKey/products?limit=2",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withOffset(4),
                   "get",
                   "test_projectKey/products?offset=4",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withWithTotal(true),
                   "get",
                   "test_projectKey/products?withTotal=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withWhere("where"),
                   "get",
                   "test_projectKey/products?where=where",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get()
                   .withPredicateVar("varName", "var.varName"),
                   "get",
                   "test_projectKey/products?var.varName=var.varName",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .get(),
                   "get",
                   "test_projectKey/products",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .post(null)
                   .withPriceCurrency("priceCurrency"),
                   "post",
                   "test_projectKey/products?priceCurrency=priceCurrency",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .post(null)
                   .withPriceCountry("priceCountry"),
                   "post",
                   "test_projectKey/products?priceCountry=priceCountry",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .post(null)
                   .withPriceCustomerGroup("priceCustomerGroup"),
                   "post",
                   "test_projectKey/products?priceCustomerGroup=priceCustomerGroup",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .post(null)
                   .withPriceChannel("priceChannel"),
                   "post",
                   "test_projectKey/products?priceChannel=priceChannel",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .post(null)
                   .withLocaleProjection("localeProjection"),
                   "post",
                   "test_projectKey/products?localeProjection=localeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .post(null)
                   .withStoreProjection("storeProjection"),
                   "post",
                   "test_projectKey/products?storeProjection=storeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .post(null)
                   .withExpand("expand"),
                   "post",
                   "test_projectKey/products?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .post(null),
                   "post",
                   "test_projectKey/products",
               }
       };
    }

    private Object[] resourcesParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withKey("test_key"),
                   "test_projectKey/products/key=test_key",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .products()
                   .withId("test_ID"),
                   "test_projectKey/products/test_ID",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductsPost(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   }
       };
    }

}
