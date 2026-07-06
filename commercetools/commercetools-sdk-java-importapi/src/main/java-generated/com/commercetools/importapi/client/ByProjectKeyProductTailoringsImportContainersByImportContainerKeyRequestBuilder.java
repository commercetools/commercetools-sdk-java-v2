
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTailoringsImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyProductTailoringsImportContainersByImportContainerKeyRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyProductTailoringsImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.ProductTailoringImportRequest productTailoringImportRequest) {
        return new ByProjectKeyProductTailoringsImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, productTailoringImportRequest);
    }

    public ByProjectKeyProductTailoringsImportContainersByImportContainerKeyPostString post(
            final String productTailoringImportRequest) {
        return new ByProjectKeyProductTailoringsImportContainersByImportContainerKeyPostString(apiHttpClient,
            projectKey, importContainerKey, productTailoringImportRequest);
    }

    public ByProjectKeyProductTailoringsImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.ProductTailoringImportRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.importapi.models.importrequests.ProductTailoringImportRequestBuilder.of())
                    .build());
    }

}
