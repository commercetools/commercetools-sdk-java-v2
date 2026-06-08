
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
 *  <p>Generated after <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> goes to 0.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryOutOfStockMessagePayload inventoryEntryOutOfStockMessagePayload = InventoryEntryOutOfStockMessagePayload.builder()
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InventoryEntryOutOfStock")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryOutOfStockMessagePayloadImpl.class)
public interface InventoryEntryOutOfStockMessagePayload extends MessagePayload {

    /**
     * discriminator value for InventoryEntryOutOfStockMessagePayload
     */
    String INVENTORY_ENTRY_OUT_OF_STOCK = "InventoryEntryOutOfStock";

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> went to 0.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity on stock went to 0.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> went to 0.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity on stock went to 0.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelReference supplyChannel);

    /**
     * factory method
     * @return instance of InventoryEntryOutOfStockMessagePayload
     */
    public static InventoryEntryOutOfStockMessagePayload of() {
        return new InventoryEntryOutOfStockMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryOutOfStockMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryOutOfStockMessagePayload of(final InventoryEntryOutOfStockMessagePayload template) {
        InventoryEntryOutOfStockMessagePayloadImpl instance = new InventoryEntryOutOfStockMessagePayloadImpl();
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public InventoryEntryOutOfStockMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryOutOfStockMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryOutOfStockMessagePayload deepCopy(
            @Nullable final InventoryEntryOutOfStockMessagePayload template) {
        if (template == null) {
            return null;
        }
        InventoryEntryOutOfStockMessagePayloadImpl instance = new InventoryEntryOutOfStockMessagePayloadImpl();
        instance.setSku(template.getSku());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryOutOfStockMessagePayload
     * @return builder
     */
    public static InventoryEntryOutOfStockMessagePayloadBuilder builder() {
        return InventoryEntryOutOfStockMessagePayloadBuilder.of();
    }

    /**
     * create builder for InventoryEntryOutOfStockMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryOutOfStockMessagePayloadBuilder builder(
            final InventoryEntryOutOfStockMessagePayload template) {
        return InventoryEntryOutOfStockMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryOutOfStockMessagePayload(
            Function<InventoryEntryOutOfStockMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryOutOfStockMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryOutOfStockMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryOutOfStockMessagePayload>";
            }
        };
    }
}
