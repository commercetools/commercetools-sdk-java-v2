package com.commercetools.models.message;

import com.commercetools.models.cart.ShippingInfo;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.OrderShippingInfoSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderShippingInfoSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ShippingInfo shippingInfo;
   
   @Nullable
   private com.commercetools.models.cart.ShippingInfo oldShippingInfo;
   
   public OrderShippingInfoSetMessagePayloadBuilder shippingInfo(@Nullable final com.commercetools.models.cart.ShippingInfo shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public OrderShippingInfoSetMessagePayloadBuilder oldShippingInfo(@Nullable final com.commercetools.models.cart.ShippingInfo oldShippingInfo) {
      this.oldShippingInfo = oldShippingInfo;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   @Nullable
   public com.commercetools.models.cart.ShippingInfo getOldShippingInfo(){
      return this.oldShippingInfo;
   }

   public OrderShippingInfoSetMessagePayload build() {
       return new OrderShippingInfoSetMessagePayloadImpl(shippingInfo, oldShippingInfo);
   }
   
   public static OrderShippingInfoSetMessagePayloadBuilder of() {
      return new OrderShippingInfoSetMessagePayloadBuilder();
   }
   
   public static OrderShippingInfoSetMessagePayloadBuilder of(final OrderShippingInfoSetMessagePayload template) {
      OrderShippingInfoSetMessagePayloadBuilder builder = new OrderShippingInfoSetMessagePayloadBuilder();
      builder.shippingInfo = template.getShippingInfo();
      builder.oldShippingInfo = template.getOldShippingInfo();
      return builder;
   }
   
}