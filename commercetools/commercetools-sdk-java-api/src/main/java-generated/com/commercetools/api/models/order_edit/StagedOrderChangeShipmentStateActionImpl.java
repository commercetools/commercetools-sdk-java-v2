package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


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
        this.action =  CHANGE_SHIPMENT_STATE;
    }
    public StagedOrderChangeShipmentStateActionImpl() {
        this.action =  CHANGE_SHIPMENT_STATE;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderChangeShipmentStateActionImpl that = (StagedOrderChangeShipmentStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(shipmentState, that.shipmentState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(shipmentState)
            .toHashCode();
    }

}
