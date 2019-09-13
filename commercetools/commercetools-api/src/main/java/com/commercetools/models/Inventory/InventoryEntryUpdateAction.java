package com.commercetools.models.inventory;

import com.commercetools.models.inventory.InventoryEntryAddQuantityAction;
import com.commercetools.models.inventory.InventoryEntryChangeQuantityAction;
import com.commercetools.models.inventory.InventoryEntryRemoveQuantityAction;
import com.commercetools.models.inventory.InventoryEntrySetCustomFieldAction;
import com.commercetools.models.inventory.InventoryEntrySetCustomTypeAction;
import com.commercetools.models.inventory.InventoryEntrySetExpectedDeliveryAction;
import com.commercetools.models.inventory.InventoryEntrySetRestockableInDaysAction;
import com.commercetools.models.inventory.InventoryEntrySetSupplyChannelAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.inventory.InventoryEntryAddQuantityActionImpl.class, name = "addQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.inventory.InventoryEntryChangeQuantityActionImpl.class, name = "changeQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.inventory.InventoryEntryRemoveQuantityActionImpl.class, name = "removeQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.inventory.InventoryEntrySetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.inventory.InventoryEntrySetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.inventory.InventoryEntrySetExpectedDeliveryActionImpl.class, name = "setExpectedDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.inventory.InventoryEntrySetRestockableInDaysActionImpl.class, name = "setRestockableInDays"),
   @JsonSubTypes.Type(value = com.commercetools.models.inventory.InventoryEntrySetSupplyChannelActionImpl.class, name = "setSupplyChannel")
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