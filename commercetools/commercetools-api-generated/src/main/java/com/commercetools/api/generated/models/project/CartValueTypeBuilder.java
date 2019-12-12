package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ShippingRateInputType;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.generated.models.project.CartValueType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartValueTypeBuilder {
   
   
   

   public CartValueType build() {
       return new CartValueTypeImpl();
   }
   
   public static CartValueTypeBuilder of() {
      return new CartValueTypeBuilder();
   }
   
   public static CartValueTypeBuilder of(final CartValueType template) {
      CartValueTypeBuilder builder = new CartValueTypeBuilder();
      return builder;
   }
   
}