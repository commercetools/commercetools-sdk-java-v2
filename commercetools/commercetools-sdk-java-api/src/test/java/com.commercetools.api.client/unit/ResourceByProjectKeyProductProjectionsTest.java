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
public class ResourceByProjectKeyProductProjectionsTest {
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
                   .productProjections()
                   .get()
                   .withStaged(true),
                   "get",
                   "test_projectKey/product-projections?staged=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withPriceCurrency("priceCurrency"),
                   "get",
                   "test_projectKey/product-projections?priceCurrency=priceCurrency",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withPriceCountry("priceCountry"),
                   "get",
                   "test_projectKey/product-projections?priceCountry=priceCountry",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withPriceCustomerGroup("priceCustomerGroup"),
                   "get",
                   "test_projectKey/product-projections?priceCustomerGroup=priceCustomerGroup",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withPriceChannel("priceChannel"),
                   "get",
                   "test_projectKey/product-projections?priceChannel=priceChannel",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withLocaleProjection("localeProjection"),
                   "get",
                   "test_projectKey/product-projections?localeProjection=localeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withStoreProjection("storeProjection"),
                   "get",
                   "test_projectKey/product-projections?storeProjection=storeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withExpand("expand"),
                   "get",
                   "test_projectKey/product-projections?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withSort("sort"),
                   "get",
                   "test_projectKey/product-projections?sort=sort",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withLimit(5),
                   "get",
                   "test_projectKey/product-projections?limit=5",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withOffset(5),
                   "get",
                   "test_projectKey/product-projections?offset=5",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withWithTotal(true),
                   "get",
                   "test_projectKey/product-projections?withTotal=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withWhere("where"),
                   "get",
                   "test_projectKey/product-projections?where=where",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get()
                   .withPredicateVar("varName", "var.varName"),
                   "get",
                   "test_projectKey/product-projections?var.varName=var.varName",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .get(),
                   "get",
                   "test_projectKey/product-projections",
               }
       };
    }

    private Object[] resourcesParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search(),
                   "test_projectKey/product-projections/search",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .suggest(),
                   "test_projectKey/product-projections/suggest",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .withKey("test_key"),
                   "test_projectKey/product-projections/key=test_key",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .withId("test_ID"),
                   "test_projectKey/product-projections/test_ID",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   }
       };
    }  
}
