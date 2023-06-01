package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryAddQuantityAction;
import com.commercetools.api.models.inventory.InventoryEntryChangeQuantityAction;
import com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityAction;
import com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldAction;
import com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeAction;
import com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryAction;
import com.commercetools.api.models.inventory.InventoryEntrySetKeyAction;
import com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysAction;
import com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelAction;
import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
