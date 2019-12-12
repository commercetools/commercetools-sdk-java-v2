package com.commercetools.api.generated.models.api_client;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.api_client.ApiClient;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ApiClientBuilder {
   
   @Nullable
   private java.time.ZonedDateTime createdAt;
   
   @Nullable
   private java.time.ZonedDateTime deleteAt;
   
   @Nullable
   private java.time.LocalDate lastUsedAt;
   
   
   private String scope;
   
   
   private String name;
   
   @Nullable
   private String secret;
   
   
   private String id;
   
   public ApiClientBuilder createdAt(@Nullable final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ApiClientBuilder deleteAt(@Nullable final java.time.ZonedDateTime deleteAt) {
      this.deleteAt = deleteAt;
      return this;
   }
   
   public ApiClientBuilder lastUsedAt(@Nullable final java.time.LocalDate lastUsedAt) {
      this.lastUsedAt = lastUsedAt;
      return this;
   }
   
   public ApiClientBuilder scope( final String scope) {
      this.scope = scope;
      return this;
   }
   
   public ApiClientBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ApiClientBuilder secret(@Nullable final String secret) {
      this.secret = secret;
      return this;
   }
   
   public ApiClientBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   @Nullable
   public java.time.ZonedDateTime getDeleteAt(){
      return this.deleteAt;
   }
   
   @Nullable
   public java.time.LocalDate getLastUsedAt(){
      return this.lastUsedAt;
   }
   
   
   public String getScope(){
      return this.scope;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public String getSecret(){
      return this.secret;
   }
   
   
   public String getId(){
      return this.id;
   }

   public ApiClient build() {
       return new ApiClientImpl(createdAt, deleteAt, lastUsedAt, scope, name, secret, id);
   }
   
   public static ApiClientBuilder of() {
      return new ApiClientBuilder();
   }
   
   public static ApiClientBuilder of(final ApiClient template) {
      ApiClientBuilder builder = new ApiClientBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.deleteAt = template.getDeleteAt();
      builder.lastUsedAt = template.getLastUsedAt();
      builder.scope = template.getScope();
      builder.name = template.getName();
      builder.secret = template.getSecret();
      builder.id = template.getId();
      return builder;
   }
   
}