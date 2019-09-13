package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeType;
import java.lang.String;
import com.commercetools.models.product_type.AttributeTimeType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeTimeTypeBuilder {
   
   
   

   public AttributeTimeType build() {
       return new AttributeTimeTypeImpl();
   }
   
   public static AttributeTimeTypeBuilder of() {
      return new AttributeTimeTypeBuilder();
   }
   
   public static AttributeTimeTypeBuilder of(final AttributeTimeType template) {
      AttributeTimeTypeBuilder builder = new AttributeTimeTypeBuilder();
      return builder;
   }
   
}