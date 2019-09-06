package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import com.commercetools.models.CartDiscount.CartDiscountValue;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountChangeValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeValueActionBuilder {
   
   
   private com.commercetools.models.CartDiscount.CartDiscountValue value;
   
   public CartDiscountChangeValueActionBuilder value( final com.commercetools.models.CartDiscount.CartDiscountValue value) {
      this.value = value;
      return this;
   }
   
   
   public com.commercetools.models.CartDiscount.CartDiscountValue getValue(){
      return this.value;
   }

   public CartDiscountChangeValueAction build() {
       return new CartDiscountChangeValueActionImpl(value);
   }
   
   public static CartDiscountChangeValueActionBuilder of() {
      return new CartDiscountChangeValueActionBuilder();
   }
   
   public static CartDiscountChangeValueActionBuilder of(final CartDiscountChangeValueAction template) {
      CartDiscountChangeValueActionBuilder builder = new CartDiscountChangeValueActionBuilder();
      builder.value = template.getValue();
      return builder;
   }
   
}