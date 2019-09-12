package com.commercetools.models.Type;

import java.lang.Object;
import com.commercetools.models.Type.FieldContainer;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class FieldContainerBuilder {
   
   
   private Map<String, java.lang.Object> values;
   
   public FieldContainerBuilder values( final Map<String, java.lang.Object> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, java.lang.Object> getValues(){
      return this.values;
   }

   public FieldContainer build() {
       return new FieldContainerImpl(values);
   }
   
   public static FieldContainerBuilder of() {
      return new FieldContainerBuilder();
   }
   
   public static FieldContainerBuilder of(final FieldContainer template) {
      FieldContainerBuilder builder = new FieldContainerBuilder();
      builder.values = template.values();
      return builder;
   }
   
}