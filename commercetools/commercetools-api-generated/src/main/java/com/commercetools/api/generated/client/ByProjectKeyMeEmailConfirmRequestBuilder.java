package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeEmailConfirmRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeEmailConfirmRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeEmailConfirmPost post() {
      return new ByProjectKeyMeEmailConfirmPost(apiHttpClient, projectKey);
   }
   
}
