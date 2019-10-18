package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomersEmailTokenByEmailTokenRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String emailToken;
   
   
   public ByProjectKeyCustomersEmailTokenByEmailTokenRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String emailToken) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.emailToken = emailToken;
   }
   
   public ByProjectKeyCustomersEmailTokenByEmailTokenGet get() {
      return new ByProjectKeyCustomersEmailTokenByEmailTokenGet(apiHttpClient, projectKey, emailToken);
   }
   
}
