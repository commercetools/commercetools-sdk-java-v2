package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderChangeShipmentStateActionImpl implements StagedOrderChangeShipmentStateAction {

    private String action;
    
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @JsonCreator
    StagedOrderChangeShipmentStateActionImpl(@JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        this.action = "changeShipmentState";
    }
    public StagedOrderChangeShipmentStateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.order.ShipmentState getShipmentState(){
        return this.shipmentState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState){
        this.shipmentState = shipmentState;
    }

}
