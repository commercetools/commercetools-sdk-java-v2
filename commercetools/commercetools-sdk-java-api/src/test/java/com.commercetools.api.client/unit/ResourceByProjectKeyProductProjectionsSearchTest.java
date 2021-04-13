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
public class ResourceByProjectKeyProductProjectionsSearchTest {
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
                   .search()
                   .post(),
                   "post",
                   "test_projectKey/product-projections/search",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withFuzzy(true),
                   "get",
                   "test_projectKey/product-projections/search?fuzzy=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withFuzzyLevel(0.67911),
                   "get",
                   "test_projectKey/product-projections/search?fuzzyLevel=0.67911",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withMarkMatchingVariants(true),
                   "get",
                   "test_projectKey/product-projections/search?markMatchingVariants=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withStaged(true),
                   "get",
                   "test_projectKey/product-projections/search?staged=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withFilter("filter"),
                   "get",
                   "test_projectKey/product-projections/search?filter=filter",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withFilterFacets("filter.facets"),
                   "get",
                   "test_projectKey/product-projections/search?filter.facets=filter.facets",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withFilterQuery("filter.query"),
                   "get",
                   "test_projectKey/product-projections/search?filter.query=filter.query",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withFacet("facet"),
                   "get",
                   "test_projectKey/product-projections/search?facet=facet",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withText("locale", "text.locale"),
                   "get",
                   "test_projectKey/product-projections/search?text.locale=text.locale",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withSort("sort"),
                   "get",
                   "test_projectKey/product-projections/search?sort=sort",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withLimit(6),
                   "get",
                   "test_projectKey/product-projections/search?limit=6",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withOffset(9),
                   "get",
                   "test_projectKey/product-projections/search?offset=9",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withWithTotal(true),
                   "get",
                   "test_projectKey/product-projections/search?withTotal=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withPriceCurrency("priceCurrency"),
                   "get",
                   "test_projectKey/product-projections/search?priceCurrency=priceCurrency",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withPriceCountry("priceCountry"),
                   "get",
                   "test_projectKey/product-projections/search?priceCountry=priceCountry",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withPriceCustomerGroup("priceCustomerGroup"),
                   "get",
                   "test_projectKey/product-projections/search?priceCustomerGroup=priceCustomerGroup",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withPriceChannel("priceChannel"),
                   "get",
                   "test_projectKey/product-projections/search?priceChannel=priceChannel",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withLocaleProjection("localeProjection"),
                   "get",
                   "test_projectKey/product-projections/search?localeProjection=localeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withStoreProjection("storeProjection"),
                   "get",
                   "test_projectKey/product-projections/search?storeProjection=storeProjection",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get()
                   .withExpand("expand"),
                   "get",
                   "test_projectKey/product-projections/search?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .productProjections()
                   .search()
                   .get(),
                   "get",
                   "test_projectKey/product-projections/search",
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
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyProductProjectionsSearchPost(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyProductProjectionsSearchGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   }
       };
    }  
}
