
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest productVariantPatchRequest) {
        return new ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, productVariantPatchRequest);
    }

}
