package com.commercetools.models.product_discount;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.models.product_discount.ProductDiscountChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountChangeNameActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   public ProductDiscountChangeNameActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }

   public ProductDiscountChangeNameAction build() {
       return new ProductDiscountChangeNameActionImpl(name);
   }
   
   public static ProductDiscountChangeNameActionBuilder of() {
      return new ProductDiscountChangeNameActionBuilder();
   }
   
   public static ProductDiscountChangeNameActionBuilder of(final ProductDiscountChangeNameAction template) {
      ProductDiscountChangeNameActionBuilder builder = new ProductDiscountChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}