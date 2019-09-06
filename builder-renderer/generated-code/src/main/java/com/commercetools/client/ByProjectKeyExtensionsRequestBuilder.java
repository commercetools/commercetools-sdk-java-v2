package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyExtensionsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyExtensionsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyExtensionsGet get() {
      return new ByProjectKeyExtensionsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyExtensionsPost post(com.commercetools.models.Extension.ExtensionDraft extensionDraft) {
      return new ByProjectKeyExtensionsPost(apiHttpClient, projectKey, extensionDraft);
   }
   
   public ByProjectKeyExtensionsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyExtensionsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyExtensionsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyExtensionsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
