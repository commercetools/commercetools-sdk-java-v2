package com.commercetools.importer.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;
    

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet get() {
        return new ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet(apiHttpClient, projectKey, importSinkKey);
    }

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder withIdValue(String id) {
        return new ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(apiHttpClient, projectKey, importSinkKey, id);
    }
}
