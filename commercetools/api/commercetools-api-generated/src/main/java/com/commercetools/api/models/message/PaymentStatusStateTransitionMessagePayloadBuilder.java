package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentStatusStateTransitionMessagePayloadBuilder {


   private Boolean force;


   private com.commercetools.api.models.state.StateReference state;

   public PaymentStatusStateTransitionMessagePayloadBuilder force( final Boolean force) {
      this.force = force;
      return this;
   }

   public PaymentStatusStateTransitionMessagePayloadBuilder state( final com.commercetools.api.models.state.StateReference state) {
      this.state = state;
      return this;
   }


   public Boolean getForce(){
      return this.force;
   }


   public com.commercetools.api.models.state.StateReference getState(){
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
