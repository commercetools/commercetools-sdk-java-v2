package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountValue;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountValueRelative;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountValueRelativeBuilder {
   
   
   private java.lang.Long permyriad;
   
   public CartDiscountValueRelativeBuilder permyriad( final java.lang.Long permyriad) {
      this.permyriad = permyriad;
      return this;
   }
   
   
   public java.lang.Long getPermyriad(){
      return this.permyriad;
   }

   public CartDiscountValueRelative build() {
       return new CartDiscountValueRelativeImpl(permyriad);
   }
   
   public static CartDiscountValueRelativeBuilder of() {
      return new CartDiscountValueRelativeBuilder();
   }
   
   public static CartDiscountValueRelativeBuilder of(final CartDiscountValueRelative template) {
      CartDiscountValueRelativeBuilder builder = new CartDiscountValueRelativeBuilder();
      builder.permyriad = template.getPermyriad();
      return builder;
   }
   
}