
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPricesImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyPricesImportContainersByImportContainerKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyPricesImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.PriceImportRequest priceImportRequest) {
        return new ByProjectKeyPricesImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, priceImportRequest);
    }

    public ByProjectKeyPricesImportContainersByImportContainerKeyPostString post(final String priceImportRequest) {
        return new ByProjectKeyPricesImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey,
            importContainerKey, priceImportRequest);
    }

    public ByProjectKeyPricesImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.PriceImportRequestBuilder> op) {
        return post(op.apply(com.commercetools.importapi.models.importrequests.PriceImportRequestBuilder.of()).build());
    }

}
