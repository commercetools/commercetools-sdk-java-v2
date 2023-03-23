
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
 *     InventoryEntryQuantitySetMessagePayload inventoryEntryQuantitySetMessagePayload = InventoryEntryQuantitySetMessagePayload.builder()
 *             .oldQuantityOnStock(0.3)
 *             .newQuantityOnStock(0.3)
 *             .oldAvailableQuantity(0.3)
 *             .newAvailableQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryQuantitySetMessagePayloadImpl.class)
public interface InventoryEntryQuantitySetMessagePayload extends MessagePayload {

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

    public void setOldQuantityOnStock(final Long oldQuantityOnStock);

    public void setNewQuantityOnStock(final Long newQuantityOnStock);

    public void setOldAvailableQuantity(final Long oldAvailableQuantity);

    public void setNewAvailableQuantity(final Long newAvailableQuantity);

    public void setSupplyChannel(final ChannelReference supplyChannel);

    public static InventoryEntryQuantitySetMessagePayload of() {
        return new InventoryEntryQuantitySetMessagePayloadImpl();
    }

    public static InventoryEntryQuantitySetMessagePayload of(final InventoryEntryQuantitySetMessagePayload template) {
        InventoryEntryQuantitySetMessagePayloadImpl instance = new InventoryEntryQuantitySetMessagePayloadImpl();
        instance.setOldQuantityOnStock(template.getOldQuantityOnStock());
        instance.setNewQuantityOnStock(template.getNewQuantityOnStock());
        instance.setOldAvailableQuantity(template.getOldAvailableQuantity());
        instance.setNewAvailableQuantity(template.getNewAvailableQuantity());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static InventoryEntryQuantitySetMessagePayloadBuilder builder() {
        return InventoryEntryQuantitySetMessagePayloadBuilder.of();
    }

    public static InventoryEntryQuantitySetMessagePayloadBuilder builder(
            final InventoryEntryQuantitySetMessagePayload template) {
        return InventoryEntryQuantitySetMessagePayloadBuilder.of(template);
    }

    default <T> T withInventoryEntryQuantitySetMessagePayload(
            Function<InventoryEntryQuantitySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryQuantitySetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryQuantitySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryQuantitySetMessagePayload>";
            }
        };
    }
}
