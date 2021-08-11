
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderReturnShipmentStateChangedMessagePayloadBuilder
        implements Builder<OrderReturnShipmentStateChangedMessagePayload> {

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnShipmentState returnShipmentState;

    public OrderReturnShipmentStateChangedMessagePayloadBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    public OrderReturnShipmentStateChangedMessagePayloadBuilder returnShipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState returnShipmentState) {
        this.returnShipmentState = returnShipmentState;
        return this;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public com.commercetools.api.models.order.ReturnShipmentState getReturnShipmentState() {
        return this.returnShipmentState;
    }

    public OrderReturnShipmentStateChangedMessagePayload build() {
        Objects.requireNonNull(returnItemId,
            OrderReturnShipmentStateChangedMessagePayload.class + ": returnItemId is missing");
        Objects.requireNonNull(returnShipmentState,
            OrderReturnShipmentStateChangedMessagePayload.class + ": returnShipmentState is missing");
        return new OrderReturnShipmentStateChangedMessagePayloadImpl(returnItemId, returnShipmentState);
    }

    /**
     * builds OrderReturnShipmentStateChangedMessagePayload without checking for non null required values
     */
    public OrderReturnShipmentStateChangedMessagePayload buildUnchecked() {
        return new OrderReturnShipmentStateChangedMessagePayloadImpl(returnItemId, returnShipmentState);
    }

    public static OrderReturnShipmentStateChangedMessagePayloadBuilder of() {
        return new OrderReturnShipmentStateChangedMessagePayloadBuilder();
    }

    public static OrderReturnShipmentStateChangedMessagePayloadBuilder of(
            final OrderReturnShipmentStateChangedMessagePayload template) {
        OrderReturnShipmentStateChangedMessagePayloadBuilder builder = new OrderReturnShipmentStateChangedMessagePayloadBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.returnShipmentState = template.getReturnShipmentState();
        return builder;
    }

}
