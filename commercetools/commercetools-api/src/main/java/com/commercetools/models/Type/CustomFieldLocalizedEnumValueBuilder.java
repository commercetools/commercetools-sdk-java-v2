package com.commercetools.models.type;

import com.commercetools.models.common.LocalizedString;
import java.lang.String;
import com.commercetools.models.type.CustomFieldLocalizedEnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldLocalizedEnumValueBuilder {
   
   
   private com.commercetools.models.common.LocalizedString label;
   
   
   private java.lang.String key;
   
   public CustomFieldLocalizedEnumValueBuilder label( final com.commercetools.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public CustomFieldLocalizedEnumValueBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public CustomFieldLocalizedEnumValue build() {
       return new CustomFieldLocalizedEnumValueImpl(label, key);
   }
   
   public static CustomFieldLocalizedEnumValueBuilder of() {
      return new CustomFieldLocalizedEnumValueBuilder();
   }
   
   public static CustomFieldLocalizedEnumValueBuilder of(final CustomFieldLocalizedEnumValue template) {
      CustomFieldLocalizedEnumValueBuilder builder = new CustomFieldLocalizedEnumValueBuilder();
      builder.label = template.getLabel();
      builder.key = template.getKey();
      return builder;
   }
   
}