package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.StringSetField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StringSetFieldBuilder {
   
   
   private java.util.List<String> value;
   
   public StringSetFieldBuilder value( final java.util.List<String> value) {
      this.value = value;
      return this;
   }
   
   
   public java.util.List<String> getValue(){
      return this.value;
   }

   public StringSetField build() {
       return new StringSetFieldImpl(value);
   }
   
   public static StringSetFieldBuilder of() {
      return new StringSetFieldBuilder();
   }
   
   public static StringSetFieldBuilder of(final StringSetField template) {
      StringSetFieldBuilder builder = new StringSetFieldBuilder();
      builder.value = template.getValue();
      return builder;
   }
   
}