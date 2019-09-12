package com.commercetools.models.Cart;

import com.commercetools.models.Cart.DiscountCodeState;
import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Cart.DiscountCodeInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeInfoBuilder {
   
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;
   
   
   private com.commercetools.models.Cart.DiscountCodeState state;
   
   public DiscountCodeInfoBuilder discountCode( final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   public DiscountCodeInfoBuilder state( final com.commercetools.models.Cart.DiscountCodeState state) {
      this.state = state;
      return this;
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }
   
   
   public com.commercetools.models.Cart.DiscountCodeState getState(){
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