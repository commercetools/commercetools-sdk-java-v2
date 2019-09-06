package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Type.FieldDefinition;
import com.commercetools.models.Type.ResourceTypeId;
import java.lang.String;
import javax.annotation.Generated;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeImpl implements Type {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private java.util.List<com.commercetools.models.Type.FieldDefinition> fieldDefinitions;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private java.lang.String key;
   
   private java.util.List<com.commercetools.models.Type.ResourceTypeId> resourceTypeIds;

   @JsonCreator
   TypeImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("fieldDefinitions") final java.util.List<com.commercetools.models.Type.FieldDefinition> fieldDefinitions, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("key") final java.lang.String key, @JsonProperty("resourceTypeIds") final java.util.List<com.commercetools.models.Type.ResourceTypeId> resourceTypeIds) {
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
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.models.Type.FieldDefinition> getFieldDefinitions(){
      return this.fieldDefinitions;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public java.util.List<com.commercetools.models.Type.ResourceTypeId> getResourceTypeIds(){
      return this.resourceTypeIds;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.Common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.Common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setFieldDefinitions(final java.util.List<com.commercetools.models.Type.FieldDefinition> fieldDefinitions){
      this.fieldDefinitions = fieldDefinitions;
   }
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setResourceTypeIds(final java.util.List<com.commercetools.models.Type.ResourceTypeId> resourceTypeIds){
      this.resourceTypeIds = resourceTypeIds;
   }

}