
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangeShipmentStateActionBuilder {

    @Nullable
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    public StagedOrderChangeShipmentStateActionBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public StagedOrderChangeShipmentStateAction build() {
        return new StagedOrderChangeShipmentStateActionImpl(shipmentState);
    }

    public static StagedOrderChangeShipmentStateActionBuilder of() {
        return new StagedOrderChangeShipmentStateActionBuilder();
    }

    public static StagedOrderChangeShipmentStateActionBuilder of(final StagedOrderChangeShipmentStateAction template) {
        StagedOrderChangeShipmentStateActionBuilder builder = new StagedOrderChangeShipmentStateActionBuilder();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
