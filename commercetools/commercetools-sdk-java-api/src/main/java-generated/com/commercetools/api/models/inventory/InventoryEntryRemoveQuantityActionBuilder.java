
package com.commercetools.api.models.inventory;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryRemoveQuantityActionBuilder
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
public class InventoryEntryRemoveQuantityActionBuilder implements Builder<InventoryEntryRemoveQuantityAction> {

    private Long quantity;

    /**
     *  <p>Value to remove from <code>quantityOnStock</code>.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public InventoryEntryRemoveQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Value to remove from <code>quantityOnStock</code>.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds InventoryEntryRemoveQuantityAction with checking for non-null required values
     * @return InventoryEntryRemoveQuantityAction
     */
    public InventoryEntryRemoveQuantityAction build() {
        Objects.requireNonNull(quantity, InventoryEntryRemoveQuantityAction.class + ": quantity is missing");
        return new InventoryEntryRemoveQuantityActionImpl(quantity);
    }

    /**
     * builds InventoryEntryRemoveQuantityAction without checking for non-null required values
     * @return InventoryEntryRemoveQuantityAction
     */
    public InventoryEntryRemoveQuantityAction buildUnchecked() {
        return new InventoryEntryRemoveQuantityActionImpl(quantity);
    }

    /**
     * factory method for an instance of InventoryEntryRemoveQuantityActionBuilder
     * @return builder
     */
    public static InventoryEntryRemoveQuantityActionBuilder of() {
        return new InventoryEntryRemoveQuantityActionBuilder();
    }

    /**
     * create builder for InventoryEntryRemoveQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryRemoveQuantityActionBuilder of(final InventoryEntryRemoveQuantityAction template) {
        InventoryEntryRemoveQuantityActionBuilder builder = new InventoryEntryRemoveQuantityActionBuilder();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
