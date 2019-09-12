package com.commercetools.models.Inventory;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Inventory.InventoryEntryDraftImpl;

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
@JsonDeserialize(as = InventoryEntryDraftImpl.class)
public interface InventoryEntryDraft  {

   
   @NotNull
   @JsonProperty("sku")
   public String getSku();
   
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelResourceIdentifier getSupplyChannel();
   
   @NotNull
   @JsonProperty("quantityOnStock")
   public Long getQuantityOnStock();
   
   
   @JsonProperty("restockableInDays")
   public Long getRestockableInDays();
   
   
   @JsonProperty("expectedDelivery")
   public ZonedDateTime getExpectedDelivery();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();

   public void setSku(final String sku);
   
   public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
   
   public void setQuantityOnStock(final Long quantityOnStock);
   
   public void setRestockableInDays(final Long restockableInDays);
   
   public void setExpectedDelivery(final ZonedDateTime expectedDelivery);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public static InventoryEntryDraftImpl of(){
      return new InventoryEntryDraftImpl();
   }
   

   public static InventoryEntryDraftImpl of(final InventoryEntryDraft template) {
      InventoryEntryDraftImpl instance = new InventoryEntryDraftImpl();
      instance.setExpectedDelivery(template.getExpectedDelivery());
      instance.setCustom(template.getCustom());
      instance.setQuantityOnStock(template.getQuantityOnStock());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setRestockableInDays(template.getRestockableInDays());
      instance.setSku(template.getSku());
      return instance;
   }

}