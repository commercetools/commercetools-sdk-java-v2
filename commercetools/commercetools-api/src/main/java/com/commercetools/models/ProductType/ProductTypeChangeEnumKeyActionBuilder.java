package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeEnumKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeEnumKeyActionBuilder {
   
   
   private java.lang.String newKey;
   
   
   private java.lang.String attributeName;
   
   
   private java.lang.String key;
   
   public ProductTypeChangeEnumKeyActionBuilder newKey( final java.lang.String newKey) {
      this.newKey = newKey;
      return this;
   }
   
   public ProductTypeChangeEnumKeyActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeChangeEnumKeyActionBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getNewKey(){
      return this.newKey;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public ProductTypeChangeEnumKeyAction build() {
       return new ProductTypeChangeEnumKeyActionImpl(newKey, attributeName, key);
   }
   
   public static ProductTypeChangeEnumKeyActionBuilder of() {
      return new ProductTypeChangeEnumKeyActionBuilder();
   }
   
   public static ProductTypeChangeEnumKeyActionBuilder of(final ProductTypeChangeEnumKeyAction template) {
      ProductTypeChangeEnumKeyActionBuilder builder = new ProductTypeChangeEnumKeyActionBuilder();
      builder.newKey = template.getNewKey();
      builder.attributeName = template.getAttributeName();
      builder.key = template.getKey();
      return builder;
   }
   
}