package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order.OrderTransitionCustomLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderTransitionCustomLineItemStateActionBuilder {
   
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier toState;
   
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier fromState;
   
   
   private String customLineItemId;
   
   
   private Long quantity;
   
   @Nullable
   private java.time.ZonedDateTime actualTransitionDate;
   
   public OrderTransitionCustomLineItemStateActionBuilder toState( final com.commercetools.api.generated.models.state.StateResourceIdentifier toState) {
      this.toState = toState;
      return this;
   }
   
   public OrderTransitionCustomLineItemStateActionBuilder fromState( final com.commercetools.api.generated.models.state.StateResourceIdentifier fromState) {
      this.fromState = fromState;
      return this;
   }
   
   public OrderTransitionCustomLineItemStateActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public OrderTransitionCustomLineItemStateActionBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public OrderTransitionCustomLineItemStateActionBuilder actualTransitionDate(@Nullable final java.time.ZonedDateTime actualTransitionDate) {
      this.actualTransitionDate = actualTransitionDate;
      return this;
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
   
   @Nullable
   public java.time.ZonedDateTime getActualTransitionDate(){
      return this.actualTransitionDate;
   }

   public OrderTransitionCustomLineItemStateAction build() {
       return new OrderTransitionCustomLineItemStateActionImpl(toState, fromState, customLineItemId, quantity, actualTransitionDate);
   }
   
   public static OrderTransitionCustomLineItemStateActionBuilder of() {
      return new OrderTransitionCustomLineItemStateActionBuilder();
   }
   
   public static OrderTransitionCustomLineItemStateActionBuilder of(final OrderTransitionCustomLineItemStateAction template) {
      OrderTransitionCustomLineItemStateActionBuilder builder = new OrderTransitionCustomLineItemStateActionBuilder();
      builder.toState = template.getToState();
      builder.fromState = template.getFromState();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.quantity = template.getQuantity();
      builder.actualTransitionDate = template.getActualTransitionDate();
      return builder;
   }
   
}