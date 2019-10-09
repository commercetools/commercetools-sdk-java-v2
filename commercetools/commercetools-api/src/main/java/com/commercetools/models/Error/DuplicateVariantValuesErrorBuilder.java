package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.VariantValues;
import com.commercetools.models.error.DuplicateVariantValuesError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DuplicateVariantValuesErrorBuilder {
   
   
   private String message;
   
   
   private com.commercetools.models.error.VariantValues variantValues;
   
   public DuplicateVariantValuesErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateVariantValuesErrorBuilder variantValues( final com.commercetools.models.error.VariantValues variantValues) {
      this.variantValues = variantValues;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.models.error.VariantValues getVariantValues(){
      return this.variantValues;
   }

   public DuplicateVariantValuesError build() {
       return new DuplicateVariantValuesErrorImpl(message, variantValues);
   }
   
   public static DuplicateVariantValuesErrorBuilder of() {
      return new DuplicateVariantValuesErrorBuilder();
   }
   
   public static DuplicateVariantValuesErrorBuilder of(final DuplicateVariantValuesError template) {
      DuplicateVariantValuesErrorBuilder builder = new DuplicateVariantValuesErrorBuilder();
      builder.message = template.getMessage();
      builder.variantValues = template.getVariantValues();
      return builder;
   }
   
}