package com.commercetools.models.Payment;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Payment.TransactionState;
import com.commercetools.models.Payment.TransactionType;
import java.lang.String;
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

   private java.lang.String interactionId;
   
   private com.commercetools.models.Common.Money amount;
   
   private com.commercetools.models.Payment.TransactionState state;
   
   private com.commercetools.models.Payment.TransactionType type;
   
   private java.time.ZonedDateTime timestamp;

   @JsonCreator
   TransactionDraftImpl(@JsonProperty("interactionId") final java.lang.String interactionId, @JsonProperty("amount") final com.commercetools.models.Common.Money amount, @JsonProperty("state") final com.commercetools.models.Payment.TransactionState state, @JsonProperty("type") final com.commercetools.models.Payment.TransactionType type, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
      this.interactionId = interactionId;
      this.amount = amount;
      this.state = state;
      this.type = type;
      this.timestamp = timestamp;
   }
   public TransactionDraftImpl() {
      
   }
   
   
   public java.lang.String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.models.Common.Money getAmount(){
      return this.amount;
   }
   
   
   public com.commercetools.models.Payment.TransactionState getState(){
      return this.state;
   }
   
   
   public com.commercetools.models.Payment.TransactionType getType(){
      return this.type;
   }
   
   
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public void setInteractionId(final java.lang.String interactionId){
      this.interactionId = interactionId;
   }
   
   public void setAmount(final com.commercetools.models.Common.Money amount){
      this.amount = amount;
   }
   
   public void setState(final com.commercetools.models.Payment.TransactionState state){
      this.state = state;
   }
   
   public void setType(final com.commercetools.models.Payment.TransactionType type){
      this.type = type;
   }
   
   public void setTimestamp(final java.time.ZonedDateTime timestamp){
      this.timestamp = timestamp;
   }

}