package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public CartDiscountSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public CartDiscountSetKeyAction build() {
       return new CartDiscountSetKeyActionImpl(key);
   }
   
   public static CartDiscountSetKeyActionBuilder of() {
      return new CartDiscountSetKeyActionBuilder();
   }
   
   public static CartDiscountSetKeyActionBuilder of(final CartDiscountSetKeyAction template) {
      CartDiscountSetKeyActionBuilder builder = new CartDiscountSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}