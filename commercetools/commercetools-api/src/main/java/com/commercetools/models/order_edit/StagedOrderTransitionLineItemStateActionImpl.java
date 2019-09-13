package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.state.StateResourceIdentifier;
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
public final class StagedOrderTransitionLineItemStateActionImpl implements StagedOrderTransitionLineItemStateAction {

   private java.lang.String action;
   
   private com.commercetools.models.state.StateResourceIdentifier toState;
   
   private com.commercetools.models.state.StateResourceIdentifier fromState;
   
   private java.lang.Long quantity;
   
   private java.lang.String lineItemId;
   
   private java.time.ZonedDateTime actualTransitionDate;

   @JsonCreator
   StagedOrderTransitionLineItemStateActionImpl(@JsonProperty("toState") final com.commercetools.models.state.StateResourceIdentifier toState, @JsonProperty("fromState") final com.commercetools.models.state.StateResourceIdentifier fromState, @JsonProperty("quantity") final java.lang.Long quantity, @JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("actualTransitionDate") final java.time.ZonedDateTime actualTransitionDate) {
      this.toState = toState;
      this.fromState = fromState;
      this.quantity = quantity;
      this.lineItemId = lineItemId;
      this.actualTransitionDate = actualTransitionDate;
      this.action = "transitionLineItemState";
   }
   public StagedOrderTransitionLineItemStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.state.StateResourceIdentifier getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.models.state.StateResourceIdentifier getFromState(){
      return this.fromState;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.time.ZonedDateTime getActualTransitionDate(){
      return this.actualTransitionDate;
   }

   public void setToState(final com.commercetools.models.state.StateResourceIdentifier toState){
      this.toState = toState;
   }
   
   public void setFromState(final com.commercetools.models.state.StateResourceIdentifier fromState){
      this.fromState = fromState;
   }
   
   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }
   
   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setActualTransitionDate(final java.time.ZonedDateTime actualTransitionDate){
      this.actualTransitionDate = actualTransitionDate;
   }

}