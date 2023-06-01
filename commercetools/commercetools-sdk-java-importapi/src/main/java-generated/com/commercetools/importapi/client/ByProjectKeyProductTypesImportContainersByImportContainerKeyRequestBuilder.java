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
public class ByProjectKeyProductTypesImportContainersByImportContainerKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;
    

    public ByProjectKeyProductTypesImportContainersByImportContainerKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyProductTypesImportContainersByImportContainerKeyPost post(com.commercetools.importapi.models.importrequests.ProductTypeImportRequest productTypeImportRequest) {
        return new ByProjectKeyProductTypesImportContainersByImportContainerKeyPost(apiHttpClient, projectKey, importContainerKey, productTypeImportRequest);
    }
    
    
    public ByProjectKeyProductTypesImportContainersByImportContainerKeyPostString post(final String productTypeImportRequest) {
        return new ByProjectKeyProductTypesImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey, importContainerKey, productTypeImportRequest);
    }
    public ByProjectKeyProductTypesImportContainersByImportContainerKeyPost post(UnaryOperator<com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder> op) {
        return post(op.apply(com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder.of()).build());
    }

    
}
