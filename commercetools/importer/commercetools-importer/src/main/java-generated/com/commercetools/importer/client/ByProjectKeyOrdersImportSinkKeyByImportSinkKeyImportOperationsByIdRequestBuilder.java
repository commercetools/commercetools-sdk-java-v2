package com.commercetools.importer.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;
    private final String id;
    

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importSinkKey,final String id) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.id = id;
    }

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdGet get() {
        return new ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdGet(apiHttpClient, projectKey, importSinkKey, id);
    }

}
