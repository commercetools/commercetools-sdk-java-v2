package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeDateTimeType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeDateTimeTypeBuilder {
   
   
   

   public AttributeDateTimeType build() {
       return new AttributeDateTimeTypeImpl();
   }
   
   public static AttributeDateTimeTypeBuilder of() {
      return new AttributeDateTimeTypeBuilder();
   }
   
   public static AttributeDateTimeTypeBuilder of(final AttributeDateTimeType template) {
      AttributeDateTimeTypeBuilder builder = new AttributeDateTimeTypeBuilder();
      return builder;
   }
   
}