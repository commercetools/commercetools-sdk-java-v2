package com.commercetools.models.Message;

import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Message.Message;
import java.lang.String;
import com.commercetools.models.Message.InventoryEntryDeletedMessageImpl;

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
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setSku(template.getSku());
      return instance;
   }

}