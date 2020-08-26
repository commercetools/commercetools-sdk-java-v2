package com.commercetools.ml.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMissingDataRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMissingDataRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   
   public ByProjectKeyMissingDataAttributesRequestBuilder attributes() {
      return new ByProjectKeyMissingDataAttributesRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMissingDataImagesRequestBuilder images() {
      return new ByProjectKeyMissingDataImagesRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMissingDataPricesRequestBuilder prices() {
      return new ByProjectKeyMissingDataPricesRequestBuilder(apiHttpClient, projectKey);
   }
}
