package com.commercetools.importer.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductVariantPatchesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyProductVariantPatchesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }


    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyRequestBuilder importSinkKeyWithImportSinkKeyValue(String importSinkKey) {
        return new ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyRequestBuilder(apiHttpClient, projectKey, importSinkKey);
    }
}
