package com.commercetools.models.zone;

import com.commercetools.models.zone.Location;
import com.commercetools.models.zone.ZoneDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneDraftBuilder {
   
   
   private String name;
   
   @Nullable
   private String description;
   
   
   private java.util.List<com.commercetools.models.zone.Location> locations;
   
   @Nullable
   private String key;
   
   public ZoneDraftBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ZoneDraftBuilder description(@Nullable final String description) {
      this.description = description;
      return this;
   }
   
   public ZoneDraftBuilder locations( final java.util.List<com.commercetools.models.zone.Location> locations) {
      this.locations = locations;
      return this;
   }
   
   public ZoneDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public String getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.zone.Location> getLocations(){
      return this.locations;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ZoneDraft build() {
       return new ZoneDraftImpl(name, description, locations, key);
   }
   
   public static ZoneDraftBuilder of() {
      return new ZoneDraftBuilder();
   }
   
   public static ZoneDraftBuilder of(final ZoneDraft template) {
      ZoneDraftBuilder builder = new ZoneDraftBuilder();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.locations = template.getLocations();
      builder.key = template.getKey();
      return builder;
   }
   
}