
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetReturnShipmentStateActionBuilder
        implements Builder<StagedOrderSetReturnShipmentStateAction> {

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    public StagedOrderSetReturnShipmentStateActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    public StagedOrderSetReturnShipmentStateActionBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public StagedOrderSetReturnShipmentStateAction build() {
        Objects.requireNonNull(returnItemId,
            StagedOrderSetReturnShipmentStateAction.class + ": returnItemId is missing");
        Objects.requireNonNull(shipmentState,
            StagedOrderSetReturnShipmentStateAction.class + ": shipmentState is missing");
        return new StagedOrderSetReturnShipmentStateActionImpl(returnItemId, shipmentState);
    }

    /**
     * builds StagedOrderSetReturnShipmentStateAction without checking for non null required values
     */
    public StagedOrderSetReturnShipmentStateAction buildUnchecked() {
        return new StagedOrderSetReturnShipmentStateActionImpl(returnItemId, shipmentState);
    }

    public static StagedOrderSetReturnShipmentStateActionBuilder of() {
        return new StagedOrderSetReturnShipmentStateActionBuilder();
    }

    public static StagedOrderSetReturnShipmentStateActionBuilder of(
            final StagedOrderSetReturnShipmentStateAction template) {
        StagedOrderSetReturnShipmentStateActionBuilder builder = new StagedOrderSetReturnShipmentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
