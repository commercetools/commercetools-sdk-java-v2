package com.commercetools.models.Zone;

import com.commercetools.models.Common.BaseResource;
import com.commercetools.models.Zone.Location;
import java.lang.String;
import com.commercetools.models.Zone.Zone;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.String description;
   
   
   private java.util.List<com.commercetools.models.Zone.Location> locations;
   
   @Nullable
   private java.lang.String key;
   
   public ZoneBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ZoneBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ZoneBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ZoneBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ZoneBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ZoneBuilder description(@Nullable final java.lang.String description) {
      this.description = description;
      return this;
   }
   
   public ZoneBuilder locations( final java.util.List<com.commercetools.models.Zone.Location> locations) {
      this.locations = locations;
      return this;
   }
   
   public ZoneBuilder key(@Nullable final java.lang.String key) {
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
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.String getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.Zone.Location> getLocations(){
      return this.locations;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public Zone build() {
       return new ZoneImpl(createdAt, lastModifiedAt, id, version, name, description, locations, key);
   }
   
   public static ZoneBuilder of() {
      return new ZoneBuilder();
   }
   
   public static ZoneBuilder of(final Zone template) {
      ZoneBuilder builder = new ZoneBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.locations = template.getLocations();
      builder.key = template.getKey();
      return builder;
   }
   
}