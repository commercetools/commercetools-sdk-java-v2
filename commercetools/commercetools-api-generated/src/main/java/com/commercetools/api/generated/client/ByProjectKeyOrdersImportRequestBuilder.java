package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyOrdersImportRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyOrdersImportRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyOrdersImportPost post(com.commercetools.api.generated.models.order.OrderImportDraft orderImportDraft) {
      return new ByProjectKeyOrdersImportPost(apiHttpClient, projectKey, orderImportDraft);
   }
   
}
