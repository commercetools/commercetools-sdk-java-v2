package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.Delivery;
import com.commercetools.api.generated.models.message.DeliveryRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryRemovedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.order.Delivery delivery;
   
   public DeliveryRemovedMessagePayloadBuilder delivery( final com.commercetools.api.generated.models.order.Delivery delivery) {
      this.delivery = delivery;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.Delivery getDelivery(){
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