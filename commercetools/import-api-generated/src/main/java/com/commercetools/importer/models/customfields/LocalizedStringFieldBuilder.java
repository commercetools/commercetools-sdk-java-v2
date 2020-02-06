package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.LocalizedStringField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LocalizedStringFieldBuilder {
   
   
   private com.commercetools.importer.models.common.LocalizedString value;
   
   public LocalizedStringFieldBuilder value( final com.commercetools.importer.models.common.LocalizedString value) {
      this.value = value;
      return this;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getValue(){
      return this.value;
   }

   public LocalizedStringField build() {
       return new LocalizedStringFieldImpl(value);
   }
   
   public static LocalizedStringFieldBuilder of() {
      return new LocalizedStringFieldBuilder();
   }
   
   public static LocalizedStringFieldBuilder of(final LocalizedStringField template) {
      LocalizedStringFieldBuilder builder = new LocalizedStringFieldBuilder();
      builder.value = template.getValue();
      return builder;
   }
   
}