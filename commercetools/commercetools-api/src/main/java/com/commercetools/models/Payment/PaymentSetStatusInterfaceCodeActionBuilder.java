package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentSetStatusInterfaceCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetStatusInterfaceCodeActionBuilder {
   
   @Nullable
   private String interfaceCode;
   
   public PaymentSetStatusInterfaceCodeActionBuilder interfaceCode(@Nullable final String interfaceCode) {
      this.interfaceCode = interfaceCode;
      return this;
   }
   
   @Nullable
   public String getInterfaceCode(){
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