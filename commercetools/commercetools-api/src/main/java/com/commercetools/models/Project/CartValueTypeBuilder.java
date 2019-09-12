package com.commercetools.models.Project;

import com.commercetools.models.Project.ShippingRateInputType;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
import com.commercetools.models.Project.CartValueType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

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