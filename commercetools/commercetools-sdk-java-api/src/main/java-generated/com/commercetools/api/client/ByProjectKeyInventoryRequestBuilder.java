
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInventoryRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyInventoryRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyInventoryGet get() {
        return new ByProjectKeyInventoryGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyInventoryPost post(
            com.commercetools.api.models.inventory.InventoryEntryDraft inventoryEntryDraft) {
        return new ByProjectKeyInventoryPost(apiHttpClient, projectKey, inventoryEntryDraft);
    }

    public ByProjectKeyInventoryByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInventoryByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyInventoryKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInventoryKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
}
