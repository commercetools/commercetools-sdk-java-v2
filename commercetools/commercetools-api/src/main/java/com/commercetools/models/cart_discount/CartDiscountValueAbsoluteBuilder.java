package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountValue;
import com.commercetools.models.common.Money;
import java.lang.String;
import com.commercetools.models.cart_discount.CartDiscountValueAbsolute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountValueAbsoluteBuilder {
   
   
   private java.util.List<com.commercetools.models.common.Money> money;
   
   public CartDiscountValueAbsoluteBuilder money( final java.util.List<com.commercetools.models.common.Money> money) {
      this.money = money;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.common.Money> getMoney(){
      return this.money;
   }

   public CartDiscountValueAbsolute build() {
       return new CartDiscountValueAbsoluteImpl(money);
   }
   
   public static CartDiscountValueAbsoluteBuilder of() {
      return new CartDiscountValueAbsoluteBuilder();
   }
   
   public static CartDiscountValueAbsoluteBuilder of(final CartDiscountValueAbsolute template) {
      CartDiscountValueAbsoluteBuilder builder = new CartDiscountValueAbsoluteBuilder();
      builder.money = template.getMoney();
      return builder;
   }
   
}