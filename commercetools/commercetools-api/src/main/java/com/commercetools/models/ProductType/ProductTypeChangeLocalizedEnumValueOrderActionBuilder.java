package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeLocalizedEnumValue;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeLocalizedEnumValueOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeLocalizedEnumValueOrderActionBuilder {
   
   
   private java.util.List<com.commercetools.models.ProductType.AttributeLocalizedEnumValue> values;
   
   
   private java.lang.String attributeName;
   
   public ProductTypeChangeLocalizedEnumValueOrderActionBuilder values( final java.util.List<com.commercetools.models.ProductType.AttributeLocalizedEnumValue> values) {
      this.values = values;
      return this;
   }
   
   public ProductTypeChangeLocalizedEnumValueOrderActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.ProductType.AttributeLocalizedEnumValue> getValues(){
      return this.values;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeChangeLocalizedEnumValueOrderAction build() {
       return new ProductTypeChangeLocalizedEnumValueOrderActionImpl(values, attributeName);
   }
   
   public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder of() {
      return new ProductTypeChangeLocalizedEnumValueOrderActionBuilder();
   }
   
   public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder of(final ProductTypeChangeLocalizedEnumValueOrderAction template) {
      ProductTypeChangeLocalizedEnumValueOrderActionBuilder builder = new ProductTypeChangeLocalizedEnumValueOrderActionBuilder();
      builder.values = template.getValues();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}