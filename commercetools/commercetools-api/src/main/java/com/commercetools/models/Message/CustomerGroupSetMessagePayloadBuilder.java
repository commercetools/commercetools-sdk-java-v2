package com.commercetools.models.Message;

import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CustomerGroupSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupSetMessagePayloadBuilder {
   
   
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   public CustomerGroupSetMessagePayloadBuilder customerGroup( final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }

   public CustomerGroupSetMessagePayload build() {
       return new CustomerGroupSetMessagePayloadImpl(customerGroup);
   }
   
   public static CustomerGroupSetMessagePayloadBuilder of() {
      return new CustomerGroupSetMessagePayloadBuilder();
   }
   
   public static CustomerGroupSetMessagePayloadBuilder of(final CustomerGroupSetMessagePayload template) {
      CustomerGroupSetMessagePayloadBuilder builder = new CustomerGroupSetMessagePayloadBuilder();
      builder.customerGroup = template.getCustomerGroup();
      return builder;
   }
   
}