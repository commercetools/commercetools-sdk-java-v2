
package com.commercetools.api.models.inventory;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryAddQuantityActionBuilder implements Builder<InventoryEntryAddQuantityAction> {

    private Long quantity;

    public InventoryEntryAddQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public InventoryEntryAddQuantityAction build() {
        Objects.requireNonNull(quantity, InventoryEntryAddQuantityAction.class + ": quantity is missing");
        return new InventoryEntryAddQuantityActionImpl(quantity);
    }

    /**
     * builds InventoryEntryAddQuantityAction without checking for non null required values
     */
    public InventoryEntryAddQuantityAction buildUnchecked() {
        return new InventoryEntryAddQuantityActionImpl(quantity);
    }

    public static InventoryEntryAddQuantityActionBuilder of() {
        return new InventoryEntryAddQuantityActionBuilder();
    }

    public static InventoryEntryAddQuantityActionBuilder of(final InventoryEntryAddQuantityAction template) {
        InventoryEntryAddQuantityActionBuilder builder = new InventoryEntryAddQuantityActionBuilder();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
