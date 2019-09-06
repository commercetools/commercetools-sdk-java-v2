package com.commercetools.models.Type;

import java.lang.String;
import com.commercetools.models.Type.CustomFieldEnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldEnumValueBuilder {
   
   
   private java.lang.String label;
   
   
   private java.lang.String key;
   
   public CustomFieldEnumValueBuilder label( final java.lang.String label) {
      this.label = label;
      return this;
   }
   
   public CustomFieldEnumValueBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public CustomFieldEnumValue build() {
       return new CustomFieldEnumValueImpl(label, key);
   }
   
   public static CustomFieldEnumValueBuilder of() {
      return new CustomFieldEnumValueBuilder();
   }
   
   public static CustomFieldEnumValueBuilder of(final CustomFieldEnumValue template) {
      CustomFieldEnumValueBuilder builder = new CustomFieldEnumValueBuilder();
      builder.label = template.getLabel();
      builder.key = template.getKey();
      return builder;
   }
   
}