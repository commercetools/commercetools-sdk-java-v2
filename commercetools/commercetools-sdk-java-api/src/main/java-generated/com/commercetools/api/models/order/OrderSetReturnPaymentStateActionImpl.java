package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ReturnPaymentState;
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
public final class OrderSetReturnPaymentStateActionImpl implements OrderSetReturnPaymentStateAction {

    private String action;
    
    private String returnItemId;
    
    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    @JsonCreator
    OrderSetReturnPaymentStateActionImpl(@JsonProperty("returnItemId") final String returnItemId, @JsonProperty("paymentState") final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.returnItemId = returnItemId;
        this.paymentState = paymentState;
        this.action = "setReturnPaymentState";
    }
    public OrderSetReturnPaymentStateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getReturnItemId(){
        return this.returnItemId;
    }
    
    
    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState(){
        return this.paymentState;
    }

    public void setReturnItemId(final String returnItemId){
        this.returnItemId = returnItemId;
    }
    
    public void setPaymentState(final com.commercetools.api.models.order.ReturnPaymentState paymentState){
        this.paymentState = paymentState;
    }

}
