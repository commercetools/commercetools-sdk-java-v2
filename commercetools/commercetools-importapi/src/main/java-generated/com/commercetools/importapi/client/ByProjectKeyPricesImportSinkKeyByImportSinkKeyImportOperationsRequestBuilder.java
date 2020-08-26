package com.commercetools.importapi.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;
    

    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet get() {
        return new ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet(apiHttpClient, projectKey, importSinkKey);
    }

    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder withIdValue(String id) {
        return new ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(apiHttpClient, projectKey, importSinkKey, id);
    }
}
