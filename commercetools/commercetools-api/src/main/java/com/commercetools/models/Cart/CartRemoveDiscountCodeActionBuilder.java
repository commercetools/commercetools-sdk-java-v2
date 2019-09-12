package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.DiscountCode.DiscountCodeReference;
import java.lang.String;
import com.commercetools.models.Cart.CartRemoveDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartRemoveDiscountCodeActionBuilder {
   
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;
   
   public CartRemoveDiscountCodeActionBuilder discountCode( final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public CartRemoveDiscountCodeAction build() {
       return new CartRemoveDiscountCodeActionImpl(discountCode);
   }
   
   public static CartRemoveDiscountCodeActionBuilder of() {
      return new CartRemoveDiscountCodeActionBuilder();
   }
   
   public static CartRemoveDiscountCodeActionBuilder of(final CartRemoveDiscountCodeAction template) {
      CartRemoveDiscountCodeActionBuilder builder = new CartRemoveDiscountCodeActionBuilder();
      builder.discountCode = template.getDiscountCode();
      return builder;
   }
   
}