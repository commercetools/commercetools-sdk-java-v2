package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Delivery;
import java.lang.String;
import com.commercetools.models.Message.DeliveryAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DeliveryAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.Delivery delivery;
   
   public DeliveryAddedMessagePayloadBuilder delivery( final com.commercetools.models.Order.Delivery delivery) {
      this.delivery = delivery;
      return this;
   }
   
   
   public com.commercetools.models.Order.Delivery getDelivery(){
      return this.delivery;
   }

   public DeliveryAddedMessagePayload build() {
       return new DeliveryAddedMessagePayloadImpl(delivery);
   }
   
   public static DeliveryAddedMessagePayloadBuilder of() {
      return new DeliveryAddedMessagePayloadBuilder();
   }
   
   public static DeliveryAddedMessagePayloadBuilder of(final DeliveryAddedMessagePayload template) {
      DeliveryAddedMessagePayloadBuilder builder = new DeliveryAddedMessagePayloadBuilder();
      builder.delivery = template.getDelivery();
      return builder;
   }
   
}