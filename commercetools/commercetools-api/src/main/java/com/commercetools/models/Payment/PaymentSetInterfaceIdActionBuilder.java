package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentSetInterfaceIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetInterfaceIdActionBuilder {
   
   
   private String interfaceId;
   
   public PaymentSetInterfaceIdActionBuilder interfaceId( final String interfaceId) {
      this.interfaceId = interfaceId;
      return this;
   }
   
   
   public String getInterfaceId(){
      return this.interfaceId;
   }

   public PaymentSetInterfaceIdAction build() {
       return new PaymentSetInterfaceIdActionImpl(interfaceId);
   }
   
   public static PaymentSetInterfaceIdActionBuilder of() {
      return new PaymentSetInterfaceIdActionBuilder();
   }
   
   public static PaymentSetInterfaceIdActionBuilder of(final PaymentSetInterfaceIdAction template) {
      PaymentSetInterfaceIdActionBuilder builder = new PaymentSetInterfaceIdActionBuilder();
      builder.interfaceId = template.getInterfaceId();
      return builder;
   }
   
}