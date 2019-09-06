package com.commercetools.models.CustomerGroup;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Type.CustomFields;
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
public final class CustomerGroupImpl implements CustomerGroup {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private java.lang.String name;
   
   private java.lang.String key;

   @JsonCreator
   CustomerGroupImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("name") final java.lang.String name, @JsonProperty("key") final java.lang.String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.custom = custom;
      this.name = name;
      this.key = key;
   }
   public CustomerGroupImpl() {
      
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
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
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
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}