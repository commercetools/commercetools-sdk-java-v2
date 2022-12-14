
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    public ByProjectKeyInventoryPost post(
            UnaryOperator<com.commercetools.api.models.inventory.InventoryEntryDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.inventory.InventoryEntryDraftBuilder.of()).build());
    }

    public ByProjectKeyInventoryByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInventoryByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyInventoryKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInventoryKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyInventoryByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.inventory.InventoryEntry> inventoryEntry,
            java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions) {
        return withId(inventoryEntry.getId())
                .post(builder -> com.commercetools.api.models.inventory.InventoryEntryUpdate.builder()
                        .version(inventoryEntry.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyInventoryByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.inventory.InventoryEntry> inventoryEntry,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.inventory.InventoryEntryUpdateAction, com.commercetools.api.models.inventory.InventoryEntryUpdateActionBuilder>> op) {
        return withId(inventoryEntry.getId())
                .post(builder -> com.commercetools.api.models.inventory.InventoryEntryUpdate.builder()
                        .version(inventoryEntry.getVersion())
                        .actions(op.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.inventory.InventoryEntryUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.inventory.InventoryEntryUpdateAction, com.commercetools.api.models.inventory.InventoryEntryUpdateActionBuilder, ByProjectKeyInventoryByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.inventory.InventoryEntry> inventoryEntry) {
        return builder -> withId(inventoryEntry.getId())
                .post(b -> com.commercetools.api.models.inventory.InventoryEntryUpdate.builder()
                        .version(inventoryEntry.getVersion())
                        .actions(builder.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.inventory.InventoryEntryUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyInventoryByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.inventory.InventoryEntry> inventoryEntry) {
        return withId(inventoryEntry.getId()).delete().withVersion(inventoryEntry.getVersion());
    }

    public ByProjectKeyInventoryPost create(
            com.commercetools.api.models.inventory.InventoryEntryDraft inventoryEntryDraft) {
        return post(inventoryEntryDraft);
    }

    public ByProjectKeyInventoryPost create(
            UnaryOperator<com.commercetools.api.models.inventory.InventoryEntryDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.inventory.InventoryEntryDraftBuilder.of()).build());
    }

}
