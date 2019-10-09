package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.models.common.Money;
import com.commercetools.models.cart_discount.CartDiscountValueAbsoluteDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountValueAbsoluteDraftBuilder {
   
   
   private java.util.List<com.commercetools.models.common.Money> money;
   
   public CartDiscountValueAbsoluteDraftBuilder money( final java.util.List<com.commercetools.models.common.Money> money) {
      this.money = money;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.common.Money> getMoney(){
      return this.money;
   }

   public CartDiscountValueAbsoluteDraft build() {
       return new CartDiscountValueAbsoluteDraftImpl(money);
   }
   
   public static CartDiscountValueAbsoluteDraftBuilder of() {
      return new CartDiscountValueAbsoluteDraftBuilder();
   }
   
   public static CartDiscountValueAbsoluteDraftBuilder of(final CartDiscountValueAbsoluteDraft template) {
      CartDiscountValueAbsoluteDraftBuilder builder = new CartDiscountValueAbsoluteDraftBuilder();
      builder.money = template.getMoney();
      return builder;
   }
   
}