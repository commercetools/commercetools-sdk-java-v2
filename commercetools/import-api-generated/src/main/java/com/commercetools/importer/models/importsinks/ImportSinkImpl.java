package com.commercetools.importer.models.importsinks;

import com.commercetools.importer.models.common.ImportResourceType;
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
*  <p>An import sink is the entry point for import resources from other systems.</p>
*  <p>It has an unique key and is specific to an import resource type.</p>
*  <p>If needed you can specify a skip predicate, which allows you skip the import of
*  operations which meet the conditions of the predicate.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportSinkImpl implements ImportSink {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private Long version;
   
   private String key;
   
   private com.commercetools.importer.models.common.ImportResourceType resourceType;

   @JsonCreator
   ImportSinkImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("version") final Long version, @JsonProperty("key") final String key, @JsonProperty("resourceType") final com.commercetools.importer.models.common.ImportResourceType resourceType) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.version = version;
      this.key = key;
      this.resourceType = resourceType;
   }
   public ImportSinkImpl() {
      
   }
   
   /**
   *  <p>When the import sink was created.</p>
   */
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   /**
   *  <p>When the import sink was modified.</p>
   */
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   *  <p>The version of this resource.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   *  <p>The unique key of the import sink.</p>
   */
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>The type of import resource sent to this import sink.
   *  You can only send one resource type per import sink.</p>
   */
   public com.commercetools.importer.models.common.ImportResourceType getResourceType(){
      return this.resourceType;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setResourceType(final com.commercetools.importer.models.common.ImportResourceType resourceType){
      this.resourceType = resourceType;
   }

}