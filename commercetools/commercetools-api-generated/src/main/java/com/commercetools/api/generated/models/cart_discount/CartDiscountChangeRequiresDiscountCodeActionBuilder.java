package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeRequiresDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountChangeRequiresDiscountCodeActionBuilder {
   
   
   private Boolean requiresDiscountCode;
   
   public CartDiscountChangeRequiresDiscountCodeActionBuilder requiresDiscountCode( final Boolean requiresDiscountCode) {
      this.requiresDiscountCode = requiresDiscountCode;
      return this;
   }
   
   
   public Boolean getRequiresDiscountCode(){
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