package com.commercetools.models.Zone;

import com.commercetools.models.Zone.Location;
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
public final class ZoneDraftImpl implements ZoneDraft {

   private java.lang.String name;
   
   private java.lang.String description;
   
   private java.util.List<com.commercetools.models.Zone.Location> locations;
   
   private java.lang.String key;

   @JsonCreator
   ZoneDraftImpl(@JsonProperty("name") final java.lang.String name, @JsonProperty("description") final java.lang.String description, @JsonProperty("locations") final java.util.List<com.commercetools.models.Zone.Location> locations, @JsonProperty("key") final java.lang.String key) {
      this.name = name;
      this.description = description;
      this.locations = locations;
      this.key = key;
   }
   public ZoneDraftImpl() {
      
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.String getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.Zone.Location> getLocations(){
      return this.locations;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setDescription(final java.lang.String description){
      this.description = description;
   }
   
   public void setLocations(final java.util.List<com.commercetools.models.Zone.Location> locations){
      this.locations = locations;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}