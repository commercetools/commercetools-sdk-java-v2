package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.payment.PaymentSetMethodInfoInterfaceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetMethodInfoInterfaceActionBuilder {
   
   
   private java.lang.String _interface;
   
   public PaymentSetMethodInfoInterfaceActionBuilder _interface( final java.lang.String _interface) {
      this._interface = _interface;
      return this;
   }
   
   
   public java.lang.String getInterface(){
      return this._interface;
   }

   public PaymentSetMethodInfoInterfaceAction build() {
       return new PaymentSetMethodInfoInterfaceActionImpl(_interface);
   }
   
   public static PaymentSetMethodInfoInterfaceActionBuilder of() {
      return new PaymentSetMethodInfoInterfaceActionBuilder();
   }
   
   public static PaymentSetMethodInfoInterfaceActionBuilder of(final PaymentSetMethodInfoInterfaceAction template) {
      PaymentSetMethodInfoInterfaceActionBuilder builder = new PaymentSetMethodInfoInterfaceActionBuilder();
      builder._interface = template.getInterface();
      return builder;
   }
   
}