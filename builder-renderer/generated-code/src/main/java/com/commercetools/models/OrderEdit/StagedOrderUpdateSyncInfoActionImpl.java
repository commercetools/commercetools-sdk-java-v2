package com.commercetools.models.OrderEdit;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Order.StagedOrderUpdateAction;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderUpdateSyncInfoActionImpl implements StagedOrderUpdateSyncInfoAction {

   private java.lang.String action;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier channel;
   
   private java.lang.String externalId;
   
   private java.time.ZonedDateTime syncedAt;

   @JsonCreator
   StagedOrderUpdateSyncInfoActionImpl(@JsonProperty("channel") final com.commercetools.models.Channel.ChannelResourceIdentifier channel, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
      this.channel = channel;
      this.externalId = externalId;
      this.syncedAt = syncedAt;
      this.action = "updateSyncInfo";
   }
   public StagedOrderUpdateSyncInfoActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getChannel(){
      return this.channel;
   }
   
   
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   
   public java.time.ZonedDateTime getSyncedAt(){
      return this.syncedAt;
   }

   public void setChannel(final com.commercetools.models.Channel.ChannelResourceIdentifier channel){
      this.channel = channel;
   }
   
   public void setExternalId(final java.lang.String externalId){
      this.externalId = externalId;
   }
   
   public void setSyncedAt(final java.time.ZonedDateTime syncedAt){
      this.syncedAt = syncedAt;
   }

}