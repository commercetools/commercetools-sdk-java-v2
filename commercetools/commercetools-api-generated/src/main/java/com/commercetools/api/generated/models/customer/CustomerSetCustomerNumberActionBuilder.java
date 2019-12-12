package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerSetCustomerNumberAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetCustomerNumberActionBuilder {
   
   @Nullable
   private String customerNumber;
   
   public CustomerSetCustomerNumberActionBuilder customerNumber(@Nullable final String customerNumber) {
      this.customerNumber = customerNumber;
      return this;
   }
   
   @Nullable
   public String getCustomerNumber(){
      return this.customerNumber;
   }

   public CustomerSetCustomerNumberAction build() {
       return new CustomerSetCustomerNumberActionImpl(customerNumber);
   }
   
   public static CustomerSetCustomerNumberActionBuilder of() {
      return new CustomerSetCustomerNumberActionBuilder();
   }
   
   public static CustomerSetCustomerNumberActionBuilder of(final CustomerSetCustomerNumberAction template) {
      CustomerSetCustomerNumberActionBuilder builder = new CustomerSetCustomerNumberActionBuilder();
      builder.customerNumber = template.getCustomerNumber();
      return builder;
   }
   
}