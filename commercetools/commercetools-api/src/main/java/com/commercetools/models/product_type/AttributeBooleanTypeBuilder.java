package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeType;
import java.lang.String;
import com.commercetools.models.product_type.AttributeBooleanType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeBooleanTypeBuilder {
   
   
   

   public AttributeBooleanType build() {
       return new AttributeBooleanTypeImpl();
   }
   
   public static AttributeBooleanTypeBuilder of() {
      return new AttributeBooleanTypeBuilder();
   }
   
   public static AttributeBooleanTypeBuilder of(final AttributeBooleanType template) {
      AttributeBooleanTypeBuilder builder = new AttributeBooleanTypeBuilder();
      return builder;
   }
   
}