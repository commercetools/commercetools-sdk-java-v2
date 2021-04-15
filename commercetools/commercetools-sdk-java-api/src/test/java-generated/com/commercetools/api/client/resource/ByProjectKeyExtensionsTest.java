package com.commercetools.api.client.resource;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.VrapHttpClient;
import com.commercetools.api.client.ApiRoot;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import org.assertj.core.api.Assertions;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@RunWith(JUnitParamsRunner.class)
public class ByProjectKeyExtensionsTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @Test
    @Parameters(method = "requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().name().toLowerCase());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeServerException(ClientRequestCommand<?> httpRequest) throws Exception{
        Mockito.when(httpClientMock.execute(Mockito.any())).thenReturn(CompletableFuture.completedFuture(
                       new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(
               () -> client.execute(httpRequest).get()).hasCauseInstanceOf(ApiServerException.class); 
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception{
        Mockito.when(httpClientMock.execute(Mockito.any())).thenReturn(CompletableFuture.completedFuture(
                       new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(
           () -> client.execute(httpRequest).get()).hasCauseInstanceOf(ApiClientException.class);
    }

    private Object[] requestWithMethodParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withExpand("expand")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/extensions?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withSort("sort")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/extensions?sort=sort",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withLimit(7)
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/extensions?limit=7",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withOffset(3)
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/extensions?offset=3",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withWithTotal(true)
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/extensions?withTotal=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withWhere("where")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/extensions?where=where",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withPredicateVar("varName", "var.varName")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/extensions?var.varName=var.varName",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/extensions",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .post(null)
                   .withExpand("expand")
                   .createHttpRequest(),
                   "post",
                   "/test_projectKey/extensions?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .post(null)
                   .createHttpRequest(),
                   "post",
                   "/test_projectKey/extensions",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withExpand("expand"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withSort("sort"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withLimit(7),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withOffset(3),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withWithTotal(true),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withWhere("where"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get()
                   .withPredicateVar("varName", "var.varName"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .get(),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .post(null)
                   .withExpand("expand"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .extensions()
                   .post(null),
               }
       };
    }
}
