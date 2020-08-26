package com.commercetools.importapi.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;


    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet get() {
        return new ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsGet(apiHttpClient, projectKey, importSinkKey);
    }

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder withIdValue(String id) {
        return new ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder(apiHttpClient, projectKey, importSinkKey, id);
    }
}
