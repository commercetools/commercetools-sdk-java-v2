package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.LocalizedEnumSetField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LocalizedEnumSetFieldBuilder {
   
   
   private java.util.List<String> value;
   
   public LocalizedEnumSetFieldBuilder value( final java.util.List<String> value) {
      this.value = value;
      return this;
   }
   
   
   public java.util.List<String> getValue(){
      return this.value;
   }

   public LocalizedEnumSetField build() {
       return new LocalizedEnumSetFieldImpl(value);
   }
   
   public static LocalizedEnumSetFieldBuilder of() {
      return new LocalizedEnumSetFieldBuilder();
   }
   
   public static LocalizedEnumSetFieldBuilder of(final LocalizedEnumSetField template) {
      LocalizedEnumSetFieldBuilder builder = new LocalizedEnumSetFieldBuilder();
      builder.value = template.getValue();
      return builder;
   }
   
}