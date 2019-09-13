package com.commercetools.models.message;

import com.commercetools.models.common.Address;
import com.commercetools.models.message.MessagePayload;
import java.lang.String;
import com.commercetools.models.message.CustomerAddressChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerAddressChangedMessagePayloadBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public CustomerAddressChangedMessagePayloadBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public CustomerAddressChangedMessagePayload build() {
       return new CustomerAddressChangedMessagePayloadImpl(address);
   }
   
   public static CustomerAddressChangedMessagePayloadBuilder of() {
      return new CustomerAddressChangedMessagePayloadBuilder();
   }
   
   public static CustomerAddressChangedMessagePayloadBuilder of(final CustomerAddressChangedMessagePayload template) {
      CustomerAddressChangedMessagePayloadBuilder builder = new CustomerAddressChangedMessagePayloadBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}