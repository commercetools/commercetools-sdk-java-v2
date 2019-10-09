package com.commercetools.models.inventory;

import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.models.inventory.InventoryEntryImpl;

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
@JsonDeserialize(as = InventoryEntryImpl.class)
public interface InventoryEntry extends LoggedResource {

   
   @NotNull
   @JsonProperty("sku")
   public String getSku();
   
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelResourceIdentifier getSupplyChannel();
   
   @NotNull
   @JsonProperty("quantityOnStock")
   public Long getQuantityOnStock();
   
   @NotNull
   @JsonProperty("availableQuantity")
   public Long getAvailableQuantity();
   
   
   @JsonProperty("restockableInDays")
   public Long getRestockableInDays();
   
   
   @JsonProperty("expectedDelivery")
   public ZonedDateTime getExpectedDelivery();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();

   public void setSku(final String sku);
   
   public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
   
   public void setQuantityOnStock(final Long quantityOnStock);
   
   public void setAvailableQuantity(final Long availableQuantity);
   
   public void setRestockableInDays(final Long restockableInDays);
   
   public void setExpectedDelivery(final ZonedDateTime expectedDelivery);
   
   public void setCustom(final CustomFields custom);
   
   public static InventoryEntryImpl of(){
      return new InventoryEntryImpl();
   }
   

   public static InventoryEntryImpl of(final InventoryEntry template) {
      InventoryEntryImpl instance = new InventoryEntryImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setAvailableQuantity(template.getAvailableQuantity());
      instance.setExpectedDelivery(template.getExpectedDelivery());
      instance.setCustom(template.getCustom());
      instance.setQuantityOnStock(template.getQuantityOnStock());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setRestockableInDays(template.getRestockableInDays());
      instance.setSku(template.getSku());
      return instance;
   }

}