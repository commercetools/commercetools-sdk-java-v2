package com.commercetools.importer.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyPricesImportSinkKeyByImportSinkKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String importSinkKey;
   
   
   public ByProjectKeyPricesImportSinkKeyByImportSinkKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importSinkKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.importSinkKey = importSinkKey;
   }
   
   public ByProjectKeyPricesImportSinkKeyByImportSinkKeyPost post(com.commercetools.importer.models.importrequests.PriceImportRequest priceImportRequest) {
      return new ByProjectKeyPricesImportSinkKeyByImportSinkKeyPost(apiHttpClient, projectKey, importSinkKey, priceImportRequest);
   }
   
   public ByProjectKeyPricesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyRequestBuilder resourceKeyWithResourceKeyValue(String resourceKey) {
      return new ByProjectKeyPricesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyRequestBuilder(apiHttpClient, projectKey, importSinkKey, resourceKey);
   }
   public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder importOperations() {
      return new ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(apiHttpClient, projectKey, importSinkKey);
   }
}
