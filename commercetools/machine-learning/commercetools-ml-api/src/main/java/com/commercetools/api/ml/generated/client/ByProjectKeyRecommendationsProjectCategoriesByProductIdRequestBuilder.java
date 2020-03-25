package com.commercetools.api.ml.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyRecommendationsProjectCategoriesByProductIdRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String productId;
   
   
   public ByProjectKeyRecommendationsProjectCategoriesByProductIdRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String productId) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.productId = productId;
   }
   
   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet get() {
      return new ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(apiHttpClient, projectKey, productId);
   }
   
}
