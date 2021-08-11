
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryQuantityValueBuilder implements Builder<InventoryQuantityValue> {

    private Integer quantityOnStock;

    private Integer availableQuantity;

    public InventoryQuantityValueBuilder quantityOnStock(final Integer quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }

    public InventoryQuantityValueBuilder availableQuantity(final Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    public Integer getQuantityOnStock() {
        return this.quantityOnStock;
    }

    public Integer getAvailableQuantity() {
        return this.availableQuantity;
    }

    public InventoryQuantityValue build() {
        Objects.requireNonNull(quantityOnStock, InventoryQuantityValue.class + ": quantityOnStock is missing");
        Objects.requireNonNull(availableQuantity, InventoryQuantityValue.class + ": availableQuantity is missing");
        return new InventoryQuantityValueImpl(quantityOnStock, availableQuantity);
    }

    /**
     * builds InventoryQuantityValue without checking for non null required values
     */
    public InventoryQuantityValue buildUnchecked() {
        return new InventoryQuantityValueImpl(quantityOnStock, availableQuantity);
    }

    public static InventoryQuantityValueBuilder of() {
        return new InventoryQuantityValueBuilder();
    }

    public static InventoryQuantityValueBuilder of(final InventoryQuantityValue template) {
        InventoryQuantityValueBuilder builder = new InventoryQuantityValueBuilder();
        builder.quantityOnStock = template.getQuantityOnStock();
        builder.availableQuantity = template.getAvailableQuantity();
        return builder;
    }

}
