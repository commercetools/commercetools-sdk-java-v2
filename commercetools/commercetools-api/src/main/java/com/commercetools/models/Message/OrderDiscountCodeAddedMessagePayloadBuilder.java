package com.commercetools.models.Message;

import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderDiscountCodeAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderDiscountCodeAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;
   
   public OrderDiscountCodeAddedMessagePayloadBuilder discountCode( final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
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