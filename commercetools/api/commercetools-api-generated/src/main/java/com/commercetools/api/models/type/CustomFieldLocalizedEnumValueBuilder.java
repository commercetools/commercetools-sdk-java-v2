package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldLocalizedEnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomFieldLocalizedEnumValueBuilder {
   
   
   private com.commercetools.api.models.common.LocalizedString label;
   
   
   private String key;
   
   public CustomFieldLocalizedEnumValueBuilder label( final com.commercetools.api.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public CustomFieldLocalizedEnumValueBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public String getKey(){
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
