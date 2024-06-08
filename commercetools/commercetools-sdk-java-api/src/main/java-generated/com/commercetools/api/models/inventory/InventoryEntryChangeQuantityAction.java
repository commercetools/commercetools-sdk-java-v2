
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
 *     InventoryEntryChangeQuantityAction inventoryEntryChangeQuantityAction = InventoryEntryChangeQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryChangeQuantityActionImpl.class)
public interface InventoryEntryChangeQuantityAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntryChangeQuantityAction
     */
    String CHANGE_QUANTITY = "changeQuantity";

    /**
     *  <p>Value to set for <code>quantityOnStock</code>.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Value to set for <code>quantityOnStock</code>.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of InventoryEntryChangeQuantityAction
     */
    public static InventoryEntryChangeQuantityAction of() {
        return new InventoryEntryChangeQuantityActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryChangeQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryChangeQuantityAction of(final InventoryEntryChangeQuantityAction template) {
        InventoryEntryChangeQuantityActionImpl instance = new InventoryEntryChangeQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of InventoryEntryChangeQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryChangeQuantityAction deepCopy(
            @Nullable final InventoryEntryChangeQuantityAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntryChangeQuantityActionImpl instance = new InventoryEntryChangeQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for InventoryEntryChangeQuantityAction
     * @return builder
     */
    public static InventoryEntryChangeQuantityActionBuilder builder() {
        return InventoryEntryChangeQuantityActionBuilder.of();
    }

    /**
     * create builder for InventoryEntryChangeQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryChangeQuantityActionBuilder builder(final InventoryEntryChangeQuantityAction template) {
        return InventoryEntryChangeQuantityActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryChangeQuantityAction(Function<InventoryEntryChangeQuantityAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryChangeQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryChangeQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryChangeQuantityAction>";
            }
        };
    }
}
