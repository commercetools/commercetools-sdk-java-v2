package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.common.LocalizedEnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LocalizedEnumValueBuilder {
   
   
   private com.commercetools.importer.models.common.LocalizedString label;
   
   
   private String key;
   
   public LocalizedEnumValueBuilder label( final com.commercetools.importer.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public LocalizedEnumValueBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public LocalizedEnumValue build() {
       return new LocalizedEnumValueImpl(label, key);
   }
   
   public static LocalizedEnumValueBuilder of() {
      return new LocalizedEnumValueBuilder();
   }
   
   public static LocalizedEnumValueBuilder of(final LocalizedEnumValue template) {
      LocalizedEnumValueBuilder builder = new LocalizedEnumValueBuilder();
      builder.label = template.getLabel();
      builder.key = template.getKey();
      return builder;
   }
   
}