package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeIsSearchableAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeIsSearchableActionBuilder {
   
   
   private java.lang.String attributeName;
   
   
   private java.lang.Boolean isSearchable;
   
   public ProductTypeChangeIsSearchableActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeChangeIsSearchableActionBuilder isSearchable( final java.lang.Boolean isSearchable) {
      this.isSearchable = isSearchable;
      return this;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }
   
   
   public java.lang.Boolean getIsSearchable(){
      return this.isSearchable;
   }

   public ProductTypeChangeIsSearchableAction build() {
       return new ProductTypeChangeIsSearchableActionImpl(attributeName, isSearchable);
   }
   
   public static ProductTypeChangeIsSearchableActionBuilder of() {
      return new ProductTypeChangeIsSearchableActionBuilder();
   }
   
   public static ProductTypeChangeIsSearchableActionBuilder of(final ProductTypeChangeIsSearchableAction template) {
      ProductTypeChangeIsSearchableActionBuilder builder = new ProductTypeChangeIsSearchableActionBuilder();
      builder.attributeName = template.getAttributeName();
      builder.isSearchable = template.getIsSearchable();
      return builder;
   }
   
}