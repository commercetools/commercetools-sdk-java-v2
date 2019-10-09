package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.Parcel;
import com.commercetools.models.message.ParcelRemovedFromDeliveryMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelRemovedFromDeliveryMessagePayloadBuilder {
   
   
   private com.commercetools.models.order.Parcel parcel;
   
   
   private String deliveryId;
   
   public ParcelRemovedFromDeliveryMessagePayloadBuilder parcel( final com.commercetools.models.order.Parcel parcel) {
      this.parcel = parcel;
      return this;
   }
   
   public ParcelRemovedFromDeliveryMessagePayloadBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   
   public com.commercetools.models.order.Parcel getParcel(){
      return this.parcel;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }

   public ParcelRemovedFromDeliveryMessagePayload build() {
       return new ParcelRemovedFromDeliveryMessagePayloadImpl(parcel, deliveryId);
   }
   
   public static ParcelRemovedFromDeliveryMessagePayloadBuilder of() {
      return new ParcelRemovedFromDeliveryMessagePayloadBuilder();
   }
   
   public static ParcelRemovedFromDeliveryMessagePayloadBuilder of(final ParcelRemovedFromDeliveryMessagePayload template) {
      ParcelRemovedFromDeliveryMessagePayloadBuilder builder = new ParcelRemovedFromDeliveryMessagePayloadBuilder();
      builder.parcel = template.getParcel();
      builder.deliveryId = template.getDeliveryId();
      return builder;
   }
   
}