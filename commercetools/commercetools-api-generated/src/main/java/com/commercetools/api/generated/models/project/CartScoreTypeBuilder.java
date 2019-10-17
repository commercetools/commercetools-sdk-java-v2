package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ShippingRateInputType;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.generated.models.project.CartScoreType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

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