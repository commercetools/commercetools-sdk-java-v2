package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.NoMatchingProductDiscountFoundError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class NoMatchingProductDiscountFoundErrorBuilder {
   
   
   private java.lang.String message;
   
   public NoMatchingProductDiscountFoundErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public NoMatchingProductDiscountFoundError build() {
       return new NoMatchingProductDiscountFoundErrorImpl(message);
   }
   
   public static NoMatchingProductDiscountFoundErrorBuilder of() {
      return new NoMatchingProductDiscountFoundErrorBuilder();
   }
   
   public static NoMatchingProductDiscountFoundErrorBuilder of(final NoMatchingProductDiscountFoundError template) {
      NoMatchingProductDiscountFoundErrorBuilder builder = new NoMatchingProductDiscountFoundErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}