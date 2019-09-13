package com.commercetools.models.zone;

import com.commercetools.models.common.BaseResource;
import com.commercetools.models.zone.Location;
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
public final class ZoneImpl implements Zone {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private java.lang.String name;
   
   private java.lang.String description;
   
   private java.util.List<com.commercetools.models.zone.Location> locations;
   
   private java.lang.String key;

   @JsonCreator
   ZoneImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("name") final java.lang.String name, @JsonProperty("description") final java.lang.String description, @JsonProperty("locations") final java.util.List<com.commercetools.models.zone.Location> locations, @JsonProperty("key") final java.lang.String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.name = name;
      this.description = description;
      this.locations = locations;
      this.key = key;
   }
   public ZoneImpl() {
      
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
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.String getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.zone.Location> getLocations(){
      return this.locations;
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
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setDescription(final java.lang.String description){
      this.description = description;
   }
   
   public void setLocations(final java.util.List<com.commercetools.models.zone.Location> locations){
      this.locations = locations;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}