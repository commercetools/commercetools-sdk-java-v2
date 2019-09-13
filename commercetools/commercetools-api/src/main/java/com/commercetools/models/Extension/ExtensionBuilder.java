package com.commercetools.models.extension;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.extension.ExtensionDestination;
import com.commercetools.models.extension.ExtensionTrigger;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.extension.Extension;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private java.lang.Integer timeoutInMs;
   
   
   private com.commercetools.models.extension.ExtensionDestination destination;
   
   
   private java.util.List<com.commercetools.models.extension.ExtensionTrigger> triggers;
   
   @Nullable
   private java.lang.String key;
   
   public ExtensionBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ExtensionBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ExtensionBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ExtensionBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ExtensionBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ExtensionBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ExtensionBuilder timeoutInMs(@Nullable final java.lang.Integer timeoutInMs) {
      this.timeoutInMs = timeoutInMs;
      return this;
   }
   
   public ExtensionBuilder destination( final com.commercetools.models.extension.ExtensionDestination destination) {
      this.destination = destination;
      return this;
   }
   
   public ExtensionBuilder triggers( final java.util.List<com.commercetools.models.extension.ExtensionTrigger> triggers) {
      this.triggers = triggers;
      return this;
   }
   
   public ExtensionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
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
   
   @Nullable
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public java.lang.Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }
   
   
   public com.commercetools.models.extension.ExtensionDestination getDestination(){
      return this.destination;
   }
   
   
   public java.util.List<com.commercetools.models.extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public Extension build() {
       return new ExtensionImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, timeoutInMs, destination, triggers, key);
   }
   
   public static ExtensionBuilder of() {
      return new ExtensionBuilder();
   }
   
   public static ExtensionBuilder of(final Extension template) {
      ExtensionBuilder builder = new ExtensionBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.timeoutInMs = template.getTimeoutInMs();
      builder.destination = template.getDestination();
      builder.triggers = template.getTriggers();
      builder.key = template.getKey();
      return builder;
   }
   
}