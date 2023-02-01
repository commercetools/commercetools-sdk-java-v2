
package com.commercetools.api.models.inventory;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface InventoryEntryMixin extends Referencable<InventoryEntry>, ResourceIdentifiable<InventoryEntry> {
    @Override
    public default InventoryEntryResourceIdentifier toResourceIdentifier() {
        return InventoryEntryResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default InventoryEntryReference toReference() {
        return InventoryEntryReference.builder().id(getId()).build();
    }
}
