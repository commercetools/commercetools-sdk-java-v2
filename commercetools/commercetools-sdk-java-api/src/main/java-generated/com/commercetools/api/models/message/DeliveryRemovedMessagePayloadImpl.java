
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryRemovedMessagePayloadImpl implements DeliveryRemovedMessagePayload {

    private String type;

    private com.commercetools.api.models.order.Delivery delivery;

    @JsonCreator
    DeliveryRemovedMessagePayloadImpl(
            @JsonProperty("delivery") final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
        this.type = DELIVERY_REMOVED;
    }

    public DeliveryRemovedMessagePayloadImpl() {
        this.type = DELIVERY_REMOVED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.order.Delivery getDelivery() {
        return this.delivery;
    }

    public void setDelivery(final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryRemovedMessagePayloadImpl that = (DeliveryRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(delivery, that.delivery).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(delivery).toHashCode();
    }

}
