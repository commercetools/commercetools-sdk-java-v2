
package com.commercetools.importapi.client;

import java.io.Closeable;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.SerializerOnlyApiHttpClient;

public class ProjectApiRoot implements Closeable {
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

    public ByProjectKeyRequestBuilder with() {
        return ApiRoot.fromClient(apiHttpClient).withProjectKeyValue(projectKey);
    }

    public ByProjectKeyRequestBuilder withProjectKey(final String projectKey) {
        return ApiRoot.fromClient(apiHttpClient).withProjectKeyValue(projectKey);
    }

    public ByProjectKeyImportContainersRequestBuilder importContainers() {
        return with().importContainers();
    }

    public ByProjectKeyImportOperationsRequestBuilder importOperations() {
        return with().importOperations();
    }

    public ByProjectKeyCategoriesRequestBuilder categories() {
        return with().categories();
    }

    public ByProjectKeyPricesRequestBuilder prices() {
        return with().prices();
    }

    public ByProjectKeyProductsRequestBuilder products() {
        return with().products();
    }

    public ByProjectKeyProductDraftsRequestBuilder productDrafts() {
        return with().productDrafts();
    }

    public ByProjectKeyProductTypesRequestBuilder productTypes() {
        return with().productTypes();
    }

    public ByProjectKeyProductVariantsRequestBuilder productVariants() {
        return with().productVariants();
    }

    public ByProjectKeyProductVariantPatchesRequestBuilder productVariantPatches() {
        return with().productVariantPatches();
    }

    public ByProjectKeyOrdersRequestBuilder orders() {
        return with().orders();
    }

    public ByProjectKeyOrderPatchesRequestBuilder orderPatches() {
        return with().orderPatches();
    }

    public ByProjectKeyCustomersRequestBuilder customers() {
        return with().customers();
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
