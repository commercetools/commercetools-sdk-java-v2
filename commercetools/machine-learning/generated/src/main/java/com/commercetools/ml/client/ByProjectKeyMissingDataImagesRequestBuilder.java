package com.commercetools.ml.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMissingDataImagesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMissingDataImagesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMissingDataImagesPost post(com.commercetools.ml.models.missing_data.MissingImagesSearchRequest missingImagesSearchRequest) {
      return new ByProjectKeyMissingDataImagesPost(apiHttpClient, projectKey, missingImagesSearchRequest);
   }
   
   public ByProjectKeyMissingDataImagesStatusRequestBuilder status() {
      return new ByProjectKeyMissingDataImagesStatusRequestBuilder(apiHttpClient, projectKey);
   }
}
