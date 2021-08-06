
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyPost post(
            com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest productVariantPatchRequest) {
        return new ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyPost(apiHttpClient, projectKey,
            importSinkKey, productVariantPatchRequest);
    }

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder importOperations() {
        return new ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(
            apiHttpClient, projectKey, importSinkKey);
    }
}
