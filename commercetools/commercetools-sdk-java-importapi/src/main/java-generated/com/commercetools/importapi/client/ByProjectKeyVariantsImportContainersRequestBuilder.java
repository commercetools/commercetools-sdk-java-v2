
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsImportContainersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyVariantsImportContainersRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyVariantsImportContainersByImportContainerKeyRequestBuilder withImportContainerKeyValue(
            String importContainerKey) {
        return new ByProjectKeyVariantsImportContainersByImportContainerKeyRequestBuilder(apiHttpClient, projectKey,
            importContainerKey);
    }

}
