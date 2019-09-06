package com.commercetools.models.Store;

import com.commercetools.models.Common.BaseResource;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Store.Store;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString name;
   
   
   private java.lang.String key;
   
   public StoreBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public StoreBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public StoreBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public StoreBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public StoreBuilder name(@Nullable final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public StoreBuilder key( final java.lang.String key) {
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
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public Store build() {
       return new StoreImpl(createdAt, lastModifiedAt, id, version, name, key);
   }
   
   public static StoreBuilder of() {
      return new StoreBuilder();
   }
   
   public static StoreBuilder of(final Store template) {
      StoreBuilder builder = new StoreBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.name = template.getName();
      builder.key = template.getKey();
      return builder;
   }
   
}