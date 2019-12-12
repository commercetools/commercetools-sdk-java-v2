package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelUpdateAction;
import com.commercetools.api.generated.models.common.GeoJson;
import com.commercetools.api.generated.models.channel.ChannelSetGeoLocationAction;
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
public final class ChannelSetGeoLocationActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.GeoJson geoLocation;
   
   public ChannelSetGeoLocationActionBuilder geoLocation(@Nullable final com.commercetools.api.generated.models.common.GeoJson geoLocation) {
      this.geoLocation = geoLocation;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.GeoJson getGeoLocation(){
      return this.geoLocation;
   }

   public ChannelSetGeoLocationAction build() {
       return new ChannelSetGeoLocationActionImpl(geoLocation);
   }
   
   public static ChannelSetGeoLocationActionBuilder of() {
      return new ChannelSetGeoLocationActionBuilder();
   }
   
   public static ChannelSetGeoLocationActionBuilder of(final ChannelSetGeoLocationAction template) {
      ChannelSetGeoLocationActionBuilder builder = new ChannelSetGeoLocationActionBuilder();
      builder.geoLocation = template.getGeoLocation();
      return builder;
   }
   
}