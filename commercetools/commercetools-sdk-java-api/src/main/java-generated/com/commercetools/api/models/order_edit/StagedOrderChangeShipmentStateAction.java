package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeShipmentStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderChangeShipmentStateActionImpl.class)
public interface StagedOrderChangeShipmentStateAction extends StagedOrderUpdateAction {

    
    
    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    public void setShipmentState(final ShipmentState shipmentState);

    public static StagedOrderChangeShipmentStateActionImpl of(){
        return new StagedOrderChangeShipmentStateActionImpl();
    }
    

    public static StagedOrderChangeShipmentStateActionImpl of(final StagedOrderChangeShipmentStateAction template) {
        StagedOrderChangeShipmentStateActionImpl instance = new StagedOrderChangeShipmentStateActionImpl();
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    default <T> T withStagedOrderChangeShipmentStateAction(Function<StagedOrderChangeShipmentStateAction, T> helper) {
        return helper.apply(this);
    }
}
