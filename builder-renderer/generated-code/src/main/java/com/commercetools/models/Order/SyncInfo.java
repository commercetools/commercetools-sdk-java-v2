package com.commercetools.models.Order;

import com.commercetools.models.Channel.ChannelReference;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Order.SyncInfoImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SyncInfoImpl.class)
public interface SyncInfo  {

   
   @NotNull
   @Valid
   @JsonProperty("channel")
   public ChannelReference getChannel();
   
   
   @JsonProperty("externalId")
   public String getExternalId();
   
   @NotNull
   @JsonProperty("syncedAt")
   public ZonedDateTime getSyncedAt();

   public void setChannel(final ChannelReference channel);
   
   public void setExternalId(final String externalId);
   
   public void setSyncedAt(final ZonedDateTime syncedAt);
   
   public static SyncInfoImpl of(){
      return new SyncInfoImpl();
   }
   

   public static SyncInfoImpl of(final SyncInfo template) {
      SyncInfoImpl instance = new SyncInfoImpl();
      instance.setChannel(template.getChannel());
      instance.setExternalId(template.getExternalId());
      instance.setSyncedAt(template.getSyncedAt());
      return instance;
   }

}