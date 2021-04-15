
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryRemoveQuantityActionImpl implements InventoryEntryRemoveQuantityAction {

    private String action;

    private Long quantity;

    @JsonCreator
    InventoryEntryRemoveQuantityActionImpl(@JsonProperty("quantity") final Long quantity) {
        this.quantity = quantity;
        this.action = REMOVE_QUANTITY;
    }

    public InventoryEntryRemoveQuantityActionImpl() {
        this.action = REMOVE_QUANTITY;
    }

    public String getAction() {
        return this.action;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryRemoveQuantityActionImpl that = (InventoryEntryRemoveQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(quantity, that.quantity).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(quantity).toHashCode();
    }

}
