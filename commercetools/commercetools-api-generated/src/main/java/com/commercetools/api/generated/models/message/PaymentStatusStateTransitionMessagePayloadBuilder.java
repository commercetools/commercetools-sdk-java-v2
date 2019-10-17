package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.message.PaymentStatusStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentStatusStateTransitionMessagePayloadBuilder {
   
   
   private Boolean force;
   
   
   private com.commercetools.api.generated.models.state.StateReference state;
   
   public PaymentStatusStateTransitionMessagePayloadBuilder force( final Boolean force) {
      this.force = force;
      return this;
   }
   
   public PaymentStatusStateTransitionMessagePayloadBuilder state( final com.commercetools.api.generated.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   
   public Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getState(){
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