
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
 *     InventoryEntryDeletedMessagePayload inventoryEntryDeletedMessagePayload = InventoryEntryDeletedMessagePayload.builder()
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InventoryEntryDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryDeletedMessagePayloadImpl.class)
public interface InventoryEntryDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for InventoryEntryDeletedMessagePayload
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
     * @return instance of InventoryEntryDeletedMessagePayload
     */
    public static InventoryEntryDeletedMessagePayload of() {
        return new InventoryEntryDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryDeletedMessagePayload of(final InventoryEntryDeletedMessagePayload template) {
        InventoryEntryDeletedMessagePayloadImpl instance = new InventoryEntryDeletedMessagePayloadImpl();
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public InventoryEntryDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryDeletedMessagePayload deepCopy(
            @Nullable final InventoryEntryDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        InventoryEntryDeletedMessagePayloadImpl instance = new InventoryEntryDeletedMessagePayloadImpl();
        instance.setSku(template.getSku());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryDeletedMessagePayload
     * @return builder
     */
    public static InventoryEntryDeletedMessagePayloadBuilder builder() {
        return InventoryEntryDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for InventoryEntryDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryDeletedMessagePayloadBuilder builder(
            final InventoryEntryDeletedMessagePayload template) {
        return InventoryEntryDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryDeletedMessagePayload(Function<InventoryEntryDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryDeletedMessagePayload>";
            }
        };
    }
}
