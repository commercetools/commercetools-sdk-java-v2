
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Updates <code>availableQuantity</code> based on the new <code>quantityOnStock</code> and amount of active reservations.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryRemoveQuantityActionImpl implements InventoryEntryRemoveQuantityAction, ModelBase {

    private String action;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntryRemoveQuantityActionImpl(@JsonProperty("quantity") final Long quantity) {
        this.quantity = quantity;
        this.action = REMOVE_QUANTITY;
    }

    /**
     * create empty instance
     */
    public InventoryEntryRemoveQuantityActionImpl() {
        this.action = REMOVE_QUANTITY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to remove from <code>quantityOnStock</code>.</p>
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

        InventoryEntryRemoveQuantityActionImpl that = (InventoryEntryRemoveQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(quantity, that.quantity)
                .append(action, that.action)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(quantity).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("quantity", quantity)
                .build();
    }

    @Override
    public InventoryEntryRemoveQuantityAction copyDeep() {
        return InventoryEntryRemoveQuantityAction.deepCopy(this);
    }
}
