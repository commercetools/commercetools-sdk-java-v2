package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.NumberSetField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class NumberSetFieldBuilder {
   
   
   private java.util.List<Integer> value;
   
   public NumberSetFieldBuilder value( final java.util.List<Integer> value) {
      this.value = value;
      return this;
   }
   
   
   public java.util.List<Integer> getValue(){
      return this.value;
   }

   public NumberSetField build() {
       return new NumberSetFieldImpl(value);
   }
   
   public static NumberSetFieldBuilder of() {
      return new NumberSetFieldBuilder();
   }
   
   public static NumberSetFieldBuilder of(final NumberSetField template) {
      NumberSetFieldBuilder builder = new NumberSetFieldBuilder();
      builder.value = template.getValue();
      return builder;
   }
   
}