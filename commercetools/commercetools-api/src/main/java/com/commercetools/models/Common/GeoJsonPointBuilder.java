package com.commercetools.models.common;

import com.commercetools.models.common.GeoJson;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.common.GeoJsonPoint;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class GeoJsonPointBuilder {
   
   
   private java.util.List<java.lang.Integer> coordinates;
   
   public GeoJsonPointBuilder coordinates( final java.util.List<java.lang.Integer> coordinates) {
      this.coordinates = coordinates;
      return this;
   }
   
   
   public java.util.List<java.lang.Integer> getCoordinates(){
      return this.coordinates;
   }

   public GeoJsonPoint build() {
       return new GeoJsonPointImpl(coordinates);
   }
   
   public static GeoJsonPointBuilder of() {
      return new GeoJsonPointBuilder();
   }
   
   public static GeoJsonPointBuilder of(final GeoJsonPoint template) {
      GeoJsonPointBuilder builder = new GeoJsonPointBuilder();
      builder.coordinates = template.getCoordinates();
      return builder;
   }
   
}