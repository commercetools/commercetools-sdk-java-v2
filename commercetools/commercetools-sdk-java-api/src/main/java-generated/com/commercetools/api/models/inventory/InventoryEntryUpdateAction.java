
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * InventoryEntryUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryUpdateAction inventoryEntryUpdateAction = InventoryEntryUpdateAction.addQuantityBuilder()
 *             quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = InventoryEntryUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = InventoryEntryUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface InventoryEntryUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<InventoryEntryUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public InventoryEntryUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryUpdateAction deepCopy(@Nullable final InventoryEntryUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof InventoryEntryUpdateActionImpl)) {
            return template.copyDeep();
        }
        InventoryEntryUpdateActionImpl instance = new InventoryEntryUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionBuilder addQuantityBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionBuilder.of();
    }

    /**
     * builder for changeQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionBuilder changeQuantityBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionBuilder.of();
    }

    /**
     * builder for removeQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionBuilder removeQuantityBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setExpectedDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionBuilder setExpectedDeliveryBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetKeyActionBuilder.of();
    }

    /**
     * builder for setRestockableInDays subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionBuilder setRestockableInDaysBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionBuilder.of();
    }

    /**
     * builder for setSupplyChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionBuilder setSupplyChannelBuilder() {
        return com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryUpdateAction(Function<InventoryEntryUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryUpdateAction>";
            }
        };
    }
}
