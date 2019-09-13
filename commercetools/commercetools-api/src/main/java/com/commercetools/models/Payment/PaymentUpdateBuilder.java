package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import java.lang.Long;
import com.commercetools.models.payment.PaymentUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.payment.PaymentUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public PaymentUpdateBuilder actions( final java.util.List<com.commercetools.models.payment.PaymentUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public PaymentUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.payment.PaymentUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
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