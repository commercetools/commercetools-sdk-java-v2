package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyShippingMethodsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyShippingMethodsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyShippingMethodsKeyByKeyGet get() {
      return new ByProjectKeyShippingMethodsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyShippingMethodsKeyByKeyPost post(com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdate shippingMethodUpdate) {
      return new ByProjectKeyShippingMethodsKeyByKeyPost(apiHttpClient, projectKey, key, shippingMethodUpdate);
   }
   
   public ByProjectKeyShippingMethodsKeyByKeyDelete delete() {
      return new ByProjectKeyShippingMethodsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
