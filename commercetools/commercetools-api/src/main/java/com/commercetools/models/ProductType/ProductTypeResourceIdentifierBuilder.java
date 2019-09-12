package com.commercetools.models.ProductType;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.ProductType.ProductTypeResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public ProductTypeResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductTypeResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ProductTypeResourceIdentifier build() {
       return new ProductTypeResourceIdentifierImpl(id, key);
   }
   
   public static ProductTypeResourceIdentifierBuilder of() {
      return new ProductTypeResourceIdentifierBuilder();
   }
   
   public static ProductTypeResourceIdentifierBuilder of(final ProductTypeResourceIdentifier template) {
      ProductTypeResourceIdentifierBuilder builder = new ProductTypeResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}