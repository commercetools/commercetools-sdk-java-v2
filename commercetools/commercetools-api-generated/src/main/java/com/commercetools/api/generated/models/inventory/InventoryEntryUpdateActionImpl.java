package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryAddQuantityAction;
import com.commercetools.api.generated.models.inventory.InventoryEntryChangeQuantityAction;
import com.commercetools.api.generated.models.inventory.InventoryEntryRemoveQuantityAction;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetCustomFieldAction;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetCustomTypeAction;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetExpectedDeliveryAction;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetRestockableInDaysAction;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetSupplyChannelAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntryUpdateActionImpl implements InventoryEntryUpdateAction {

   private String action;

   @JsonCreator
   InventoryEntryUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}