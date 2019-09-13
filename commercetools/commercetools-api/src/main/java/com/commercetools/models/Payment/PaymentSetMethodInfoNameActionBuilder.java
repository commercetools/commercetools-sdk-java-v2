package com.commercetools.models.payment;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.payment.PaymentSetMethodInfoNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetMethodInfoNameActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString name;
   
   public PaymentSetMethodInfoNameActionBuilder name(@Nullable final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }

   public PaymentSetMethodInfoNameAction build() {
       return new PaymentSetMethodInfoNameActionImpl(name);
   }
   
   public static PaymentSetMethodInfoNameActionBuilder of() {
      return new PaymentSetMethodInfoNameActionBuilder();
   }
   
   public static PaymentSetMethodInfoNameActionBuilder of(final PaymentSetMethodInfoNameAction template) {
      PaymentSetMethodInfoNameActionBuilder builder = new PaymentSetMethodInfoNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}