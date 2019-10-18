package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   public CartDiscountSetDescriptionActionBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
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