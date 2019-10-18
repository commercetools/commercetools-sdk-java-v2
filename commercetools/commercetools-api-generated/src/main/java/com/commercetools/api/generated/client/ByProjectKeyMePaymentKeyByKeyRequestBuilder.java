package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMePaymentKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyMePaymentKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyMePaymentKeyByKeyPost post(com.commercetools.api.generated.models.me.MyPaymentUpdate myPaymentUpdate) {
      return new ByProjectKeyMePaymentKeyByKeyPost(apiHttpClient, projectKey, key, myPaymentUpdate);
   }
   
}
