
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryCreatedMessagePayload inventoryEntryCreatedMessagePayload = InventoryEntryCreatedMessagePayload.builder()
 *             .inventoryEntry(inventoryEntryBuilder -> inventoryEntryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryCreatedMessagePayloadBuilder implements Builder<InventoryEntryCreatedMessagePayload> {

    private com.commercetools.api.models.inventory.InventoryEntry inventoryEntry;

    /**
     *  <p>InventoryEntry that was created.</p>
     * @param builder function to build the inventoryEntry value
     * @return Builder
     */

    public InventoryEntryCreatedMessagePayloadBuilder inventoryEntry(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntryBuilder> builder) {
        this.inventoryEntry = builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>InventoryEntry that was created.</p>
     * @param inventoryEntry value to be set
     * @return Builder
     */

    public InventoryEntryCreatedMessagePayloadBuilder inventoryEntry(
            final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
        return this;
    }

    /**
     *  <p>InventoryEntry that was created.</p>
     * @return inventoryEntry
     */

    public com.commercetools.api.models.inventory.InventoryEntry getInventoryEntry() {
        return this.inventoryEntry;
    }

    /**
     * builds InventoryEntryCreatedMessagePayload with checking for non-null required values
     * @return InventoryEntryCreatedMessagePayload
     */
    public InventoryEntryCreatedMessagePayload build() {
        Objects.requireNonNull(inventoryEntry,
            InventoryEntryCreatedMessagePayload.class + ": inventoryEntry is missing");
        return new InventoryEntryCreatedMessagePayloadImpl(inventoryEntry);
    }

    /**
     * builds InventoryEntryCreatedMessagePayload without checking for non-null required values
     * @return InventoryEntryCreatedMessagePayload
     */
    public InventoryEntryCreatedMessagePayload buildUnchecked() {
        return new InventoryEntryCreatedMessagePayloadImpl(inventoryEntry);
    }

    /**
     * factory method for an instance of InventoryEntryCreatedMessagePayloadBuilder
     * @return builder
     */
    public static InventoryEntryCreatedMessagePayloadBuilder of() {
        return new InventoryEntryCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for InventoryEntryCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryCreatedMessagePayloadBuilder of(final InventoryEntryCreatedMessagePayload template) {
        InventoryEntryCreatedMessagePayloadBuilder builder = new InventoryEntryCreatedMessagePayloadBuilder();
        builder.inventoryEntry = template.getInventoryEntry();
        return builder;
    }

}
