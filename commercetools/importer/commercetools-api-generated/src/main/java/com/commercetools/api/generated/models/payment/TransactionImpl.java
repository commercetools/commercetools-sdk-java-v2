package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.payment.TransactionState;
import com.commercetools.api.generated.models.payment.TransactionType;
import java.time.ZonedDateTime;
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
public final class TransactionImpl implements Transaction {

   private String interactionId;
   
   private com.commercetools.api.generated.models.common.TypedMoney amount;
   
   private com.commercetools.api.generated.models.payment.TransactionState state;
   
   private String id;
   
   private com.commercetools.api.generated.models.payment.TransactionType type;
   
   private java.time.ZonedDateTime timestamp;

   @JsonCreator
   TransactionImpl(@JsonProperty("interactionId") final String interactionId, @JsonProperty("amount") final com.commercetools.api.generated.models.common.TypedMoney amount, @JsonProperty("state") final com.commercetools.api.generated.models.payment.TransactionState state, @JsonProperty("id") final String id, @JsonProperty("type") final com.commercetools.api.generated.models.payment.TransactionType type, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
      this.interactionId = interactionId;
      this.amount = amount;
      this.state = state;
      this.id = id;
      this.type = type;
      this.timestamp = timestamp;
   }
   public TransactionImpl() {
      
   }
   
   /**
   *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP).
   *  If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
   */
   public String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getAmount(){
      return this.amount;
   }
   
   /**
   *  <p>The state of this transaction.</p>
   */
   public com.commercetools.api.generated.models.payment.TransactionState getState(){
      return this.state;
   }
   
   /**
   *  <p>The unique ID of this object.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   *  <p>The type of this transaction.</p>
   */
   public com.commercetools.api.generated.models.payment.TransactionType getType(){
      return this.type;
   }
   
   /**
   *  <p>The time at which the transaction took place.</p>
   */
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public void setInteractionId(final String interactionId){
      this.interactionId = interactionId;
   }
   
   public void setAmount(final com.commercetools.api.generated.models.common.TypedMoney amount){
      this.amount = amount;
   }
   
   public void setState(final com.commercetools.api.generated.models.payment.TransactionState state){
      this.state = state;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setType(final com.commercetools.api.generated.models.payment.TransactionType type){
      this.type = type;
   }
   
   public void setTimestamp(final java.time.ZonedDateTime timestamp){
      this.timestamp = timestamp;
   }

}