package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.common.LocalizedString;
import java.lang.String;
import com.commercetools.models.cart_discount.CartDiscountChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeNameActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   public CartDiscountChangeNameActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }

   public CartDiscountChangeNameAction build() {
       return new CartDiscountChangeNameActionImpl(name);
   }
   
   public static CartDiscountChangeNameActionBuilder of() {
      return new CartDiscountChangeNameActionBuilder();
   }
   
   public static CartDiscountChangeNameActionBuilder of(final CartDiscountChangeNameAction template) {
      CartDiscountChangeNameActionBuilder builder = new CartDiscountChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}