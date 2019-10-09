package com.commercetools.models.message;

import com.commercetools.models.common.Address;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.CustomerAddressAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerAddressAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public CustomerAddressAddedMessagePayloadBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public CustomerAddressAddedMessagePayload build() {
       return new CustomerAddressAddedMessagePayloadImpl(address);
   }
   
   public static CustomerAddressAddedMessagePayloadBuilder of() {
      return new CustomerAddressAddedMessagePayloadBuilder();
   }
   
   public static CustomerAddressAddedMessagePayloadBuilder of(final CustomerAddressAddedMessagePayload template) {
      CustomerAddressAddedMessagePayloadBuilder builder = new CustomerAddressAddedMessagePayloadBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}