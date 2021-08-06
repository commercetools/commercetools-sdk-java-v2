
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost post(
            com.commercetools.importapi.models.importrequests.OrderPatchImportRequest orderPatchImportRequest) {
        return new ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost(apiHttpClient, projectKey, importSinkKey,
            orderPatchImportRequest);
    }

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder importOperations() {
        return new ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(apiHttpClient,
            projectKey, importSinkKey);
    }
}
