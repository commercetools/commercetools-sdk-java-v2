package com.commercetools.models.Project;

import com.commercetools.models.Project.ShippingRateInputType;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
import com.commercetools.models.Project.CartScoreType;
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