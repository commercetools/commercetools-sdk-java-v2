package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.error.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.generated.models.error.DuplicateFieldWithConflictingResourceError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateFieldWithConflictingResourceErrorBuilder {
   
   
   private String message;
   
   
   private com.commercetools.api.generated.models.common.Reference conflictingResource;
   
   
   private com.fasterxml.jackson.databind.JsonNode duplicateValue;
   
   
   private String field;
   
   public DuplicateFieldWithConflictingResourceErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateFieldWithConflictingResourceErrorBuilder conflictingResource( final com.commercetools.api.generated.models.common.Reference conflictingResource) {
      this.conflictingResource = conflictingResource;
      return this;
   }
   
   public DuplicateFieldWithConflictingResourceErrorBuilder duplicateValue( final com.fasterxml.jackson.databind.JsonNode duplicateValue) {
      this.duplicateValue = duplicateValue;
      return this;
   }
   
   public DuplicateFieldWithConflictingResourceErrorBuilder field( final String field) {
      this.field = field;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getConflictingResource(){
      return this.conflictingResource;
   }
   
   
   public com.fasterxml.jackson.databind.JsonNode getDuplicateValue(){
      return this.duplicateValue;
   }
   
   
   public String getField(){
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