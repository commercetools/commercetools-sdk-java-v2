package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.ShippingMethodDoesNotMatchCartError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodDoesNotMatchCartErrorBuilder {
   
   
   private String message;
   
   public ShippingMethodDoesNotMatchCartErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }

   public ShippingMethodDoesNotMatchCartError build() {
       return new ShippingMethodDoesNotMatchCartErrorImpl(message);
   }
   
   public static ShippingMethodDoesNotMatchCartErrorBuilder of() {
      return new ShippingMethodDoesNotMatchCartErrorBuilder();
   }
   
   public static ShippingMethodDoesNotMatchCartErrorBuilder of(final ShippingMethodDoesNotMatchCartError template) {
      ShippingMethodDoesNotMatchCartErrorBuilder builder = new ShippingMethodDoesNotMatchCartErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}