
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetRestockableInDaysActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetRestockableInDaysAction inventoryEntrySetRestockableInDaysAction = InventoryEntrySetRestockableInDaysAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetRestockableInDaysActionBuilder
        implements Builder<InventoryEntrySetRestockableInDaysAction> {

    @Nullable
    private Long restockableInDays;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public InventoryEntrySetRestockableInDaysActionBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    @Nullable
    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    public InventoryEntrySetRestockableInDaysAction build() {
        return new InventoryEntrySetRestockableInDaysActionImpl(restockableInDays);
    }

    /**
     * builds InventoryEntrySetRestockableInDaysAction without checking for non null required values
     */
    public InventoryEntrySetRestockableInDaysAction buildUnchecked() {
        return new InventoryEntrySetRestockableInDaysActionImpl(restockableInDays);
    }

    public static InventoryEntrySetRestockableInDaysActionBuilder of() {
        return new InventoryEntrySetRestockableInDaysActionBuilder();
    }

    public static InventoryEntrySetRestockableInDaysActionBuilder of(
            final InventoryEntrySetRestockableInDaysAction template) {
        InventoryEntrySetRestockableInDaysActionBuilder builder = new InventoryEntrySetRestockableInDaysActionBuilder();
        builder.restockableInDays = template.getRestockableInDays();
        return builder;
    }

}
