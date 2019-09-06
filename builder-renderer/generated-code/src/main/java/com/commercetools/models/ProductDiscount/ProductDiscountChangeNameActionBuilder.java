package com.commercetools.models.ProductDiscount;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductDiscount.ProductDiscountChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountChangeNameActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   public ProductDiscountChangeNameActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
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