package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionImpl;

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
