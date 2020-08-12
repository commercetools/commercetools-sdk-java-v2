package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
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
public final class OrderTransitionCustomLineItemStateActionImpl implements OrderTransitionCustomLineItemStateAction {

   private String action;
   
   private String customLineItemId;
   
   private Long quantity;
   
   private com.commercetools.api.models.state.StateResourceIdentifier fromState;
   
   private com.commercetools.api.models.state.StateResourceIdentifier toState;
   
   private java.time.ZonedDateTime actualTransitionDate;

   @JsonCreator
   OrderTransitionCustomLineItemStateActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("quantity") final Long quantity, @JsonProperty("fromState") final com.commercetools.api.models.state.StateResourceIdentifier fromState, @JsonProperty("toState") final com.commercetools.api.models.state.StateResourceIdentifier toState, @JsonProperty("actualTransitionDate") final java.time.ZonedDateTime actualTransitionDate) {
      this.customLineItemId = customLineItemId;
      this.quantity = quantity;
      this.fromState = fromState;
      this.toState = toState;
      this.actualTransitionDate = actualTransitionDate;
      this.action = "transitionCustomLineItemState";
   }
   public OrderTransitionCustomLineItemStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.api.models.state.StateResourceIdentifier getFromState(){
      return this.fromState;
   }
   
   
   public com.commercetools.api.models.state.StateResourceIdentifier getToState(){
      return this.toState;
   }
   
   
   public java.time.ZonedDateTime getActualTransitionDate(){
      return this.actualTransitionDate;
   }

   public void setCustomLineItemId(final String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setFromState(final com.commercetools.api.models.state.StateResourceIdentifier fromState){
      this.fromState = fromState;
   }
   
   public void setToState(final com.commercetools.api.models.state.StateResourceIdentifier toState){
      this.toState = toState;
   }
   
   public void setActualTransitionDate(final java.time.ZonedDateTime actualTransitionDate){
      this.actualTransitionDate = actualTransitionDate;
   }

}
