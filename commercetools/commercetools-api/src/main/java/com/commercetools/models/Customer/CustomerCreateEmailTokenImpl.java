package com.commercetools.models.customer;

import java.lang.Long;
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
public final class CustomerCreateEmailTokenImpl implements CustomerCreateEmailToken {

   private java.lang.Long ttlMinutes;
   
   private java.lang.String id;
   
   private java.lang.Long version;

   @JsonCreator
   CustomerCreateEmailTokenImpl(@JsonProperty("ttlMinutes") final java.lang.Long ttlMinutes, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version) {
      this.ttlMinutes = ttlMinutes;
      this.id = id;
      this.version = version;
   }
   public CustomerCreateEmailTokenImpl() {
      
   }
   
   
   public java.lang.Long getTtlMinutes(){
      return this.ttlMinutes;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public void setTtlMinutes(final java.lang.Long ttlMinutes){
      this.ttlMinutes = ttlMinutes;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }

}