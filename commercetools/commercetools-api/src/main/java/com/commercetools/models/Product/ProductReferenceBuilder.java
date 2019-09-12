package com.commercetools.models.Product;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Product.Product;
import com.commercetools.models.Product.ProductReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.Product.Product obj;
   
   public ProductReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductReferenceBuilder obj(@Nullable final com.commercetools.models.Product.Product obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.Product.Product getObj(){
      return this.obj;
   }

   public ProductReference build() {
       return new ProductReferenceImpl(id, obj);
   }
   
   public static ProductReferenceBuilder of() {
      return new ProductReferenceBuilder();
   }
   
   public static ProductReferenceBuilder of(final ProductReference template) {
      ProductReferenceBuilder builder = new ProductReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}