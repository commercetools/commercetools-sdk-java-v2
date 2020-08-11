package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyTypesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyTypesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyTypesGet get() {
      return new ByProjectKeyTypesGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyTypesPost post(com.commercetools.api.models.type.TypeDraft typeDraft) {
      return new ByProjectKeyTypesPost(apiHttpClient, projectKey, typeDraft);
   }
   
   public ByProjectKeyTypesKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyTypesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyTypesByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyTypesByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
