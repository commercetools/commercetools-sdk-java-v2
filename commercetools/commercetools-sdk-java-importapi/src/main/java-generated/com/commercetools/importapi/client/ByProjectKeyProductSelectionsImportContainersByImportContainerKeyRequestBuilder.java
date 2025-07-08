
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductSelectionsImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyProductSelectionsImportContainersByImportContainerKeyRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.ProductSelectionImportRequest productSelectionImportRequest) {
        return new ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, productSelectionImportRequest);
    }

    public ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPostString post(
            final String productSelectionImportRequest) {
        return new ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPostString(apiHttpClient,
            projectKey, importContainerKey, productSelectionImportRequest);
    }

    public ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.ProductSelectionImportRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.importapi.models.importrequests.ProductSelectionImportRequestBuilder.of())
                    .build());
    }

}
