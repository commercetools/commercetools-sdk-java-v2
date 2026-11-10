
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryStockLevelsBuilder
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
public class InventoryEntryStockLevelsBuilder implements Builder<InventoryEntryStockLevels> {

    @Nullable
    private Integer reorderPoint;

    @Nullable
    private Integer safetyStock;

    /**
     *  <p>When the <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> reaches this value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryReorderPointMessage" rel="nofollow">InventoryEntryReorderPoint</a> Message is generated.</p>
     * @param reorderPoint value to be set
     * @return Builder
     */

    public InventoryEntryStockLevelsBuilder reorderPoint(@Nullable final Integer reorderPoint) {
        this.reorderPoint = reorderPoint;
        return this;
    }

    /**
     *  <p>When the <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> reaches this value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySafetyStockMessage" rel="nofollow">InventoryEntrySafetyStock</a> Message is generated.</p>
     * @param safetyStock value to be set
     * @return Builder
     */

    public InventoryEntryStockLevelsBuilder safetyStock(@Nullable final Integer safetyStock) {
        this.safetyStock = safetyStock;
        return this;
    }

    /**
     *  <p>When the <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> reaches this value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryReorderPointMessage" rel="nofollow">InventoryEntryReorderPoint</a> Message is generated.</p>
     * @return reorderPoint
     */

    @Nullable
    public Integer getReorderPoint() {
        return this.reorderPoint;
    }

    /**
     *  <p>When the <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> reaches this value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySafetyStockMessage" rel="nofollow">InventoryEntrySafetyStock</a> Message is generated.</p>
     * @return safetyStock
     */

    @Nullable
    public Integer getSafetyStock() {
        return this.safetyStock;
    }

    /**
     * builds InventoryEntryStockLevels with checking for non-null required values
     * @return InventoryEntryStockLevels
     */
    public InventoryEntryStockLevels build() {
        return new InventoryEntryStockLevelsImpl(reorderPoint, safetyStock);
    }

    /**
     * builds InventoryEntryStockLevels without checking for non-null required values
     * @return InventoryEntryStockLevels
     */
    public InventoryEntryStockLevels buildUnchecked() {
        return new InventoryEntryStockLevelsImpl(reorderPoint, safetyStock);
    }

    /**
     * factory method for an instance of InventoryEntryStockLevelsBuilder
     * @return builder
     */
    public static InventoryEntryStockLevelsBuilder of() {
        return new InventoryEntryStockLevelsBuilder();
    }

    /**
     * create builder for InventoryEntryStockLevels instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryStockLevelsBuilder of(final InventoryEntryStockLevels template) {
        InventoryEntryStockLevelsBuilder builder = new InventoryEntryStockLevelsBuilder();
        builder.reorderPoint = template.getReorderPoint();
        builder.safetyStock = template.getSafetyStock();
        return builder;
    }

}
