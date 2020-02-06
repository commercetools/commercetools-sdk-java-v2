package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.importer.models.errors.ConcurrentModificationError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ConcurrentModificationErrorBuilder {
   
   
   private String message;
   
   
   private Long specifiedVersion;
   
   
   private Long currentVersion;
   
   
   private com.fasterxml.jackson.databind.JsonNode conflictedResource;
   
   public ConcurrentModificationErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public ConcurrentModificationErrorBuilder specifiedVersion( final Long specifiedVersion) {
      this.specifiedVersion = specifiedVersion;
      return this;
   }
   
   public ConcurrentModificationErrorBuilder currentVersion( final Long currentVersion) {
      this.currentVersion = currentVersion;
      return this;
   }
   
   public ConcurrentModificationErrorBuilder conflictedResource( final com.fasterxml.jackson.databind.JsonNode conflictedResource) {
      this.conflictedResource = conflictedResource;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public Long getSpecifiedVersion(){
      return this.specifiedVersion;
   }
   
   
   public Long getCurrentVersion(){
      return this.currentVersion;
   }
   
   
   public com.fasterxml.jackson.databind.JsonNode getConflictedResource(){
      return this.conflictedResource;
   }

   public ConcurrentModificationError build() {
       return new ConcurrentModificationErrorImpl(message, specifiedVersion, currentVersion, conflictedResource);
   }
   
   public static ConcurrentModificationErrorBuilder of() {
      return new ConcurrentModificationErrorBuilder();
   }
   
   public static ConcurrentModificationErrorBuilder of(final ConcurrentModificationError template) {
      ConcurrentModificationErrorBuilder builder = new ConcurrentModificationErrorBuilder();
      builder.message = template.getMessage();
      builder.specifiedVersion = template.getSpecifiedVersion();
      builder.currentVersion = template.getCurrentVersion();
      builder.conflictedResource = template.getConflictedResource();
      return builder;
   }
   
}