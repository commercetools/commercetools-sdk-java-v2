package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeNameActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   public CartDiscountChangeNameActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
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