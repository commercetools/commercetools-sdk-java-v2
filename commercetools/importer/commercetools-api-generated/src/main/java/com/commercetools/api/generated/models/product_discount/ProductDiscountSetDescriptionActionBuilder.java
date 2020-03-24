package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   public ProductDiscountSetDescriptionActionBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
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