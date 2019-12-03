package com.commercetools.importer.models.importsinks;

import com.commercetools.importer.models.common.ImportResourceType;
import java.time.ZonedDateTime;
import com.commercetools.importer.models.importsinks.ImportSink;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportSinkBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private Long version;
   
   
   private String key;
   
   
   private com.commercetools.importer.models.common.ImportResourceType resourceType;
   
   public ImportSinkBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ImportSinkBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ImportSinkBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ImportSinkBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   public ImportSinkBuilder resourceType( final com.commercetools.importer.models.common.ImportResourceType resourceType) {
      this.resourceType = resourceType;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.importer.models.common.ImportResourceType getResourceType(){
      return this.resourceType;
   }

   public ImportSink build() {
       return new ImportSinkImpl(createdAt, lastModifiedAt, version, key, resourceType);
   }
   
   public static ImportSinkBuilder of() {
      return new ImportSinkBuilder();
   }
   
   public static ImportSinkBuilder of(final ImportSink template) {
      ImportSinkBuilder builder = new ImportSinkBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.version = template.getVersion();
      builder.key = template.getKey();
      builder.resourceType = template.getResourceType();
      return builder;
   }
   
}