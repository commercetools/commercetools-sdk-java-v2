
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Add LineItem update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderLineItemAddedMessagePayloadImpl implements OrderLineItemAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.cart.LineItem lineItem;

    private Long addedQuantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderLineItemAddedMessagePayloadImpl(
            @JsonProperty("lineItem") final com.commercetools.api.models.cart.LineItem lineItem,
            @JsonProperty("addedQuantity") final Long addedQuantity) {
        this.lineItem = lineItem;
        this.addedQuantity = addedQuantity;
        this.type = ORDER_LINE_ITEM_ADDED;
    }

    /**
     * create empty instance
     */
    public OrderLineItemAddedMessagePayloadImpl() {
        this.type = ORDER_LINE_ITEM_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Line Item that was added to the Order.</p>
     */

    public com.commercetools.api.models.cart.LineItem getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p>Quantity of Line Items that were added to the Order.</p>
     */

    public Long getAddedQuantity() {
        return this.addedQuantity;
    }

    public void setLineItem(final com.commercetools.api.models.cart.LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public void setAddedQuantity(final Long addedQuantity) {
        this.addedQuantity = addedQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderLineItemAddedMessagePayloadImpl that = (OrderLineItemAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(lineItem, that.lineItem)
                .append(addedQuantity, that.addedQuantity)
                .append(type, that.type)
                .append(lineItem, that.lineItem)
                .append(addedQuantity, that.addedQuantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(lineItem).append(addedQuantity).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("lineItem", lineItem)
                .append("addedQuantity", addedQuantity)
                .build();
    }

    @Override
    public OrderLineItemAddedMessagePayload copyDeep() {
        return OrderLineItemAddedMessagePayload.deepCopy(this);
    }
}
