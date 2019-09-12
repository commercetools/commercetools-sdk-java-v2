package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountValue;
import com.commercetools.models.Common.Money;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountValueAbsolute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountValueAbsoluteBuilder {
   
   
   private java.util.List<com.commercetools.models.Common.Money> money;
   
   public CartDiscountValueAbsoluteBuilder money( final java.util.List<com.commercetools.models.Common.Money> money) {
      this.money = money;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Money> getMoney(){
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