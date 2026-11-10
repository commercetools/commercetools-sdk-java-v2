
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyVariantsImportContainersByImportContainerKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyVariantsImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.VariantImportRequest variantImportRequest) {
        return new ByProjectKeyVariantsImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, variantImportRequest);
    }

    public ByProjectKeyVariantsImportContainersByImportContainerKeyPostString post(final String variantImportRequest) {
        return new ByProjectKeyVariantsImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey,
            importContainerKey, variantImportRequest);
    }

    public ByProjectKeyVariantsImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.VariantImportRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.importapi.models.importrequests.VariantImportRequestBuilder.of()).build());
    }

}
