
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsImportSinkKeyByImportSinkKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyProductsImportSinkKeyByImportSinkKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost post(
            com.commercetools.importapi.models.importrequests.ProductImportRequest productImportRequest) {
        return new ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost(apiHttpClient, projectKey, importSinkKey,
            productImportRequest);
    }

    public ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder importOperations() {
        return new ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(apiHttpClient,
            projectKey, importSinkKey);
    }
}
