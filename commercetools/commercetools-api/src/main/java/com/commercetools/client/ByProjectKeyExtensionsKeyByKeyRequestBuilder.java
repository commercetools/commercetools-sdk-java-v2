package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyExtensionsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyExtensionsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyExtensionsKeyByKeyGet get() {
      return new ByProjectKeyExtensionsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyExtensionsKeyByKeyPost post(com.commercetools.models.extension.ExtensionUpdate extensionUpdate) {
      return new ByProjectKeyExtensionsKeyByKeyPost(apiHttpClient, projectKey, key, extensionUpdate);
   }
   
   public ByProjectKeyExtensionsKeyByKeyDelete delete() {
      return new ByProjectKeyExtensionsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
