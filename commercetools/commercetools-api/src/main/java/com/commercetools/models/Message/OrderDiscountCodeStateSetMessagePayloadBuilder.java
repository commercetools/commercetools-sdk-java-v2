package com.commercetools.models.Message;

import com.commercetools.models.Cart.DiscountCodeState;
import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderDiscountCodeStateSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderDiscountCodeStateSetMessagePayloadBuilder {
   
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;
   
   @Nullable
   private com.commercetools.models.Cart.DiscountCodeState oldState;
   
   
   private com.commercetools.models.Cart.DiscountCodeState state;
   
   public OrderDiscountCodeStateSetMessagePayloadBuilder discountCode( final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   public OrderDiscountCodeStateSetMessagePayloadBuilder oldState(@Nullable final com.commercetools.models.Cart.DiscountCodeState oldState) {
      this.oldState = oldState;
      return this;
   }
   
   public OrderDiscountCodeStateSetMessagePayloadBuilder state( final com.commercetools.models.Cart.DiscountCodeState state) {
      this.state = state;
      return this;
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }
   
   @Nullable
   public com.commercetools.models.Cart.DiscountCodeState getOldState(){
      return this.oldState;
   }
   
   
   public com.commercetools.models.Cart.DiscountCodeState getState(){
      return this.state;
   }

   public OrderDiscountCodeStateSetMessagePayload build() {
       return new OrderDiscountCodeStateSetMessagePayloadImpl(discountCode, oldState, state);
   }
   
   public static OrderDiscountCodeStateSetMessagePayloadBuilder of() {
      return new OrderDiscountCodeStateSetMessagePayloadBuilder();
   }
   
   public static OrderDiscountCodeStateSetMessagePayloadBuilder of(final OrderDiscountCodeStateSetMessagePayload template) {
      OrderDiscountCodeStateSetMessagePayloadBuilder builder = new OrderDiscountCodeStateSetMessagePayloadBuilder();
      builder.discountCode = template.getDiscountCode();
      builder.oldState = template.getOldState();
      builder.state = template.getState();
      return builder;
   }
   
}