package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.CartDiscount.CartDiscountSetValidUntilAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountSetValidUntilActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   public CartDiscountSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }

   public CartDiscountSetValidUntilAction build() {
       return new CartDiscountSetValidUntilActionImpl(validUntil);
   }
   
   public static CartDiscountSetValidUntilActionBuilder of() {
      return new CartDiscountSetValidUntilActionBuilder();
   }
   
   public static CartDiscountSetValidUntilActionBuilder of(final CartDiscountSetValidUntilAction template) {
      CartDiscountSetValidUntilActionBuilder builder = new CartDiscountSetValidUntilActionBuilder();
      builder.validUntil = template.getValidUntil();
      return builder;
   }
   
}