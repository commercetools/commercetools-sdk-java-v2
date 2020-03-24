package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountChangeValueActionBuilder {
   
   
   private com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft value;
   
   public CartDiscountChangeValueActionBuilder value( final com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft value) {
      this.value = value;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft getValue(){
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