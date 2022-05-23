
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;
    private final String id;

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importSinkKey, final String id) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.id = id;
    }

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsByIdGet get() {
        return new ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(apiHttpClient,
            projectKey, importSinkKey, id);
    }

}
