package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.DuplicateFieldError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateFieldErrorBuilder {
   
   
   private String message;
   
   @Nullable
   private Object duplicateValue;
   
   @Nullable
   private String field;
   
   public DuplicateFieldErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateFieldErrorBuilder duplicateValue(@Nullable final Object duplicateValue) {
      this.duplicateValue = duplicateValue;
      return this;
   }
   
   public DuplicateFieldErrorBuilder field(@Nullable final String field) {
      this.field = field;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   @Nullable
   public Object getDuplicateValue(){
      return this.duplicateValue;
   }
   
   @Nullable
   public String getField(){
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