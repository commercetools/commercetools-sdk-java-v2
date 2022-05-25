
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet get() {
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet(apiHttpClient, projectKey,
            importSinkKey);
    }

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder withIdValue(String id) {
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(apiHttpClient,
            projectKey, importSinkKey, id);
    }
}
