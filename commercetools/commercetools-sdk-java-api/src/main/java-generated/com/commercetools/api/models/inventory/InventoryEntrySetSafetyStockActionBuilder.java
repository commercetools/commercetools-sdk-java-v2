
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetSafetyStockActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetSafetyStockAction inventoryEntrySetSafetyStockAction = InventoryEntrySetSafetyStockAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetSafetyStockActionBuilder implements Builder<InventoryEntrySetSafetyStockAction> {

    @Nullable
    private Integer quantity;

    /**
     *  <p>Sets the configured inventory stock level for safety stock. If the value is absent or <code>null</code> the configured inventory stock level is removed.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public InventoryEntrySetSafetyStockActionBuilder quantity(@Nullable final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Sets the configured inventory stock level for safety stock. If the value is absent or <code>null</code> the configured inventory stock level is removed.</p>
     * @return quantity
     */

    @Nullable
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * builds InventoryEntrySetSafetyStockAction with checking for non-null required values
     * @return InventoryEntrySetSafetyStockAction
     */
    public InventoryEntrySetSafetyStockAction build() {
        return new InventoryEntrySetSafetyStockActionImpl(quantity);
    }

    /**
     * builds InventoryEntrySetSafetyStockAction without checking for non-null required values
     * @return InventoryEntrySetSafetyStockAction
     */
    public InventoryEntrySetSafetyStockAction buildUnchecked() {
        return new InventoryEntrySetSafetyStockActionImpl(quantity);
    }

    /**
     * factory method for an instance of InventoryEntrySetSafetyStockActionBuilder
     * @return builder
     */
    public static InventoryEntrySetSafetyStockActionBuilder of() {
        return new InventoryEntrySetSafetyStockActionBuilder();
    }

    /**
     * create builder for InventoryEntrySetSafetyStockAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetSafetyStockActionBuilder of(final InventoryEntrySetSafetyStockAction template) {
        InventoryEntrySetSafetyStockActionBuilder builder = new InventoryEntrySetSafetyStockActionBuilder();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
