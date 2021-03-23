
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryQuantitySetMessagePayloadImpl implements InventoryEntryQuantitySetMessagePayload {

    private String type;

    private Long oldQuantityOnStock;

    private Long newQuantityOnStock;

    private Long oldAvailableQuantity;

    private Long newAvailableQuantity;

    @JsonCreator
    InventoryEntryQuantitySetMessagePayloadImpl(@JsonProperty("oldQuantityOnStock") final Long oldQuantityOnStock,
            @JsonProperty("newQuantityOnStock") final Long newQuantityOnStock,
            @JsonProperty("oldAvailableQuantity") final Long oldAvailableQuantity,
            @JsonProperty("newAvailableQuantity") final Long newAvailableQuantity) {
        this.oldQuantityOnStock = oldQuantityOnStock;
        this.newQuantityOnStock = newQuantityOnStock;
        this.oldAvailableQuantity = oldAvailableQuantity;
        this.newAvailableQuantity = newAvailableQuantity;
        this.type = INVENTORY_ENTRY_QUANTITY_SET;
    }

    public InventoryEntryQuantitySetMessagePayloadImpl() {
        this.type = INVENTORY_ENTRY_QUANTITY_SET;
    }

    public String getType() {
        return this.type;
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

    public void setOldQuantityOnStock(final Long oldQuantityOnStock) {
        this.oldQuantityOnStock = oldQuantityOnStock;
    }

    public void setNewQuantityOnStock(final Long newQuantityOnStock) {
        this.newQuantityOnStock = newQuantityOnStock;
    }

    public void setOldAvailableQuantity(final Long oldAvailableQuantity) {
        this.oldAvailableQuantity = oldAvailableQuantity;
    }

    public void setNewAvailableQuantity(final Long newAvailableQuantity) {
        this.newAvailableQuantity = newAvailableQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryQuantitySetMessagePayloadImpl that = (InventoryEntryQuantitySetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(oldQuantityOnStock, that.oldQuantityOnStock)
                .append(newQuantityOnStock, that.newQuantityOnStock)
                .append(oldAvailableQuantity, that.oldAvailableQuantity)
                .append(newAvailableQuantity, that.newAvailableQuantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(oldQuantityOnStock)
                .append(newQuantityOnStock)
                .append(oldAvailableQuantity)
                .append(newAvailableQuantity)
                .toHashCode();
    }

}
