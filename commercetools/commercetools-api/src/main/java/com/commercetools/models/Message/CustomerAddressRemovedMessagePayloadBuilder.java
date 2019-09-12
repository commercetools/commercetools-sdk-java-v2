package com.commercetools.models.Message;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CustomerAddressRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerAddressRemovedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public CustomerAddressRemovedMessagePayloadBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public CustomerAddressRemovedMessagePayload build() {
       return new CustomerAddressRemovedMessagePayloadImpl(address);
   }
   
   public static CustomerAddressRemovedMessagePayloadBuilder of() {
      return new CustomerAddressRemovedMessagePayloadBuilder();
   }
   
   public static CustomerAddressRemovedMessagePayloadBuilder of(final CustomerAddressRemovedMessagePayload template) {
      CustomerAddressRemovedMessagePayloadBuilder builder = new CustomerAddressRemovedMessagePayloadBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}