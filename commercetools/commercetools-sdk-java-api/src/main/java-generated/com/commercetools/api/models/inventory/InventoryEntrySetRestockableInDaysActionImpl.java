
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
 * InventoryEntrySetRestockableInDaysAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetRestockableInDaysActionImpl
        implements InventoryEntrySetRestockableInDaysAction, ModelBase {

    private String action;

    private Long restockableInDays;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntrySetRestockableInDaysActionImpl(@JsonProperty("restockableInDays") final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        this.action = SET_RESTOCKABLE_IN_DAYS;
    }

    /**
     * create empty instance
     */
    public InventoryEntrySetRestockableInDaysActionImpl() {
        this.action = SET_RESTOCKABLE_IN_DAYS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    public void setRestockableInDays(final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntrySetRestockableInDaysActionImpl that = (InventoryEntrySetRestockableInDaysActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(restockableInDays, that.restockableInDays)
                .append(action, that.action)
                .append(restockableInDays, that.restockableInDays)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(restockableInDays).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("restockableInDays", restockableInDays)
                .build();
    }

    @Override
    public InventoryEntrySetRestockableInDaysAction copyDeep() {
        return InventoryEntrySetRestockableInDaysAction.deepCopy(this);
    }
}
