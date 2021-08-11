
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryQuantitySetMessagePayloadBuilder
        implements Builder<InventoryEntryQuantitySetMessagePayload> {

    private Long oldQuantityOnStock;

    private Long newQuantityOnStock;

    private Long oldAvailableQuantity;

    private Long newAvailableQuantity;

    public InventoryEntryQuantitySetMessagePayloadBuilder oldQuantityOnStock(final Long oldQuantityOnStock) {
        this.oldQuantityOnStock = oldQuantityOnStock;
        return this;
    }

    public InventoryEntryQuantitySetMessagePayloadBuilder newQuantityOnStock(final Long newQuantityOnStock) {
        this.newQuantityOnStock = newQuantityOnStock;
        return this;
    }

    public InventoryEntryQuantitySetMessagePayloadBuilder oldAvailableQuantity(final Long oldAvailableQuantity) {
        this.oldAvailableQuantity = oldAvailableQuantity;
        return this;
    }

    public InventoryEntryQuantitySetMessagePayloadBuilder newAvailableQuantity(final Long newAvailableQuantity) {
        this.newAvailableQuantity = newAvailableQuantity;
        return this;
    }

    public Long getOldQuantityOnStock() {
        return this.oldQuantityOnStock;
    }

    public Long getNewQuantityOnStock() {
        return this.newQuantityOnStock;
    }

    public Long getOldAvailableQuantity() {
        return this.oldAvailableQuantity;
    }

    public Long getNewAvailableQuantity() {
        return this.newAvailableQuantity;
    }

    public InventoryEntryQuantitySetMessagePayload build() {
        Objects.requireNonNull(oldQuantityOnStock,
            InventoryEntryQuantitySetMessagePayload.class + ": oldQuantityOnStock is missing");
        Objects.requireNonNull(newQuantityOnStock,
            InventoryEntryQuantitySetMessagePayload.class + ": newQuantityOnStock is missing");
        Objects.requireNonNull(oldAvailableQuantity,
            InventoryEntryQuantitySetMessagePayload.class + ": oldAvailableQuantity is missing");
        Objects.requireNonNull(newAvailableQuantity,
            InventoryEntryQuantitySetMessagePayload.class + ": newAvailableQuantity is missing");
        return new InventoryEntryQuantitySetMessagePayloadImpl(oldQuantityOnStock, newQuantityOnStock,
            oldAvailableQuantity, newAvailableQuantity);
    }

    /**
     * builds InventoryEntryQuantitySetMessagePayload without checking for non null required values
     */
    public InventoryEntryQuantitySetMessagePayload buildUnchecked() {
        return new InventoryEntryQuantitySetMessagePayloadImpl(oldQuantityOnStock, newQuantityOnStock,
            oldAvailableQuantity, newAvailableQuantity);
    }

    public static InventoryEntryQuantitySetMessagePayloadBuilder of() {
        return new InventoryEntryQuantitySetMessagePayloadBuilder();
    }

    public static InventoryEntryQuantitySetMessagePayloadBuilder of(
            final InventoryEntryQuantitySetMessagePayload template) {
        InventoryEntryQuantitySetMessagePayloadBuilder builder = new InventoryEntryQuantitySetMessagePayloadBuilder();
        builder.oldQuantityOnStock = template.getOldQuantityOnStock();
        builder.newQuantityOnStock = template.getNewQuantityOnStock();
        builder.oldAvailableQuantity = template.getOldAvailableQuantity();
        builder.newAvailableQuantity = template.getNewAvailableQuantity();
        return builder;
    }

}
