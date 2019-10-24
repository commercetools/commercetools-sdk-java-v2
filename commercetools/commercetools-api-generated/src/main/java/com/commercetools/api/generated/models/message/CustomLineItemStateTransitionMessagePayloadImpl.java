package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.state.StateReference;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
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

   private String type;
   
   private com.commercetools.api.generated.models.state.StateReference toState;
   
   private com.commercetools.api.generated.models.state.StateReference fromState;
   
   private String customLineItemId;
   
   private Long quantity;
   
   private java.time.ZonedDateTime transitionDate;

   @JsonCreator
   CustomLineItemStateTransitionMessagePayloadImpl(@JsonProperty("toState") final com.commercetools.api.generated.models.state.StateReference toState, @JsonProperty("fromState") final com.commercetools.api.generated.models.state.StateReference fromState, @JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("quantity") final Long quantity, @JsonProperty("transitionDate") final java.time.ZonedDateTime transitionDate) {
      this.toState = toState;
      this.fromState = fromState;
      this.customLineItemId = customLineItemId;
      this.quantity = quantity;
      this.transitionDate = transitionDate;
      this.type = "CustomLineItemStateTransition";
   }
   public CustomLineItemStateTransitionMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getFromState(){
      return this.fromState;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.time.ZonedDateTime getTransitionDate(){
      return this.transitionDate;
   }

   public void setToState(final com.commercetools.api.generated.models.state.StateReference toState){
      this.toState = toState;
   }
   
   public void setFromState(final com.commercetools.api.generated.models.state.StateReference fromState){
      this.fromState = fromState;
   }
   
   public void setCustomLineItemId(final String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setTransitionDate(final java.time.ZonedDateTime transitionDate){
      this.transitionDate = transitionDate;
   }

}