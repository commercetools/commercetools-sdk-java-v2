
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public ByProjectKeyInventoryKeyByKeyDelete delete() {
        return new ByProjectKeyInventoryKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
