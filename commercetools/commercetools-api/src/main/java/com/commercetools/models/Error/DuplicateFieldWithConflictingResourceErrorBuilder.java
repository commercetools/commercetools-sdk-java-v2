package com.commercetools.models.error;

import com.commercetools.models.common.Reference;
import com.commercetools.models.error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.error.DuplicateFieldWithConflictingResourceError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DuplicateFieldWithConflictingResourceErrorBuilder {
   
   
   private java.lang.String message;
   
   
   private com.commercetools.models.common.Reference conflictingResource;
   
   
   private java.lang.Object duplicateValue;
   
   
   private java.lang.String field;
   
   public DuplicateFieldWithConflictingResourceErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateFieldWithConflictingResourceErrorBuilder conflictingResource( final com.commercetools.models.common.Reference conflictingResource) {
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
   
   
   public com.commercetools.models.common.Reference getConflictingResource(){
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