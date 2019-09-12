package com.commercetools.models.Order;

import com.commercetools.models.Channel.ChannelReference;
import java.lang.String;
import java.time.ZonedDateTime;
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
public final class SyncInfoImpl implements SyncInfo {

   private com.commercetools.models.Channel.ChannelReference channel;
   
   private java.lang.String externalId;
   
   private java.time.ZonedDateTime syncedAt;

   @JsonCreator
   SyncInfoImpl(@JsonProperty("channel") final com.commercetools.models.Channel.ChannelReference channel, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
      this.channel = channel;
      this.externalId = externalId;
      this.syncedAt = syncedAt;
   }
   public SyncInfoImpl() {
      
   }
   
   
   public com.commercetools.models.Channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   
   public java.time.ZonedDateTime getSyncedAt(){
      return this.syncedAt;
   }

   public void setChannel(final com.commercetools.models.Channel.ChannelReference channel){
      this.channel = channel;
   }
   
   public void setExternalId(final java.lang.String externalId){
      this.externalId = externalId;
   }
   
   public void setSyncedAt(final java.time.ZonedDateTime syncedAt){
      this.syncedAt = syncedAt;
   }

}