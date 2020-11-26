package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnShipmentState;
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
public final class ReturnItemDraftImpl implements ReturnItemDraft {

    private Long quantity;
    
    private String lineItemId;
    
    private String customLineItemId;
    
    private String comment;
    
    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    @JsonCreator
    ReturnItemDraftImpl(@JsonProperty("quantity") final Long quantity, @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("comment") final String comment, @JsonProperty("shipmentState") final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.quantity = quantity;
        this.lineItemId = lineItemId;
        this.customLineItemId = customLineItemId;
        this.comment = comment;
        this.shipmentState = shipmentState;
    }
    public ReturnItemDraftImpl() {
    }

    
    public Long getQuantity(){
        return this.quantity;
    }
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    
    public String getComment(){
        return this.comment;
    }
    
    
    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState(){
        return this.shipmentState;
    }

    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }
    
    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    public void setComment(final String comment){
        this.comment = comment;
    }
    
    public void setShipmentState(final com.commercetools.api.models.order.ReturnShipmentState shipmentState){
        this.shipmentState = shipmentState;
    }

}
