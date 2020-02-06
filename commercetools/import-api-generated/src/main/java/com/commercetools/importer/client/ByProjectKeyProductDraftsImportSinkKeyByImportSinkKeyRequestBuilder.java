package com.commercetools.importer.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String importSinkKey;
   
   
   public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importSinkKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.importSinkKey = importSinkKey;
   }
   
   public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyPost post(com.commercetools.importer.models.importrequests.ProductDraftImportRequest productDraftImportRequest) {
      return new ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyPost(apiHttpClient, projectKey, importSinkKey, productDraftImportRequest);
   }
   
   public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyRequestBuilder resourceKeyWithResourceKeyValue(String resourceKey) {
      return new ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyRequestBuilder(apiHttpClient, projectKey, importSinkKey, resourceKey);
   }
   public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder importOperations() {
      return new ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(apiHttpClient, projectKey, importSinkKey);
   }
}
