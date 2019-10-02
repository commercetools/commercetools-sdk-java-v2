package com.commercetools.models.error;

import com.commercetools.models.common.Price;
import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.DuplicatePriceScopeError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DuplicatePriceScopeErrorBuilder {
   
   
   private String message;
   
   
   private java.util.List<com.commercetools.models.common.Price> conflictingPrices;
   
   public DuplicatePriceScopeErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public DuplicatePriceScopeErrorBuilder conflictingPrices( final java.util.List<com.commercetools.models.common.Price> conflictingPrices) {
      this.conflictingPrices = conflictingPrices;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<com.commercetools.models.common.Price> getConflictingPrices(){
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