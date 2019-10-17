package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMeCartsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyMeCartsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyMeCartsByIDGet get() {
      return new ByProjectKeyMeCartsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyMeCartsByIDPost post(com.commercetools.api.generated.models.common.Update update) {
      return new ByProjectKeyMeCartsByIDPost(apiHttpClient, projectKey, ID, update);
   }
   
   public ByProjectKeyMeCartsByIDDelete delete() {
      return new ByProjectKeyMeCartsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
