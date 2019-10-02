package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentSetExternalIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetExternalIdActionBuilder {
   
   @Nullable
   private String externalId;
   
   public PaymentSetExternalIdActionBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   @Nullable
   public String getExternalId(){
      return this.externalId;
   }

   public PaymentSetExternalIdAction build() {
       return new PaymentSetExternalIdActionImpl(externalId);
   }
   
   public static PaymentSetExternalIdActionBuilder of() {
      return new PaymentSetExternalIdActionBuilder();
   }
   
   public static PaymentSetExternalIdActionBuilder of(final PaymentSetExternalIdAction template) {
      PaymentSetExternalIdActionBuilder builder = new PaymentSetExternalIdActionBuilder();
      builder.externalId = template.getExternalId();
      return builder;
   }
   
}