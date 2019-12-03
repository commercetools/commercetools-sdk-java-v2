package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.AttributeLocalizableTextType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeLocalizableTextTypeBuilder {
   
   
   

   public AttributeLocalizableTextType build() {
       return new AttributeLocalizableTextTypeImpl();
   }
   
   public static AttributeLocalizableTextTypeBuilder of() {
      return new AttributeLocalizableTextTypeBuilder();
   }
   
   public static AttributeLocalizableTextTypeBuilder of(final AttributeLocalizableTextType template) {
      AttributeLocalizableTextTypeBuilder builder = new AttributeLocalizableTextTypeBuilder();
      return builder;
   }
   
}