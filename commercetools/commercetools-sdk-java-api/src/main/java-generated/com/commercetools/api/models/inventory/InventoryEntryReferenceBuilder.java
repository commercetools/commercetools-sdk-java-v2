
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryReference inventoryEntryReference = InventoryEntryReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryReferenceBuilder implements Builder<InventoryEntryReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.inventory.InventoryEntry obj;

    /**
     *  <p>Unique identifier of the referenced InventoryEntry.</p>
     */

    public InventoryEntryReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded InventoryEntry. Only present in responses to requests with Reference Expansion for InventoryEntries.</p>
     */

    public InventoryEntryReferenceBuilder obj(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntryBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded InventoryEntry. Only present in responses to requests with Reference Expansion for InventoryEntries.</p>
     */

    public InventoryEntryReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.inventory.InventoryEntry obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.inventory.InventoryEntry getObj() {
        return this.obj;
    }

    public InventoryEntryReference build() {
        Objects.requireNonNull(id, InventoryEntryReference.class + ": id is missing");
        return new InventoryEntryReferenceImpl(id, obj);
    }

    /**
     * builds InventoryEntryReference without checking for non null required values
     */
    public InventoryEntryReference buildUnchecked() {
        return new InventoryEntryReferenceImpl(id, obj);
    }

    public static InventoryEntryReferenceBuilder of() {
        return new InventoryEntryReferenceBuilder();
    }

    public static InventoryEntryReferenceBuilder of(final InventoryEntryReference template) {
        InventoryEntryReferenceBuilder builder = new InventoryEntryReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
