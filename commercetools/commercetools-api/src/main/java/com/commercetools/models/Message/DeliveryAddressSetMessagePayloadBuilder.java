package com.commercetools.models.message;

import com.commercetools.models.common.Address;
import com.commercetools.models.message.MessagePayload;
import java.lang.String;
import com.commercetools.models.message.DeliveryAddressSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DeliveryAddressSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.common.Address oldAddress;
   
   
   private java.lang.String deliveryId;
   
   @Nullable
   private com.commercetools.models.common.Address address;
   
   public DeliveryAddressSetMessagePayloadBuilder oldAddress(@Nullable final com.commercetools.models.common.Address oldAddress) {
      this.oldAddress = oldAddress;
      return this;
   }
   
   public DeliveryAddressSetMessagePayloadBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public DeliveryAddressSetMessagePayloadBuilder address(@Nullable final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getOldAddress(){
      return this.oldAddress;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getAddress(){
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