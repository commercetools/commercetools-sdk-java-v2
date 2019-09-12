package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributePlainEnumValue;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeAddPlainEnumValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeAddPlainEnumValueActionBuilder {
   
   
   private java.lang.String attributeName;
   
   
   private com.commercetools.models.ProductType.AttributePlainEnumValue value;
   
   public ProductTypeAddPlainEnumValueActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeAddPlainEnumValueActionBuilder value( final com.commercetools.models.ProductType.AttributePlainEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }
   
   
   public com.commercetools.models.ProductType.AttributePlainEnumValue getValue(){
      return this.value;
   }

   public ProductTypeAddPlainEnumValueAction build() {
       return new ProductTypeAddPlainEnumValueActionImpl(attributeName, value);
   }
   
   public static ProductTypeAddPlainEnumValueActionBuilder of() {
      return new ProductTypeAddPlainEnumValueActionBuilder();
   }
   
   public static ProductTypeAddPlainEnumValueActionBuilder of(final ProductTypeAddPlainEnumValueAction template) {
      ProductTypeAddPlainEnumValueActionBuilder builder = new ProductTypeAddPlainEnumValueActionBuilder();
      builder.attributeName = template.getAttributeName();
      builder.value = template.getValue();
      return builder;
   }
   
}