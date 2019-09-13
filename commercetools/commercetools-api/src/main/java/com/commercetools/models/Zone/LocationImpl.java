package com.commercetools.models.zone;

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
public final class LocationImpl implements Location {

   private java.lang.String country;
   
   private java.lang.String state;

   @JsonCreator
   LocationImpl(@JsonProperty("country") final java.lang.String country, @JsonProperty("state") final java.lang.String state) {
      this.country = country;
      this.state = state;
   }
   public LocationImpl() {
      
   }
   
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.lang.String getState(){
      return this.state;
   }

   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setState(final java.lang.String state){
      this.state = state;
   }

}