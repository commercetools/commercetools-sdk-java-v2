package com.commercetools.models.Message;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderBillingAddressSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderBillingAddressSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address oldAddress;
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public OrderBillingAddressSetMessagePayloadBuilder oldAddress(@Nullable final com.commercetools.models.Common.Address oldAddress) {
      this.oldAddress = oldAddress;
      return this;
   }
   
   public OrderBillingAddressSetMessagePayloadBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
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

   public OrderBillingAddressSetMessagePayload build() {
       return new OrderBillingAddressSetMessagePayloadImpl(oldAddress, address);
   }
   
   public static OrderBillingAddressSetMessagePayloadBuilder of() {
      return new OrderBillingAddressSetMessagePayloadBuilder();
   }
   
   public static OrderBillingAddressSetMessagePayloadBuilder of(final OrderBillingAddressSetMessagePayload template) {
      OrderBillingAddressSetMessagePayloadBuilder builder = new OrderBillingAddressSetMessagePayloadBuilder();
      builder.oldAddress = template.getOldAddress();
      builder.address = template.getAddress();
      return builder;
   }
   
}