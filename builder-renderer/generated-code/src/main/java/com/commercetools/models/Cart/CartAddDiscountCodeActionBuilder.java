package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.Cart.CartAddDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartAddDiscountCodeActionBuilder {
   
   
   private java.lang.String code;
   
   public CartAddDiscountCodeActionBuilder code( final java.lang.String code) {
      this.code = code;
      return this;
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }

   public CartAddDiscountCodeAction build() {
       return new CartAddDiscountCodeActionImpl(code);
   }
   
   public static CartAddDiscountCodeActionBuilder of() {
      return new CartAddDiscountCodeActionBuilder();
   }
   
   public static CartAddDiscountCodeActionBuilder of(final CartAddDiscountCodeAction template) {
      CartAddDiscountCodeActionBuilder builder = new CartAddDiscountCodeActionBuilder();
      builder.code = template.getCode();
      return builder;
   }
   
}