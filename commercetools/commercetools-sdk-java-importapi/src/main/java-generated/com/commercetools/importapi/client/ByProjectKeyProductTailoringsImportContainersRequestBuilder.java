
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTailoringsImportContainersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductTailoringsImportContainersRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductTailoringsImportContainersByImportContainerKeyRequestBuilder withImportContainerKeyValue(
            String importContainerKey) {
        return new ByProjectKeyProductTailoringsImportContainersByImportContainerKeyRequestBuilder(apiHttpClient,
            projectKey, importContainerKey);
    }

}
