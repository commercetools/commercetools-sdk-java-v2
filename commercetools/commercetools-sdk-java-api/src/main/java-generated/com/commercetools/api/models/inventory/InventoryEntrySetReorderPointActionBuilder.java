
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetReorderPointActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetReorderPointAction inventoryEntrySetReorderPointAction = InventoryEntrySetReorderPointAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetReorderPointActionBuilder implements Builder<InventoryEntrySetReorderPointAction> {

    @Nullable
    private Integer quantity;

    /**
     *  <p>Sets the configured inventory stock level for reorder point. If the value is absent or <code>null</code> the configured inventory stock level is removed.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public InventoryEntrySetReorderPointActionBuilder quantity(@Nullable final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Sets the configured inventory stock level for reorder point. If the value is absent or <code>null</code> the configured inventory stock level is removed.</p>
     * @return quantity
     */

    @Nullable
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * builds InventoryEntrySetReorderPointAction with checking for non-null required values
     * @return InventoryEntrySetReorderPointAction
     */
    public InventoryEntrySetReorderPointAction build() {
        return new InventoryEntrySetReorderPointActionImpl(quantity);
    }

    /**
     * builds InventoryEntrySetReorderPointAction without checking for non-null required values
     * @return InventoryEntrySetReorderPointAction
     */
    public InventoryEntrySetReorderPointAction buildUnchecked() {
        return new InventoryEntrySetReorderPointActionImpl(quantity);
    }

    /**
     * factory method for an instance of InventoryEntrySetReorderPointActionBuilder
     * @return builder
     */
    public static InventoryEntrySetReorderPointActionBuilder of() {
        return new InventoryEntrySetReorderPointActionBuilder();
    }

    /**
     * create builder for InventoryEntrySetReorderPointAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetReorderPointActionBuilder of(final InventoryEntrySetReorderPointAction template) {
        InventoryEntrySetReorderPointActionBuilder builder = new InventoryEntrySetReorderPointActionBuilder();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
