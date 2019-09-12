package com.commercetools.models.Error;

import com.commercetools.models.Common.Price;
import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.DuplicatePriceScopeError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DuplicatePriceScopeErrorBuilder {
   
   
   private java.lang.String message;
   
   
   private java.util.List<com.commercetools.models.Common.Price> conflictingPrices;
   
   public DuplicatePriceScopeErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public DuplicatePriceScopeErrorBuilder conflictingPrices( final java.util.List<com.commercetools.models.Common.Price> conflictingPrices) {
      this.conflictingPrices = conflictingPrices;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Price> getConflictingPrices(){
      return this.conflictingPrices;
   }

   public DuplicatePriceScopeError build() {
       return new DuplicatePriceScopeErrorImpl(message, conflictingPrices);
   }
   
   public static DuplicatePriceScopeErrorBuilder of() {
      return new DuplicatePriceScopeErrorBuilder();
   }
   
   public static DuplicatePriceScopeErrorBuilder of(final DuplicatePriceScopeError template) {
      DuplicatePriceScopeErrorBuilder builder = new DuplicatePriceScopeErrorBuilder();
      builder.message = template.getMessage();
      builder.conflictingPrices = template.getConflictingPrices();
      return builder;
   }
   
}