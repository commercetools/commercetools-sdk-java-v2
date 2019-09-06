package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelUpdateAction;
import java.lang.Object;
import java.lang.String;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelSetGeoLocationActionImpl implements ChannelSetGeoLocationAction {

   private java.lang.String action;
   
   private java.lang.Object geoLocation;

   @JsonCreator
   ChannelSetGeoLocationActionImpl(@JsonProperty("geoLocation") final java.lang.Object geoLocation) {
      this.geoLocation = geoLocation;
      this.action = "setGeoLocation";
   }
   public ChannelSetGeoLocationActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Object getGeoLocation(){
      return this.geoLocation;
   }

   public void setGeoLocation(final java.lang.Object geoLocation){
      this.geoLocation = geoLocation;
   }

}