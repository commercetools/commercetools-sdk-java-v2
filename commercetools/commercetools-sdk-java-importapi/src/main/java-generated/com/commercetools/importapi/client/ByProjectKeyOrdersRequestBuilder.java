
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyOrdersRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyOrdersImportContainersRequestBuilder importContainers() {
        return new ByProjectKeyOrdersImportContainersRequestBuilder(apiHttpClient, projectKey);
    }

    @Deprecated
    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyRequestBuilder importSinkKeyWithImportSinkKeyValue(
            String importSinkKey) {
        return new ByProjectKeyOrdersImportSinkKeyByImportSinkKeyRequestBuilder(apiHttpClient, projectKey,
            importSinkKey);
    }
}
