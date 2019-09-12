package com.commercetools.models.Inventory;

import com.commercetools.models.Inventory.InventoryEntryUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Inventory.InventoryEntryRemoveQuantityActionImpl;

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
@JsonDeserialize(as = InventoryEntryRemoveQuantityActionImpl.class)
public interface InventoryEntryRemoveQuantityAction extends InventoryEntryUpdateAction {

   
   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();

   public void setQuantity(final Long quantity);
   
   public static InventoryEntryRemoveQuantityActionImpl of(){
      return new InventoryEntryRemoveQuantityActionImpl();
   }
   

   public static InventoryEntryRemoveQuantityActionImpl of(final InventoryEntryRemoveQuantityAction template) {
      InventoryEntryRemoveQuantityActionImpl instance = new InventoryEntryRemoveQuantityActionImpl();
      instance.setQuantity(template.getQuantity());
      return instance;
   }

}