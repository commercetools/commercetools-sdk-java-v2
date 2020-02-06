package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import java.time.LocalTime;
import com.commercetools.importer.models.customfields.TimeSetField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TimeSetFieldBuilder {
   
   
   private java.util.List<java.time.LocalTime> value;
   
   public TimeSetFieldBuilder value( final java.util.List<java.time.LocalTime> value) {
      this.value = value;
      return this;
   }
   
   
   public java.util.List<java.time.LocalTime> getValue(){
      return this.value;
   }

   public TimeSetField build() {
       return new TimeSetFieldImpl(value);
   }
   
   public static TimeSetFieldBuilder of() {
      return new TimeSetFieldBuilder();
   }
   
   public static TimeSetFieldBuilder of(final TimeSetField template) {
      TimeSetFieldBuilder builder = new TimeSetFieldBuilder();
      builder.value = template.getValue();
      return builder;
   }
   
}