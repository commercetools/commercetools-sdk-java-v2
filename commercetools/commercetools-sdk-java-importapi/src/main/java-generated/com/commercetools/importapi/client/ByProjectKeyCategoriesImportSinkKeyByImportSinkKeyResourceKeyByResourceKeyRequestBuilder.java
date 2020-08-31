package com.commercetools.importapi.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;
    private final String resourceKey;
    

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importSinkKey,final String resourceKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.resourceKey = resourceKey;
    }

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete delete() {
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete(apiHttpClient, projectKey, importSinkKey, resourceKey);
    }

}
