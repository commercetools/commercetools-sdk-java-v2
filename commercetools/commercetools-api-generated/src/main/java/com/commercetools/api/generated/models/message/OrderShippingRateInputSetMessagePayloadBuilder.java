package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.ShippingRateInput;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderShippingRateInputSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderShippingRateInputSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ShippingRateInput oldShippingRateInput;
   
   public OrderShippingRateInputSetMessagePayloadBuilder shippingRateInput(@Nullable final com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public OrderShippingRateInputSetMessagePayloadBuilder oldShippingRateInput(@Nullable final com.commercetools.api.generated.models.cart.ShippingRateInput oldShippingRateInput) {
      this.oldShippingRateInput = oldShippingRateInput;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ShippingRateInput getOldShippingRateInput(){
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