
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.inventory.InventoryEntry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/inventory:POST" rel="nofollow">Create InventoryEntry</a> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryCreatedMessage inventoryEntryCreatedMessage = InventoryEntryCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .inventoryEntry(inventoryEntryBuilder -> inventoryEntryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InventoryEntryCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryCreatedMessageImpl.class)
public interface InventoryEntryCreatedMessage extends Message {

    /**
     * discriminator value for InventoryEntryCreatedMessage
     */
    String INVENTORY_ENTRY_CREATED = "InventoryEntryCreated";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> that was created.</p>
     * @return inventoryEntry
     */
    @NotNull
    @Valid
    @JsonProperty("inventoryEntry")
    public InventoryEntry getInventoryEntry();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> that was created.</p>
     * @param inventoryEntry value to be set
     */

    public void setInventoryEntry(final InventoryEntry inventoryEntry);

    /**
     * factory method
     * @return instance of InventoryEntryCreatedMessage
     */
    public static InventoryEntryCreatedMessage of() {
        return new InventoryEntryCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryCreatedMessage of(final InventoryEntryCreatedMessage template) {
        InventoryEntryCreatedMessageImpl instance = new InventoryEntryCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setInventoryEntry(template.getInventoryEntry());
        return instance;
    }

    public InventoryEntryCreatedMessage copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryCreatedMessage deepCopy(@Nullable final InventoryEntryCreatedMessage template) {
        if (template == null) {
            return null;
        }
        InventoryEntryCreatedMessageImpl instance = new InventoryEntryCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setInventoryEntry(
            com.commercetools.api.models.inventory.InventoryEntry.deepCopy(template.getInventoryEntry()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryCreatedMessage
     * @return builder
     */
    public static InventoryEntryCreatedMessageBuilder builder() {
        return InventoryEntryCreatedMessageBuilder.of();
    }

    /**
     * create builder for InventoryEntryCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryCreatedMessageBuilder builder(final InventoryEntryCreatedMessage template) {
        return InventoryEntryCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryCreatedMessage(Function<InventoryEntryCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryCreatedMessage>";
            }
        };
    }
}
