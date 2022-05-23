
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class ByProjectKeyOrdersImportSinkKeyByImportSinkKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyPost post(
            com.commercetools.importapi.models.importrequests.OrderImportRequest orderImportRequest) {
        return new ByProjectKeyOrdersImportSinkKeyByImportSinkKeyPost(apiHttpClient, projectKey, importSinkKey,
            orderImportRequest);
    }

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder importOperations() {
        return new ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(apiHttpClient,
            projectKey, importSinkKey);
    }
}
