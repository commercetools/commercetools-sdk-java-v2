package com.commercetools.api.generated.models.api_client;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
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
   
   private String scope;
   
   private String name;
   
   private String secret;
   
   private String id;

   @JsonCreator
   ApiClientImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("deleteAt") final java.time.ZonedDateTime deleteAt, @JsonProperty("lastUsedAt") final java.time.LocalDate lastUsedAt, @JsonProperty("scope") final String scope, @JsonProperty("name") final String name, @JsonProperty("secret") final String secret, @JsonProperty("id") final String id) {
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
   
   
   public String getScope(){
      return this.scope;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public String getSecret(){
      return this.secret;
   }
   
   
   public String getId(){
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
   
   public void setScope(final String scope){
      this.scope = scope;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setSecret(final String secret){
      this.secret = secret;
   }
   
   public void setId(final String id){
      this.id = id;
   }

}