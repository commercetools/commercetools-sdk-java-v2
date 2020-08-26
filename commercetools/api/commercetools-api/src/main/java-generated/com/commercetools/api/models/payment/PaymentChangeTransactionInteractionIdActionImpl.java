package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
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
public final class PaymentChangeTransactionInteractionIdActionImpl implements PaymentChangeTransactionInteractionIdAction {

    private String action;
    
    private String transactionId;
    
    private String interactionId;

    @JsonCreator
    PaymentChangeTransactionInteractionIdActionImpl(@JsonProperty("transactionId") final String transactionId, @JsonProperty("interactionId") final String interactionId) {
        this.transactionId = transactionId;
        this.interactionId = interactionId;
        this.action = "changeTransactionInteractionId";
    }
    public PaymentChangeTransactionInteractionIdActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getTransactionId(){
        return this.transactionId;
    }
    
    
    public String getInteractionId(){
        return this.interactionId;
    }

    public void setTransactionId(final String transactionId){
        this.transactionId = transactionId;
    }
    
    public void setInteractionId(final String interactionId){
        this.interactionId = interactionId;
    }

}
