package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.state.StateResourceIdentifier;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.order_edit.StagedOrderTransitionCustomLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderTransitionCustomLineItemStateActionBuilder {
   
   
   private com.commercetools.models.state.StateResourceIdentifier toState;
   
   
   private com.commercetools.models.state.StateResourceIdentifier fromState;
   
   
   private java.lang.String customLineItemId;
   
   
   private java.lang.Long quantity;
   
   @Nullable
   private java.time.ZonedDateTime actualTransitionDate;
   
   public StagedOrderTransitionCustomLineItemStateActionBuilder toState( final com.commercetools.models.state.StateResourceIdentifier toState) {
      this.toState = toState;
      return this;
   }
   
   public StagedOrderTransitionCustomLineItemStateActionBuilder fromState( final com.commercetools.models.state.StateResourceIdentifier fromState) {
      this.fromState = fromState;
      return this;
   }
   
   public StagedOrderTransitionCustomLineItemStateActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderTransitionCustomLineItemStateActionBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public StagedOrderTransitionCustomLineItemStateActionBuilder actualTransitionDate(@Nullable final java.time.ZonedDateTime actualTransitionDate) {
      this.actualTransitionDate = actualTransitionDate;
      return this;
   }
   
   
   public com.commercetools.models.state.StateResourceIdentifier getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.models.state.StateResourceIdentifier getFromState(){
      return this.fromState;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public java.time.ZonedDateTime getActualTransitionDate(){
      return this.actualTransitionDate;
   }

   public StagedOrderTransitionCustomLineItemStateAction build() {
       return new StagedOrderTransitionCustomLineItemStateActionImpl(toState, fromState, customLineItemId, quantity, actualTransitionDate);
   }
   
   public static StagedOrderTransitionCustomLineItemStateActionBuilder of() {
      return new StagedOrderTransitionCustomLineItemStateActionBuilder();
   }
   
   public static StagedOrderTransitionCustomLineItemStateActionBuilder of(final StagedOrderTransitionCustomLineItemStateAction template) {
      StagedOrderTransitionCustomLineItemStateActionBuilder builder = new StagedOrderTransitionCustomLineItemStateActionBuilder();
      builder.toState = template.getToState();
      builder.fromState = template.getFromState();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.quantity = template.getQuantity();
      builder.actualTransitionDate = template.getActualTransitionDate();
      return builder;
   }
   
}