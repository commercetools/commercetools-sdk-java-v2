
package com.commercetools.api.models.inventory;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryAddQuantityActionBuilder
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
public class InventoryEntryAddQuantityActionBuilder implements Builder<InventoryEntryAddQuantityAction> {

    private Long quantity;

    /**
     *  <p>Value to add to <code>quantityOnStock</code>.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public InventoryEntryAddQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Value to add to <code>quantityOnStock</code>.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds InventoryEntryAddQuantityAction with checking for non-null required values
     * @return InventoryEntryAddQuantityAction
     */
    public InventoryEntryAddQuantityAction build() {
        Objects.requireNonNull(quantity, InventoryEntryAddQuantityAction.class + ": quantity is missing");
        return new InventoryEntryAddQuantityActionImpl(quantity);
    }

    /**
     * builds InventoryEntryAddQuantityAction without checking for non-null required values
     * @return InventoryEntryAddQuantityAction
     */
    public InventoryEntryAddQuantityAction buildUnchecked() {
        return new InventoryEntryAddQuantityActionImpl(quantity);
    }

    /**
     * factory method for an instance of InventoryEntryAddQuantityActionBuilder
     * @return builder
     */
    public static InventoryEntryAddQuantityActionBuilder of() {
        return new InventoryEntryAddQuantityActionBuilder();
    }

    /**
     * create builder for InventoryEntryAddQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryAddQuantityActionBuilder of(final InventoryEntryAddQuantityAction template) {
        InventoryEntryAddQuantityActionBuilder builder = new InventoryEntryAddQuantityActionBuilder();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
