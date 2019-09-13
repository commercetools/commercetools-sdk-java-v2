package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.state.StateResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.order.OrderTransitionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderTransitionStateActionBuilder {
   
   @Nullable
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.state.StateResourceIdentifier state;
   
   public OrderTransitionStateActionBuilder force(@Nullable final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public OrderTransitionStateActionBuilder state( final com.commercetools.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.state.StateResourceIdentifier getState(){
      return this.state;
   }

   public OrderTransitionStateAction build() {
       return new OrderTransitionStateActionImpl(force, state);
   }
   
   public static OrderTransitionStateActionBuilder of() {
      return new OrderTransitionStateActionBuilder();
   }
   
   public static OrderTransitionStateActionBuilder of(final OrderTransitionStateAction template) {
      OrderTransitionStateActionBuilder builder = new OrderTransitionStateActionBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}