package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.models.product_type.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeLocalizedEnumValueLabelActionBuilder {
   
   
   private com.commercetools.models.product_type.AttributeLocalizedEnumValue newValue;
   
   
   private java.lang.String attributeName;
   
   public ProductTypeChangeLocalizedEnumValueLabelActionBuilder newValue( final com.commercetools.models.product_type.AttributeLocalizedEnumValue newValue) {
      this.newValue = newValue;
      return this;
   }
   
   public ProductTypeChangeLocalizedEnumValueLabelActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public com.commercetools.models.product_type.AttributeLocalizedEnumValue getNewValue(){
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