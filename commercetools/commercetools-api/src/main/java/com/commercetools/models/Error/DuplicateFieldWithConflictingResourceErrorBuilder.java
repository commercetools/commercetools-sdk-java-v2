package com.commercetools.models.Error;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Error.DuplicateFieldWithConflictingResourceError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DuplicateFieldWithConflictingResourceErrorBuilder {
   
   
   private java.lang.String message;
   
   
   private com.commercetools.models.Common.Reference conflictingResource;
   
   
   private java.lang.Object duplicateValue;
   
   
   private java.lang.String field;
   
   public DuplicateFieldWithConflictingResourceErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateFieldWithConflictingResourceErrorBuilder conflictingResource( final com.commercetools.models.Common.Reference conflictingResource) {
      this.conflictingResource = conflictingResource;
      return this;
   }
   
   public DuplicateFieldWithConflictingResourceErrorBuilder duplicateValue( final java.lang.Object duplicateValue) {
      this.duplicateValue = duplicateValue;
      return this;
   }
   
   public DuplicateFieldWithConflictingResourceErrorBuilder field( final java.lang.String field) {
      this.field = field;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.models.Common.Reference getConflictingResource(){
      return this.conflictingResource;
   }
   
   
   public java.lang.Object getDuplicateValue(){
      return this.duplicateValue;
   }
   
   
   public java.lang.String getField(){
      return this.field;
   }

   public DuplicateFieldWithConflictingResourceError build() {
       return new DuplicateFieldWithConflictingResourceErrorImpl(message, conflictingResource, duplicateValue, field);
   }
   
   public static DuplicateFieldWithConflictingResourceErrorBuilder of() {
      return new DuplicateFieldWithConflictingResourceErrorBuilder();
   }
   
   public static DuplicateFieldWithConflictingResourceErrorBuilder of(final DuplicateFieldWithConflictingResourceError template) {
      DuplicateFieldWithConflictingResourceErrorBuilder builder = new DuplicateFieldWithConflictingResourceErrorBuilder();
      builder.message = template.getMessage();
      builder.conflictingResource = template.getConflictingResource();
      builder.duplicateValue = template.getDuplicateValue();
      builder.field = template.getField();
      return builder;
   }
   
}