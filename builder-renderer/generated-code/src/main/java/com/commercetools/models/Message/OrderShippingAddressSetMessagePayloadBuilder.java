package com.commercetools.models.Message;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderShippingAddressSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderShippingAddressSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address oldAddress;
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public OrderShippingAddressSetMessagePayloadBuilder oldAddress(@Nullable final com.commercetools.models.Common.Address oldAddress) {
      this.oldAddress = oldAddress;
      return this;
   }
   
   public OrderShippingAddressSetMessagePayloadBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getOldAddress(){
      return this.oldAddress;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public OrderShippingAddressSetMessagePayload build() {
       return new OrderShippingAddressSetMessagePayloadImpl(oldAddress, address);
   }
   
   public static OrderShippingAddressSetMessagePayloadBuilder of() {
      return new OrderShippingAddressSetMessagePayloadBuilder();
   }
   
   public static OrderShippingAddressSetMessagePayloadBuilder of(final OrderShippingAddressSetMessagePayload template) {
      OrderShippingAddressSetMessagePayloadBuilder builder = new OrderShippingAddressSetMessagePayloadBuilder();
      builder.oldAddress = template.getOldAddress();
      builder.address = template.getAddress();
      return builder;
   }
   
}