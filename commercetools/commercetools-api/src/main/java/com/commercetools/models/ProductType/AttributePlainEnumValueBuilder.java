package com.commercetools.models.ProductType;

import java.lang.String;
import com.commercetools.models.ProductType.AttributePlainEnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributePlainEnumValueBuilder {
   
   
   private java.lang.String label;
   
   
   private java.lang.String key;
   
   public AttributePlainEnumValueBuilder label( final java.lang.String label) {
      this.label = label;
      return this;
   }
   
   public AttributePlainEnumValueBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public AttributePlainEnumValue build() {
       return new AttributePlainEnumValueImpl(label, key);
   }
   
   public static AttributePlainEnumValueBuilder of() {
      return new AttributePlainEnumValueBuilder();
   }
   
   public static AttributePlainEnumValueBuilder of(final AttributePlainEnumValue template) {
      AttributePlainEnumValueBuilder builder = new AttributePlainEnumValueBuilder();
      builder.label = template.getLabel();
      builder.key = template.getKey();
      return builder;
   }
   
}