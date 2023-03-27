
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates <code>availableQuantity</code> based on the new <code>quantityOnStock</code> and amount of active reservations.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryAddQuantityAction inventoryEntryAddQuantityAction = InventoryEntryAddQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryAddQuantityActionImpl.class)
public interface InventoryEntryAddQuantityAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntryAddQuantityAction
     */
    String ADD_QUANTITY = "addQuantity";

    /**
     *  <p>Value to add to <code>quantityOnStock</code>.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Value to add to <code>quantityOnStock</code>.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of InventoryEntryAddQuantityAction
     */
    public static InventoryEntryAddQuantityAction of() {
        return new InventoryEntryAddQuantityActionImpl();
    }

    /**
     * factory method to copy an instance of InventoryEntryAddQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryAddQuantityAction of(final InventoryEntryAddQuantityAction template) {
        InventoryEntryAddQuantityActionImpl instance = new InventoryEntryAddQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for InventoryEntryAddQuantityAction
     * @return builder
     */
    public static InventoryEntryAddQuantityActionBuilder builder() {
        return InventoryEntryAddQuantityActionBuilder.of();
    }

    /**
     * create builder for InventoryEntryAddQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryAddQuantityActionBuilder builder(final InventoryEntryAddQuantityAction template) {
        return InventoryEntryAddQuantityActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryAddQuantityAction(Function<InventoryEntryAddQuantityAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryAddQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryAddQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryAddQuantityAction>";
            }
        };
    }
}
