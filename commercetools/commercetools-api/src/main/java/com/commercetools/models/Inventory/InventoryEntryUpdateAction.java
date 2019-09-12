package com.commercetools.models.Inventory;

import com.commercetools.models.Inventory.InventoryEntryAddQuantityAction;
import com.commercetools.models.Inventory.InventoryEntryChangeQuantityAction;
import com.commercetools.models.Inventory.InventoryEntryRemoveQuantityAction;
import com.commercetools.models.Inventory.InventoryEntrySetCustomFieldAction;
import com.commercetools.models.Inventory.InventoryEntrySetCustomTypeAction;
import com.commercetools.models.Inventory.InventoryEntrySetExpectedDeliveryAction;
import com.commercetools.models.Inventory.InventoryEntrySetRestockableInDaysAction;
import com.commercetools.models.Inventory.InventoryEntrySetSupplyChannelAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Inventory.InventoryEntryAddQuantityActionImpl.class, name = "addQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.Inventory.InventoryEntryChangeQuantityActionImpl.class, name = "changeQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.Inventory.InventoryEntryRemoveQuantityActionImpl.class, name = "removeQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.Inventory.InventoryEntrySetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Inventory.InventoryEntrySetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Inventory.InventoryEntrySetExpectedDeliveryActionImpl.class, name = "setExpectedDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.Inventory.InventoryEntrySetRestockableInDaysActionImpl.class, name = "setRestockableInDays"),
   @JsonSubTypes.Type(value = com.commercetools.models.Inventory.InventoryEntrySetSupplyChannelActionImpl.class, name = "setSupplyChannel")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface InventoryEntryUpdateAction  {


   


}