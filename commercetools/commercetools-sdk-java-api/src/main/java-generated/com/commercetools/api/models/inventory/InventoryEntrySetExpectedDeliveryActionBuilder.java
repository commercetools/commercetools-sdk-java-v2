
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetExpectedDeliveryActionBuilder
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
public class InventoryEntrySetExpectedDeliveryActionBuilder
        implements Builder<InventoryEntrySetExpectedDeliveryAction> {

    @Nullable
    private java.time.ZonedDateTime expectedDelivery;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public InventoryEntrySetExpectedDeliveryActionBuilder expectedDelivery(
            @Nullable final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getExpectedDelivery() {
        return this.expectedDelivery;
    }

    public InventoryEntrySetExpectedDeliveryAction build() {
        return new InventoryEntrySetExpectedDeliveryActionImpl(expectedDelivery);
    }

    /**
     * builds InventoryEntrySetExpectedDeliveryAction without checking for non null required values
     */
    public InventoryEntrySetExpectedDeliveryAction buildUnchecked() {
        return new InventoryEntrySetExpectedDeliveryActionImpl(expectedDelivery);
    }

    public static InventoryEntrySetExpectedDeliveryActionBuilder of() {
        return new InventoryEntrySetExpectedDeliveryActionBuilder();
    }

    public static InventoryEntrySetExpectedDeliveryActionBuilder of(
            final InventoryEntrySetExpectedDeliveryAction template) {
        InventoryEntrySetExpectedDeliveryActionBuilder builder = new InventoryEntrySetExpectedDeliveryActionBuilder();
        builder.expectedDelivery = template.getExpectedDelivery();
        return builder;
    }

}
