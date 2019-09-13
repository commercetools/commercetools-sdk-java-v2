package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.payment.PaymentSetStatusInterfaceTextAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetStatusInterfaceTextActionBuilder {
   
   
   private java.lang.String interfaceText;
   
   public PaymentSetStatusInterfaceTextActionBuilder interfaceText( final java.lang.String interfaceText) {
      this.interfaceText = interfaceText;
      return this;
   }
   
   
   public java.lang.String getInterfaceText(){
      return this.interfaceText;
   }

   public PaymentSetStatusInterfaceTextAction build() {
       return new PaymentSetStatusInterfaceTextActionImpl(interfaceText);
   }
   
   public static PaymentSetStatusInterfaceTextActionBuilder of() {
      return new PaymentSetStatusInterfaceTextActionBuilder();
   }
   
   public static PaymentSetStatusInterfaceTextActionBuilder of(final PaymentSetStatusInterfaceTextAction template) {
      PaymentSetStatusInterfaceTextActionBuilder builder = new PaymentSetStatusInterfaceTextActionBuilder();
      builder.interfaceText = template.getInterfaceText();
      return builder;
   }
   
}