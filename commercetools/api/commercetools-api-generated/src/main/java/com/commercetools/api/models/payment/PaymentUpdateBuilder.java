package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentUpdateBuilder {


   private java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions;


   private Long version;

   public PaymentUpdateBuilder actions( final java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions) {
      this.actions = actions;
      return this;
   }

   public PaymentUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }


   public java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> getActions(){
      return this.actions;
   }


   public Long getVersion(){
      return this.version;
   }

   public PaymentUpdate build() {
       return new PaymentUpdateImpl(actions, version);
   }

   public static PaymentUpdateBuilder of() {
      return new PaymentUpdateBuilder();
   }

   public static PaymentUpdateBuilder of(final PaymentUpdate template) {
      PaymentUpdateBuilder builder = new PaymentUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }

}
