package com.commercetools.api.models.message;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadImpl;

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
@JsonDeserialize(as = InventoryEntryDeletedMessagePayloadImpl.class)
public interface InventoryEntryDeletedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("sku")
   public String getSku();
   
   @NotNull
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelReference getSupplyChannel();

   public void setSku(final String sku);
   
   public void setSupplyChannel(final ChannelReference supplyChannel);
   
   public static InventoryEntryDeletedMessagePayloadImpl of(){
      return new InventoryEntryDeletedMessagePayloadImpl();
   }
   

   public static InventoryEntryDeletedMessagePayloadImpl of(final InventoryEntryDeletedMessagePayload template) {
      InventoryEntryDeletedMessagePayloadImpl instance = new InventoryEntryDeletedMessagePayloadImpl();
      instance.setSku(template.getSku());
      instance.setSupplyChannel(template.getSupplyChannel());
      return instance;
   }

}
