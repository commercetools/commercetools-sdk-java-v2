package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.error.DuplicateFieldError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DuplicateFieldErrorBuilder {
   
   
   private java.lang.String message;
   
   @Nullable
   private java.lang.Object duplicateValue;
   
   @Nullable
   private java.lang.String field;
   
   public DuplicateFieldErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateFieldErrorBuilder duplicateValue(@Nullable final java.lang.Object duplicateValue) {
      this.duplicateValue = duplicateValue;
      return this;
   }
   
   public DuplicateFieldErrorBuilder field(@Nullable final java.lang.String field) {
      this.field = field;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   @Nullable
   public java.lang.Object getDuplicateValue(){
      return this.duplicateValue;
   }
   
   @Nullable
   public java.lang.String getField(){
      return this.field;
   }

   public DuplicateFieldError build() {
       return new DuplicateFieldErrorImpl(message, duplicateValue, field);
   }
   
   public static DuplicateFieldErrorBuilder of() {
      return new DuplicateFieldErrorBuilder();
   }
   
   public static DuplicateFieldErrorBuilder of(final DuplicateFieldError template) {
      DuplicateFieldErrorBuilder builder = new DuplicateFieldErrorBuilder();
      builder.message = template.getMessage();
      builder.duplicateValue = template.getDuplicateValue();
      builder.field = template.getField();
      return builder;
   }
   
}