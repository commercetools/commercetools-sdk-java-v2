
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Updates <code>availableQuantity</code> based on the new <code>quantityOnStock</code> and amount of active reservations.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryChangeQuantityActionImpl implements InventoryEntryChangeQuantityAction, ModelBase {

    private String action;

    private Long quantity;

    @JsonCreator
    InventoryEntryChangeQuantityActionImpl(@JsonProperty("quantity") final Long quantity) {
        this.quantity = quantity;
        this.action = CHANGE_QUANTITY;
    }

    public InventoryEntryChangeQuantityActionImpl() {
        this.action = CHANGE_QUANTITY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set for <code>quantityOnStock</code>.</p>
     */

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

        InventoryEntryChangeQuantityActionImpl that = (InventoryEntryChangeQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(quantity, that.quantity).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(quantity).toHashCode();
    }

}
