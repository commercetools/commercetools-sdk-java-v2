
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyDiscountCodesImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyDiscountCodesImportContainersByImportContainerKeyRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyDiscountCodesImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.DiscountCodeImportRequest discountCodeImportRequest) {
        return new ByProjectKeyDiscountCodesImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, discountCodeImportRequest);
    }

    public ByProjectKeyDiscountCodesImportContainersByImportContainerKeyPostString post(
            final String discountCodeImportRequest) {
        return new ByProjectKeyDiscountCodesImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey,
            importContainerKey, discountCodeImportRequest);
    }

    public ByProjectKeyDiscountCodesImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.DiscountCodeImportRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.importapi.models.importrequests.DiscountCodeImportRequestBuilder.of()).build());
    }

}
