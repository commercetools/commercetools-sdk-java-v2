package com.commercetools.api.ml.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMissingDataAttributesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMissingDataAttributesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMissingDataAttributesPost post(com.commercetools.api.ml.generated.models.missing_data.MissingAttributesSearchRequest missingAttributesSearchRequest) {
      return new ByProjectKeyMissingDataAttributesPost(apiHttpClient, projectKey, missingAttributesSearchRequest);
   }
   
   public ByProjectKeyMissingDataAttributesStatusRequestBuilder status() {
      return new ByProjectKeyMissingDataAttributesStatusRequestBuilder(apiHttpClient, projectKey);
   }
}
