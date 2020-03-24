package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.LocalizableTextSetAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LocalizableTextSetAttributeBuilder {
   
   @Nullable
   private String name;
   
   
   private java.util.List<com.commercetools.importer.models.common.LocalizedString> value;
   
   public LocalizableTextSetAttributeBuilder name(@Nullable final String name) {
      this.name = name;
      return this;
   }
   
   public LocalizableTextSetAttributeBuilder value( final java.util.List<com.commercetools.importer.models.common.LocalizedString> value) {
      this.value = value;
      return this;
   }
   
   @Nullable
   public String getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.importer.models.common.LocalizedString> getValue(){
      return this.value;
   }

   public LocalizableTextSetAttribute build() {
       return new LocalizableTextSetAttributeImpl(name, value);
   }
   
   public static LocalizableTextSetAttributeBuilder of() {
      return new LocalizableTextSetAttributeBuilder();
   }
   
   public static LocalizableTextSetAttributeBuilder of(final LocalizableTextSetAttribute template) {
      LocalizableTextSetAttributeBuilder builder = new LocalizableTextSetAttributeBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}