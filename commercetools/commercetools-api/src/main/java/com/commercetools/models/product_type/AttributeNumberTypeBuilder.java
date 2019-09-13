package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeType;
import java.lang.String;
import com.commercetools.models.product_type.AttributeNumberType;
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