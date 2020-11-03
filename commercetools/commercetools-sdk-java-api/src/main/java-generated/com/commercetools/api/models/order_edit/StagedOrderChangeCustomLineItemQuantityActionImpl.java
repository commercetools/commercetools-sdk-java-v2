package com.commercetools.api.models.order_edit;

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
public final class StagedOrderChangeCustomLineItemQuantityActionImpl implements StagedOrderChangeCustomLineItemQuantityAction {

    private String action;
    
    private String customLineItemId;
    
    private Double quantity;

    @JsonCreator
    StagedOrderChangeCustomLineItemQuantityActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("quantity") final Double quantity) {
        this.customLineItemId = customLineItemId;
        this.quantity = quantity;
        this.action = "changeCustomLineItemQuantity";
    }
    public StagedOrderChangeCustomLineItemQuantityActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    
    public Double getQuantity(){
        return this.quantity;
    }

    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }

}
