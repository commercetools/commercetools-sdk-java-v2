package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderUpdateSyncInfoActionImpl implements StagedOrderUpdateSyncInfoAction {

   private String action;
   
   private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;
   
   private String externalId;
   
   private java.time.ZonedDateTime syncedAt;

   @JsonCreator
   StagedOrderUpdateSyncInfoActionImpl(@JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel, @JsonProperty("externalId") final String externalId, @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
      this.channel = channel;
      this.externalId = externalId;
      this.syncedAt = syncedAt;
      this.action = "updateSyncInfo";
   }
   public StagedOrderUpdateSyncInfoActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel(){
      return this.channel;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public java.time.ZonedDateTime getSyncedAt(){
      return this.syncedAt;
   }

   public void setChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier channel){
      this.channel = channel;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setSyncedAt(final java.time.ZonedDateTime syncedAt){
      this.syncedAt = syncedAt;
   }

}
