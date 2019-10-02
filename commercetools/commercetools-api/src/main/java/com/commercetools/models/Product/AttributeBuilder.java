package com.commercetools.models.product;


import com.commercetools.models.product.Attribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeBuilder {
   
   
   private String name;
   
   
   private Object value;
   
   public AttributeBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public AttributeBuilder value( final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public Object getValue(){
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