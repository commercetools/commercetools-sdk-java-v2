
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInventoryKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyInventoryKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyInventoryKeyByKeyGet get() {
        return new ByProjectKeyInventoryKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyInventoryKeyByKeyPost post(
            com.commercetools.api.models.inventory.InventoryEntryUpdate inventoryEntryUpdate) {
        return new ByProjectKeyInventoryKeyByKeyPost(apiHttpClient, projectKey, key, inventoryEntryUpdate);
    }

    public ByProjectKeyInventoryKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.inventory.InventoryEntryUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.inventory.InventoryEntryUpdateBuilder.of()).build());
    }

    public ByProjectKeyInventoryKeyByKeyDelete delete() {
        return new ByProjectKeyInventoryKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyInventoryKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
