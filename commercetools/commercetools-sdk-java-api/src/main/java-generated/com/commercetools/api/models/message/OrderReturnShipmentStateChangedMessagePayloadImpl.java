package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.order.ReturnShipmentState;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
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

/**
 *  <p>Generated after a successful Set Return Shipment State update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderReturnShipmentStateChangedMessagePayloadImpl implements OrderReturnShipmentStateChangedMessagePayload, ModelBase {

    
    private String type;
    
    
    private String returnItemId;
    
    
    private com.commercetools.api.models.order.ReturnShipmentState returnShipmentState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderReturnShipmentStateChangedMessagePayloadImpl(@JsonProperty("returnItemId") final String returnItemId, @JsonProperty("returnShipmentState") final com.commercetools.api.models.order.ReturnShipmentState returnShipmentState) {
        this.returnItemId = returnItemId;
        this.returnShipmentState = returnShipmentState;
        this.type =  ORDER_RETURN_SHIPMENT_STATE_CHANGED;
    }
    /**
     * create empty instance
     */
    public OrderReturnShipmentStateChangedMessagePayloadImpl() {
        this.type =  ORDER_RETURN_SHIPMENT_STATE_CHANGED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     */
    
    public String getReturnItemId(){
        return this.returnItemId;
    }
    
    /**
     *  <p>State of the ReturnItem after the Set Return Shipment State update action.</p>
     */
    
    public com.commercetools.api.models.order.ReturnShipmentState getReturnShipmentState(){
        return this.returnShipmentState;
    }

    
    public void setReturnItemId(final String returnItemId){
        this.returnItemId = returnItemId;
    }
    
    
    public void setReturnShipmentState(final com.commercetools.api.models.order.ReturnShipmentState returnShipmentState){
        this.returnShipmentState = returnShipmentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderReturnShipmentStateChangedMessagePayloadImpl that = (OrderReturnShipmentStateChangedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(returnItemId, that.returnItemId)
                .append(returnShipmentState, that.returnShipmentState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(returnItemId)
            .append(returnShipmentState)
            .toHashCode();
    }

}
