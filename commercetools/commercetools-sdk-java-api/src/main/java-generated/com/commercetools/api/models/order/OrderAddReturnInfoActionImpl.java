
package com.commercetools.api.models.order;

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
 *  <p>Produces the Return Info Added Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderAddReturnInfoActionImpl implements OrderAddReturnInfoAction, ModelBase {

    private String action;

    private String returnTrackingId;

    private java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items;

    private java.time.ZonedDateTime returnDate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderAddReturnInfoActionImpl(@JsonProperty("returnTrackingId") final String returnTrackingId,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items,
            @JsonProperty("returnDate") final java.time.ZonedDateTime returnDate) {
        this.returnTrackingId = returnTrackingId;
        this.items = items;
        this.returnDate = returnDate;
        this.action = ADD_RETURN_INFO;
    }

    /**
     * create empty instance
     */
    public OrderAddReturnInfoActionImpl() {
        this.action = ADD_RETURN_INFO;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     */

    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    /**
     *  <p>Items to be returned. Must not be empty.</p>
     */

    public java.util.List<com.commercetools.api.models.order.ReturnItemDraft> getItems() {
        return this.items;
    }

    /**
     *  <p>Value to set. If not set, it defaults to the current date and time.</p>
     */

    public java.time.ZonedDateTime getReturnDate() {
        return this.returnDate;
    }

    public void setReturnTrackingId(final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
    }

    public void setItems(final com.commercetools.api.models.order.ReturnItemDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items) {
        this.items = items;
    }

    public void setReturnDate(final java.time.ZonedDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderAddReturnInfoActionImpl that = (OrderAddReturnInfoActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(returnTrackingId, that.returnTrackingId)
                .append(items, that.items)
                .append(returnDate, that.returnDate)
                .append(action, that.action)
                .append(returnTrackingId, that.returnTrackingId)
                .append(items, that.items)
                .append(returnDate, that.returnDate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(returnTrackingId)
                .append(items)
                .append(returnDate)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("returnTrackingId", returnTrackingId)
                .append("items", items)
                .append("returnDate", returnDate)
                .build();
    }

}
