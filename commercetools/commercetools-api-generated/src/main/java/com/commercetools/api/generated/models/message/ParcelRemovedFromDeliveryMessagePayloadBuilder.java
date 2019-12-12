package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.Parcel;
import com.commercetools.api.generated.models.message.ParcelRemovedFromDeliveryMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelRemovedFromDeliveryMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.order.Parcel parcel;
   
   
   private String deliveryId;
   
   public ParcelRemovedFromDeliveryMessagePayloadBuilder parcel( final com.commercetools.api.generated.models.order.Parcel parcel) {
      this.parcel = parcel;
      return this;
   }
   
   public ParcelRemovedFromDeliveryMessagePayloadBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.Parcel getParcel(){
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