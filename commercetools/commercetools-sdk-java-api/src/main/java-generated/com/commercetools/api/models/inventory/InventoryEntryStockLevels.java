
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Stock level thresholds for an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> that trigger Messages when stock levels reach certain points. For more information, see <span>Stock level notifications</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryStockLevels inventoryEntryStockLevels = InventoryEntryStockLevels.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryStockLevelsImpl.class)
public interface InventoryEntryStockLevels {

    /**
     *  <p>When the <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> reaches this value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryReorderPointMessage" rel="nofollow">InventoryEntryReorderPoint</a> Message is generated.</p>
     * @return reorderPoint
     */

    @JsonProperty("reorderPoint")
    public Integer getReorderPoint();

    /**
     *  <p>When the <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> reaches this value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySafetyStockMessage" rel="nofollow">InventoryEntrySafetyStock</a> Message is generated.</p>
     * @return safetyStock
     */

    @JsonProperty("safetyStock")
    public Integer getSafetyStock();

    /**
     *  <p>When the <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> reaches this value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryReorderPointMessage" rel="nofollow">InventoryEntryReorderPoint</a> Message is generated.</p>
     * @param reorderPoint value to be set
     */

    public void setReorderPoint(final Integer reorderPoint);

    /**
     *  <p>When the <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> reaches this value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySafetyStockMessage" rel="nofollow">InventoryEntrySafetyStock</a> Message is generated.</p>
     * @param safetyStock value to be set
     */

    public void setSafetyStock(final Integer safetyStock);

    /**
     * factory method
     * @return instance of InventoryEntryStockLevels
     */
    public static InventoryEntryStockLevels of() {
        return new InventoryEntryStockLevelsImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryStockLevels
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryStockLevels of(final InventoryEntryStockLevels template) {
        InventoryEntryStockLevelsImpl instance = new InventoryEntryStockLevelsImpl();
        instance.setReorderPoint(template.getReorderPoint());
        instance.setSafetyStock(template.getSafetyStock());
        return instance;
    }

    public InventoryEntryStockLevels copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryStockLevels
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryStockLevels deepCopy(@Nullable final InventoryEntryStockLevels template) {
        if (template == null) {
            return null;
        }
        InventoryEntryStockLevelsImpl instance = new InventoryEntryStockLevelsImpl();
        instance.setReorderPoint(template.getReorderPoint());
        instance.setSafetyStock(template.getSafetyStock());
        return instance;
    }

    /**
     * builder factory method for InventoryEntryStockLevels
     * @return builder
     */
    public static InventoryEntryStockLevelsBuilder builder() {
        return InventoryEntryStockLevelsBuilder.of();
    }

    /**
     * create builder for InventoryEntryStockLevels instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryStockLevelsBuilder builder(final InventoryEntryStockLevels template) {
        return InventoryEntryStockLevelsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryStockLevels(Function<InventoryEntryStockLevels, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryStockLevels> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryStockLevels>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryStockLevels>";
            }
        };
    }
}
