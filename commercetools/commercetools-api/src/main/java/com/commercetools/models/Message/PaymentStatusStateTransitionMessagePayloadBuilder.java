package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.state.StateReference;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.message.PaymentStatusStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentStatusStateTransitionMessagePayloadBuilder {
   
   
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.state.StateReference state;
   
   public PaymentStatusStateTransitionMessagePayloadBuilder force( final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public PaymentStatusStateTransitionMessagePayloadBuilder state( final com.commercetools.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.state.StateReference getState(){
      return this.state;
   }

   public PaymentStatusStateTransitionMessagePayload build() {
       return new PaymentStatusStateTransitionMessagePayloadImpl(force, state);
   }
   
   public static PaymentStatusStateTransitionMessagePayloadBuilder of() {
      return new PaymentStatusStateTransitionMessagePayloadBuilder();
   }
   
   public static PaymentStatusStateTransitionMessagePayloadBuilder of(final PaymentStatusStateTransitionMessagePayload template) {
      PaymentStatusStateTransitionMessagePayloadBuilder builder = new PaymentStatusStateTransitionMessagePayloadBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}