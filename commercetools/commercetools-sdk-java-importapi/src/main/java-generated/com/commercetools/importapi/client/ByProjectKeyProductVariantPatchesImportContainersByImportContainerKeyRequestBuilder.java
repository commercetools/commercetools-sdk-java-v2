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
public class ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;
    

    public ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost post(com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest productVariantPatchRequest) {
        return new ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost(apiHttpClient, projectKey, importContainerKey, productVariantPatchRequest);
    }
    
    
    public ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPostString post(final String productVariantPatchRequest) {
        return new ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPostString(apiHttpClient, projectKey, importContainerKey, productVariantPatchRequest);
    }
    public ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost post(UnaryOperator<com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder> op) {
        return post(op.apply(com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder.of()).build());
    }

    
}
