
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryQuantityValueBuilder {

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
