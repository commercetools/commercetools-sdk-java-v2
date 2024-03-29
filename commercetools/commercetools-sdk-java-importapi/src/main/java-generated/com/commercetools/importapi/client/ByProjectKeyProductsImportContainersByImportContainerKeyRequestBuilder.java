
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductsImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyProductsImportContainersByImportContainerKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyProductsImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.ProductImportRequest productImportRequest) {
        return new ByProjectKeyProductsImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, productImportRequest);
    }

    public ByProjectKeyProductsImportContainersByImportContainerKeyPostString post(final String productImportRequest) {
        return new ByProjectKeyProductsImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey,
            importContainerKey, productImportRequest);
    }

    public ByProjectKeyProductsImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.ProductImportRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.importapi.models.importrequests.ProductImportRequestBuilder.of()).build());
    }

}
