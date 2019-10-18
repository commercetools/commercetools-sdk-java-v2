package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order.OrderTransitionLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderTransitionLineItemStateActionBuilder {
   
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier toState;
   
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier fromState;
   
   
   private Long quantity;
   
   
   private String lineItemId;
   
   @Nullable
   private java.time.ZonedDateTime actualTransitionDate;
   
   public OrderTransitionLineItemStateActionBuilder toState( final com.commercetools.api.generated.models.state.StateResourceIdentifier toState) {
      this.toState = toState;
      return this;
   }
   
   public OrderTransitionLineItemStateActionBuilder fromState( final com.commercetools.api.generated.models.state.StateResourceIdentifier fromState) {
      this.fromState = fromState;
      return this;
   }
   
   public OrderTransitionLineItemStateActionBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public OrderTransitionLineItemStateActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public OrderTransitionLineItemStateActionBuilder actualTransitionDate(@Nullable final java.time.ZonedDateTime actualTransitionDate) {
      this.actualTransitionDate = actualTransitionDate;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getFromState(){
      return this.fromState;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getLineItemId(){
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