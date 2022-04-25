
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionImpl.class, name = InventoryEntryAddQuantityAction.ADD_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionImpl.class, name = InventoryEntryChangeQuantityAction.CHANGE_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionImpl.class, name = InventoryEntryRemoveQuantityAction.REMOVE_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionImpl.class, name = InventoryEntrySetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionImpl.class, name = InventoryEntrySetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionImpl.class, name = InventoryEntrySetExpectedDeliveryAction.SET_EXPECTED_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetKeyActionImpl.class, name = InventoryEntrySetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionImpl.class, name = InventoryEntrySetRestockableInDaysAction.SET_RESTOCKABLE_IN_DAYS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionImpl.class, name = InventoryEntrySetSupplyChannelAction.SET_SUPPLY_CHANNEL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = InventoryEntryUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = InventoryEntryUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface InventoryEntryUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<InventoryEntryUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionBuilder addQuantityBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionBuilder changeQuantityBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionBuilder removeQuantityBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionBuilder setExpectedDeliveryBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionBuilder.of();
    }

    public static com.commercetools.api.models.inventory.InventoryEntrySetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionBuilder setRestockableInDaysBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionBuilder.of();
    }

    public static com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionBuilder setSupplyChannelBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionBuilder.of();
    }

    default <T> T withInventoryEntryUpdateAction(Function<InventoryEntryUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryUpdateAction>";
            }
        };
    }
}
