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
public class ResourceByProjectKeyMessagesTest {
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
                   .messages()
                   .get()
                   .withExpand("expand"),
                   "get",
                   "test_projectKey/messages?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .messages()
                   .get()
                   .withSort("sort"),
                   "get",
                   "test_projectKey/messages?sort=sort",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .messages()
                   .get()
                   .withLimit(2),
                   "get",
                   "test_projectKey/messages?limit=2",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .messages()
                   .get()
                   .withOffset(8),
                   "get",
                   "test_projectKey/messages?offset=8",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .messages()
                   .get()
                   .withWithTotal(true),
                   "get",
                   "test_projectKey/messages?withTotal=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .messages()
                   .get()
                   .withWhere("where"),
                   "get",
                   "test_projectKey/messages?where=where",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .messages()
                   .get()
                   .withPredicateVar("varName", "var.varName"),
                   "get",
                   "test_projectKey/messages?var.varName=var.varName",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .messages()
                   .get(),
                   "get",
                   "test_projectKey/messages",
               }
       };
    }

    private Object[] resourcesParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .messages()
                   .withId("test_ID"),
                   "test_projectKey/messages/test_ID",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyMessagesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyMessagesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyMessagesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyMessagesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyMessagesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyMessagesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyMessagesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyMessagesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), null, null)
                   }
       };
    }

}
