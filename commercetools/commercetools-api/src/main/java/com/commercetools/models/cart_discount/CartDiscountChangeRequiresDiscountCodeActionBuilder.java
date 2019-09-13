package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.cart_discount.CartDiscountChangeRequiresDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeRequiresDiscountCodeActionBuilder {
   
   
   private java.lang.Boolean requiresDiscountCode;
   
   public CartDiscountChangeRequiresDiscountCodeActionBuilder requiresDiscountCode( final java.lang.Boolean requiresDiscountCode) {
      this.requiresDiscountCode = requiresDiscountCode;
      return this;
   }
   
   
   public java.lang.Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }

   public CartDiscountChangeRequiresDiscountCodeAction build() {
       return new CartDiscountChangeRequiresDiscountCodeActionImpl(requiresDiscountCode);
   }
   
   public static CartDiscountChangeRequiresDiscountCodeActionBuilder of() {
      return new CartDiscountChangeRequiresDiscountCodeActionBuilder();
   }
   
   public static CartDiscountChangeRequiresDiscountCodeActionBuilder of(final CartDiscountChangeRequiresDiscountCodeAction template) {
      CartDiscountChangeRequiresDiscountCodeActionBuilder builder = new CartDiscountChangeRequiresDiscountCodeActionBuilder();
      builder.requiresDiscountCode = template.getRequiresDiscountCode();
      return builder;
   }
   
}