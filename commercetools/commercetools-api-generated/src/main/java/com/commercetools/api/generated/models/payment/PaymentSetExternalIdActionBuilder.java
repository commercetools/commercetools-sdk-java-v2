package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentSetExternalIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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