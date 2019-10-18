package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelUpdateAction;
import com.commercetools.api.generated.models.channel.ChannelSetGeoLocationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelSetGeoLocationActionBuilder {
   
   @Nullable
   private Object geoLocation;
   
   public ChannelSetGeoLocationActionBuilder geoLocation(@Nullable final Object geoLocation) {
      this.geoLocation = geoLocation;
      return this;
   }
   
   @Nullable
   public Object getGeoLocation(){
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