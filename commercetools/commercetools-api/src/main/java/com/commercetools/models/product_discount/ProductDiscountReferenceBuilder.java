package com.commercetools.models.product_discount;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.product_discount.ProductDiscount;
import com.commercetools.models.product_discount.ProductDiscountReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.product_discount.ProductDiscount obj;
   
   public ProductDiscountReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductDiscountReferenceBuilder obj(@Nullable final com.commercetools.models.product_discount.ProductDiscount obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.product_discount.ProductDiscount getObj(){
      return this.obj;
   }

   public ProductDiscountReference build() {
       return new ProductDiscountReferenceImpl(id, obj);
   }
   
   public static ProductDiscountReferenceBuilder of() {
      return new ProductDiscountReferenceBuilder();
   }
   
   public static ProductDiscountReferenceBuilder of(final ProductDiscountReference template) {
      ProductDiscountReferenceBuilder builder = new ProductDiscountReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}