package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.State.StateResourceIdentifier;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderTransitionCustomLineItemStateActionImpl implements StagedOrderTransitionCustomLineItemStateAction {

   private java.lang.String action;
   
   private com.commercetools.models.State.StateResourceIdentifier toState;
   
   private com.commercetools.models.State.StateResourceIdentifier fromState;
   
   private java.lang.String customLineItemId;
   
   private java.lang.Long quantity;
   
   private java.time.ZonedDateTime actualTransitionDate;

   @JsonCreator
   StagedOrderTransitionCustomLineItemStateActionImpl(@JsonProperty("toState") final com.commercetools.models.State.StateResourceIdentifier toState, @JsonProperty("fromState") final com.commercetools.models.State.StateResourceIdentifier fromState, @JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("quantity") final java.lang.Long quantity, @JsonProperty("actualTransitionDate") final java.time.ZonedDateTime actualTransitionDate) {
      this.toState = toState;
      this.fromState = fromState;
      this.customLineItemId = customLineItemId;
      this.quantity = quantity;
      this.actualTransitionDate = actualTransitionDate;
      this.action = "transitionCustomLineItemState";
   }
   public StagedOrderTransitionCustomLineItemStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.State.StateResourceIdentifier getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.models.State.StateResourceIdentifier getFromState(){
      return this.fromState;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.time.ZonedDateTime getActualTransitionDate(){
      return this.actualTransitionDate;
   }

   public void setToState(final com.commercetools.models.State.StateResourceIdentifier toState){
      this.toState = toState;
   }
   
   public void setFromState(final com.commercetools.models.State.StateResourceIdentifier fromState){
      this.fromState = fromState;
   }
   
   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }
   
   public void setActualTransitionDate(final java.time.ZonedDateTime actualTransitionDate){
      this.actualTransitionDate = actualTransitionDate;
   }

}