package com.commercetools.api.generated.models.customer;

import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerTokenImpl implements CustomerToken {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String customerId;
   
   private String id;
   
   private String value;
   
   private java.time.ZonedDateTime expiresAt;

   @JsonCreator
   CustomerTokenImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("customerId") final String customerId, @JsonProperty("id") final String id, @JsonProperty("value") final String value, @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.customerId = customerId;
      this.id = id;
      this.value = value;
      this.expiresAt = expiresAt;
   }
   public CustomerTokenImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getCustomerId(){
      return this.customerId;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public String getValue(){
      return this.value;
   }
   
   
   public java.time.ZonedDateTime getExpiresAt(){
      return this.expiresAt;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setCustomerId(final String customerId){
      this.customerId = customerId;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setValue(final String value){
      this.value = value;
   }
   
   public void setExpiresAt(final java.time.ZonedDateTime expiresAt){
      this.expiresAt = expiresAt;
   }

}