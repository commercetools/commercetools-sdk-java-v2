
package com.commercetools.importapi.client;

public interface ProjectScopedApiRoot {
    ByProjectKeyRequestBuilder with();

    ByProjectKeyImportContainersRequestBuilder importContainers();

    ByProjectKeyImportOperationsRequestBuilder importOperations();

    ByProjectKeyCategoriesRequestBuilder categories();

    ByProjectKeyPricesRequestBuilder prices();

    ByProjectKeyProductsRequestBuilder products();

    ByProjectKeyProductDraftsRequestBuilder productDrafts();

    ByProjectKeyProductTypesRequestBuilder productTypes();

    ByProjectKeyProductVariantsRequestBuilder productVariants();

    ByProjectKeyProductVariantPatchesRequestBuilder productVariantPatches();

    ByProjectKeyOrdersRequestBuilder orders();

    ByProjectKeyOrderPatchesRequestBuilder orderPatches();

    ByProjectKeyCustomersRequestBuilder customers();

    ByProjectKeyStandalonePricesRequestBuilder standalonePrices();

    ByProjectKeyInventoriesRequestBuilder inventories();

    ByProjectKeyTypesRequestBuilder types();
}
