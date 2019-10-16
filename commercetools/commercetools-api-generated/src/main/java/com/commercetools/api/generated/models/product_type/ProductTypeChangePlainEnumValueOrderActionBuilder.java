package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeChangePlainEnumValueOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangePlainEnumValueOrderActionBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.product_type.AttributePlainEnumValue> values;
   
   
   private String attributeName;
   
   public ProductTypeChangePlainEnumValueOrderActionBuilder values( final java.util.List<com.commercetools.api.generated.models.product_type.AttributePlainEnumValue> values) {
      this.values = values;
      return this;
   }
   
   public ProductTypeChangePlainEnumValueOrderActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product_type.AttributePlainEnumValue> getValues(){
      return this.values;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeChangePlainEnumValueOrderAction build() {
       return new ProductTypeChangePlainEnumValueOrderActionImpl(values, attributeName);
   }
   
   public static ProductTypeChangePlainEnumValueOrderActionBuilder of() {
      return new ProductTypeChangePlainEnumValueOrderActionBuilder();
   }
   
   public static ProductTypeChangePlainEnumValueOrderActionBuilder of(final ProductTypeChangePlainEnumValueOrderAction template) {
      ProductTypeChangePlainEnumValueOrderActionBuilder builder = new ProductTypeChangePlainEnumValueOrderActionBuilder();
      builder.values = template.getValues();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}