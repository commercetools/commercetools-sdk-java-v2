package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentMethodInfoBuilder {

   @Nullable
   private String method;

   @Nullable
   private com.commercetools.api.models.common.LocalizedString name;

   @Nullable
   private String paymentInterface;

   public PaymentMethodInfoBuilder method(@Nullable final String method) {
      this.method = method;
      return this;
   }

   public PaymentMethodInfoBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }

   public PaymentMethodInfoBuilder paymentInterface(@Nullable final String paymentInterface) {
      this.paymentInterface = paymentInterface;
      return this;
   }

   @Nullable
   public String getMethod(){
      return this.method;
   }

   @Nullable
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }

   @Nullable
   public String getPaymentInterface(){
      return this.paymentInterface;
   }

   public PaymentMethodInfo build() {
       return new PaymentMethodInfoImpl(method, name, paymentInterface);
   }

   public static PaymentMethodInfoBuilder of() {
      return new PaymentMethodInfoBuilder();
   }

   public static PaymentMethodInfoBuilder of(final PaymentMethodInfo template) {
      PaymentMethodInfoBuilder builder = new PaymentMethodInfoBuilder();
      builder.method = template.getMethod();
      builder.name = template.getName();
      builder.paymentInterface = template.getPaymentInterface();
      return builder;
   }

}
