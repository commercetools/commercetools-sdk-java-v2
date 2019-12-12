package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetExpectedDeliveryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = InventoryEntrySetExpectedDeliveryActionImpl.class)
public interface InventoryEntrySetExpectedDeliveryAction extends InventoryEntryUpdateAction {

   
   
   @JsonProperty("expectedDelivery")
   public ZonedDateTime getExpectedDelivery();

   public void setExpectedDelivery(final ZonedDateTime expectedDelivery);
   
   public static InventoryEntrySetExpectedDeliveryActionImpl of(){
      return new InventoryEntrySetExpectedDeliveryActionImpl();
   }
   

   public static InventoryEntrySetExpectedDeliveryActionImpl of(final InventoryEntrySetExpectedDeliveryAction template) {
      InventoryEntrySetExpectedDeliveryActionImpl instance = new InventoryEntrySetExpectedDeliveryActionImpl();
      instance.setExpectedDelivery(template.getExpectedDelivery());
      return instance;
   }

}