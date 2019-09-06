package com.commercetools.models.Message;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CustomerAddressAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerAddressAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public CustomerAddressAddedMessagePayloadBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
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