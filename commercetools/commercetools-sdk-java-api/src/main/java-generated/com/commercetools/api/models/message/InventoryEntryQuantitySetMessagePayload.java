
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
 *  <p>Generated after a successful Add Quantity, Remove Quantity or Change Quantity update action. Inventory changes as a result of Order creation do not trigger this message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryQuantitySetMessagePayload inventoryEntryQuantitySetMessagePayload = InventoryEntryQuantitySetMessagePayload.builder()
 *             .oldQuantityOnStock(0.3)
 *             .newQuantityOnStock(0.3)
 *             .oldAvailableQuantity(0.3)
 *             .newAvailableQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InventoryEntryQuantitySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryQuantitySetMessagePayloadImpl.class)
public interface InventoryEntryQuantitySetMessagePayload extends MessagePayload {

    /**
     * discriminator value for InventoryEntryQuantitySetMessagePayload
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
     * @return instance of InventoryEntryQuantitySetMessagePayload
     */
    public static InventoryEntryQuantitySetMessagePayload of() {
        return new InventoryEntryQuantitySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryQuantitySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryQuantitySetMessagePayload of(final InventoryEntryQuantitySetMessagePayload template) {
        InventoryEntryQuantitySetMessagePayloadImpl instance = new InventoryEntryQuantitySetMessagePayloadImpl();
        instance.setOldQuantityOnStock(template.getOldQuantityOnStock());
        instance.setNewQuantityOnStock(template.getNewQuantityOnStock());
        instance.setOldAvailableQuantity(template.getOldAvailableQuantity());
        instance.setNewAvailableQuantity(template.getNewAvailableQuantity());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public InventoryEntryQuantitySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryQuantitySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryQuantitySetMessagePayload deepCopy(
            @Nullable final InventoryEntryQuantitySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        InventoryEntryQuantitySetMessagePayloadImpl instance = new InventoryEntryQuantitySetMessagePayloadImpl();
        instance.setOldQuantityOnStock(template.getOldQuantityOnStock());
        instance.setNewQuantityOnStock(template.getNewQuantityOnStock());
        instance.setOldAvailableQuantity(template.getOldAvailableQuantity());
        instance.setNewAvailableQuantity(template.getNewAvailableQuantity());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryQuantitySetMessagePayload
     * @return builder
     */
    public static InventoryEntryQuantitySetMessagePayloadBuilder builder() {
        return InventoryEntryQuantitySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for InventoryEntryQuantitySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryQuantitySetMessagePayloadBuilder builder(
            final InventoryEntryQuantitySetMessagePayload template) {
        return InventoryEntryQuantitySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryQuantitySetMessagePayload(
            Function<InventoryEntryQuantitySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryQuantitySetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryQuantitySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryQuantitySetMessagePayload>";
            }
        };
    }
}
