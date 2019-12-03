package com.commercetools.importer.models.importoperations;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.common.ProcessingState;
import com.commercetools.importer.models.errors.ErrorObject;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>Tracks the status of a single import resource as it is imported into the commercetools project.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportOperationImpl implements ImportOperation {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String resourceKey;
   
   private Integer retryCount;
   
   private Long resourceVersion;
   
   private java.util.List<com.commercetools.importer.models.common.KeyReference> unresolvedReferences;
   
   private com.commercetools.importer.models.common.ProcessingState state;
   
   private String id;
   
   private String importSinkKey;
   
   private Long version;
   
   private java.time.ZonedDateTime expiresAt;
   
   private java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors;

   @JsonCreator
   ImportOperationImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("resourceKey") final String resourceKey, @JsonProperty("retryCount") final Integer retryCount, @JsonProperty("resourceVersion") final Long resourceVersion, @JsonProperty("unresolvedReferences") final java.util.List<com.commercetools.importer.models.common.KeyReference> unresolvedReferences, @JsonProperty("state") final com.commercetools.importer.models.common.ProcessingState state, @JsonProperty("id") final String id, @JsonProperty("importSinkKey") final String importSinkKey, @JsonProperty("version") final Long version, @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt, @JsonProperty("errors") final java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.resourceKey = resourceKey;
      this.retryCount = retryCount;
      this.resourceVersion = resourceVersion;
      this.unresolvedReferences = unresolvedReferences;
      this.state = state;
      this.id = id;
      this.importSinkKey = importSinkKey;
      this.version = version;
      this.expiresAt = expiresAt;
      this.errors = errors;
   }
   public ImportOperationImpl() {
      
   }
   
   /**
   *  <p>When the import operation was created.</p>
   */
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   /**
   *  <p>When the import operation was modified.</p>
   */
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   *  <p>The key of the import resource.</p>
   */
   public String getResourceKey(){
      return this.resourceKey;
   }
   
   /**
   *  <p>The number of request retries for processing the import resource.</p>
   */
   public Integer getRetryCount(){
      return this.retryCount;
   }
   
   /**
   *  <p>When the resource is successfully imported, this represents the imported resource version</p>
   */
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   /**
   *  <p>If an import resource has unresolved references, the state is set to <code>Unresolved</code>
   *  and this property contains the unresolved references.</p>
   */
   public java.util.List<com.commercetools.importer.models.common.KeyReference> getUnresolvedReferences(){
      return this.unresolvedReferences;
   }
   
   /**
   *  <p>The status of the import resource.</p>
   */
   public com.commercetools.importer.models.common.ProcessingState getState(){
      return this.state;
   }
   
   /**
   *  <p>The identifier of the operaton that is to be commited</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   *  <p>The key of the import sink.</p>
   */
   public String getImportSinkKey(){
      return this.importSinkKey;
   }
   
   /**
   *  <p>The import operation version.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   *  <p>When the import operation expires.</p>
   */
   public java.time.ZonedDateTime getExpiresAt(){
      return this.expiresAt;
   }
   
   /**
   *  <p>If an import resource does not import correctly, the state is set to <code>Rejected</code> or <code>ValidationFailed</code>
   *  and this property contains the errors.</p>
   */
   public java.util.List<com.commercetools.importer.models.errors.ErrorObject> getErrors(){
      return this.errors;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setResourceKey(final String resourceKey){
      this.resourceKey = resourceKey;
   }
   
   public void setRetryCount(final Integer retryCount){
      this.retryCount = retryCount;
   }
   
   public void setResourceVersion(final Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setUnresolvedReferences(final java.util.List<com.commercetools.importer.models.common.KeyReference> unresolvedReferences){
      this.unresolvedReferences = unresolvedReferences;
   }
   
   public void setState(final com.commercetools.importer.models.common.ProcessingState state){
      this.state = state;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setImportSinkKey(final String importSinkKey){
      this.importSinkKey = importSinkKey;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setExpiresAt(final java.time.ZonedDateTime expiresAt){
      this.expiresAt = expiresAt;
   }
   
   public void setErrors(final java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors){
      this.errors = errors;
   }

}