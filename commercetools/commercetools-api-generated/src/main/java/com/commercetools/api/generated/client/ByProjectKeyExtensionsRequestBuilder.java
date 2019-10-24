package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
   
   public ByProjectKeyExtensionsPost post(com.commercetools.api.generated.models.extension.ExtensionDraft extensionDraft) {
      return new ByProjectKeyExtensionsPost(apiHttpClient, projectKey, extensionDraft);
   }
   
   public ByProjectKeyExtensionsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyExtensionsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyExtensionsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyExtensionsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
