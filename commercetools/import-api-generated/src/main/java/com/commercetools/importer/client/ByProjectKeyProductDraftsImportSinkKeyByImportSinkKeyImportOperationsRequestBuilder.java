package com.commercetools.importer.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String importSinkKey;
   
   
   public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importSinkKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.importSinkKey = importSinkKey;
   }
   
   public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet get() {
      return new ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet(apiHttpClient, projectKey, importSinkKey);
   }
   
   public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder withIdValue(String id) {
      return new ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(apiHttpClient, projectKey, importSinkKey, id);
   }
}
