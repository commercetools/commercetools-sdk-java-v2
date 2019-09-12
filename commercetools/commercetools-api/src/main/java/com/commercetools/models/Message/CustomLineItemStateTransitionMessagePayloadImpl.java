package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.State.StateReference;
import java.lang.Long;
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
public final class CustomLineItemStateTransitionMessagePayloadImpl implements CustomLineItemStateTransitionMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.State.StateReference toState;
   
   private com.commercetools.models.State.StateReference fromState;
   
   private java.lang.String customLineItemId;
   
   private java.lang.Long quantity;
   
   private java.time.ZonedDateTime transitionDate;

   @JsonCreator
   CustomLineItemStateTransitionMessagePayloadImpl(@JsonProperty("toState") final com.commercetools.models.State.StateReference toState, @JsonProperty("fromState") final com.commercetools.models.State.StateReference fromState, @JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("quantity") final java.lang.Long quantity, @JsonProperty("transitionDate") final java.time.ZonedDateTime transitionDate) {
      this.toState = toState;
      this.fromState = fromState;
      this.customLineItemId = customLineItemId;
      this.quantity = quantity;
      this.transitionDate = transitionDate;
      this.type = "CustomLineItemStateTransition";
   }
   public CustomLineItemStateTransitionMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.State.StateReference getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.models.State.StateReference getFromState(){
      return this.fromState;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.time.ZonedDateTime getTransitionDate(){
      return this.transitionDate;
   }

   public void setToState(final com.commercetools.models.State.StateReference toState){
      this.toState = toState;
   }
   
   public void setFromState(final com.commercetools.models.State.StateReference fromState){
      this.fromState = fromState;
   }
   
   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }
   
   public void setTransitionDate(final java.time.ZonedDateTime transitionDate){
      this.transitionDate = transitionDate;
   }

}