package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.ReferenceSetAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReferenceSetAttributeBuilder {
   
   @Nullable
   private String name;
   
   
   private java.util.List<com.commercetools.importer.models.common.KeyReference> value;
   
   public ReferenceSetAttributeBuilder name(@Nullable final String name) {
      this.name = name;
      return this;
   }
   
   public ReferenceSetAttributeBuilder value( final java.util.List<com.commercetools.importer.models.common.KeyReference> value) {
      this.value = value;
      return this;
   }
   
   @Nullable
   public String getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.importer.models.common.KeyReference> getValue(){
      return this.value;
   }

   public ReferenceSetAttribute build() {
       return new ReferenceSetAttributeImpl(name, value);
   }
   
   public static ReferenceSetAttributeBuilder of() {
      return new ReferenceSetAttributeBuilder();
   }
   
   public static ReferenceSetAttributeBuilder of(final ReferenceSetAttribute template) {
      ReferenceSetAttributeBuilder builder = new ReferenceSetAttributeBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}