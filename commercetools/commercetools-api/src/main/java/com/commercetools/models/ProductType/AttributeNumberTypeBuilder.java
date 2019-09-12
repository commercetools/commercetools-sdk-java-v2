package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeNumberType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeNumberTypeBuilder {
   
   
   

   public AttributeNumberType build() {
       return new AttributeNumberTypeImpl();
   }
   
   public static AttributeNumberTypeBuilder of() {
      return new AttributeNumberTypeBuilder();
   }
   
   public static AttributeNumberTypeBuilder of(final AttributeNumberType template) {
      AttributeNumberTypeBuilder builder = new AttributeNumberTypeBuilder();
      return builder;
   }
   
}