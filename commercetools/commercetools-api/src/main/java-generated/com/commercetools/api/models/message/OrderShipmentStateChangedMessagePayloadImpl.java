package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.ShipmentState;
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
public final class OrderShipmentStateChangedMessagePayloadImpl implements OrderShipmentStateChangedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.order.ShipmentState shipmentState;
    
    private com.commercetools.api.models.order.ShipmentState oldShipmentState;

    @JsonCreator
    OrderShipmentStateChangedMessagePayloadImpl(@JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState, @JsonProperty("oldShipmentState") final com.commercetools.api.models.order.ShipmentState oldShipmentState) {
        this.shipmentState = shipmentState;
        this.oldShipmentState = oldShipmentState;
        this.type = "OrderShipmentStateChanged";
    }
    public OrderShipmentStateChangedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.order.ShipmentState getShipmentState(){
        return this.shipmentState;
    }
    
    
    public com.commercetools.api.models.order.ShipmentState getOldShipmentState(){
        return this.oldShipmentState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState){
        this.shipmentState = shipmentState;
    }
    
    public void setOldShipmentState(final com.commercetools.api.models.order.ShipmentState oldShipmentState){
        this.oldShipmentState = oldShipmentState;
    }

}
