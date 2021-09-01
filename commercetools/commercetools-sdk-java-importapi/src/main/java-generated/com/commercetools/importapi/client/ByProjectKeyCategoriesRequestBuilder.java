
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCategoriesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCategoriesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCategoriesImportContainersRequestBuilder importContainers() {
        return new ByProjectKeyCategoriesImportContainersRequestBuilder(apiHttpClient, projectKey);
    }

    @Deprecated
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyRequestBuilder importSinkKeyWithImportSinkKeyValue(
            String importSinkKey) {
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyRequestBuilder(apiHttpClient, projectKey,
            importSinkKey);
    }
}
