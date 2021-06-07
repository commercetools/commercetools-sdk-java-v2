
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrderPatchesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyOrderPatchesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyRequestBuilder importSinkKeyWithImportSinkKeyValue(
            String importSinkKey) {
        return new ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyRequestBuilder(apiHttpClient, projectKey,
            importSinkKey);
    }
}
