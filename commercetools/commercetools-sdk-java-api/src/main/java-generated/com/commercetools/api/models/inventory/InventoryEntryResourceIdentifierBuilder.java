
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
     <*  <p>Platform-generated unique identifier of the referenced InventoryEntry. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public InventoryEntryResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>User-defined unique identifier of the referenced InventoryEntry. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public InventoryEntryResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public InventoryEntryResourceIdentifier build() {
        return new InventoryEntryResourceIdentifierImpl(id, key);
    }

    /**
     * builds InventoryEntryResourceIdentifier without checking for non null required values
     */
    public InventoryEntryResourceIdentifier buildUnchecked() {
        return new InventoryEntryResourceIdentifierImpl(id, key);
    }

    public static InventoryEntryResourceIdentifierBuilder of() {
        return new InventoryEntryResourceIdentifierBuilder();
    }

    public static InventoryEntryResourceIdentifierBuilder of(final InventoryEntryResourceIdentifier template) {
        InventoryEntryResourceIdentifierBuilder builder = new InventoryEntryResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
