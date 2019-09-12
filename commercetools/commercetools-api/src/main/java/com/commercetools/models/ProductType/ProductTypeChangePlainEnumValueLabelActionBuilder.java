package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributePlainEnumValue;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangePlainEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangePlainEnumValueLabelActionBuilder {
   
   
   private com.commercetools.models.ProductType.AttributePlainEnumValue newValue;
   
   
   private java.lang.String attributeName;
   
   public ProductTypeChangePlainEnumValueLabelActionBuilder newValue( final com.commercetools.models.ProductType.AttributePlainEnumValue newValue) {
      this.newValue = newValue;
      return this;
   }
   
   public ProductTypeChangePlainEnumValueLabelActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public com.commercetools.models.ProductType.AttributePlainEnumValue getNewValue(){
      return this.newValue;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeChangePlainEnumValueLabelAction build() {
       return new ProductTypeChangePlainEnumValueLabelActionImpl(newValue, attributeName);
   }
   
   public static ProductTypeChangePlainEnumValueLabelActionBuilder of() {
      return new ProductTypeChangePlainEnumValueLabelActionBuilder();
   }
   
   public static ProductTypeChangePlainEnumValueLabelActionBuilder of(final ProductTypeChangePlainEnumValueLabelAction template) {
      ProductTypeChangePlainEnumValueLabelActionBuilder builder = new ProductTypeChangePlainEnumValueLabelActionBuilder();
      builder.newValue = template.getNewValue();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}