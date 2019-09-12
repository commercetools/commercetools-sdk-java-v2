package com.commercetools.models.ApiClient;

import java.lang.String;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import com.commercetools.models.ApiClient.ApiClient;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ApiClientBuilder {
   
   @Nullable
   private java.time.ZonedDateTime createdAt;
   
   @Nullable
   private java.time.ZonedDateTime deleteAt;
   
   @Nullable
   private java.time.LocalDate lastUsedAt;
   
   
   private java.lang.String scope;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.String secret;
   
   
   private java.lang.String id;
   
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
   
   public ApiClientBuilder scope( final java.lang.String scope) {
      this.scope = scope;
      return this;
   }
   
   public ApiClientBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ApiClientBuilder secret(@Nullable final java.lang.String secret) {
      this.secret = secret;
      return this;
   }
   
   public ApiClientBuilder id( final java.lang.String id) {
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
   
   
   public java.lang.String getScope(){
      return this.scope;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.String getSecret(){
      return this.secret;
   }
   
   
   public java.lang.String getId(){
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