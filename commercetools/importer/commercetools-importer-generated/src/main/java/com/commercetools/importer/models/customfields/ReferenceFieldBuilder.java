package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.ReferenceField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReferenceFieldBuilder {
   
   
   private com.commercetools.importer.models.common.KeyReference value;
   
   public ReferenceFieldBuilder value( final com.commercetools.importer.models.common.KeyReference value) {
      this.value = value;
      return this;
   }
   
   
   public com.commercetools.importer.models.common.KeyReference getValue(){
      return this.value;
   }

   public ReferenceField build() {
       return new ReferenceFieldImpl(value);
   }
   
   public static ReferenceFieldBuilder of() {
      return new ReferenceFieldBuilder();
   }
   
   public static ReferenceFieldBuilder of(final ReferenceField template) {
      ReferenceFieldBuilder builder = new ReferenceFieldBuilder();
      builder.value = template.getValue();
      return builder;
   }
   
}