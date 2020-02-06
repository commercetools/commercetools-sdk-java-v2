package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.NumberField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class NumberFieldBuilder {
   
   
   private Integer value;
   
   public NumberFieldBuilder value( final Integer value) {
      this.value = value;
      return this;
   }
   
   
   public Integer getValue(){
      return this.value;
   }

   public NumberField build() {
       return new NumberFieldImpl(value);
   }
   
   public static NumberFieldBuilder of() {
      return new NumberFieldBuilder();
   }
   
   public static NumberFieldBuilder of(final NumberField template) {
      NumberFieldBuilder builder = new NumberFieldBuilder();
      builder.value = template.getValue();
      return builder;
   }
   
}