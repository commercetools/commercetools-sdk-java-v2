package com.commercetools.models.api_client;

import java.lang.String;
import java.time.LocalDate;
import java.time.ZonedDateTime;
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
public final class ApiClientImpl implements ApiClient {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime deleteAt;
   
   private java.time.LocalDate lastUsedAt;
   
   private java.lang.String scope;
   
   private java.lang.String name;
   
   private java.lang.String secret;
   
   private java.lang.String id;

   @JsonCreator
   ApiClientImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("deleteAt") final java.time.ZonedDateTime deleteAt, @JsonProperty("lastUsedAt") final java.time.LocalDate lastUsedAt, @JsonProperty("scope") final java.lang.String scope, @JsonProperty("name") final java.lang.String name, @JsonProperty("secret") final java.lang.String secret, @JsonProperty("id") final java.lang.String id) {
      this.createdAt = createdAt;
      this.deleteAt = deleteAt;
      this.lastUsedAt = lastUsedAt;
      this.scope = scope;
      this.name = name;
      this.secret = secret;
      this.id = id;
   }
   public ApiClientImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getDeleteAt(){
      return this.deleteAt;
   }
   
   
   public java.time.LocalDate getLastUsedAt(){
      return this.lastUsedAt;
   }
   
   
   public java.lang.String getScope(){
      return this.scope;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.String getSecret(){
      return this.secret;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setDeleteAt(final java.time.ZonedDateTime deleteAt){
      this.deleteAt = deleteAt;
   }
   
   public void setLastUsedAt(final java.time.LocalDate lastUsedAt){
      this.lastUsedAt = lastUsedAt;
   }
   
   public void setScope(final java.lang.String scope){
      this.scope = scope;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setSecret(final java.lang.String secret){
      this.secret = secret;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }

}