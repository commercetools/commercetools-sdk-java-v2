package com.commercetools.api.models.order;

import com.commercetools.api.models.channel.ChannelReference;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order.SyncInfoImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = SyncInfoImpl.class)
public interface SyncInfo  {

   /**
   *  <p>Connection to a particular synchronization destination.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("channel")
   public ChannelReference getChannel();
   /**
   *  <p>Can be used to reference an external order instance, file etc.</p>
   */

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
