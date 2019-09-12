package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyShippingMethodsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyShippingMethodsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyShippingMethodsByIDGet get() {
      return new ByProjectKeyShippingMethodsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyShippingMethodsByIDPost post(com.commercetools.models.ShippingMethod.ShippingMethodUpdate shippingMethodUpdate) {
      return new ByProjectKeyShippingMethodsByIDPost(apiHttpClient, projectKey, ID, shippingMethodUpdate);
   }
   
   public ByProjectKeyShippingMethodsByIDDelete delete() {
      return new ByProjectKeyShippingMethodsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
