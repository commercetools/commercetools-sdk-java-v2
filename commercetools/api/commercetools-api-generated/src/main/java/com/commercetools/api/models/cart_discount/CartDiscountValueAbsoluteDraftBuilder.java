package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountValueAbsoluteDraftBuilder {
   
   
   private java.util.List<com.commercetools.api.models.common.Money> money;
   
   public CartDiscountValueAbsoluteDraftBuilder money( final java.util.List<com.commercetools.api.models.common.Money> money) {
      this.money = money;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.models.common.Money> getMoney(){
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
