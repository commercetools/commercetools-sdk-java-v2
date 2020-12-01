package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ShipmentState;
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
public final class OrderChangeShipmentStateActionImpl implements OrderChangeShipmentStateAction {

    private String action;
    
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @JsonCreator
    OrderChangeShipmentStateActionImpl(@JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        this.action = "changeShipmentState";
    }
    public OrderChangeShipmentStateActionImpl() {
        this.action = "changeShipmentState";
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
