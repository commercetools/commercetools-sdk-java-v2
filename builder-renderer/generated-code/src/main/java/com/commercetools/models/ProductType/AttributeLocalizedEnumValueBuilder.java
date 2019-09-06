package com.commercetools.models.ProductType;

import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeLocalizedEnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeLocalizedEnumValueBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString label;
   
   
   private java.lang.String key;
   
   public AttributeLocalizedEnumValueBuilder label( final com.commercetools.models.Common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public AttributeLocalizedEnumValueBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public AttributeLocalizedEnumValue build() {
       return new AttributeLocalizedEnumValueImpl(label, key);
   }
   
   public static AttributeLocalizedEnumValueBuilder of() {
      return new AttributeLocalizedEnumValueBuilder();
   }
   
   public static AttributeLocalizedEnumValueBuilder of(final AttributeLocalizedEnumValue template) {
      AttributeLocalizedEnumValueBuilder builder = new AttributeLocalizedEnumValueBuilder();
      builder.label = template.getLabel();
      builder.key = template.getKey();
      return builder;
   }
   
}