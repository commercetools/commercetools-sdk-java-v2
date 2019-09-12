package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetStatusInterfaceCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetStatusInterfaceCodeActionBuilder {
   
   @Nullable
   private java.lang.String interfaceCode;
   
   public PaymentSetStatusInterfaceCodeActionBuilder interfaceCode(@Nullable final java.lang.String interfaceCode) {
      this.interfaceCode = interfaceCode;
      return this;
   }
   
   @Nullable
   public java.lang.String getInterfaceCode(){
      return this.interfaceCode;
   }

   public PaymentSetStatusInterfaceCodeAction build() {
       return new PaymentSetStatusInterfaceCodeActionImpl(interfaceCode);
   }
   
   public static PaymentSetStatusInterfaceCodeActionBuilder of() {
      return new PaymentSetStatusInterfaceCodeActionBuilder();
   }
   
   public static PaymentSetStatusInterfaceCodeActionBuilder of(final PaymentSetStatusInterfaceCodeAction template) {
      PaymentSetStatusInterfaceCodeActionBuilder builder = new PaymentSetStatusInterfaceCodeActionBuilder();
      builder.interfaceCode = template.getInterfaceCode();
      return builder;
   }
   
}