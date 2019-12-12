package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.type.FieldDefinition;
import com.commercetools.api.generated.models.type.ResourceTypeId;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeImpl implements Type {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private java.util.List<com.commercetools.api.generated.models.type.FieldDefinition> fieldDefinitions;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private String key;
   
   private java.util.List<com.commercetools.api.generated.models.type.ResourceTypeId> resourceTypeIds;

   @JsonCreator
   TypeImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("fieldDefinitions") final java.util.List<com.commercetools.api.generated.models.type.FieldDefinition> fieldDefinitions, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("key") final String key, @JsonProperty("resourceTypeIds") final java.util.List<com.commercetools.api.generated.models.type.ResourceTypeId> resourceTypeIds) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.name = name;
      this.fieldDefinitions = fieldDefinitions;
      this.description = description;
      this.key = key;
      this.resourceTypeIds = resourceTypeIds;
   }
   public TypeImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   *  <p>The unique ID of the type.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   *  <p>The current version of the type.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.type.FieldDefinition> getFieldDefinitions(){
      return this.fieldDefinitions;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   *  <p>Identifier for the type (max.
   *  256 characters).</p>
   */
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>Defines for which resource(s) the type is valid.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.type.ResourceTypeId> getResourceTypeIds(){
      return this.resourceTypeIds;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setFieldDefinitions(final java.util.List<com.commercetools.api.generated.models.type.FieldDefinition> fieldDefinitions){
      this.fieldDefinitions = fieldDefinitions;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setResourceTypeIds(final java.util.List<com.commercetools.api.generated.models.type.ResourceTypeId> resourceTypeIds){
      this.resourceTypeIds = resourceTypeIds;
   }

}