
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;
    private final String id;

    public ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importSinkKey, final String id) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.id = id;
    }

    public ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdGet get() {
        return new ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdGet(apiHttpClient, projectKey,
            importSinkKey, id);
    }

}
