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
public final class LineItemStateTransitionMessagePayloadImpl implements LineItemStateTransitionMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.State.StateReference toState;
   
   private com.commercetools.models.State.StateReference fromState;
   
   private java.lang.Long quantity;
   
   private java.lang.String lineItemId;
   
   private java.time.ZonedDateTime transitionDate;

   @JsonCreator
   LineItemStateTransitionMessagePayloadImpl(@JsonProperty("toState") final com.commercetools.models.State.StateReference toState, @JsonProperty("fromState") final com.commercetools.models.State.StateReference fromState, @JsonProperty("quantity") final java.lang.Long quantity, @JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("transitionDate") final java.time.ZonedDateTime transitionDate) {
      this.toState = toState;
      this.fromState = fromState;
      this.quantity = quantity;
      this.lineItemId = lineItemId;
      this.transitionDate = transitionDate;
      this.type = "LineItemStateTransition";
   }
   public LineItemStateTransitionMessagePayloadImpl() {
      
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
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
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
   
   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }
   
   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setTransitionDate(final java.time.ZonedDateTime transitionDate){
      this.transitionDate = transitionDate;
   }

}