
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the inventory limits for a specific InventoryEntry. This action allows you to define minimum and maximum quantities that can be added to a Cart. For more information, see Quantity limits.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetInventoryLimitsAction inventoryEntrySetInventoryLimitsAction = InventoryEntrySetInventoryLimitsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setInventoryLimits")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetInventoryLimitsActionImpl.class)
public interface InventoryEntrySetInventoryLimitsAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntrySetInventoryLimitsAction
     */
    String SET_INVENTORY_LIMITS = "setInventoryLimits";

    /**
     *  <p>Sets the minimum quantity that can be added to a Cart. If the value is absent or <code>null</code> the inventory limit is removed.</p>
     * @return minCartQuantity
     */

    @JsonProperty("minCartQuantity")
    public Long getMinCartQuantity();

    /**
     *  <p>Sets the maximum quantity that can be added to a Cart. If the value is absent or <code>null</code> the inventory limit is removed.</p>
     * @return maxCartQuantity
     */

    @JsonProperty("maxCartQuantity")
    public Long getMaxCartQuantity();

    /**
     *  <p>Sets the minimum quantity that can be added to a Cart. If the value is absent or <code>null</code> the inventory limit is removed.</p>
     * @param minCartQuantity value to be set
     */

    public void setMinCartQuantity(final Long minCartQuantity);

    /**
     *  <p>Sets the maximum quantity that can be added to a Cart. If the value is absent or <code>null</code> the inventory limit is removed.</p>
     * @param maxCartQuantity value to be set
     */

    public void setMaxCartQuantity(final Long maxCartQuantity);

    /**
     * factory method
     * @return instance of InventoryEntrySetInventoryLimitsAction
     */
    public static InventoryEntrySetInventoryLimitsAction of() {
        return new InventoryEntrySetInventoryLimitsActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntrySetInventoryLimitsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntrySetInventoryLimitsAction of(final InventoryEntrySetInventoryLimitsAction template) {
        InventoryEntrySetInventoryLimitsActionImpl instance = new InventoryEntrySetInventoryLimitsActionImpl();
        instance.setMinCartQuantity(template.getMinCartQuantity());
        instance.setMaxCartQuantity(template.getMaxCartQuantity());
        return instance;
    }

    public InventoryEntrySetInventoryLimitsAction copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntrySetInventoryLimitsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntrySetInventoryLimitsAction deepCopy(
            @Nullable final InventoryEntrySetInventoryLimitsAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntrySetInventoryLimitsActionImpl instance = new InventoryEntrySetInventoryLimitsActionImpl();
        instance.setMinCartQuantity(template.getMinCartQuantity());
        instance.setMaxCartQuantity(template.getMaxCartQuantity());
        return instance;
    }

    /**
     * builder factory method for InventoryEntrySetInventoryLimitsAction
     * @return builder
     */
    public static InventoryEntrySetInventoryLimitsActionBuilder builder() {
        return InventoryEntrySetInventoryLimitsActionBuilder.of();
    }

    /**
     * create builder for InventoryEntrySetInventoryLimitsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetInventoryLimitsActionBuilder builder(
            final InventoryEntrySetInventoryLimitsAction template) {
        return InventoryEntrySetInventoryLimitsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntrySetInventoryLimitsAction(
            Function<InventoryEntrySetInventoryLimitsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetInventoryLimitsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetInventoryLimitsAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetInventoryLimitsAction>";
            }
        };
    }
}
