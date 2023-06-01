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
public class ByProjectKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }


    
    public ByProjectKeyImportContainersRequestBuilder importContainers() {
        return new ByProjectKeyImportContainersRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyImportOperationsRequestBuilder importOperations() {
        return new ByProjectKeyImportOperationsRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyCategoriesRequestBuilder categories() {
        return new ByProjectKeyCategoriesRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyPricesRequestBuilder prices() {
        return new ByProjectKeyPricesRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyStandalonePricesRequestBuilder standalonePrices() {
        return new ByProjectKeyStandalonePricesRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyProductsRequestBuilder products() {
        return new ByProjectKeyProductsRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyProductDraftsRequestBuilder productDrafts() {
        return new ByProjectKeyProductDraftsRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyProductTypesRequestBuilder productTypes() {
        return new ByProjectKeyProductTypesRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyProductVariantsRequestBuilder productVariants() {
        return new ByProjectKeyProductVariantsRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyProductVariantPatchesRequestBuilder productVariantPatches() {
        return new ByProjectKeyProductVariantPatchesRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyOrdersRequestBuilder orders() {
        return new ByProjectKeyOrdersRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyOrderPatchesRequestBuilder orderPatches() {
        return new ByProjectKeyOrderPatchesRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyCustomersRequestBuilder customers() {
        return new ByProjectKeyCustomersRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyInventoriesRequestBuilder inventories() {
        return new ByProjectKeyInventoriesRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyTypesRequestBuilder types() {
        return new ByProjectKeyTypesRequestBuilder(apiHttpClient, projectKey);
    }
    
}
