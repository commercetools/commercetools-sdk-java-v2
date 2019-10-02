package com.commercetools.models.payment;

import com.commercetools.models.common.Money;
import com.commercetools.models.payment.TransactionState;
import com.commercetools.models.payment.TransactionType;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TransactionDraftImpl implements TransactionDraft {

   private String interactionId;
   
   private com.commercetools.models.common.Money amount;
   
   private com.commercetools.models.payment.TransactionState state;
   
   private com.commercetools.models.payment.TransactionType type;
   
   private java.time.ZonedDateTime timestamp;

   @JsonCreator
   TransactionDraftImpl(@JsonProperty("interactionId") final String interactionId, @JsonProperty("amount") final com.commercetools.models.common.Money amount, @JsonProperty("state") final com.commercetools.models.payment.TransactionState state, @JsonProperty("type") final com.commercetools.models.payment.TransactionType type, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
      this.interactionId = interactionId;
      this.amount = amount;
      this.state = state;
      this.type = type;
      this.timestamp = timestamp;
   }
   public TransactionDraftImpl() {
      
   }
   
   
   public String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.models.common.Money getAmount(){
      return this.amount;
   }
   
   
   public com.commercetools.models.payment.TransactionState getState(){
      return this.state;
   }
   
   
   public com.commercetools.models.payment.TransactionType getType(){
      return this.type;
   }
   
   
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public void setInteractionId(final String interactionId){
      this.interactionId = interactionId;
   }
   
   public void setAmount(final com.commercetools.models.common.Money amount){
      this.amount = amount;
   }
   
   public void setState(final com.commercetools.models.payment.TransactionState state){
      this.state = state;
   }
   
   public void setType(final com.commercetools.models.payment.TransactionType type){
      this.type = type;
   }
   
   public void setTimestamp(final java.time.ZonedDateTime timestamp){
      this.timestamp = timestamp;
   }

}