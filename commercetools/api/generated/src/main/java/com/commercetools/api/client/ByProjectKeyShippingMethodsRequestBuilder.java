package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyShippingMethodsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyShippingMethodsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyShippingMethodsGet get() {
      return new ByProjectKeyShippingMethodsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyShippingMethodsPost post(com.commercetools.api.models.shipping_method.ShippingMethodDraft shippingMethodDraft) {
      return new ByProjectKeyShippingMethodsPost(apiHttpClient, projectKey, shippingMethodDraft);
   }
   
   public ByProjectKeyShippingMethodsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyShippingMethodsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyShippingMethodsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyShippingMethodsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
