
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.inventory.InventoryEntry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create InventoryEntry request.</p>
 *
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
@JsonDeserialize(as = InventoryEntryCreatedMessagePayloadImpl.class)
public interface InventoryEntryCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for InventoryEntryCreatedMessagePayload
     */
    String INVENTORY_ENTRY_CREATED = "InventoryEntryCreated";

    /**
     *  <p>InventoryEntry that was created.</p>
     * @return inventoryEntry
     */
    @NotNull
    @Valid
    @JsonProperty("inventoryEntry")
    public InventoryEntry getInventoryEntry();

    /**
     *  <p>InventoryEntry that was created.</p>
     * @param inventoryEntry value to be set
     */

    public void setInventoryEntry(final InventoryEntry inventoryEntry);

    /**
     * factory method
     * @return instance of InventoryEntryCreatedMessagePayload
     */
    public static InventoryEntryCreatedMessagePayload of() {
        return new InventoryEntryCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryCreatedMessagePayload of(final InventoryEntryCreatedMessagePayload template) {
        InventoryEntryCreatedMessagePayloadImpl instance = new InventoryEntryCreatedMessagePayloadImpl();
        instance.setInventoryEntry(template.getInventoryEntry());
        return instance;
    }

    /**
     * factory method to create a deep copy of InventoryEntryCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryCreatedMessagePayload deepCopy(
            @Nullable final InventoryEntryCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        InventoryEntryCreatedMessagePayloadImpl instance = new InventoryEntryCreatedMessagePayloadImpl();
        instance.setInventoryEntry(
            com.commercetools.api.models.inventory.InventoryEntry.deepCopy(template.getInventoryEntry()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryCreatedMessagePayload
     * @return builder
     */
    public static InventoryEntryCreatedMessagePayloadBuilder builder() {
        return InventoryEntryCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for InventoryEntryCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryCreatedMessagePayloadBuilder builder(
            final InventoryEntryCreatedMessagePayload template) {
        return InventoryEntryCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryCreatedMessagePayload(Function<InventoryEntryCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryCreatedMessagePayload>";
            }
        };
    }
}
