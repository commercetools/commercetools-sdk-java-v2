
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.inventory.InventoryEntryDraft;
import com.commercetools.api.models.inventory.InventoryEntryDraftBuilder;
import com.commercetools.api.models.inventory.InventoryEntryUpdate;
import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.models.inventory.InventoryEntryUpdateActionBuilder;

public interface ByProjectKeyInventoryRequestBuilderMixin {
    public ByProjectKeyInventoryPost post(InventoryEntryDraft inventoryEntryDraft);

    public ByProjectKeyInventoryByIDRequestBuilder withId(String ID);

    public default ByProjectKeyInventoryByIDPost update(Versioned<InventoryEntry> inventoryEntry,
            List<InventoryEntryUpdateAction> actions) {
        return withId(inventoryEntry.getId())
                .post(builder -> InventoryEntryUpdate.builder().version(inventoryEntry.getVersion()).actions(actions));
    }

    public default ByProjectKeyInventoryByIDPost update(Versioned<InventoryEntry> inventoryEntry,
            UnaryOperator<UpdateActionBuilder<InventoryEntryUpdateAction, InventoryEntryUpdateActionBuilder>> op) {
        return withId(inventoryEntry.getId()).post(builder -> InventoryEntryUpdate.builder()
                .version(inventoryEntry.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(InventoryEntryUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<InventoryEntryUpdateAction, InventoryEntryUpdateActionBuilder, ByProjectKeyInventoryByIDPost> update(
            Versioned<InventoryEntry> inventoryEntry) {
        return builder -> withId(inventoryEntry.getId()).post(b -> InventoryEntryUpdate.builder()
                .version(inventoryEntry.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(InventoryEntryUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyInventoryByIDDelete delete(Versioned<InventoryEntry> inventoryEntry) {
        return withId(inventoryEntry.getId()).delete().withVersion(inventoryEntry.getVersion());
    }

    public default ByProjectKeyInventoryPost create(InventoryEntryDraft inventoryEntryDraft) {
        return post(inventoryEntryDraft);
    }

    public default ByProjectKeyInventoryPost create(UnaryOperator<InventoryEntryDraftBuilder> op) {
        return post(op.apply(InventoryEntryDraftBuilder.of()).build());
    }
}
