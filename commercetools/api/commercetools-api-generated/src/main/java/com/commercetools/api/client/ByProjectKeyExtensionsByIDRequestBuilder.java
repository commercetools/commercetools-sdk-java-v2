package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyExtensionsByIDRequestBuilder {

   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;


   public ByProjectKeyExtensionsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }

   public ByProjectKeyExtensionsByIDGet get() {
      return new ByProjectKeyExtensionsByIDGet(apiHttpClient, projectKey, ID);
   }

   public ByProjectKeyExtensionsByIDPost post(com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate) {
      return new ByProjectKeyExtensionsByIDPost(apiHttpClient, projectKey, ID, extensionUpdate);
   }

   public ByProjectKeyExtensionsByIDDelete delete() {
      return new ByProjectKeyExtensionsByIDDelete(apiHttpClient, projectKey, ID);
   }

}
