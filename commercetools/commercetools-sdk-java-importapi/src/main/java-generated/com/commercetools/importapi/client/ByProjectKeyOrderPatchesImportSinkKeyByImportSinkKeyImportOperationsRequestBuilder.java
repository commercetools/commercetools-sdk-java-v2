
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet get() {
        return new ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsGet(apiHttpClient, projectKey,
            importSinkKey);
    }

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder withIdValue(
            String id) {
        return new ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(apiHttpClient,
            projectKey, importSinkKey, id);
    }
}
