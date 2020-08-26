package com.commercetools.importapi.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyImportSummariesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyImportSummariesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }


    public ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyRequestBuilder importSinkKeyWithImportSinkKeyValue(String importSinkKey) {
        return new ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyRequestBuilder(apiHttpClient, projectKey, importSinkKey);
    }
}
