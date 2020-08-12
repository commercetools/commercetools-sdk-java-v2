package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeBooleanType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
