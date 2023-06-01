package com.commercetools.api.client.resource;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.VrapHttpClient;
import com.commercetools.api.client.ApiRoot;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import org.assertj.core.api.Assertions;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ByProjectKeyCustomerGroupsByIDTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final static ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @TestTemplate
    @UseDataProvider("requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assertions.assertThat(httpMethod).isEqualTo(request.getMethod().name().toLowerCase());
        Assertions.assertThat(uri).isEqualTo(request.getUri().toString());
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeServerException(ClientRequestCommand<?> httpRequest) throws Exception{
        Mockito.when(httpClientMock.execute(Mockito.any())).thenReturn(CompletableFuture.completedFuture(
                       new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(
               () -> client.execute(httpRequest).toCompletableFuture().get()).hasCauseInstanceOf(ApiServerException.class); 
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception{
        Mockito.when(httpClientMock.execute(Mockito.any())).thenReturn(CompletableFuture.completedFuture(
                       new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(
           () -> client.execute(httpRequest).toCompletableFuture().get()).hasCauseInstanceOf(ApiClientException.class);
    }

    @DataProvider
    public static Object[][] requestWithMethodParameters() {
       return new Object [][] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .get()
                   .withExpand("expand")
                   .createHttpRequest(),
                   "get",
                   "test_projectKey/customer-groups/test_ID?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .get()
                   .createHttpRequest(),
                   "get",
                   "test_projectKey/customer-groups/test_ID",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .post(com.commercetools.api.models.customer_group.CustomerGroupUpdate.of())
                   .withExpand("expand")
                   .createHttpRequest(),
                   "post",
                   "test_projectKey/customer-groups/test_ID?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .post(com.commercetools.api.models.customer_group.CustomerGroupUpdate.of())
                   .createHttpRequest(),
                   "post",
                   "test_projectKey/customer-groups/test_ID",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .delete()
                   .withVersion(2)
                   .createHttpRequest(),
                   "delete",
                   "test_projectKey/customer-groups/test_ID?version=2",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .delete()
                   .withExpand("expand")
                   .createHttpRequest(),
                   "delete",
                   "test_projectKey/customer-groups/test_ID?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .delete()
                   .createHttpRequest(),
                   "delete",
                   "test_projectKey/customer-groups/test_ID",
               }
       };
    }

    @DataProvider
    public static Object[][] executeMethodParameters() {
       return new Object [][] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .get()
                   .withExpand("expand"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .get(),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .post(com.commercetools.api.models.customer_group.CustomerGroupUpdate.of())
                   .withExpand("expand"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .post(com.commercetools.api.models.customer_group.CustomerGroupUpdate.of()),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .delete()
                   .withVersion(2),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .delete()
                   .withExpand("expand"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .customerGroups()
                   .withId("test_ID")
                   .delete(),
               }
       };
    }
}
