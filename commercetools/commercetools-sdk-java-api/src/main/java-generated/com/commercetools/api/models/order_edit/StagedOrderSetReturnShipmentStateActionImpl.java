package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetReturnShipmentStateActionImpl implements StagedOrderSetReturnShipmentStateAction {

    private String action;
    
    private String returnItemId;
    
    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    @JsonCreator
    StagedOrderSetReturnShipmentStateActionImpl(@JsonProperty("returnItemId") final String returnItemId, @JsonProperty("shipmentState") final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.returnItemId = returnItemId;
        this.shipmentState = shipmentState;
        this.action = "setReturnShipmentState";
    }
    public StagedOrderSetReturnShipmentStateActionImpl() {
        this.action = "setReturnShipmentState";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getReturnItemId(){
        return this.returnItemId;
    }
    
    
    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState(){
        return this.shipmentState;
    }

    public void setReturnItemId(final String returnItemId){
        this.returnItemId = returnItemId;
    }
    
    public void setShipmentState(final com.commercetools.api.models.order.ReturnShipmentState shipmentState){
        this.shipmentState = shipmentState;
    }

}
