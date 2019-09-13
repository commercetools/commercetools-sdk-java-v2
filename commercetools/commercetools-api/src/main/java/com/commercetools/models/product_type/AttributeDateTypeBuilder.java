package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeType;
import java.lang.String;
import com.commercetools.models.product_type.AttributeDateType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeDateTypeBuilder {
   
   
   

   public AttributeDateType build() {
       return new AttributeDateTypeImpl();
   }
   
   public static AttributeDateTypeBuilder of() {
      return new AttributeDateTypeBuilder();
   }
   
   public static AttributeDateTypeBuilder of(final AttributeDateType template) {
      AttributeDateTypeBuilder builder = new AttributeDateTypeBuilder();
      return builder;
   }
   
}