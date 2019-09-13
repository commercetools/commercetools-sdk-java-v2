package com.commercetools.models.product;

import java.lang.Object;
import java.lang.String;
import com.commercetools.models.product.Attribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeBuilder {
   
   
   private java.lang.String name;
   
   
   private java.lang.Object value;
   
   public AttributeBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public AttributeBuilder value( final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.Object getValue(){
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