
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyImportOperationsGet get() {
        return new ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyImportOperationsGet(apiHttpClient, projectKey,
            importSinkKey);
    }

    public ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder withIdValue(
            String id) {
        return new ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(
            apiHttpClient, projectKey, importSinkKey, id);
    }
}
