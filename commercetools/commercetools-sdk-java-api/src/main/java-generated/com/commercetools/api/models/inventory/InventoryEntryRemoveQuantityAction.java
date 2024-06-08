
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
 *  <p>Updates <code>availableQuantity</code> based on the new <code>quantityOnStock</code> and amount of active reservations.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryRemoveQuantityAction inventoryEntryRemoveQuantityAction = InventoryEntryRemoveQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryRemoveQuantityActionImpl.class)
public interface InventoryEntryRemoveQuantityAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntryRemoveQuantityAction
     */
    String REMOVE_QUANTITY = "removeQuantity";

    /**
     *  <p>Value to remove from <code>quantityOnStock</code>.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Value to remove from <code>quantityOnStock</code>.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of InventoryEntryRemoveQuantityAction
     */
    public static InventoryEntryRemoveQuantityAction of() {
        return new InventoryEntryRemoveQuantityActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryRemoveQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryRemoveQuantityAction of(final InventoryEntryRemoveQuantityAction template) {
        InventoryEntryRemoveQuantityActionImpl instance = new InventoryEntryRemoveQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of InventoryEntryRemoveQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryRemoveQuantityAction deepCopy(
            @Nullable final InventoryEntryRemoveQuantityAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntryRemoveQuantityActionImpl instance = new InventoryEntryRemoveQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for InventoryEntryRemoveQuantityAction
     * @return builder
     */
    public static InventoryEntryRemoveQuantityActionBuilder builder() {
        return InventoryEntryRemoveQuantityActionBuilder.of();
    }

    /**
     * create builder for InventoryEntryRemoveQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryRemoveQuantityActionBuilder builder(final InventoryEntryRemoveQuantityAction template) {
        return InventoryEntryRemoveQuantityActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryRemoveQuantityAction(Function<InventoryEntryRemoveQuantityAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryRemoveQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryRemoveQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryRemoveQuantityAction>";
            }
        };
    }
}
