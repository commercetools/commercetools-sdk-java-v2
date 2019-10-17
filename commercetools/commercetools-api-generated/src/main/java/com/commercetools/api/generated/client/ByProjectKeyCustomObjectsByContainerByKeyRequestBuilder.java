package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCustomObjectsByContainerByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String container;
   private final String key;
   
   
   public ByProjectKeyCustomObjectsByContainerByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String container,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.container = container;
      this.key = key;
   }
   
   public ByProjectKeyCustomObjectsByContainerByKeyGet get() {
      return new ByProjectKeyCustomObjectsByContainerByKeyGet(apiHttpClient, projectKey, container, key);
   }
   
   public ByProjectKeyCustomObjectsByContainerByKeyDelete delete() {
      return new ByProjectKeyCustomObjectsByContainerByKeyDelete(apiHttpClient, projectKey, container, key);
   }
   
}
