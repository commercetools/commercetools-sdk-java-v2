
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetInventoryLimitsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetInventoryLimitsAction inventoryEntrySetInventoryLimitsAction = InventoryEntrySetInventoryLimitsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetInventoryLimitsActionBuilder implements Builder<InventoryEntrySetInventoryLimitsAction> {

    @Nullable
    private Long minCartQuantity;

    @Nullable
    private Long maxCartQuantity;

    /**
     *  <p>Sets the minimum quantity that can be added to a Cart. If the value is absent or <code>null</code> the inventory limit is removed.</p>
     * @param minCartQuantity value to be set
     * @return Builder
     */

    public InventoryEntrySetInventoryLimitsActionBuilder minCartQuantity(@Nullable final Long minCartQuantity) {
        this.minCartQuantity = minCartQuantity;
        return this;
    }

    /**
     *  <p>Sets the maximum quantity that can be added to a Cart. If the value is absent or <code>null</code> the inventory limit is removed.</p>
     * @param maxCartQuantity value to be set
     * @return Builder
     */

    public InventoryEntrySetInventoryLimitsActionBuilder maxCartQuantity(@Nullable final Long maxCartQuantity) {
        this.maxCartQuantity = maxCartQuantity;
        return this;
    }

    /**
     *  <p>Sets the minimum quantity that can be added to a Cart. If the value is absent or <code>null</code> the inventory limit is removed.</p>
     * @return minCartQuantity
     */

    @Nullable
    public Long getMinCartQuantity() {
        return this.minCartQuantity;
    }

    /**
     *  <p>Sets the maximum quantity that can be added to a Cart. If the value is absent or <code>null</code> the inventory limit is removed.</p>
     * @return maxCartQuantity
     */

    @Nullable
    public Long getMaxCartQuantity() {
        return this.maxCartQuantity;
    }

    /**
     * builds InventoryEntrySetInventoryLimitsAction with checking for non-null required values
     * @return InventoryEntrySetInventoryLimitsAction
     */
    public InventoryEntrySetInventoryLimitsAction build() {
        return new InventoryEntrySetInventoryLimitsActionImpl(minCartQuantity, maxCartQuantity);
    }

    /**
     * builds InventoryEntrySetInventoryLimitsAction without checking for non-null required values
     * @return InventoryEntrySetInventoryLimitsAction
     */
    public InventoryEntrySetInventoryLimitsAction buildUnchecked() {
        return new InventoryEntrySetInventoryLimitsActionImpl(minCartQuantity, maxCartQuantity);
    }

    /**
     * factory method for an instance of InventoryEntrySetInventoryLimitsActionBuilder
     * @return builder
     */
    public static InventoryEntrySetInventoryLimitsActionBuilder of() {
        return new InventoryEntrySetInventoryLimitsActionBuilder();
    }

    /**
     * create builder for InventoryEntrySetInventoryLimitsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetInventoryLimitsActionBuilder of(
            final InventoryEntrySetInventoryLimitsAction template) {
        InventoryEntrySetInventoryLimitsActionBuilder builder = new InventoryEntrySetInventoryLimitsActionBuilder();
        builder.minCartQuantity = template.getMinCartQuantity();
        builder.maxCartQuantity = template.getMaxCartQuantity();
        return builder;
    }

}
