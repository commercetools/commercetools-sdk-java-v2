package com.commercetools.models.customer_group;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.type.CustomFields;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerGroupImpl implements CustomerGroup {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private java.lang.String name;
   
   private java.lang.String key;

   @JsonCreator
   CustomerGroupImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("name") final java.lang.String name, @JsonProperty("key") final java.lang.String key) {
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
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
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
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}