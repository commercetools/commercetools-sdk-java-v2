package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.Delivery;
import com.commercetools.models.order.Parcel;
import java.lang.String;
import com.commercetools.models.message.ParcelAddedToDeliveryMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelAddedToDeliveryMessagePayloadBuilder {
   
   
   private com.commercetools.models.order.Delivery delivery;
   
   
   private com.commercetools.models.order.Parcel parcel;
   
   public ParcelAddedToDeliveryMessagePayloadBuilder delivery( final com.commercetools.models.order.Delivery delivery) {
      this.delivery = delivery;
      return this;
   }
   
   public ParcelAddedToDeliveryMessagePayloadBuilder parcel( final com.commercetools.models.order.Parcel parcel) {
      this.parcel = parcel;
      return this;
   }
   
   
   public com.commercetools.models.order.Delivery getDelivery(){
      return this.delivery;
   }
   
   
   public com.commercetools.models.order.Parcel getParcel(){
      return this.parcel;
   }

   public ParcelAddedToDeliveryMessagePayload build() {
       return new ParcelAddedToDeliveryMessagePayloadImpl(delivery, parcel);
   }
   
   public static ParcelAddedToDeliveryMessagePayloadBuilder of() {
      return new ParcelAddedToDeliveryMessagePayloadBuilder();
   }
   
   public static ParcelAddedToDeliveryMessagePayloadBuilder of(final ParcelAddedToDeliveryMessagePayload template) {
      ParcelAddedToDeliveryMessagePayloadBuilder builder = new ParcelAddedToDeliveryMessagePayloadBuilder();
      builder.delivery = template.getDelivery();
      builder.parcel = template.getParcel();
      return builder;
   }
   
}