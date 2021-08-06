
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;
    private final String id;

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importSinkKey, final String id) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.id = id;
    }

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdGet get() {
        return new ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(apiHttpClient,
            projectKey, importSinkKey, id);
    }

}
