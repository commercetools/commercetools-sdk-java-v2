package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountValue;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueAbsolute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountValueAbsoluteBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.common.TypedMoney> money;
   
   public CartDiscountValueAbsoluteBuilder money( final java.util.List<com.commercetools.api.generated.models.common.TypedMoney> money) {
      this.money = money;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.TypedMoney> getMoney(){
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