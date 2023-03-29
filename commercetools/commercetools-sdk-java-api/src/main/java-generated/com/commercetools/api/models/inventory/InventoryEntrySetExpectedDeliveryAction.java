
package com.commercetools.api.models.inventory;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetExpectedDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetExpectedDeliveryAction inventoryEntrySetExpectedDeliveryAction = InventoryEntrySetExpectedDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetExpectedDeliveryActionImpl.class)
public interface InventoryEntrySetExpectedDeliveryAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntrySetExpectedDeliveryAction
     */
    String SET_EXPECTED_DELIVERY = "setExpectedDelivery";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return expectedDelivery
     */

    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param expectedDelivery value to be set
     */

    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);

    /**
     * factory method
     * @return instance of InventoryEntrySetExpectedDeliveryAction
     */
    public static InventoryEntrySetExpectedDeliveryAction of() {
        return new InventoryEntrySetExpectedDeliveryActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntrySetExpectedDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntrySetExpectedDeliveryAction of(final InventoryEntrySetExpectedDeliveryAction template) {
        InventoryEntrySetExpectedDeliveryActionImpl instance = new InventoryEntrySetExpectedDeliveryActionImpl();
        instance.setExpectedDelivery(template.getExpectedDelivery());
        return instance;
    }

    /**
     * factory method to create a deep copy of InventoryEntrySetExpectedDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntrySetExpectedDeliveryAction deepCopy(
            @Nullable final InventoryEntrySetExpectedDeliveryAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntrySetExpectedDeliveryActionImpl instance = new InventoryEntrySetExpectedDeliveryActionImpl();
        instance.setExpectedDelivery(template.getExpectedDelivery());
        return instance;
    }

    /**
     * builder factory method for InventoryEntrySetExpectedDeliveryAction
     * @return builder
     */
    public static InventoryEntrySetExpectedDeliveryActionBuilder builder() {
        return InventoryEntrySetExpectedDeliveryActionBuilder.of();
    }

    /**
     * create builder for InventoryEntrySetExpectedDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetExpectedDeliveryActionBuilder builder(
            final InventoryEntrySetExpectedDeliveryAction template) {
        return InventoryEntrySetExpectedDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntrySetExpectedDeliveryAction(
            Function<InventoryEntrySetExpectedDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetExpectedDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetExpectedDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetExpectedDeliveryAction>";
            }
        };
    }
}
