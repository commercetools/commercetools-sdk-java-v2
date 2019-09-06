package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeLocalizedEnumValue;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeLocalizedEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeLocalizedEnumValueLabelActionBuilder {
   
   
   private com.commercetools.models.ProductType.AttributeLocalizedEnumValue newValue;
   
   
   private java.lang.String attributeName;
   
   public ProductTypeChangeLocalizedEnumValueLabelActionBuilder newValue( final com.commercetools.models.ProductType.AttributeLocalizedEnumValue newValue) {
      this.newValue = newValue;
      return this;
   }
   
   public ProductTypeChangeLocalizedEnumValueLabelActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public com.commercetools.models.ProductType.AttributeLocalizedEnumValue getNewValue(){
      return this.newValue;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeChangeLocalizedEnumValueLabelAction build() {
       return new ProductTypeChangeLocalizedEnumValueLabelActionImpl(newValue, attributeName);
   }
   
   public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder of() {
      return new ProductTypeChangeLocalizedEnumValueLabelActionBuilder();
   }
   
   public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder of(final ProductTypeChangeLocalizedEnumValueLabelAction template) {
      ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder = new ProductTypeChangeLocalizedEnumValueLabelActionBuilder();
      builder.newValue = template.getNewValue();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}