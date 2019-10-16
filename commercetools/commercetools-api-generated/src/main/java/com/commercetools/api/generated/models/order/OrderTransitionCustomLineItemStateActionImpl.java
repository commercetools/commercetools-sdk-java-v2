package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
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
public final class OrderTransitionCustomLineItemStateActionImpl implements OrderTransitionCustomLineItemStateAction {

   private String action;
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier toState;
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier fromState;
   
   private String customLineItemId;
   
   private Long quantity;
   
   private java.time.ZonedDateTime actualTransitionDate;

   @JsonCreator
   OrderTransitionCustomLineItemStateActionImpl(@JsonProperty("toState") final com.commercetools.api.generated.models.state.StateResourceIdentifier toState, @JsonProperty("fromState") final com.commercetools.api.generated.models.state.StateResourceIdentifier fromState, @JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("quantity") final Long quantity, @JsonProperty("actualTransitionDate") final java.time.ZonedDateTime actualTransitionDate) {
      this.toState = toState;
      this.fromState = fromState;
      this.customLineItemId = customLineItemId;
      this.quantity = quantity;
      this.actualTransitionDate = actualTransitionDate;
      this.action = "transitionCustomLineItemState";
   }
   public OrderTransitionCustomLineItemStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getFromState(){
      return this.fromState;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.time.ZonedDateTime getActualTransitionDate(){
      return this.actualTransitionDate;
   }

   public void setToState(final com.commercetools.api.generated.models.state.StateResourceIdentifier toState){
      this.toState = toState;
   }
   
   public void setFromState(final com.commercetools.api.generated.models.state.StateResourceIdentifier fromState){
      this.fromState = fromState;
   }
   
   public void setCustomLineItemId(final String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setActualTransitionDate(final java.time.ZonedDateTime actualTransitionDate){
      this.actualTransitionDate = actualTransitionDate;
   }

}