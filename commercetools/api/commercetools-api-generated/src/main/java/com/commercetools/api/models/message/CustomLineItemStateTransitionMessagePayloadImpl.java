package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
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
public final class CustomLineItemStateTransitionMessagePayloadImpl implements CustomLineItemStateTransitionMessagePayload {

   private String type;
   
   private String customLineItemId;
   
   private java.time.ZonedDateTime transitionDate;
   
   private Long quantity;
   
   private com.commercetools.api.models.state.StateReference fromState;
   
   private com.commercetools.api.models.state.StateReference toState;

   @JsonCreator
   CustomLineItemStateTransitionMessagePayloadImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("transitionDate") final java.time.ZonedDateTime transitionDate, @JsonProperty("quantity") final Long quantity, @JsonProperty("fromState") final com.commercetools.api.models.state.StateReference fromState, @JsonProperty("toState") final com.commercetools.api.models.state.StateReference toState) {
      this.customLineItemId = customLineItemId;
      this.transitionDate = transitionDate;
      this.quantity = quantity;
      this.fromState = fromState;
      this.toState = toState;
      this.type = "CustomLineItemStateTransition";
   }
   public CustomLineItemStateTransitionMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.time.ZonedDateTime getTransitionDate(){
      return this.transitionDate;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.api.models.state.StateReference getFromState(){
      return this.fromState;
   }
   
   
   public com.commercetools.api.models.state.StateReference getToState(){
      return this.toState;
   }

   public void setCustomLineItemId(final String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setTransitionDate(final java.time.ZonedDateTime transitionDate){
      this.transitionDate = transitionDate;
   }
   
   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setFromState(final com.commercetools.api.models.state.StateReference fromState){
      this.fromState = fromState;
   }
   
   public void setToState(final com.commercetools.api.models.state.StateReference toState){
      this.toState = toState;
   }

}
