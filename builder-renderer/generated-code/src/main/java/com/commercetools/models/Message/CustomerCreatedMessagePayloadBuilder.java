package com.commercetools.models.Message;

import com.commercetools.models.Customer.Customer;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CustomerCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Customer.Customer customer;
   
   public CustomerCreatedMessagePayloadBuilder customer( final com.commercetools.models.Customer.Customer customer) {
      this.customer = customer;
      return this;
   }
   
   
   public com.commercetools.models.Customer.Customer getCustomer(){
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