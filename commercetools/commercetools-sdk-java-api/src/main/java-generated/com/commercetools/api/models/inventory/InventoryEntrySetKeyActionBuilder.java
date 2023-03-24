
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetKeyAction inventoryEntrySetKeyAction = InventoryEntrySetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetKeyActionBuilder implements Builder<InventoryEntrySetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public InventoryEntrySetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds InventoryEntrySetKeyAction with checking for non-null required values
     * @return InventoryEntrySetKeyAction
     */
    public InventoryEntrySetKeyAction build() {
        return new InventoryEntrySetKeyActionImpl(key);
    }

    /**
     * builds InventoryEntrySetKeyAction without checking for non-null required values
     * @return InventoryEntrySetKeyAction
     */
    public InventoryEntrySetKeyAction buildUnchecked() {
        return new InventoryEntrySetKeyActionImpl(key);
    }

    public static InventoryEntrySetKeyActionBuilder of() {
        return new InventoryEntrySetKeyActionBuilder();
    }

    public static InventoryEntrySetKeyActionBuilder of(final InventoryEntrySetKeyAction template) {
        InventoryEntrySetKeyActionBuilder builder = new InventoryEntrySetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
