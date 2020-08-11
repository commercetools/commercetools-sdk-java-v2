package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomersPasswordRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomersPasswordRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomersPasswordPost post(com.commercetools.api.models.customer.CustomerChangePassword customerChangePassword) {
      return new ByProjectKeyCustomersPasswordPost(apiHttpClient, projectKey, customerChangePassword);
   }
   
   public ByProjectKeyCustomersPasswordResetRequestBuilder reset() {
      return new ByProjectKeyCustomersPasswordResetRequestBuilder(apiHttpClient, projectKey);
   }
}
