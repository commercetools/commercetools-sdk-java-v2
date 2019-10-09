package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.CartAddDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartAddDiscountCodeActionBuilder {
   
   
   private String code;
   
   public CartAddDiscountCodeActionBuilder code( final String code) {
      this.code = code;
      return this;
   }
   
   
   public String getCode(){
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