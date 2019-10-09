package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.cart_discount.CartDiscountSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   public CartDiscountSetDescriptionActionBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public CartDiscountSetDescriptionAction build() {
       return new CartDiscountSetDescriptionActionImpl(description);
   }
   
   public static CartDiscountSetDescriptionActionBuilder of() {
      return new CartDiscountSetDescriptionActionBuilder();
   }
   
   public static CartDiscountSetDescriptionActionBuilder of(final CartDiscountSetDescriptionAction template) {
      CartDiscountSetDescriptionActionBuilder builder = new CartDiscountSetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}