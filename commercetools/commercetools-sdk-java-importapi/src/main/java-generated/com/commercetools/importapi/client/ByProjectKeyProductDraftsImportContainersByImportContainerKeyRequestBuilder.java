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
public class ByProjectKeyProductDraftsImportContainersByImportContainerKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;
    

    public ByProjectKeyProductDraftsImportContainersByImportContainerKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost post(com.commercetools.importapi.models.importrequests.ProductDraftImportRequest productDraftImportRequest) {
        return new ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost(apiHttpClient, projectKey, importContainerKey, productDraftImportRequest);
    }
    
    
    public ByProjectKeyProductDraftsImportContainersByImportContainerKeyPostString post(final String productDraftImportRequest) {
        return new ByProjectKeyProductDraftsImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey, importContainerKey, productDraftImportRequest);
    }
    public ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost post(UnaryOperator<com.commercetools.importapi.models.importrequests.ProductDraftImportRequestBuilder> op) {
        return post(op.apply(com.commercetools.importapi.models.importrequests.ProductDraftImportRequestBuilder.of()).build());
    }

    
}
