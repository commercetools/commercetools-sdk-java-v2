package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.state.StateResourceIdentifier;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.order.OrderTransitionLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderTransitionLineItemStateActionBuilder {
   
   
   private com.commercetools.models.state.StateResourceIdentifier toState;
   
   
   private com.commercetools.models.state.StateResourceIdentifier fromState;
   
   
   private java.lang.Long quantity;
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private java.time.ZonedDateTime actualTransitionDate;
   
   public OrderTransitionLineItemStateActionBuilder toState( final com.commercetools.models.state.StateResourceIdentifier toState) {
      this.toState = toState;
      return this;
   }
   
   public OrderTransitionLineItemStateActionBuilder fromState( final com.commercetools.models.state.StateResourceIdentifier fromState) {
      this.fromState = fromState;
      return this;
   }
   
   public OrderTransitionLineItemStateActionBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public OrderTransitionLineItemStateActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public OrderTransitionLineItemStateActionBuilder actualTransitionDate(@Nullable final java.time.ZonedDateTime actualTransitionDate) {
      this.actualTransitionDate = actualTransitionDate;
      return this;
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
   
   @Nullable
   public java.time.ZonedDateTime getActualTransitionDate(){
      return this.actualTransitionDate;
   }

   public OrderTransitionLineItemStateAction build() {
       return new OrderTransitionLineItemStateActionImpl(toState, fromState, quantity, lineItemId, actualTransitionDate);
   }
   
   public static OrderTransitionLineItemStateActionBuilder of() {
      return new OrderTransitionLineItemStateActionBuilder();
   }
   
   public static OrderTransitionLineItemStateActionBuilder of(final OrderTransitionLineItemStateAction template) {
      OrderTransitionLineItemStateActionBuilder builder = new OrderTransitionLineItemStateActionBuilder();
      builder.toState = template.getToState();
      builder.fromState = template.getFromState();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      builder.actualTransitionDate = template.getActualTransitionDate();
      return builder;
   }
   
}