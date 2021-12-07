
package com.commercetools.api.models.inventory;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InventoryEntryChangeQuantityActionBuilder implements Builder<InventoryEntryChangeQuantityAction> {

    private Long quantity;

    public InventoryEntryChangeQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public InventoryEntryChangeQuantityAction build() {
        Objects.requireNonNull(quantity, InventoryEntryChangeQuantityAction.class + ": quantity is missing");
        return new InventoryEntryChangeQuantityActionImpl(quantity);
    }

    /**
     * builds InventoryEntryChangeQuantityAction without checking for non null required values
     */
    public InventoryEntryChangeQuantityAction buildUnchecked() {
        return new InventoryEntryChangeQuantityActionImpl(quantity);
    }

    public static InventoryEntryChangeQuantityActionBuilder of() {
        return new InventoryEntryChangeQuantityActionBuilder();
    }

    public static InventoryEntryChangeQuantityActionBuilder of(final InventoryEntryChangeQuantityAction template) {
        InventoryEntryChangeQuantityActionBuilder builder = new InventoryEntryChangeQuantityActionBuilder();
        builder.quantity = template.getQuantity();
        return builder;
    }

}