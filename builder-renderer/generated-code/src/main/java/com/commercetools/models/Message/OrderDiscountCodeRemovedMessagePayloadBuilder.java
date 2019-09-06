package com.commercetools.models.Message;

import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderDiscountCodeRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderDiscountCodeRemovedMessagePayloadBuilder {
   
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;
   
   public OrderDiscountCodeRemovedMessagePayloadBuilder discountCode( final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public OrderDiscountCodeRemovedMessagePayload build() {
       return new OrderDiscountCodeRemovedMessagePayloadImpl(discountCode);
   }
   
   public static OrderDiscountCodeRemovedMessagePayloadBuilder of() {
      return new OrderDiscountCodeRemovedMessagePayloadBuilder();
   }
   
   public static OrderDiscountCodeRemovedMessagePayloadBuilder of(final OrderDiscountCodeRemovedMessagePayload template) {
      OrderDiscountCodeRemovedMessagePayloadBuilder builder = new OrderDiscountCodeRemovedMessagePayloadBuilder();
      builder.discountCode = template.getDiscountCode();
      return builder;
   }
   
}