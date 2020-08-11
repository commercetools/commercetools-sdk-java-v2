package com.commercetools.ml.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeySimilaritiesProductsStatusRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeySimilaritiesProductsStatusRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   
   public ByProjectKeySimilaritiesProductsStatusByTaskIdRequestBuilder withTaskId(String taskId) {
      return new ByProjectKeySimilaritiesProductsStatusByTaskIdRequestBuilder(apiHttpClient, projectKey, taskId);
   }
}
