package com.commercetools.api.generated.models.product_type;


import com.commercetools.api.generated.models.product_type.AttributePlainEnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributePlainEnumValueBuilder {
   
   
   private String label;
   
   
   private String key;
   
   public AttributePlainEnumValueBuilder label( final String label) {
      this.label = label;
      return this;
   }
   
   public AttributePlainEnumValueBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getLabel(){
      return this.label;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public AttributePlainEnumValue build() {
       return new AttributePlainEnumValueImpl(label, key);
   }
   
   public static AttributePlainEnumValueBuilder of() {
      return new AttributePlainEnumValueBuilder();
   }
   
   public static AttributePlainEnumValueBuilder of(final AttributePlainEnumValue template) {
      AttributePlainEnumValueBuilder builder = new AttributePlainEnumValueBuilder();
      builder.label = template.getLabel();
      builder.key = template.getKey();
      return builder;
   }
   
}