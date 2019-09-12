package com.commercetools.models.Payment;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetMethodInfoNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetMethodInfoNameActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString name;
   
   public PaymentSetMethodInfoNameActionBuilder name(@Nullable final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getName(){
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