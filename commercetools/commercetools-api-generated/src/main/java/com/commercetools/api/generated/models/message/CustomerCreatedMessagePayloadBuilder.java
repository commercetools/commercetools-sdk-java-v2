package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.customer.Customer;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.CustomerCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.customer.Customer customer;
   
   public CustomerCreatedMessagePayloadBuilder customer( final com.commercetools.api.generated.models.customer.Customer customer) {
      this.customer = customer;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.customer.Customer getCustomer(){
      return this.customer;
   }

   public CustomerCreatedMessagePayload build() {
       return new CustomerCreatedMessagePayloadImpl(customer);
   }
   
   public static CustomerCreatedMessagePayloadBuilder of() {
      return new CustomerCreatedMessagePayloadBuilder();
   }
   
   public static CustomerCreatedMessagePayloadBuilder of(final CustomerCreatedMessagePayload template) {
      CustomerCreatedMessagePayloadBuilder builder = new CustomerCreatedMessagePayloadBuilder();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}