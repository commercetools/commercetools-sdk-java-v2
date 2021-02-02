
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeShipmentStateActionImpl.class)
public interface StagedOrderChangeShipmentStateAction extends StagedOrderUpdateAction {

    String CHANGE_SHIPMENT_STATE = "changeShipmentState";

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    public void setShipmentState(final ShipmentState shipmentState);

    public static StagedOrderChangeShipmentStateAction of() {
        return new StagedOrderChangeShipmentStateActionImpl();
    }

    public static StagedOrderChangeShipmentStateAction of(final StagedOrderChangeShipmentStateAction template) {
        StagedOrderChangeShipmentStateActionImpl instance = new StagedOrderChangeShipmentStateActionImpl();
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    public static StagedOrderChangeShipmentStateActionBuilder builder() {
        return StagedOrderChangeShipmentStateActionBuilder.of();
    }

    public static StagedOrderChangeShipmentStateActionBuilder builder(
            final StagedOrderChangeShipmentStateAction template) {
        return StagedOrderChangeShipmentStateActionBuilder.of(template);
    }

    default <T> T withStagedOrderChangeShipmentStateAction(Function<StagedOrderChangeShipmentStateAction, T> helper) {
        return helper.apply(this);
    }
}
