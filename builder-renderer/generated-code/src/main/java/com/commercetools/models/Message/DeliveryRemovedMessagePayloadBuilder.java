package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Delivery;
import java.lang.String;
import com.commercetools.models.Message.DeliveryRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DeliveryRemovedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.Delivery delivery;
   
   public DeliveryRemovedMessagePayloadBuilder delivery( final com.commercetools.models.Order.Delivery delivery) {
      this.delivery = delivery;
      return this;
   }
   
   
   public com.commercetools.models.Order.Delivery getDelivery(){
      return this.delivery;
   }

   public DeliveryRemovedMessagePayload build() {
       return new DeliveryRemovedMessagePayloadImpl(delivery);
   }
   
   public static DeliveryRemovedMessagePayloadBuilder of() {
      return new DeliveryRemovedMessagePayloadBuilder();
   }
   
   public static DeliveryRemovedMessagePayloadBuilder of(final DeliveryRemovedMessagePayload template) {
      DeliveryRemovedMessagePayloadBuilder builder = new DeliveryRemovedMessagePayloadBuilder();
      builder.delivery = template.getDelivery();
      return builder;
   }
   
}