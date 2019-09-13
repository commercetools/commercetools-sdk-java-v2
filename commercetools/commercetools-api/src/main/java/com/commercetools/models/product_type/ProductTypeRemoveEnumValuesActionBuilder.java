package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.product_type.ProductTypeRemoveEnumValuesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeRemoveEnumValuesActionBuilder {
   
   
   private java.util.List<java.lang.String> keys;
   
   
   private java.lang.String attributeName;
   
   public ProductTypeRemoveEnumValuesActionBuilder keys( final java.util.List<java.lang.String> keys) {
      this.keys = keys;
      return this;
   }
   
   public ProductTypeRemoveEnumValuesActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getKeys(){
      return this.keys;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeRemoveEnumValuesAction build() {
       return new ProductTypeRemoveEnumValuesActionImpl(keys, attributeName);
   }
   
   public static ProductTypeRemoveEnumValuesActionBuilder of() {
      return new ProductTypeRemoveEnumValuesActionBuilder();
   }
   
   public static ProductTypeRemoveEnumValuesActionBuilder of(final ProductTypeRemoveEnumValuesAction template) {
      ProductTypeRemoveEnumValuesActionBuilder builder = new ProductTypeRemoveEnumValuesActionBuilder();
      builder.keys = template.getKeys();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}