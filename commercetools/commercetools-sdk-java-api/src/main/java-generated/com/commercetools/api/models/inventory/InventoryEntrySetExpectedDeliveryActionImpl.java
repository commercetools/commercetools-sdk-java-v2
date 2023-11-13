
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
 * InventoryEntrySetExpectedDeliveryAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetExpectedDeliveryActionImpl implements InventoryEntrySetExpectedDeliveryAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime expectedDelivery;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntrySetExpectedDeliveryActionImpl(
            @JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        this.action = SET_EXPECTED_DELIVERY;
    }

    /**
     * create empty instance
     */
    public InventoryEntrySetExpectedDeliveryActionImpl() {
        this.action = SET_EXPECTED_DELIVERY;
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

    public java.time.ZonedDateTime getExpectedDelivery() {
        return this.expectedDelivery;
    }

    public void setExpectedDelivery(final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntrySetExpectedDeliveryActionImpl that = (InventoryEntrySetExpectedDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(expectedDelivery, that.expectedDelivery)
                .append(action, that.action)
                .append(expectedDelivery, that.expectedDelivery)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(expectedDelivery).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("expectedDelivery", expectedDelivery)
                .build();
    }

}
