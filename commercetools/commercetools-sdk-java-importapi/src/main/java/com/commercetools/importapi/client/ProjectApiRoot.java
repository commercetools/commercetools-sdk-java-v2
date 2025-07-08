
package com.commercetools.importapi.client;

import java.io.Closeable;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.SerializerOnlyApiHttpClient;

public class ProjectApiRoot implements Closeable, ProjectScopedApiRoot {
    private final String projectKey;
    private final ApiHttpClient apiHttpClient;

    private ProjectApiRoot(final String projectKey, final ApiHttpClient apiHttpClient) {
        this.projectKey = projectKey;
        this.apiHttpClient = apiHttpClient;
    }

    public static ProjectApiRoot of(final String projectKey) {
        return new ProjectApiRoot(projectKey, SerializerOnlyApiHttpClient.of());
    }

    public static ProjectApiRoot fromClient(final String projectKey, final ApiHttpClient apiHttpClient) {
        return new ProjectApiRoot(projectKey, apiHttpClient);
    }

    @Override
    public ByProjectKeyRequestBuilder with() {
        return ApiRoot.fromClient(apiHttpClient).withProjectKeyValue(projectKey);
    }

    public ByProjectKeyRequestBuilder withProjectKey(final String projectKey) {
        return ApiRoot.fromClient(apiHttpClient).withProjectKeyValue(projectKey);
    }

    @Override
    public ByProjectKeyImportContainersRequestBuilder importContainers() {
        return with().importContainers();
    }

    @Override
    public ByProjectKeyImportOperationsRequestBuilder importOperations() {
        return with().importOperations();
    }

    @Override
    public ByProjectKeyCategoriesRequestBuilder categories() {
        return with().categories();
    }

    @Override
    public ByProjectKeyPricesRequestBuilder prices() {
        return with().prices();
    }

    @Override
    public ByProjectKeyProductsRequestBuilder products() {
        return with().products();
    }

    @Override
    public ByProjectKeyProductDraftsRequestBuilder productDrafts() {
        return with().productDrafts();
    }

    @Override
    public ByProjectKeyProductTypesRequestBuilder productTypes() {
        return with().productTypes();
    }

    @Override
    public ByProjectKeyProductVariantsRequestBuilder productVariants() {
        return with().productVariants();
    }

    @Override
    public ByProjectKeyProductVariantPatchesRequestBuilder productVariantPatches() {
        return with().productVariantPatches();
    }

    @Override
    public ByProjectKeyOrdersRequestBuilder orders() {
        return with().orders();
    }

    @Override
    public ByProjectKeyOrderPatchesRequestBuilder orderPatches() {
        return with().orderPatches();
    }

    @Override
    public ByProjectKeyCustomersRequestBuilder customers() {
        return with().customers();
    }

    @Override
    public ByProjectKeyStandalonePricesRequestBuilder standalonePrices() {
        return with().standalonePrices();
    }

    @Override
    public ByProjectKeyInventoriesRequestBuilder inventories() {
        return with().inventories();
    }

    @Override
    public ByProjectKeyTypesRequestBuilder types() {
        return with().types();
    }

    @Override
    public ByProjectKeyDiscountCodesRequestBuilder discountCodes() {
        return with().discountCodes();
    }

    @Override
    public ByProjectKeyProductSelectionsRequestBuilder productSelections() {
        return with().productSelections();
    }

    @Override
    public void close() {
        if (apiHttpClient == null) {
            return;
        }
        try {
            apiHttpClient.close();
        }
        catch (final Throwable ignored) {
        }
    }
}
