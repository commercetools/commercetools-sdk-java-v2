
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
 *  <p>Generated after a successful Add CustomLineItem update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemAddedMessagePayloadImpl implements OrderCustomLineItemAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.cart.CustomLineItem customLineItem;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCustomLineItemAddedMessagePayloadImpl(
            @JsonProperty("customLineItem") final com.commercetools.api.models.cart.CustomLineItem customLineItem) {
        this.customLineItem = customLineItem;
        this.type = ORDER_CUSTOM_LINE_ITEM_ADDED;
    }

    /**
     * create empty instance
     */
    public OrderCustomLineItemAddedMessagePayloadImpl() {
        this.type = ORDER_CUSTOM_LINE_ITEM_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Custom Line Item that was added to the Order.</p>
     */

    public com.commercetools.api.models.cart.CustomLineItem getCustomLineItem() {
        return this.customLineItem;
    }

    public void setCustomLineItem(final com.commercetools.api.models.cart.CustomLineItem customLineItem) {
        this.customLineItem = customLineItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderCustomLineItemAddedMessagePayloadImpl that = (OrderCustomLineItemAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customLineItem, that.customLineItem)
                .append(type, that.type)
                .append(customLineItem, that.customLineItem)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customLineItem).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customLineItem", customLineItem)
                .build();
    }

    @Override
    public OrderCustomLineItemAddedMessagePayload copyDeep() {
        return OrderCustomLineItemAddedMessagePayload.deepCopy(this);
    }
}
