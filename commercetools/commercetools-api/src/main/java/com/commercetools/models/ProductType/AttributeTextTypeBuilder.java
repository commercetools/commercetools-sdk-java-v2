package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeTextType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeTextTypeBuilder {
   
   
   

   public AttributeTextType build() {
       return new AttributeTextTypeImpl();
   }
   
   public static AttributeTextTypeBuilder of() {
      return new AttributeTextTypeBuilder();
   }
   
   public static AttributeTextTypeBuilder of(final AttributeTextType template) {
      AttributeTextTypeBuilder builder = new AttributeTextTypeBuilder();
      return builder;
   }
   
}