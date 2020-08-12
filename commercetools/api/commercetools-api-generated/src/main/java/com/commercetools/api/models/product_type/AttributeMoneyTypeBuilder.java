package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeMoneyType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeMoneyTypeBuilder {
   
   
   

   public AttributeMoneyType build() {
       return new AttributeMoneyTypeImpl();
   }
   
   public static AttributeMoneyTypeBuilder of() {
      return new AttributeMoneyTypeBuilder();
   }
   
   public static AttributeMoneyTypeBuilder of(final AttributeMoneyType template) {
      AttributeMoneyTypeBuilder builder = new AttributeMoneyTypeBuilder();
      return builder;
   }
   
}
