package com.commercetools.api.models.common;

import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.common.GeoJsonPoint;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class GeoJsonPointBuilder {
   
   
   private java.util.List<Integer> coordinates;
   
   public GeoJsonPointBuilder coordinates( final java.util.List<Integer> coordinates) {
      this.coordinates = coordinates;
      return this;
   }
   
   
   public java.util.List<Integer> getCoordinates(){
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
