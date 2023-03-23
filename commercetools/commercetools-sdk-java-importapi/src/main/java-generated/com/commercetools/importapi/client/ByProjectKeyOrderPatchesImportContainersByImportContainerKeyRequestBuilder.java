
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrderPatchesImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyOrderPatchesImportContainersByImportContainerKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.OrderPatchImportRequest orderPatchImportRequest) {
        return new ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, orderPatchImportRequest);
    }

    public ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPostString post(
            final String orderPatchImportRequest) {
        return new ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey,
            importContainerKey, orderPatchImportRequest);
    }

    public ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.OrderPatchImportRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.importapi.models.importrequests.OrderPatchImportRequestBuilder.of()).build());
    }

}
