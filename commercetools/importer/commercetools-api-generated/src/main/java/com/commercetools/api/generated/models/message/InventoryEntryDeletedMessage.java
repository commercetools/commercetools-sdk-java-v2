package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.InventoryEntryDeletedMessageImpl;

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
@JsonDeserialize(as = InventoryEntryDeletedMessageImpl.class)
public interface InventoryEntryDeletedMessage extends Message {

   
   @NotNull
   @JsonProperty("sku")
   public String getSku();
   
   @NotNull
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelReference getSupplyChannel();

   public void setSku(final String sku);
   
   public void setSupplyChannel(final ChannelReference supplyChannel);
   
   public static InventoryEntryDeletedMessageImpl of(){
      return new InventoryEntryDeletedMessageImpl();
   }
   

   public static InventoryEntryDeletedMessageImpl of(final InventoryEntryDeletedMessage template) {
      InventoryEntryDeletedMessageImpl instance = new InventoryEntryDeletedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setSku(template.getSku());
      return instance;
   }

}