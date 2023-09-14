
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
 *  <p>Generated after a successful Change CustomLineItem Quantity update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemQuantityChangedMessagePayloadImpl
        implements OrderCustomLineItemQuantityChangedMessagePayload, ModelBase {

    private String type;

    private String customLineItemId;

    private String customLineItemKey;

    private Long quantity;

    private Long oldQuantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCustomLineItemQuantityChangedMessagePayloadImpl(
            @JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey,
            @JsonProperty("quantity") final Long quantity, @JsonProperty("oldQuantity") final Long oldQuantity) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.quantity = quantity;
        this.oldQuantity = oldQuantity;
        this.type = ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED;
    }

    /**
     * create empty instance
     */
    public OrderCustomLineItemQuantityChangedMessagePayloadImpl() {
        this.type = ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED;
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
     *  <p>Custom Line Item quantity after the Change Custom Line Item Quantity update action.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Custom Line Item quantity before the Change Custom Line Item Quantity update action.</p>
     */

    public Long getOldQuantity() {
        return this.oldQuantity;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setCustomLineItemKey(final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setOldQuantity(final Long oldQuantity) {
        this.oldQuantity = oldQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderCustomLineItemQuantityChangedMessagePayloadImpl that = (OrderCustomLineItemQuantityChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(quantity, that.quantity)
                .append(oldQuantity, that.oldQuantity)
                .append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(quantity, that.quantity)
                .append(oldQuantity, that.oldQuantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customLineItemId)
                .append(customLineItemKey)
                .append(quantity)
                .append(oldQuantity)
                .toHashCode();
    }

}
