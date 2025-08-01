
package com.commercetools.api.models.inventory;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryUpdateActionBuilder {

    public com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionBuilder addQuantityBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionBuilder.of();
    }

    public com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionBuilder changeQuantityBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionBuilder.of();
    }

    public com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionBuilder removeQuantityBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionBuilder.of();
    }

    public com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionBuilder.of();
    }

    public com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionBuilder.of();
    }

    public com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionBuilder setExpectedDeliveryBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionBuilder.of();
    }

    public com.commercetools.api.models.inventory.InventoryEntrySetInventoryLimitsActionBuilder setInventoryLimitsBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetInventoryLimitsActionBuilder.of();
    }

    public com.commercetools.api.models.inventory.InventoryEntrySetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetKeyActionBuilder.of();
    }

    public com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionBuilder setRestockableInDaysBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionBuilder.of();
    }

    public com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionBuilder setSupplyChannelBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionBuilder.of();
    }

    /**
     * factory method for an instance of InventoryEntryUpdateActionBuilder
     * @return builder
     */
    public static InventoryEntryUpdateActionBuilder of() {
        return new InventoryEntryUpdateActionBuilder();
    }

}
