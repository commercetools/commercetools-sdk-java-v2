package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentSetCustomerAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetCustomerActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer;
   
   public PaymentSetCustomerActionBuilder customer(@Nullable final com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public PaymentSetCustomerAction build() {
       return new PaymentSetCustomerActionImpl(customer);
   }
   
   public static PaymentSetCustomerActionBuilder of() {
      return new PaymentSetCustomerActionBuilder();
   }
   
   public static PaymentSetCustomerActionBuilder of(final PaymentSetCustomerAction template) {
      PaymentSetCustomerActionBuilder builder = new PaymentSetCustomerActionBuilder();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}