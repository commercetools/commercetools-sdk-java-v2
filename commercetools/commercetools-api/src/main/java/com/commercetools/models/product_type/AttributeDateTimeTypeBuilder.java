package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeType;
import com.commercetools.models.product_type.AttributeDateTimeType;
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