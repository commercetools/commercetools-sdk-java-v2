
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyBusinessUnitsImportContainersByImportContainerKeyRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyBusinessUnitsImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.BusinessUnitImportRequest businessUnitImportRequest) {
        return new ByProjectKeyBusinessUnitsImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, businessUnitImportRequest);
    }

    public ByProjectKeyBusinessUnitsImportContainersByImportContainerKeyPostString post(
            final String businessUnitImportRequest) {
        return new ByProjectKeyBusinessUnitsImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey,
            importContainerKey, businessUnitImportRequest);
    }

    public ByProjectKeyBusinessUnitsImportContainersByImportContainerKeyPost post(
            UnaryOperator<com.commercetools.importapi.models.importrequests.BusinessUnitImportRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.importapi.models.importrequests.BusinessUnitImportRequestBuilder.of()).build());
    }

}
