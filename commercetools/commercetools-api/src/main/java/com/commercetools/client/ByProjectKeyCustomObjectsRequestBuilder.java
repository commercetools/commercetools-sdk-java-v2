package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCustomObjectsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomObjectsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomObjectsGet get() {
      return new ByProjectKeyCustomObjectsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyCustomObjectsPost post(com.commercetools.models.CustomObject.CustomObjectDraft customObjectDraft) {
      return new ByProjectKeyCustomObjectsPost(apiHttpClient, projectKey, customObjectDraft);
   }
   
   public ByProjectKeyCustomObjectsByContainerByKeyRequestBuilder withContainerAndKey(String container ,String key) {
      return new ByProjectKeyCustomObjectsByContainerByKeyRequestBuilder(apiHttpClient, projectKey, container, key);
   }
   public ByProjectKeyCustomObjectsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyCustomObjectsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
