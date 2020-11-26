package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.payment.TransactionType;
import java.time.ZonedDateTime;
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
public final class TransactionImpl implements Transaction {

    private String id;
    
    private java.time.ZonedDateTime timestamp;
    
    private com.commercetools.api.models.payment.TransactionType type;
    
    private com.commercetools.api.models.common.TypedMoney amount;
    
    private String interactionId;
    
    private com.commercetools.api.models.payment.TransactionState state;

    @JsonCreator
    TransactionImpl(@JsonProperty("id") final String id, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp, @JsonProperty("type") final com.commercetools.api.models.payment.TransactionType type, @JsonProperty("amount") final com.commercetools.api.models.common.TypedMoney amount, @JsonProperty("interactionId") final String interactionId, @JsonProperty("state") final com.commercetools.api.models.payment.TransactionState state) {
        this.id = id;
        this.timestamp = timestamp;
        this.type = type;
        this.amount = amount;
        this.interactionId = interactionId;
        this.state = state;
    }
    public TransactionImpl() {
    }

    /**
    *  <p>The unique ID of this object.</p>
    */
    public String getId(){
        return this.id;
    }
    
    /**
    *  <p>The time at which the transaction took place.</p>
    */
    public java.time.ZonedDateTime getTimestamp(){
        return this.timestamp;
    }
    
    /**
    *  <p>The type of this transaction.</p>
    */
    public com.commercetools.api.models.payment.TransactionType getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.common.TypedMoney getAmount(){
        return this.amount;
    }
    
    /**
    *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP).
    *  If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
    */
    public String getInteractionId(){
        return this.interactionId;
    }
    
    /**
    *  <p>The state of this transaction.</p>
    */
    public com.commercetools.api.models.payment.TransactionState getState(){
        return this.state;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setTimestamp(final java.time.ZonedDateTime timestamp){
        this.timestamp = timestamp;
    }
    
    public void setType(final com.commercetools.api.models.payment.TransactionType type){
        this.type = type;
    }
    
    public void setAmount(final com.commercetools.api.models.common.TypedMoney amount){
        this.amount = amount;
    }
    
    public void setInteractionId(final String interactionId){
        this.interactionId = interactionId;
    }
    
    public void setState(final com.commercetools.api.models.payment.TransactionState state){
        this.state = state;
    }

}
