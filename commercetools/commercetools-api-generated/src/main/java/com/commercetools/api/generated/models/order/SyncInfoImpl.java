package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.channel.ChannelReference;
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

   private com.commercetools.api.generated.models.channel.ChannelReference channel;
   
   private String externalId;
   
   private java.time.ZonedDateTime syncedAt;

   @JsonCreator
   SyncInfoImpl(@JsonProperty("channel") final com.commercetools.api.generated.models.channel.ChannelReference channel, @JsonProperty("externalId") final String externalId, @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
      this.channel = channel;
      this.externalId = externalId;
      this.syncedAt = syncedAt;
   }
   public SyncInfoImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public java.time.ZonedDateTime getSyncedAt(){
      return this.syncedAt;
   }

   public void setChannel(final com.commercetools.api.generated.models.channel.ChannelReference channel){
      this.channel = channel;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setSyncedAt(final java.time.ZonedDateTime syncedAt){
      this.syncedAt = syncedAt;
   }

}