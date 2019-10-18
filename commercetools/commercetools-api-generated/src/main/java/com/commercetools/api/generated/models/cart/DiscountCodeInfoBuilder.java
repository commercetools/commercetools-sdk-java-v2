package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.DiscountCodeState;
import com.commercetools.api.generated.models.discount_code.DiscountCodeReference;
import com.commercetools.api.generated.models.cart.DiscountCodeInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeInfoBuilder {
   
   
   private com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode;
   
   
   private com.commercetools.api.generated.models.cart.DiscountCodeState state;
   
   public DiscountCodeInfoBuilder discountCode( final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   public DiscountCodeInfoBuilder state( final com.commercetools.api.generated.models.cart.DiscountCodeState state) {
      this.state = state;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }
   
   
   public com.commercetools.api.generated.models.cart.DiscountCodeState getState(){
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