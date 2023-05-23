
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTypesImportContainersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyTypesImportContainersRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyTypesImportContainersByImportContainerKeyRequestBuilder withImportContainerKeyValue(
            String importContainerKey) {
        return new ByProjectKeyTypesImportContainersByImportContainerKeyRequestBuilder(apiHttpClient, projectKey,
            importContainerKey);
    }

}
