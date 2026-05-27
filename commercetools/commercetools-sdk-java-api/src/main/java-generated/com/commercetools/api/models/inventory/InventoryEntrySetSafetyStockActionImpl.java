
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
 *  <p>Sets the safety stock level for a specific InventoryEntry. When the stock reaches this level, a corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySafetyStockMessage" rel="nofollow">InventoryEntrySafetyStock</a> Message is generated.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetSafetyStockActionImpl implements InventoryEntrySetSafetyStockAction, ModelBase {

    private String action;

    private Integer quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntrySetSafetyStockActionImpl(@JsonProperty("quantity") final Integer quantity) {
        this.quantity = quantity;
        this.action = SET_SAFETY_STOCK;
    }

    /**
     * create empty instance
     */
    public InventoryEntrySetSafetyStockActionImpl() {
        this.action = SET_SAFETY_STOCK;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Sets the configured inventory stock level for safety stock. If the value is absent or <code>null</code> the configured inventory stock level is removed.</p>
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntrySetSafetyStockActionImpl that = (InventoryEntrySetSafetyStockActionImpl) o;

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
    public InventoryEntrySetSafetyStockAction copyDeep() {
        return InventoryEntrySetSafetyStockAction.deepCopy(this);
    }
}
