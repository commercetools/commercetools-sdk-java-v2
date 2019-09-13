package com.commercetools.models.cart;

import com.commercetools.models.cart.DiscountCodeState;
import com.commercetools.models.discount_code.DiscountCodeReference;
import com.commercetools.models.cart.DiscountCodeInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeInfoBuilder {
   
   
   private com.commercetools.models.discount_code.DiscountCodeReference discountCode;
   
   
   private com.commercetools.models.cart.DiscountCodeState state;
   
   public DiscountCodeInfoBuilder discountCode( final com.commercetools.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   public DiscountCodeInfoBuilder state( final com.commercetools.models.cart.DiscountCodeState state) {
      this.state = state;
      return this;
   }
   
   
   public com.commercetools.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }
   
   
   public com.commercetools.models.cart.DiscountCodeState getState(){
      return this.state;
   }

   public DiscountCodeInfo build() {
       return new DiscountCodeInfoImpl(discountCode, state);
   }
   
   public static DiscountCodeInfoBuilder of() {
      return new DiscountCodeInfoBuilder();
   }
   
   public static DiscountCodeInfoBuilder of(final DiscountCodeInfo template) {
      DiscountCodeInfoBuilder builder = new DiscountCodeInfoBuilder();
      builder.discountCode = template.getDiscountCode();
      builder.state = template.getState();
      return builder;
   }
   
}