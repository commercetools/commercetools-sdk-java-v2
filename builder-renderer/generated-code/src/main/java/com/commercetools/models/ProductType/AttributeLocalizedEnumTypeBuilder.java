package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeLocalizedEnumValue;
import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeLocalizedEnumType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeLocalizedEnumTypeBuilder {
   
   
   private java.util.List<com.commercetools.models.ProductType.AttributeLocalizedEnumValue> values;
   
   public AttributeLocalizedEnumTypeBuilder values( final java.util.List<com.commercetools.models.ProductType.AttributeLocalizedEnumValue> values) {
      this.values = values;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.ProductType.AttributeLocalizedEnumValue> getValues(){
      return this.values;
   }

   public AttributeLocalizedEnumType build() {
       return new AttributeLocalizedEnumTypeImpl(values);
   }
   
   public static AttributeLocalizedEnumTypeBuilder of() {
      return new AttributeLocalizedEnumTypeBuilder();
   }
   
   public static AttributeLocalizedEnumTypeBuilder of(final AttributeLocalizedEnumType template) {
      AttributeLocalizedEnumTypeBuilder builder = new AttributeLocalizedEnumTypeBuilder();
      builder.values = template.getValues();
      return builder;
   }
   
}