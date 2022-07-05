
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

/**
 * OrderCustomLineItemRemovedMessagePayload
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemRemovedMessagePayloadImpl
        implements OrderCustomLineItemRemovedMessagePayload, ModelBase {

    private String type;

    private String customLineItemId;

    private com.commercetools.api.models.cart.CustomLineItem customLineItem;

    @JsonCreator
    OrderCustomLineItemRemovedMessagePayloadImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItem") final com.commercetools.api.models.cart.CustomLineItem customLineItem) {
        this.customLineItemId = customLineItemId;
        this.customLineItem = customLineItem;
        this.type = ORDER_CUSTOM_LINE_ITEM_REMOVED;
    }

    public OrderCustomLineItemRemovedMessagePayloadImpl() {
        this.type = ORDER_CUSTOM_LINE_ITEM_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *
     */

    public com.commercetools.api.models.cart.CustomLineItem getCustomLineItem() {
        return this.customLineItem;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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

        OrderCustomLineItemRemovedMessagePayloadImpl that = (OrderCustomLineItemRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItem, that.customLineItem)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customLineItemId).append(customLineItem).toHashCode();
    }

}
