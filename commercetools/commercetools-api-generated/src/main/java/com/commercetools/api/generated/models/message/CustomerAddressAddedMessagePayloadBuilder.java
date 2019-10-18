package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.CustomerAddressAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerAddressAddedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.common.Address address;
   
   public CustomerAddressAddedMessagePayloadBuilder address( final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
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