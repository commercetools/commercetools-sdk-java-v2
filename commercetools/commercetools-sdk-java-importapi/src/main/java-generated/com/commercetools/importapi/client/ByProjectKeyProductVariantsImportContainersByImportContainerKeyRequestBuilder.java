
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductVariantsImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyProductVariantsImportContainersByImportContainerKeyRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.ProductVariantImportRequest productVariantImportRequest) {
        return new ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, productVariantImportRequest);
    }

    public ByProjectKeyProductVariantsImportContainersByImportContainerKeyPostString post(
            final String productVariantImportRequest) {
        return new ByProjectKeyProductVariantsImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey,
            importContainerKey, productVariantImportRequest);
    }

    public ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.ProductVariantImportRequestBuilder> op) {
        return post(op.apply(com.commercetools.importapi.models.importrequests.ProductVariantImportRequestBuilder.of())
                .build());
    }

}
