
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryQuantityValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryQuantityValue inventoryQuantityValue = InventoryQuantityValue.builder()
 *             .quantityOnStock(1)
 *             .availableQuantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryQuantityValueBuilder implements Builder<InventoryQuantityValue> {

    private Integer quantityOnStock;

    private Integer availableQuantity;

    /**
     *  <p>Overall amount of stock (<code>availableQuantity</code> + reserved).</p>
     * @param quantityOnStock value to be set
     * @return Builder
     */

    public InventoryQuantityValueBuilder quantityOnStock(final Integer quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }

    /**
     *  <p>Available amount of stock (<code>quantityOnStock</code> - reserved).</p>
     * @param availableQuantity value to be set
     * @return Builder
     */

    public InventoryQuantityValueBuilder availableQuantity(final Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    /**
     *  <p>Overall amount of stock (<code>availableQuantity</code> + reserved).</p>
     * @return quantityOnStock
     */

    public Integer getQuantityOnStock() {
        return this.quantityOnStock;
    }

    /**
     *  <p>Available amount of stock (<code>quantityOnStock</code> - reserved).</p>
     * @return availableQuantity
     */

    public Integer getAvailableQuantity() {
        return this.availableQuantity;
    }

    /**
     * builds InventoryQuantityValue with checking for non-null required values
     * @return InventoryQuantityValue
     */
    public InventoryQuantityValue build() {
        Objects.requireNonNull(quantityOnStock, InventoryQuantityValue.class + ": quantityOnStock is missing");
        Objects.requireNonNull(availableQuantity, InventoryQuantityValue.class + ": availableQuantity is missing");
        return new InventoryQuantityValueImpl(quantityOnStock, availableQuantity);
    }

    /**
     * builds InventoryQuantityValue without checking for non-null required values
     * @return InventoryQuantityValue
     */
    public InventoryQuantityValue buildUnchecked() {
        return new InventoryQuantityValueImpl(quantityOnStock, availableQuantity);
    }

    /**
     * factory method for an instance of InventoryQuantityValueBuilder
     * @return builder
     */
    public static InventoryQuantityValueBuilder of() {
        return new InventoryQuantityValueBuilder();
    }

    /**
     * create builder for InventoryQuantityValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryQuantityValueBuilder of(final InventoryQuantityValue template) {
        InventoryQuantityValueBuilder builder = new InventoryQuantityValueBuilder();
        builder.quantityOnStock = template.getQuantityOnStock();
        builder.availableQuantity = template.getAvailableQuantity();
        return builder;
    }

}
