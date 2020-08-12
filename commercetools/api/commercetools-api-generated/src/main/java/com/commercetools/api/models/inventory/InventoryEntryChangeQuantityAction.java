package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionImpl;

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
@JsonDeserialize(as = InventoryEntryChangeQuantityActionImpl.class)
public interface InventoryEntryChangeQuantityAction extends InventoryEntryUpdateAction {

   
   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();

   public void setQuantity(final Long quantity);
   
   public static InventoryEntryChangeQuantityActionImpl of(){
      return new InventoryEntryChangeQuantityActionImpl();
   }
   

   public static InventoryEntryChangeQuantityActionImpl of(final InventoryEntryChangeQuantityAction template) {
      InventoryEntryChangeQuantityActionImpl instance = new InventoryEntryChangeQuantityActionImpl();
      instance.setQuantity(template.getQuantity());
      return instance;
   }

}
