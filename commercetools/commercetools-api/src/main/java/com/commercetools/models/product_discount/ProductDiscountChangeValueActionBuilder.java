package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.models.product_discount.ProductDiscountValue;
import java.lang.String;
import com.commercetools.models.product_discount.ProductDiscountChangeValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountChangeValueActionBuilder {
   
   
   private com.commercetools.models.product_discount.ProductDiscountValue value;
   
   public ProductDiscountChangeValueActionBuilder value( final com.commercetools.models.product_discount.ProductDiscountValue value) {
      this.value = value;
      return this;
   }
   
   
   public com.commercetools.models.product_discount.ProductDiscountValue getValue(){
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