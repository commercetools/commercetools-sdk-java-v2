package com.commercetools.models.product_discount;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.models.product_discount.ProductDiscountSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   public ProductDiscountSetDescriptionActionBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public ProductDiscountSetDescriptionAction build() {
       return new ProductDiscountSetDescriptionActionImpl(description);
   }
   
   public static ProductDiscountSetDescriptionActionBuilder of() {
      return new ProductDiscountSetDescriptionActionBuilder();
   }
   
   public static ProductDiscountSetDescriptionActionBuilder of(final ProductDiscountSetDescriptionAction template) {
      ProductDiscountSetDescriptionActionBuilder builder = new ProductDiscountSetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}