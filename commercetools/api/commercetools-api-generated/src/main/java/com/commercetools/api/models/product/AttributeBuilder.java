package com.commercetools.api.models.product;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.Attribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeBuilder {
   
   
   private String name;
   
   
   private com.fasterxml.jackson.databind.JsonNode value;
   
   public AttributeBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public AttributeBuilder value( final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public Attribute build() {
       return new AttributeImpl(name, value);
   }
   
   public static AttributeBuilder of() {
      return new AttributeBuilder();
   }
   
   public static AttributeBuilder of(final Attribute template) {
      AttributeBuilder builder = new AttributeBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}
