
package com.commercetools.api.models.inventory;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface InventoryEntryMixin extends Referencable<InventoryEntry>, ResourceIdentifiable<InventoryEntry> {
    @Override
    public default InventoryEntryResourceIdentifier toResourceIdentifier() {
        return InventoryEntryResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default InventoryEntryReference toReference() {
        return InventoryEntryReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.INVENTORY_ENTRY;
    }
}
