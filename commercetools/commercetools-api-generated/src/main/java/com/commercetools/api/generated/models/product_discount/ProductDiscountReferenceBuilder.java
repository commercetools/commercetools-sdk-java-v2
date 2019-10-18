package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.product_discount.ProductDiscount;
import com.commercetools.api.generated.models.product_discount.ProductDiscountReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.product_discount.ProductDiscount obj;
   
   public ProductDiscountReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ProductDiscountReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.product_discount.ProductDiscount obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.product_discount.ProductDiscount getObj(){
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