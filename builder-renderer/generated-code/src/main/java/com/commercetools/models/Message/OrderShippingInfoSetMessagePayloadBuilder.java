package com.commercetools.models.Message;

import com.commercetools.models.Cart.ShippingInfo;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderShippingInfoSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderShippingInfoSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ShippingInfo shippingInfo;
   
   @Nullable
   private com.commercetools.models.Cart.ShippingInfo oldShippingInfo;
   
   public OrderShippingInfoSetMessagePayloadBuilder shippingInfo(@Nullable final com.commercetools.models.Cart.ShippingInfo shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public OrderShippingInfoSetMessagePayloadBuilder oldShippingInfo(@Nullable final com.commercetools.models.Cart.ShippingInfo oldShippingInfo) {
      this.oldShippingInfo = oldShippingInfo;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingInfo getOldShippingInfo(){
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