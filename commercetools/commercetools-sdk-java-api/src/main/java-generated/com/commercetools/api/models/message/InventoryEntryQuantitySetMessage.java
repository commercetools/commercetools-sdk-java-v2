
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Quantity, Remove Quantity or Change Quantity update action. Inventory changes as a result of Order creation do not trigger this message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryQuantitySetMessage inventoryEntryQuantitySetMessage = InventoryEntryQuantitySetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .oldQuantityOnStock(0.3)
 *             .newQuantityOnStock(0.3)
 *             .oldAvailableQuantity(0.3)
 *             .newAvailableQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryQuantitySetMessageImpl.class)
public interface InventoryEntryQuantitySetMessage extends Message {

    /**
     * discriminator value for InventoryEntryQuantitySetMessage
     */
    String INVENTORY_ENTRY_QUANTITY_SET = "InventoryEntryQuantitySet";

    /**
     *  <p>Quantity on stock for the InventoryEntry before the quantity was updated.</p>
     * @return oldQuantityOnStock
     */
    @NotNull
    @JsonProperty("oldQuantityOnStock")
    public Long getOldQuantityOnStock();

    /**
     *  <p>Quantity on stock for the InventoryEntry after the quantity was updated.</p>
     * @return newQuantityOnStock
     */
    @NotNull
    @JsonProperty("newQuantityOnStock")
    public Long getNewQuantityOnStock();

    /**
     *  <p>Available quantity for the InventoryEntry before the quantity was updated.</p>
     * @return oldAvailableQuantity
     */
    @NotNull
    @JsonProperty("oldAvailableQuantity")
    public Long getOldAvailableQuantity();

    /**
     *  <p>Available quantity for the InventoryEntry after the quantity was updated.</p>
     * @return newAvailableQuantity
     */
    @NotNull
    @JsonProperty("newAvailableQuantity")
    public Long getNewAvailableQuantity();

    /**
     *  <p>Reference to the Channel where the InventoryEntry quantity was set.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>Quantity on stock for the InventoryEntry before the quantity was updated.</p>
     * @param oldQuantityOnStock value to be set
     */

    public void setOldQuantityOnStock(final Long oldQuantityOnStock);

    /**
     *  <p>Quantity on stock for the InventoryEntry after the quantity was updated.</p>
     * @param newQuantityOnStock value to be set
     */

    public void setNewQuantityOnStock(final Long newQuantityOnStock);

    /**
     *  <p>Available quantity for the InventoryEntry before the quantity was updated.</p>
     * @param oldAvailableQuantity value to be set
     */

    public void setOldAvailableQuantity(final Long oldAvailableQuantity);

    /**
     *  <p>Available quantity for the InventoryEntry after the quantity was updated.</p>
     * @param newAvailableQuantity value to be set
     */

    public void setNewAvailableQuantity(final Long newAvailableQuantity);

    /**
     *  <p>Reference to the Channel where the InventoryEntry quantity was set.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelReference supplyChannel);

    /**
     * factory method
     * @return instance of InventoryEntryQuantitySetMessage
     */
    public static InventoryEntryQuantitySetMessage of() {
        return new InventoryEntryQuantitySetMessageImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryQuantitySetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryQuantitySetMessage of(final InventoryEntryQuantitySetMessage template) {
        InventoryEntryQuantitySetMessageImpl instance = new InventoryEntryQuantitySetMessageImpl();
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
        instance.setOldQuantityOnStock(template.getOldQuantityOnStock());
        instance.setNewQuantityOnStock(template.getNewQuantityOnStock());
        instance.setOldAvailableQuantity(template.getOldAvailableQuantity());
        instance.setNewAvailableQuantity(template.getNewAvailableQuantity());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of InventoryEntryQuantitySetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryQuantitySetMessage deepCopy(@Nullable final InventoryEntryQuantitySetMessage template) {
        if (template == null) {
            return null;
        }
        InventoryEntryQuantitySetMessageImpl instance = new InventoryEntryQuantitySetMessageImpl();
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
        instance.setOldQuantityOnStock(template.getOldQuantityOnStock());
        instance.setNewQuantityOnStock(template.getNewQuantityOnStock());
        instance.setOldAvailableQuantity(template.getOldAvailableQuantity());
        instance.setNewAvailableQuantity(template.getNewAvailableQuantity());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryQuantitySetMessage
     * @return builder
     */
    public static InventoryEntryQuantitySetMessageBuilder builder() {
        return InventoryEntryQuantitySetMessageBuilder.of();
    }

    /**
     * create builder for InventoryEntryQuantitySetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryQuantitySetMessageBuilder builder(final InventoryEntryQuantitySetMessage template) {
        return InventoryEntryQuantitySetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryQuantitySetMessage(Function<InventoryEntryQuantitySetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryQuantitySetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryQuantitySetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryQuantitySetMessage>";
            }
        };
    }
}
