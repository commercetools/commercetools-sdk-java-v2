package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import com.commercetools.models.ProductDiscount.ProductDiscountValue;
import java.lang.String;
import com.commercetools.models.ProductDiscount.ProductDiscountChangeValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountChangeValueActionBuilder {
   
   
   private com.commercetools.models.ProductDiscount.ProductDiscountValue value;
   
   public ProductDiscountChangeValueActionBuilder value( final com.commercetools.models.ProductDiscount.ProductDiscountValue value) {
      this.value = value;
      return this;
   }
   
   
   public com.commercetools.models.ProductDiscount.ProductDiscountValue getValue(){
      return this.value;
   }

   public ProductDiscountChangeValueAction build() {
       return new ProductDiscountChangeValueActionImpl(value);
   }
   
   public static ProductDiscountChangeValueActionBuilder of() {
      return new ProductDiscountChangeValueActionBuilder();
   }
   
   public static ProductDiscountChangeValueActionBuilder of(final ProductDiscountChangeValueAction template) {
      ProductDiscountChangeValueActionBuilder builder = new ProductDiscountChangeValueActionBuilder();
      builder.value = template.getValue();
      return builder;
   }
   
}