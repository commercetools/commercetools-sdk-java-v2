package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetReturnShipmentStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetReturnShipmentStateActionImpl.class)
public interface StagedOrderSetReturnShipmentStateAction extends StagedOrderUpdateAction {

    String SET_RETURN_SHIPMENT_STATE = "setReturnShipmentState";

    
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();
    
    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    
    public void setReturnItemId(final String returnItemId);
    
    
    
    public void setShipmentState(final ReturnShipmentState shipmentState);
    

    public static StagedOrderSetReturnShipmentStateAction of(){
        return new StagedOrderSetReturnShipmentStateActionImpl();
    }
    

    public static StagedOrderSetReturnShipmentStateAction of(final StagedOrderSetReturnShipmentStateAction template) {
        StagedOrderSetReturnShipmentStateActionImpl instance = new StagedOrderSetReturnShipmentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    public static StagedOrderSetReturnShipmentStateActionBuilder builder(){
        return StagedOrderSetReturnShipmentStateActionBuilder.of();
    }
    
    public static StagedOrderSetReturnShipmentStateActionBuilder builder(final StagedOrderSetReturnShipmentStateAction template){
        return StagedOrderSetReturnShipmentStateActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderSetReturnShipmentStateAction(Function<StagedOrderSetReturnShipmentStateAction, T> helper) {
        return helper.apply(this);
    }
}
