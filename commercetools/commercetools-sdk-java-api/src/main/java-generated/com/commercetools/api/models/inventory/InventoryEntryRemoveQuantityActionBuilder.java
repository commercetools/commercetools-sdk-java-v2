
package com.commercetools.api.models.inventory;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryRemoveQuantityActionBuilder implements Builder<InventoryEntryRemoveQuantityAction> {

    private Long quantity;

    public InventoryEntryRemoveQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public InventoryEntryRemoveQuantityAction build() {
        Objects.requireNonNull(quantity, InventoryEntryRemoveQuantityAction.class + ": quantity is missing");
        return new InventoryEntryRemoveQuantityActionImpl(quantity);
    }

    /**
     * builds InventoryEntryRemoveQuantityAction without checking for non null required values
     */
    public InventoryEntryRemoveQuantityAction buildUnchecked() {
        return new InventoryEntryRemoveQuantityActionImpl(quantity);
    }

    public static InventoryEntryRemoveQuantityActionBuilder of() {
        return new InventoryEntryRemoveQuantityActionBuilder();
    }

    public static InventoryEntryRemoveQuantityActionBuilder of(final InventoryEntryRemoveQuantityAction template) {
        InventoryEntryRemoveQuantityActionBuilder builder = new InventoryEntryRemoveQuantityActionBuilder();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
