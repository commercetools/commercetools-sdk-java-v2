
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveDeliveryItemsChangeImpl implements RemoveDeliveryItemsChange {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Delivery previousValue;

    @JsonCreator
    RemoveDeliveryItemsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Delivery previousValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.type = REMOVE_DELIVERY_ITEMS_CHANGE;
    }

    public RemoveDeliveryItemsChangeImpl() {
        this.type = REMOVE_DELIVERY_ITEMS_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>removeDelivery</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Delivery getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Delivery previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemoveDeliveryItemsChangeImpl that = (RemoveDeliveryItemsChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(previousValue).toHashCode();
    }

}
