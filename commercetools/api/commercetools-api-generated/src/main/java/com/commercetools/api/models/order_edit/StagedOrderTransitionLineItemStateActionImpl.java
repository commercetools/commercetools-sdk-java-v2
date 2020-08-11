package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderTransitionLineItemStateActionImpl implements StagedOrderTransitionLineItemStateAction {

   private String action;

   private com.commercetools.api.models.state.StateResourceIdentifier toState;

   private com.commercetools.api.models.state.StateResourceIdentifier fromState;

   private Long quantity;

   private String lineItemId;

   private java.time.ZonedDateTime actualTransitionDate;

   @JsonCreator
   StagedOrderTransitionLineItemStateActionImpl(@JsonProperty("toState") final com.commercetools.api.models.state.StateResourceIdentifier toState, @JsonProperty("fromState") final com.commercetools.api.models.state.StateResourceIdentifier fromState, @JsonProperty("quantity") final Long quantity, @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("actualTransitionDate") final java.time.ZonedDateTime actualTransitionDate) {
      this.toState = toState;
      this.fromState = fromState;
      this.quantity = quantity;
      this.lineItemId = lineItemId;
      this.actualTransitionDate = actualTransitionDate;
      this.action = "transitionLineItemState";
   }
   public StagedOrderTransitionLineItemStateActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.state.StateResourceIdentifier getToState(){
      return this.toState;
   }


   public com.commercetools.api.models.state.StateResourceIdentifier getFromState(){
      return this.fromState;
   }


   public Long getQuantity(){
      return this.quantity;
   }


   public String getLineItemId(){
      return this.lineItemId;
   }


   public java.time.ZonedDateTime getActualTransitionDate(){
      return this.actualTransitionDate;
   }

   public void setToState(final com.commercetools.api.models.state.StateResourceIdentifier toState){
      this.toState = toState;
   }

   public void setFromState(final com.commercetools.api.models.state.StateResourceIdentifier fromState){
      this.fromState = fromState;
   }

   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }

   public void setActualTransitionDate(final java.time.ZonedDateTime actualTransitionDate){
      this.actualTransitionDate = actualTransitionDate;
   }

}
