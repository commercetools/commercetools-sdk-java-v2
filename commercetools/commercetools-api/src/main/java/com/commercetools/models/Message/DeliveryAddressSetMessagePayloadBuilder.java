package com.commercetools.models.Message;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.DeliveryAddressSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DeliveryAddressSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address oldAddress;
   
   
   private java.lang.String deliveryId;
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public DeliveryAddressSetMessagePayloadBuilder oldAddress(@Nullable final com.commercetools.models.Common.Address oldAddress) {
      this.oldAddress = oldAddress;
      return this;
   }
   
   public DeliveryAddressSetMessagePayloadBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public DeliveryAddressSetMessagePayloadBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getOldAddress(){
      return this.oldAddress;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public DeliveryAddressSetMessagePayload build() {
       return new DeliveryAddressSetMessagePayloadImpl(oldAddress, deliveryId, address);
   }
   
   public static DeliveryAddressSetMessagePayloadBuilder of() {
      return new DeliveryAddressSetMessagePayloadBuilder();
   }
   
   public static DeliveryAddressSetMessagePayloadBuilder of(final DeliveryAddressSetMessagePayload template) {
      DeliveryAddressSetMessagePayloadBuilder builder = new DeliveryAddressSetMessagePayloadBuilder();
      builder.oldAddress = template.getOldAddress();
      builder.deliveryId = template.getDeliveryId();
      builder.address = template.getAddress();
      return builder;
   }
   
}