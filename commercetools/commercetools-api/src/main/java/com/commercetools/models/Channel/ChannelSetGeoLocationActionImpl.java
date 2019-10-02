package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelUpdateAction;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelSetGeoLocationActionImpl implements ChannelSetGeoLocationAction {

   private String action;
   
   private Object geoLocation;

   @JsonCreator
   ChannelSetGeoLocationActionImpl(@JsonProperty("geoLocation") final Object geoLocation) {
      this.geoLocation = geoLocation;
      this.action = "setGeoLocation";
   }
   public ChannelSetGeoLocationActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Object getGeoLocation(){
      return this.geoLocation;
   }

   public void setGeoLocation(final Object geoLocation){
      this.geoLocation = geoLocation;
   }

}