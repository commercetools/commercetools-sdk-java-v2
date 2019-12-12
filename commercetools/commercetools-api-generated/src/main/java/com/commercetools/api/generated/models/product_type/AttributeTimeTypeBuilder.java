package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeType;
import com.commercetools.api.generated.models.product_type.AttributeTimeType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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