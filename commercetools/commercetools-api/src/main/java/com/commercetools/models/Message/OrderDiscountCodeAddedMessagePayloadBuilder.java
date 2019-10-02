package com.commercetools.models.message;

import com.commercetools.models.discount_code.DiscountCodeReference;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.OrderDiscountCodeAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderDiscountCodeAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.discount_code.DiscountCodeReference discountCode;
   
   public OrderDiscountCodeAddedMessagePayloadBuilder discountCode( final com.commercetools.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public OrderDiscountCodeAddedMessagePayload build() {
       return new OrderDiscountCodeAddedMessagePayloadImpl(discountCode);
   }
   
   public static OrderDiscountCodeAddedMessagePayloadBuilder of() {
      return new OrderDiscountCodeAddedMessagePayloadBuilder();
   }
   
   public static OrderDiscountCodeAddedMessagePayloadBuilder of(final OrderDiscountCodeAddedMessagePayload template) {
      OrderDiscountCodeAddedMessagePayloadBuilder builder = new OrderDiscountCodeAddedMessagePayloadBuilder();
      builder.discountCode = template.getDiscountCode();
      return builder;
   }
   
}