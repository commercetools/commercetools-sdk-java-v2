
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStandalonePricesImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyStandalonePricesImportContainersByImportContainerKeyRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.StandalonePriceImportRequest standalonePriceImportRequest) {
        return new ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, standalonePriceImportRequest);
    }

    public ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.StandalonePriceImportRequestBuilder> op) {
        return post(op.apply(com.commercetools.importapi.models.importrequests.StandalonePriceImportRequestBuilder.of())
                .build());
    }

}
