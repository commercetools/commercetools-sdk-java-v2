
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetReturnShipmentStateActionBuilder {

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
