package com.commercetools.models.message;

import com.commercetools.models.customer.Customer;
import com.commercetools.models.message.MessagePayload;
import java.lang.String;
import com.commercetools.models.message.CustomerCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.models.customer.Customer customer;
   
   public CustomerCreatedMessagePayloadBuilder customer( final com.commercetools.models.customer.Customer customer) {
      this.customer = customer;
      return this;
   }
   
   
   public com.commercetools.models.customer.Customer getCustomer(){
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