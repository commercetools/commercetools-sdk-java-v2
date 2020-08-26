package com.commercetools.importapi.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;
    private final String id;
    

    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importSinkKey,final String id) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.id = id;
    }

    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet get() {
        return new ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(apiHttpClient, projectKey, importSinkKey, id);
    }

}
