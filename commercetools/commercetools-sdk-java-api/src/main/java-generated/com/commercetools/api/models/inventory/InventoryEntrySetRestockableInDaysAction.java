
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetRestockableInDaysAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetRestockableInDaysAction inventoryEntrySetRestockableInDaysAction = InventoryEntrySetRestockableInDaysAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setRestockableInDays")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetRestockableInDaysActionImpl.class)
public interface InventoryEntrySetRestockableInDaysAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntrySetRestockableInDaysAction
     */
    String SET_RESTOCKABLE_IN_DAYS = "setRestockableInDays";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return restockableInDays
     */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param restockableInDays value to be set
     */

    public void setRestockableInDays(final Long restockableInDays);

    /**
     * factory method
     * @return instance of InventoryEntrySetRestockableInDaysAction
     */
    public static InventoryEntrySetRestockableInDaysAction of() {
        return new InventoryEntrySetRestockableInDaysActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntrySetRestockableInDaysAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntrySetRestockableInDaysAction of(final InventoryEntrySetRestockableInDaysAction template) {
        InventoryEntrySetRestockableInDaysActionImpl instance = new InventoryEntrySetRestockableInDaysActionImpl();
        instance.setRestockableInDays(template.getRestockableInDays());
        return instance;
    }

    public InventoryEntrySetRestockableInDaysAction copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntrySetRestockableInDaysAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntrySetRestockableInDaysAction deepCopy(
            @Nullable final InventoryEntrySetRestockableInDaysAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntrySetRestockableInDaysActionImpl instance = new InventoryEntrySetRestockableInDaysActionImpl();
        instance.setRestockableInDays(template.getRestockableInDays());
        return instance;
    }

    /**
     * builder factory method for InventoryEntrySetRestockableInDaysAction
     * @return builder
     */
    public static InventoryEntrySetRestockableInDaysActionBuilder builder() {
        return InventoryEntrySetRestockableInDaysActionBuilder.of();
    }

    /**
     * create builder for InventoryEntrySetRestockableInDaysAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetRestockableInDaysActionBuilder builder(
            final InventoryEntrySetRestockableInDaysAction template) {
        return InventoryEntrySetRestockableInDaysActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntrySetRestockableInDaysAction(
            Function<InventoryEntrySetRestockableInDaysAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetRestockableInDaysAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetRestockableInDaysAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetRestockableInDaysAction>";
            }
        };
    }
}
