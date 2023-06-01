package com.commercetools.importapi.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyOrdersImportContainersByImportContainerKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;
    

    public ByProjectKeyOrdersImportContainersByImportContainerKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyOrdersImportContainersByImportContainerKeyPost post(com.commercetools.importapi.models.importrequests.OrderImportRequest orderImportRequest) {
        return new ByProjectKeyOrdersImportContainersByImportContainerKeyPost(apiHttpClient, projectKey, importContainerKey, orderImportRequest);
    }
    
    
    public ByProjectKeyOrdersImportContainersByImportContainerKeyPostString post(final String orderImportRequest) {
        return new ByProjectKeyOrdersImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey, importContainerKey, orderImportRequest);
    }
    public ByProjectKeyOrdersImportContainersByImportContainerKeyPost post(UnaryOperator<com.commercetools.importapi.models.importrequests.OrderImportRequestBuilder> op) {
        return post(op.apply(com.commercetools.importapi.models.importrequests.OrderImportRequestBuilder.of()).build());
    }

    
}
