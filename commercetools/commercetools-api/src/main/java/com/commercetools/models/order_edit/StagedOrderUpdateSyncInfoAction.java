package com.commercetools.models.order_edit;

import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.order_edit.StagedOrderUpdateSyncInfoActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderUpdateSyncInfoActionImpl.class)
public interface StagedOrderUpdateSyncInfoAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("channel")
   public ChannelResourceIdentifier getChannel();
   
   
   @JsonProperty("externalId")
   public String getExternalId();
   
   
   @JsonProperty("syncedAt")
   public ZonedDateTime getSyncedAt();

   public void setChannel(final ChannelResourceIdentifier channel);
   
   public void setExternalId(final String externalId);
   
   public void setSyncedAt(final ZonedDateTime syncedAt);
   
   public static StagedOrderUpdateSyncInfoActionImpl of(){
      return new StagedOrderUpdateSyncInfoActionImpl();
   }
   

   public static StagedOrderUpdateSyncInfoActionImpl of(final StagedOrderUpdateSyncInfoAction template) {
      StagedOrderUpdateSyncInfoActionImpl instance = new StagedOrderUpdateSyncInfoActionImpl();
      instance.setChannel(template.getChannel());
      instance.setExternalId(template.getExternalId());
      instance.setSyncedAt(template.getSyncedAt());
      return instance;
   }

}