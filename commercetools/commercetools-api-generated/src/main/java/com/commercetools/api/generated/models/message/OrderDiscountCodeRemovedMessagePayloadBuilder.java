package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.discount_code.DiscountCodeReference;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderDiscountCodeRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderDiscountCodeRemovedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode;
   
   public OrderDiscountCodeRemovedMessagePayloadBuilder discountCode( final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.discount_code.DiscountCodeReference getDiscountCode(){
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