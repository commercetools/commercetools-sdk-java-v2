package com.commercetools.models.product_type;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.product_type.ProductType;
import com.commercetools.models.product_type.ProductTypeReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.product_type.ProductType obj;
   
   public ProductTypeReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductTypeReferenceBuilder obj(@Nullable final com.commercetools.models.product_type.ProductType obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.product_type.ProductType getObj(){
      return this.obj;
   }

   public ProductTypeReference build() {
       return new ProductTypeReferenceImpl(id, obj);
   }
   
   public static ProductTypeReferenceBuilder of() {
      return new ProductTypeReferenceBuilder();
   }
   
   public static ProductTypeReferenceBuilder of(final ProductTypeReference template) {
      ProductTypeReferenceBuilder builder = new ProductTypeReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}