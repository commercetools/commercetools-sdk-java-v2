package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.TransactionState;
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
public final class PaymentTransactionStateChangedMessagePayloadImpl implements PaymentTransactionStateChangedMessagePayload {

    private String type;
    
    private String transactionId;
    
    private com.commercetools.api.models.payment.TransactionState state;

    @JsonCreator
    PaymentTransactionStateChangedMessagePayloadImpl(@JsonProperty("transactionId") final String transactionId, @JsonProperty("state") final com.commercetools.api.models.payment.TransactionState state) {
        this.transactionId = transactionId;
        this.state = state;
        this.type = "PaymentTransactionStateChanged";
    }
    public PaymentTransactionStateChangedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getTransactionId(){
        return this.transactionId;
    }
    
    
    public com.commercetools.api.models.payment.TransactionState getState(){
        return this.state;
    }

    public void setTransactionId(final String transactionId){
        this.transactionId = transactionId;
    }
    
    public void setState(final com.commercetools.api.models.payment.TransactionState state){
        this.state = state;
    }

}
