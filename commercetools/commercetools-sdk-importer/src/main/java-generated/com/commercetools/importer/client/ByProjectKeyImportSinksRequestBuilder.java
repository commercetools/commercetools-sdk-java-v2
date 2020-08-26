package com.commercetools.importer.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyImportSinksRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyImportSinksRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyImportSinksPost post(com.commercetools.importer.models.importsinks.ImportSinkDraft importSinkDraft) {
        return new ByProjectKeyImportSinksPost(apiHttpClient, projectKey, importSinkDraft);
    }
    
    public ByProjectKeyImportSinksGet get() {
        return new ByProjectKeyImportSinksGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyImportSinksByImportSinkKeyRequestBuilder withImportSinkKeyValue(String importSinkKey) {
        return new ByProjectKeyImportSinksByImportSinkKeyRequestBuilder(apiHttpClient, projectKey, importSinkKey);
    }
}
