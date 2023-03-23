
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyCustomersImportContainersByImportContainerKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyCustomersImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.CustomerImportRequest customerImportRequest) {
        return new ByProjectKeyCustomersImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, customerImportRequest);
    }

    public ByProjectKeyCustomersImportContainersByImportContainerKeyPostString post(
            final String customerImportRequest) {
        return new ByProjectKeyCustomersImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey,
            importContainerKey, customerImportRequest);
    }

    public ByProjectKeyCustomersImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.CustomerImportRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.importapi.models.importrequests.CustomerImportRequestBuilder.of()).build());
    }

}
