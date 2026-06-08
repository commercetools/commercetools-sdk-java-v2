
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the safety stock level for a specific InventoryEntry. When the stock reaches this level, a corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySafetyStockMessage" rel="nofollow">InventoryEntrySafetyStock</a> Message is generated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetSafetyStockAction inventoryEntrySetSafetyStockAction = InventoryEntrySetSafetyStockAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setSafetyStock")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetSafetyStockActionImpl.class)
public interface InventoryEntrySetSafetyStockAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntrySetSafetyStockAction
     */
    String SET_SAFETY_STOCK = "setSafetyStock";

    /**
     *  <p>Sets the configured inventory stock level for safety stock. If the value is absent or <code>null</code> the configured inventory stock level is removed.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Integer getQuantity();

    /**
     *  <p>Sets the configured inventory stock level for safety stock. If the value is absent or <code>null</code> the configured inventory stock level is removed.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Integer quantity);

    /**
     * factory method
     * @return instance of InventoryEntrySetSafetyStockAction
     */
    public static InventoryEntrySetSafetyStockAction of() {
        return new InventoryEntrySetSafetyStockActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntrySetSafetyStockAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntrySetSafetyStockAction of(final InventoryEntrySetSafetyStockAction template) {
        InventoryEntrySetSafetyStockActionImpl instance = new InventoryEntrySetSafetyStockActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public InventoryEntrySetSafetyStockAction copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntrySetSafetyStockAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntrySetSafetyStockAction deepCopy(
            @Nullable final InventoryEntrySetSafetyStockAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntrySetSafetyStockActionImpl instance = new InventoryEntrySetSafetyStockActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for InventoryEntrySetSafetyStockAction
     * @return builder
     */
    public static InventoryEntrySetSafetyStockActionBuilder builder() {
        return InventoryEntrySetSafetyStockActionBuilder.of();
    }

    /**
     * create builder for InventoryEntrySetSafetyStockAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetSafetyStockActionBuilder builder(final InventoryEntrySetSafetyStockAction template) {
        return InventoryEntrySetSafetyStockActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntrySetSafetyStockAction(Function<InventoryEntrySetSafetyStockAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<InventoryEntrySetSafetyStockAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<InventoryEntrySetSafetyStockAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetSafetyStockAction>";
            }
        };
    }
}
