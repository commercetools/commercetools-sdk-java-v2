
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
 *  <p>Sets the inventory limits for a specific InventoryEntry. This action allows you to define minimum and maximum quantities that can be added to a Cart. For more information, see <span>Quantity limits</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetInventoryLimitsActionImpl implements InventoryEntrySetInventoryLimitsAction, ModelBase {

    private String action;

    private Long minCartQuantity;

    private Long maxCartQuantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntrySetInventoryLimitsActionImpl(@JsonProperty("minCartQuantity") final Long minCartQuantity,
            @JsonProperty("maxCartQuantity") final Long maxCartQuantity) {
        this.minCartQuantity = minCartQuantity;
        this.maxCartQuantity = maxCartQuantity;
        this.action = SET_INVENTORY_LIMITS;
    }

    /**
     * create empty instance
     */
    public InventoryEntrySetInventoryLimitsActionImpl() {
        this.action = SET_INVENTORY_LIMITS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Sets the minimum quantity that can be added to a Cart. If the value is absent or <code>null</code> the inventory limit is removed.</p>
     */

    public Long getMinCartQuantity() {
        return this.minCartQuantity;
    }

    /**
     *  <p>Sets the maximum quantity that can be added to a Cart. If the value is absent or <code>null</code> the inventory limit is removed.</p>
     */

    public Long getMaxCartQuantity() {
        return this.maxCartQuantity;
    }

    public void setMinCartQuantity(final Long minCartQuantity) {
        this.minCartQuantity = minCartQuantity;
    }

    public void setMaxCartQuantity(final Long maxCartQuantity) {
        this.maxCartQuantity = maxCartQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntrySetInventoryLimitsActionImpl that = (InventoryEntrySetInventoryLimitsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(minCartQuantity, that.minCartQuantity)
                .append(maxCartQuantity, that.maxCartQuantity)
                .append(action, that.action)
                .append(minCartQuantity, that.minCartQuantity)
                .append(maxCartQuantity, that.maxCartQuantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(minCartQuantity).append(maxCartQuantity).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("minCartQuantity", minCartQuantity)
                .append("maxCartQuantity", maxCartQuantity)
                .build();
    }

    @Override
    public InventoryEntrySetInventoryLimitsAction copyDeep() {
        return InventoryEntrySetInventoryLimitsAction.deepCopy(this);
    }
}
