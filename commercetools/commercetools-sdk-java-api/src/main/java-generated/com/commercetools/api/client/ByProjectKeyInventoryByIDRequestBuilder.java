
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInventoryByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyInventoryByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyInventoryByIDGet get() {
        return new ByProjectKeyInventoryByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyInventoryByIDPost post(
            com.commercetools.api.models.inventory.InventoryEntryUpdate inventoryEntryUpdate) {
        return new ByProjectKeyInventoryByIDPost(apiHttpClient, projectKey, ID, inventoryEntryUpdate);
    }

    public ByProjectKeyInventoryByIDPost post(
            UnaryOperator<com.commercetools.api.models.inventory.InventoryEntryUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.inventory.InventoryEntryUpdateBuilder.of()).build());
    }

    public ByProjectKeyInventoryByIDDelete delete() {
        return new ByProjectKeyInventoryByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyInventoryByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
