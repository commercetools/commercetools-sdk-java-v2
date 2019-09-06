package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Delivery;
import com.commercetools.models.Order.Parcel;
import java.lang.String;
import com.commercetools.models.Message.ParcelAddedToDeliveryMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelAddedToDeliveryMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.Delivery delivery;
   
   
   private com.commercetools.models.Order.Parcel parcel;
   
   public ParcelAddedToDeliveryMessagePayloadBuilder delivery( final com.commercetools.models.Order.Delivery delivery) {
      this.delivery = delivery;
      return this;
   }
   
   public ParcelAddedToDeliveryMessagePayloadBuilder parcel( final com.commercetools.models.Order.Parcel parcel) {
      this.parcel = parcel;
      return this;
   }
   
   
   public com.commercetools.models.Order.Delivery getDelivery(){
      return this.delivery;
   }
   
   
   public com.commercetools.models.Order.Parcel getParcel(){
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