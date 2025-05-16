
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
 *  <p>Generated after a successful Set Delivery Items update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryItemsUpdatedMessagePayloadImpl implements DeliveryItemsUpdatedMessagePayload, ModelBase {

    private String type;

    private String deliveryId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryItemsUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items,
            @JsonProperty("oldItems") final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.deliveryId = deliveryId;
        this.items = items;
        this.oldItems = oldItems;
        this.shippingKey = shippingKey;
        this.type = DELIVERY_ITEMS_UPDATED;
    }

    /**
     * create empty instance
     */
    public DeliveryItemsUpdatedMessagePayloadImpl() {
        this.type = DELIVERY_ITEMS_UPDATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems() {
        return this.oldItems;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setItems(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
    }

    public void setOldItems(final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        this.oldItems = new ArrayList<>(Arrays.asList(oldItems));
    }

    public void setOldItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
        this.oldItems = oldItems;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryItemsUpdatedMessagePayloadImpl that = (DeliveryItemsUpdatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(deliveryId, that.deliveryId)
                .append(items, that.items)
                .append(oldItems, that.oldItems)
                .append(shippingKey, that.shippingKey)
                .append(type, that.type)
                .append(deliveryId, that.deliveryId)
                .append(items, that.items)
                .append(oldItems, that.oldItems)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(deliveryId)
                .append(items)
                .append(oldItems)
                .append(shippingKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("deliveryId", deliveryId)
                .append("items", items)
                .append("oldItems", oldItems)
                .append("shippingKey", shippingKey)
                .build();
    }

    @Override
    public DeliveryItemsUpdatedMessagePayload copyDeep() {
        return DeliveryItemsUpdatedMessagePayload.deepCopy(this);
    }
}
