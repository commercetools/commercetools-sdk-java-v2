package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Parcel;
import java.lang.String;
import com.commercetools.models.Message.ParcelRemovedFromDeliveryMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelRemovedFromDeliveryMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.Parcel parcel;
   
   
   private java.lang.String deliveryId;
   
   public ParcelRemovedFromDeliveryMessagePayloadBuilder parcel( final com.commercetools.models.Order.Parcel parcel) {
      this.parcel = parcel;
      return this;
   }
   
   public ParcelRemovedFromDeliveryMessagePayloadBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   
   public com.commercetools.models.Order.Parcel getParcel(){
      return this.parcel;
   }
   
   
   public java.lang.String getDeliveryId(){
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