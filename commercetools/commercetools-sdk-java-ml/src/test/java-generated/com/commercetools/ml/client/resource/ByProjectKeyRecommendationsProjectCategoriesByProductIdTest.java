package com.commercetools.ml.client.resource;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.VrapHttpClient;
import com.commercetools.ml.client.ApiRoot;
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
public class ByProjectKeyRecommendationsProjectCategoriesByProductIdTest {
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
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .withLimit(7)
                   .createHttpRequest(),
                   "get",
                   "test_projectKey/recommendations/project-categories/test_productId?limit=7",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .withOffset(3)
                   .createHttpRequest(),
                   "get",
                   "test_projectKey/recommendations/project-categories/test_productId?offset=3",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .withStaged(true)
                   .createHttpRequest(),
                   "get",
                   "test_projectKey/recommendations/project-categories/test_productId?staged=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .withConfidenceMin(0.7340351)
                   .createHttpRequest(),
                   "get",
                   "test_projectKey/recommendations/project-categories/test_productId?confidenceMin=0.7340351",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .withConfidenceMax(0.30089796)
                   .createHttpRequest(),
                   "get",
                   "test_projectKey/recommendations/project-categories/test_productId?confidenceMax=0.30089796",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .createHttpRequest(),
                   "get",
                   "test_projectKey/recommendations/project-categories/test_productId",
               }
       };
    }

    @DataProvider
    public static Object[][] executeMethodParameters() {
       return new Object [][] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .withLimit(7),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .withOffset(3),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .withStaged(true),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .withConfidenceMin(0.7340351),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get()
                   .withConfidenceMax(0.30089796),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .projectCategories()
                   .withProductId("test_productId")
                   .get(),
               }
       };
    }
}
