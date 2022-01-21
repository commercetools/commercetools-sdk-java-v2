
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetDeliveryItemsActionImpl implements StagedOrderSetDeliveryItemsAction, ModelBase {

    private String action;

    private String deliveryId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    @JsonCreator
    StagedOrderSetDeliveryItemsActionImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.deliveryId = deliveryId;
        this.items = items;
        this.action = SET_DELIVERY_ITEMS;
    }

    public StagedOrderSetDeliveryItemsActionImpl() {
        this.action = SET_DELIVERY_ITEMS;
    }

    public String getAction() {
        return this.action;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetDeliveryItemsActionImpl that = (StagedOrderSetDeliveryItemsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(items, that.items)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(deliveryId).append(items).toHashCode();
    }

}
