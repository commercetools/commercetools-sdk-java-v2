package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.State.StateReference;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Message.OrderStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderStateTransitionMessagePayloadBuilder {
   
   
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.State.StateReference state;
   
   public OrderStateTransitionMessagePayloadBuilder force( final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public OrderStateTransitionMessagePayloadBuilder state( final com.commercetools.models.State.StateReference state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.State.StateReference getState(){
      return this.state;
   }

   public OrderStateTransitionMessagePayload build() {
       return new OrderStateTransitionMessagePayloadImpl(force, state);
   }
   
   public static OrderStateTransitionMessagePayloadBuilder of() {
      return new OrderStateTransitionMessagePayloadBuilder();
   }
   
   public static OrderStateTransitionMessagePayloadBuilder of(final OrderStateTransitionMessagePayload template) {
      OrderStateTransitionMessagePayloadBuilder builder = new OrderStateTransitionMessagePayloadBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}