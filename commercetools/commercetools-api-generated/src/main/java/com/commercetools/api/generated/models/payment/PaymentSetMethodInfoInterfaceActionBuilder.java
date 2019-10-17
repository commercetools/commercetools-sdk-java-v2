package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentSetMethodInfoInterfaceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetMethodInfoInterfaceActionBuilder {
   
   
   private String _interface;
   
   public PaymentSetMethodInfoInterfaceActionBuilder _interface( final String _interface) {
      this._interface = _interface;
      return this;
   }
   
   
   public String getInterface(){
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