
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCategoriesImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyCategoriesImportContainersByImportContainerKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyCategoriesImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.CategoryImportRequest categoryImportRequest) {
        return new ByProjectKeyCategoriesImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, categoryImportRequest);
    }

    public ByProjectKeyCategoriesImportContainersByImportContainerKeyPostString post(
            final String categoryImportRequest) {
        return new ByProjectKeyCategoriesImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey,
            importContainerKey, categoryImportRequest);
    }

    public ByProjectKeyCategoriesImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.CategoryImportRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.importapi.models.importrequests.CategoryImportRequestBuilder.of()).build());
    }

}
