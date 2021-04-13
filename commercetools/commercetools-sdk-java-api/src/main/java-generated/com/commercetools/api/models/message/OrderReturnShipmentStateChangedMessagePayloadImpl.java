
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
public final class OrderReturnShipmentStateChangedMessagePayloadImpl
        implements OrderReturnShipmentStateChangedMessagePayload {

    private String type;

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnShipmentState returnShipmentState;

    @JsonCreator
    OrderReturnShipmentStateChangedMessagePayloadImpl(@JsonProperty("returnItemId") final String returnItemId,
            @JsonProperty("returnShipmentState") final com.commercetools.api.models.order.ReturnShipmentState returnShipmentState) {
        this.returnItemId = returnItemId;
        this.returnShipmentState = returnShipmentState;
        this.type = ORDER_RETURN_SHIPMENT_STATE_CHANGED;
    }

    public OrderReturnShipmentStateChangedMessagePayloadImpl() {
        this.type = ORDER_RETURN_SHIPMENT_STATE_CHANGED;
    }

    public String getType() {
        return this.type;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public com.commercetools.api.models.order.ReturnShipmentState getReturnShipmentState() {
        return this.returnShipmentState;
    }

    public void setReturnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
    }

    public void setReturnShipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState returnShipmentState) {
        this.returnShipmentState = returnShipmentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderReturnShipmentStateChangedMessagePayloadImpl that = (OrderReturnShipmentStateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(returnItemId, that.returnItemId)
                .append(returnShipmentState, that.returnShipmentState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(returnItemId).append(returnShipmentState).toHashCode();
    }

}
