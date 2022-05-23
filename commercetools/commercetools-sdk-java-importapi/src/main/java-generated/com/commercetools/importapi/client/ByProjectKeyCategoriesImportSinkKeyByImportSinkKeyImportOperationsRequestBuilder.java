
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet get() {
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet(apiHttpClient, projectKey,
            importSinkKey);
    }

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder withIdValue(String id) {
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(apiHttpClient,
            projectKey, importSinkKey, id);
    }
}
