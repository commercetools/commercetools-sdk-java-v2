package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.PaymentState;
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
public final class OrderChangePaymentStateActionImpl implements OrderChangePaymentStateAction {

    private String action;
    
    private com.commercetools.api.models.order.PaymentState paymentState;

    @JsonCreator
    OrderChangePaymentStateActionImpl(@JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        this.action = "changePaymentState";
    }
    public OrderChangePaymentStateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.order.PaymentState getPaymentState(){
        return this.paymentState;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState){
        this.paymentState = paymentState;
    }

}
