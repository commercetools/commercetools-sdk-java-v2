package com.commercetools.importer.models.importoperations;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.common.ProcessingState;
import com.commercetools.importer.models.errors.ErrorObject;
import java.time.ZonedDateTime;
import com.commercetools.importer.models.importoperations.ImportOperation;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportOperationBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String resourceKey;
   
   
   private Integer retryCount;
   
   @Nullable
   private Long resourceVersion;
   
   @Nullable
   private java.util.List<com.commercetools.importer.models.common.KeyReference> unresolvedReferences;
   
   
   private com.commercetools.importer.models.common.ProcessingState state;
   
   
   private String id;
   
   
   private String importSinkKey;
   
   
   private Long version;
   
   @Nullable
   private java.time.ZonedDateTime expiresAt;
   
   @Nullable
   private java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors;
   
   public ImportOperationBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ImportOperationBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ImportOperationBuilder resourceKey( final String resourceKey) {
      this.resourceKey = resourceKey;
      return this;
   }
   
   public ImportOperationBuilder retryCount( final Integer retryCount) {
      this.retryCount = retryCount;
      return this;
   }
   
   public ImportOperationBuilder resourceVersion(@Nullable final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ImportOperationBuilder unresolvedReferences(@Nullable final java.util.List<com.commercetools.importer.models.common.KeyReference> unresolvedReferences) {
      this.unresolvedReferences = unresolvedReferences;
      return this;
   }
   
   public ImportOperationBuilder state( final com.commercetools.importer.models.common.ProcessingState state) {
      this.state = state;
      return this;
   }
   
   public ImportOperationBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ImportOperationBuilder importSinkKey( final String importSinkKey) {
      this.importSinkKey = importSinkKey;
      return this;
   }
   
   public ImportOperationBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ImportOperationBuilder expiresAt(@Nullable final java.time.ZonedDateTime expiresAt) {
      this.expiresAt = expiresAt;
      return this;
   }
   
   public ImportOperationBuilder errors(@Nullable final java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors) {
      this.errors = errors;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getResourceKey(){
      return this.resourceKey;
   }
   
   
   public Integer getRetryCount(){
      return this.retryCount;
   }
   
   @Nullable
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   @Nullable
   public java.util.List<com.commercetools.importer.models.common.KeyReference> getUnresolvedReferences(){
      return this.unresolvedReferences;
   }
   
   
   public com.commercetools.importer.models.common.ProcessingState getState(){
      return this.state;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public String getImportSinkKey(){
      return this.importSinkKey;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public java.time.ZonedDateTime getExpiresAt(){
      return this.expiresAt;
   }
   
   @Nullable
   public java.util.List<com.commercetools.importer.models.errors.ErrorObject> getErrors(){
      return this.errors;
   }

   public ImportOperation build() {
       return new ImportOperationImpl(createdAt, lastModifiedAt, resourceKey, retryCount, resourceVersion, unresolvedReferences, state, id, importSinkKey, version, expiresAt, errors);
   }
   
   public static ImportOperationBuilder of() {
      return new ImportOperationBuilder();
   }
   
   public static ImportOperationBuilder of(final ImportOperation template) {
      ImportOperationBuilder builder = new ImportOperationBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.resourceKey = template.getResourceKey();
      builder.retryCount = template.getRetryCount();
      builder.resourceVersion = template.getResourceVersion();
      builder.unresolvedReferences = template.getUnresolvedReferences();
      builder.state = template.getState();
      builder.id = template.getId();
      builder.importSinkKey = template.getImportSinkKey();
      builder.version = template.getVersion();
      builder.expiresAt = template.getExpiresAt();
      builder.errors = template.getErrors();
      return builder;
   }
   
}