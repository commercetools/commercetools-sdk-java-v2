
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
public final class OrderShipmentStateChangedMessagePayloadImpl implements OrderShipmentStateChangedMessagePayload {

    private String type;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    private com.commercetools.api.models.order.ShipmentState oldShipmentState;

    @JsonCreator
    OrderShipmentStateChangedMessagePayloadImpl(
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState,
            @JsonProperty("oldShipmentState") final com.commercetools.api.models.order.ShipmentState oldShipmentState) {
        this.shipmentState = shipmentState;
        this.oldShipmentState = oldShipmentState;
        this.type = ORDER_SHIPMENT_STATE_CHANGED;
    }

    public OrderShipmentStateChangedMessagePayloadImpl() {
        this.type = ORDER_SHIPMENT_STATE_CHANGED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public com.commercetools.api.models.order.ShipmentState getOldShipmentState() {
        return this.oldShipmentState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setOldShipmentState(final com.commercetools.api.models.order.ShipmentState oldShipmentState) {
        this.oldShipmentState = oldShipmentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderShipmentStateChangedMessagePayloadImpl that = (OrderShipmentStateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(shipmentState, that.shipmentState)
                .append(oldShipmentState, that.oldShipmentState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(shipmentState).append(oldShipmentState).toHashCode();
    }

}
