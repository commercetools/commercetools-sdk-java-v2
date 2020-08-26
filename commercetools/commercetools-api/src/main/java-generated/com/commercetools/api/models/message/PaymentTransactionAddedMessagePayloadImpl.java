package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.Transaction;
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
public final class PaymentTransactionAddedMessagePayloadImpl implements PaymentTransactionAddedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.payment.Transaction transaction;

    @JsonCreator
    PaymentTransactionAddedMessagePayloadImpl(@JsonProperty("transaction") final com.commercetools.api.models.payment.Transaction transaction) {
        this.transaction = transaction;
        this.type = "PaymentTransactionAdded";
    }
    public PaymentTransactionAddedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.payment.Transaction getTransaction(){
        return this.transaction;
    }

    public void setTransaction(final com.commercetools.api.models.payment.Transaction transaction){
        this.transaction = transaction;
    }

}
