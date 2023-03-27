
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryResourceIdentifier inventoryEntryResourceIdentifier = InventoryEntryResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryResourceIdentifierBuilder implements Builder<InventoryEntryResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced InventoryEntry. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */

    public InventoryEntryResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced InventoryEntry. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */

    public InventoryEntryResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced InventoryEntry. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced InventoryEntry. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds InventoryEntryResourceIdentifier with checking for non-null required values
     * @return InventoryEntryResourceIdentifier
     */
    public InventoryEntryResourceIdentifier build() {
        return new InventoryEntryResourceIdentifierImpl(id, key);
    }

    /**
     * builds InventoryEntryResourceIdentifier without checking for non-null required values
     * @return InventoryEntryResourceIdentifier
     */
    public InventoryEntryResourceIdentifier buildUnchecked() {
        return new InventoryEntryResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of InventoryEntryResourceIdentifierBuilder
     * @return builder
     */
    public static InventoryEntryResourceIdentifierBuilder of() {
        return new InventoryEntryResourceIdentifierBuilder();
    }

    /**
     * create builder for InventoryEntryResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryResourceIdentifierBuilder of(final InventoryEntryResourceIdentifier template) {
        InventoryEntryResourceIdentifierBuilder builder = new InventoryEntryResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
