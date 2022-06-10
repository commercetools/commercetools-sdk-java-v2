
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
 * InventoryEntrySetExpectedDeliveryAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetExpectedDeliveryActionImpl implements InventoryEntrySetExpectedDeliveryAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime expectedDelivery;

    @JsonCreator
    InventoryEntrySetExpectedDeliveryActionImpl(
            @JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        this.action = SET_EXPECTED_DELIVERY;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(expectedDelivery).toHashCode();
    }

}
