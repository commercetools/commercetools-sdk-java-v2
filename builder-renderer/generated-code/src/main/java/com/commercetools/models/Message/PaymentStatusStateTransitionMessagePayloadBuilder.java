package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.State.StateReference;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Message.PaymentStatusStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentStatusStateTransitionMessagePayloadBuilder {
   
   
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.State.StateReference state;
   
   public PaymentStatusStateTransitionMessagePayloadBuilder force( final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public PaymentStatusStateTransitionMessagePayloadBuilder state( final com.commercetools.models.State.StateReference state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.State.StateReference getState(){
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