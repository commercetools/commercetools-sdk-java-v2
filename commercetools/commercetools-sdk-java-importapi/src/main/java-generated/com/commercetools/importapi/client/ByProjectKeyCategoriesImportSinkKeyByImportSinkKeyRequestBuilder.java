
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyPost post(
            com.commercetools.importapi.models.importrequests.CategoryImportRequest categoryImportRequest) {
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyPost(apiHttpClient, projectKey, importSinkKey,
            categoryImportRequest);
    }

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder importOperations() {
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(apiHttpClient,
            projectKey, importSinkKey);
    }
}
