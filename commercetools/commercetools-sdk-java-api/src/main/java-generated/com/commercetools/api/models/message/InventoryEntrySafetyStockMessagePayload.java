
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reaches the configured safety stock level. For more information, see <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryStockLevels" rel="nofollow">InventoryEntryStockLevels</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySafetyStockMessagePayload inventoryEntrySafetyStockMessagePayload = InventoryEntrySafetyStockMessagePayload.builder()
 *             .sku("{sku}")
 *             .quantityOnStock(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InventoryEntrySafetyStock")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySafetyStockMessagePayloadImpl.class)
public interface InventoryEntrySafetyStockMessagePayload extends MessagePayload {

    /**
     * discriminator value for InventoryEntrySafetyStockMessagePayload
     */
    String INVENTORY_ENTRY_SAFETY_STOCK = "InventoryEntrySafetyStock";

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> reached the configured safety stock level.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> at the time the safety stock level was reached.</p>
     * @return quantityOnStock
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Integer getQuantityOnStock();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured safety stock level.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> reached the configured safety stock level.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> at the time the safety stock level was reached.</p>
     * @param quantityOnStock value to be set
     */

    public void setQuantityOnStock(final Integer quantityOnStock);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured safety stock level.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelReference supplyChannel);

    /**
     * factory method
     * @return instance of InventoryEntrySafetyStockMessagePayload
     */
    public static InventoryEntrySafetyStockMessagePayload of() {
        return new InventoryEntrySafetyStockMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntrySafetyStockMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntrySafetyStockMessagePayload of(final InventoryEntrySafetyStockMessagePayload template) {
        InventoryEntrySafetyStockMessagePayloadImpl instance = new InventoryEntrySafetyStockMessagePayloadImpl();
        instance.setSku(template.getSku());
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public InventoryEntrySafetyStockMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntrySafetyStockMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntrySafetyStockMessagePayload deepCopy(
            @Nullable final InventoryEntrySafetyStockMessagePayload template) {
        if (template == null) {
            return null;
        }
        InventoryEntrySafetyStockMessagePayloadImpl instance = new InventoryEntrySafetyStockMessagePayloadImpl();
        instance.setSku(template.getSku());
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntrySafetyStockMessagePayload
     * @return builder
     */
    public static InventoryEntrySafetyStockMessagePayloadBuilder builder() {
        return InventoryEntrySafetyStockMessagePayloadBuilder.of();
    }

    /**
     * create builder for InventoryEntrySafetyStockMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySafetyStockMessagePayloadBuilder builder(
            final InventoryEntrySafetyStockMessagePayload template) {
        return InventoryEntrySafetyStockMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntrySafetyStockMessagePayload(
            Function<InventoryEntrySafetyStockMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<InventoryEntrySafetyStockMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<InventoryEntrySafetyStockMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySafetyStockMessagePayload>";
            }
        };
    }
}
