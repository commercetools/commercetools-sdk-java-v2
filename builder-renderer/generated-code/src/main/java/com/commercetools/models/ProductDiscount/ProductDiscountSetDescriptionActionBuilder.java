package com.commercetools.models.ProductDiscount;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductDiscount.ProductDiscountSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   public ProductDiscountSetDescriptionActionBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
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