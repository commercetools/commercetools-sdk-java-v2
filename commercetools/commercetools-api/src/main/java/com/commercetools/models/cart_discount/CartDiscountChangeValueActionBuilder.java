package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.models.cart_discount.CartDiscountChangeValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeValueActionBuilder {
   
   
   private com.commercetools.models.cart_discount.CartDiscountValueDraft value;
   
   public CartDiscountChangeValueActionBuilder value( final com.commercetools.models.cart_discount.CartDiscountValueDraft value) {
      this.value = value;
      return this;
   }
   
   
   public com.commercetools.models.cart_discount.CartDiscountValueDraft getValue(){
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