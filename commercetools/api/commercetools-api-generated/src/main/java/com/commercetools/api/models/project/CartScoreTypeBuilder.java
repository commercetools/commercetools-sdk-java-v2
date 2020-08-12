package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ShippingRateInputType;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.project.CartScoreType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartScoreTypeBuilder {
   
   
   

   public CartScoreType build() {
       return new CartScoreTypeImpl();
   }
   
   public static CartScoreTypeBuilder of() {
      return new CartScoreTypeBuilder();
   }
   
   public static CartScoreTypeBuilder of(final CartScoreType template) {
      CartScoreTypeBuilder builder = new CartScoreTypeBuilder();
      return builder;
   }
   
}
