package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.DeliveryAddressSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryAddressSetMessagePayloadBuilder {

   @Nullable
   private com.commercetools.api.models.common.Address oldAddress;


   private String deliveryId;

   @Nullable
   private com.commercetools.api.models.common.Address address;

   public DeliveryAddressSetMessagePayloadBuilder oldAddress(@Nullable final com.commercetools.api.models.common.Address oldAddress) {
      this.oldAddress = oldAddress;
      return this;
   }

   public DeliveryAddressSetMessagePayloadBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }

   public DeliveryAddressSetMessagePayloadBuilder address(@Nullable final com.commercetools.api.models.common.Address address) {
      this.address = address;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.common.Address getOldAddress(){
      return this.oldAddress;
   }


   public String getDeliveryId(){
      return this.deliveryId;
   }

   @Nullable
   public com.commercetools.api.models.common.Address getAddress(){
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
