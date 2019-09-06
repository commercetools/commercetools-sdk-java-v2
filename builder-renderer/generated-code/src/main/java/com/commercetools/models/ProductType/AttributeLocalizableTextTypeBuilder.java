package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeLocalizableTextType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

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