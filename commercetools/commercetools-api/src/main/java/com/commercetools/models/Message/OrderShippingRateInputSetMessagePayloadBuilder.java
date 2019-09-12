package com.commercetools.models.Message;

import com.commercetools.models.Cart.ShippingRateInput;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderShippingRateInputSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderShippingRateInputSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.models.Cart.ShippingRateInput oldShippingRateInput;
   
   public OrderShippingRateInputSetMessagePayloadBuilder shippingRateInput(@Nullable final com.commercetools.models.Cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public OrderShippingRateInputSetMessagePayloadBuilder oldShippingRateInput(@Nullable final com.commercetools.models.Cart.ShippingRateInput oldShippingRateInput) {
      this.oldShippingRateInput = oldShippingRateInput;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingRateInput getOldShippingRateInput(){
      return this.oldShippingRateInput;
   }

   public OrderShippingRateInputSetMessagePayload build() {
       return new OrderShippingRateInputSetMessagePayloadImpl(shippingRateInput, oldShippingRateInput);
   }
   
   public static OrderShippingRateInputSetMessagePayloadBuilder of() {
      return new OrderShippingRateInputSetMessagePayloadBuilder();
   }
   
   public static OrderShippingRateInputSetMessagePayloadBuilder of(final OrderShippingRateInputSetMessagePayload template) {
      OrderShippingRateInputSetMessagePayloadBuilder builder = new OrderShippingRateInputSetMessagePayloadBuilder();
      builder.shippingRateInput = template.getShippingRateInput();
      builder.oldShippingRateInput = template.getOldShippingRateInput();
      return builder;
   }
   
}