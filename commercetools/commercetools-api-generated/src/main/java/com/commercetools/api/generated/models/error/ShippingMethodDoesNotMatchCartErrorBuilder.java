package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.ShippingMethodDoesNotMatchCartError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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