package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.payment.PaymentTransitionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentTransitionStateActionBuilder {
   
   @Nullable
   private Boolean force;
   
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier state;
   
   public PaymentTransitionStateActionBuilder force(@Nullable final Boolean force) {
      this.force = force;
      return this;
   }
   
   public PaymentTransitionStateActionBuilder state( final com.commercetools.api.generated.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getState(){
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