package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import com.commercetools.models.State.StateResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Payment.PaymentTransitionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentTransitionStateActionBuilder {
   
   @Nullable
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.State.StateResourceIdentifier state;
   
   public PaymentTransitionStateActionBuilder force(@Nullable final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public PaymentTransitionStateActionBuilder state( final com.commercetools.models.State.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.State.StateResourceIdentifier getState(){
      return this.state;
   }

   public PaymentTransitionStateAction build() {
       return new PaymentTransitionStateActionImpl(force, state);
   }
   
   public static PaymentTransitionStateActionBuilder of() {
      return new PaymentTransitionStateActionBuilder();
   }
   
   public static PaymentTransitionStateActionBuilder of(final PaymentTransitionStateAction template) {
      PaymentTransitionStateActionBuilder builder = new PaymentTransitionStateActionBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}