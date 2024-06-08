
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Delete InventoryEntry request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryDeletedMessage inventoryEntryDeletedMessage = InventoryEntryDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryDeletedMessageImpl.class)
public interface InventoryEntryDeletedMessage extends Message {

    /**
     * discriminator value for InventoryEntryDeletedMessage
     */
    String INVENTORY_ENTRY_DELETED = "InventoryEntryDeleted";

    /**
     *  <p>The <code>sku</code> of the InventoryEntry that was deleted.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Reference to the Channel where the InventoryEntry was deleted.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>The <code>sku</code> of the InventoryEntry that was deleted.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Reference to the Channel where the InventoryEntry was deleted.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelReference supplyChannel);

    /**
     * factory method
     * @return instance of InventoryEntryDeletedMessage
     */
    public static InventoryEntryDeletedMessage of() {
        return new InventoryEntryDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryDeletedMessage of(final InventoryEntryDeletedMessage template) {
        InventoryEntryDeletedMessageImpl instance = new InventoryEntryDeletedMessageImpl();
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
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of InventoryEntryDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryDeletedMessage deepCopy(@Nullable final InventoryEntryDeletedMessage template) {
        if (template == null) {
            return null;
        }
        InventoryEntryDeletedMessageImpl instance = new InventoryEntryDeletedMessageImpl();
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
        instance.setSku(template.getSku());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryDeletedMessage
     * @return builder
     */
    public static InventoryEntryDeletedMessageBuilder builder() {
        return InventoryEntryDeletedMessageBuilder.of();
    }

    /**
     * create builder for InventoryEntryDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryDeletedMessageBuilder builder(final InventoryEntryDeletedMessage template) {
        return InventoryEntryDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryDeletedMessage(Function<InventoryEntryDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryDeletedMessage>";
            }
        };
    }
}
