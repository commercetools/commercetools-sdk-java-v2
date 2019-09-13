package com.commercetools.models.message;

import com.commercetools.models.cart.ShippingRateInput;
import com.commercetools.models.message.MessagePayload;
import java.lang.String;
import com.commercetools.models.message.OrderShippingRateInputSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderShippingRateInputSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.models.cart.ShippingRateInput oldShippingRateInput;
   
   public OrderShippingRateInputSetMessagePayloadBuilder shippingRateInput(@Nullable final com.commercetools.models.cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public OrderShippingRateInputSetMessagePayloadBuilder oldShippingRateInput(@Nullable final com.commercetools.models.cart.ShippingRateInput oldShippingRateInput) {
      this.oldShippingRateInput = oldShippingRateInput;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.models.cart.ShippingRateInput getOldShippingRateInput(){
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