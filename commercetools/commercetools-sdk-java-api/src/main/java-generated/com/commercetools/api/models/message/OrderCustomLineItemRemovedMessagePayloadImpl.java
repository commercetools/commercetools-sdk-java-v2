
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
 *  <p>Generated after a successful Remove CustomLineItem update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemRemovedMessagePayloadImpl
        implements OrderCustomLineItemRemovedMessagePayload, ModelBase {

    private String type;

    private String customLineItemId;

    private String customLineItemKey;

    private com.commercetools.api.models.cart.CustomLineItem customLineItem;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCustomLineItemRemovedMessagePayloadImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey,
            @JsonProperty("customLineItem") final com.commercetools.api.models.cart.CustomLineItem customLineItem) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.customLineItem = customLineItem;
        this.type = ORDER_CUSTOM_LINE_ITEM_REMOVED;
    }

    /**
     * create empty instance
     */
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
     *  <p>Unique identifier of the Custom Line Item.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     */

    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Custom Line Item that was removed from the Order.</p>
     */

    public com.commercetools.api.models.cart.CustomLineItem getCustomLineItem() {
        return this.customLineItem;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setCustomLineItemKey(final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
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
                .append(customLineItemKey, that.customLineItemKey)
                .append(customLineItem, that.customLineItem)
                .append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(customLineItem, that.customLineItem)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customLineItemId)
                .append(customLineItemKey)
                .append(customLineItem)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customLineItemId", customLineItemId)
                .append("customLineItemKey", customLineItemKey)
                .append("customLineItem", customLineItem)
                .build();
    }

    @Override
    public OrderCustomLineItemRemovedMessagePayload copyDeep() {
        return OrderCustomLineItemRemovedMessagePayload.deepCopy(this);
    }
}
