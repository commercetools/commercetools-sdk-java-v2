package com.commercetools.models.zone;

import java.lang.String;
import com.commercetools.models.zone.Location;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LocationBuilder {
   
   
   private java.lang.String country;
   
   @Nullable
   private java.lang.String state;
   
   public LocationBuilder country( final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public LocationBuilder state(@Nullable final java.lang.String state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.lang.String getState(){
      return this.state;
   }

   public Location build() {
       return new LocationImpl(country, state);
   }
   
   public static LocationBuilder of() {
      return new LocationBuilder();
   }
   
   public static LocationBuilder of(final Location template) {
      LocationBuilder builder = new LocationBuilder();
      builder.country = template.getCountry();
      builder.state = template.getState();
      return builder;
   }
   
}