
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost post(
            com.commercetools.importapi.models.importrequests.ProductTypeImportRequest productTypeImportRequest) {
        return new ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost(apiHttpClient, projectKey, importSinkKey,
            productTypeImportRequest);
    }

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder importOperations() {
        return new ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(apiHttpClient,
            projectKey, importSinkKey);
    }
}
