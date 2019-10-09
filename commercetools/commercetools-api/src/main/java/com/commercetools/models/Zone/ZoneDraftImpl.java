package com.commercetools.models.zone;

import com.commercetools.models.zone.Location;
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

   private String name;
   
   private String description;
   
   private java.util.List<com.commercetools.models.zone.Location> locations;
   
   private String key;

   @JsonCreator
   ZoneDraftImpl(@JsonProperty("name") final String name, @JsonProperty("description") final String description, @JsonProperty("locations") final java.util.List<com.commercetools.models.zone.Location> locations, @JsonProperty("key") final String key) {
      this.name = name;
      this.description = description;
      this.locations = locations;
      this.key = key;
   }
   public ZoneDraftImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public String getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.zone.Location> getLocations(){
      return this.locations;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setDescription(final String description){
      this.description = description;
   }
   
   public void setLocations(final java.util.List<com.commercetools.models.zone.Location> locations){
      this.locations = locations;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}