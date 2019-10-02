package com.commercetools.models.product_type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product_type.AttributeLocalizedEnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeLocalizedEnumValueBuilder {
   
   
   private com.commercetools.models.common.LocalizedString label;
   
   
   private String key;
   
   public AttributeLocalizedEnumValueBuilder label( final com.commercetools.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public AttributeLocalizedEnumValueBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public String getKey(){
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