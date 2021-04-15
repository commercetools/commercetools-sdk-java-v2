
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryCreatedMessagePayloadBuilder {

    private com.commercetools.api.models.inventory.InventoryEntry inventoryEntry;

    public InventoryEntryCreatedMessagePayloadBuilder inventoryEntry(
            final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
        return this;
    }

    public com.commercetools.api.models.inventory.InventoryEntry getInventoryEntry() {
        return this.inventoryEntry;
    }

    public InventoryEntryCreatedMessagePayload build() {
        return new InventoryEntryCreatedMessagePayloadImpl(inventoryEntry);
    }

    public static InventoryEntryCreatedMessagePayloadBuilder of() {
        return new InventoryEntryCreatedMessagePayloadBuilder();
    }

    public static InventoryEntryCreatedMessagePayloadBuilder of(final InventoryEntryCreatedMessagePayload template) {
        InventoryEntryCreatedMessagePayloadBuilder builder = new InventoryEntryCreatedMessagePayloadBuilder();
        builder.inventoryEntry = template.getInventoryEntry();
        return builder;
    }

}
