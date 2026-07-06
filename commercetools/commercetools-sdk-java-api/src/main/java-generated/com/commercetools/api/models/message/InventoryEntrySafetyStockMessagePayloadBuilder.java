
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySafetyStockMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySafetyStockMessagePayloadBuilder
        implements Builder<InventoryEntrySafetyStockMessagePayload> {

    private String sku;

    private Integer quantityOnStock;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> reached the configured safety stock level.</p>
     * @param sku value to be set
     * @return Builder
     */

    public InventoryEntrySafetyStockMessagePayloadBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> at the time the safety stock level was reached.</p>
     * @param quantityOnStock value to be set
     * @return Builder
     */

    public InventoryEntrySafetyStockMessagePayloadBuilder quantityOnStock(final Integer quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured safety stock level.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntrySafetyStockMessagePayloadBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured safety stock level.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntrySafetyStockMessagePayloadBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured safety stock level.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public InventoryEntrySafetyStockMessagePayloadBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> reached the configured safety stock level.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> at the time the safety stock level was reached.</p>
     * @return quantityOnStock
     */

    public Integer getQuantityOnStock() {
        return this.quantityOnStock;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured safety stock level.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds InventoryEntrySafetyStockMessagePayload with checking for non-null required values
     * @return InventoryEntrySafetyStockMessagePayload
     */
    public InventoryEntrySafetyStockMessagePayload build() {
        Objects.requireNonNull(sku, InventoryEntrySafetyStockMessagePayload.class + ": sku is missing");
        Objects.requireNonNull(quantityOnStock,
            InventoryEntrySafetyStockMessagePayload.class + ": quantityOnStock is missing");
        return new InventoryEntrySafetyStockMessagePayloadImpl(sku, quantityOnStock, supplyChannel);
    }

    /**
     * builds InventoryEntrySafetyStockMessagePayload without checking for non-null required values
     * @return InventoryEntrySafetyStockMessagePayload
     */
    public InventoryEntrySafetyStockMessagePayload buildUnchecked() {
        return new InventoryEntrySafetyStockMessagePayloadImpl(sku, quantityOnStock, supplyChannel);
    }

    /**
     * factory method for an instance of InventoryEntrySafetyStockMessagePayloadBuilder
     * @return builder
     */
    public static InventoryEntrySafetyStockMessagePayloadBuilder of() {
        return new InventoryEntrySafetyStockMessagePayloadBuilder();
    }

    /**
     * create builder for InventoryEntrySafetyStockMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySafetyStockMessagePayloadBuilder of(
            final InventoryEntrySafetyStockMessagePayload template) {
        InventoryEntrySafetyStockMessagePayloadBuilder builder = new InventoryEntrySafetyStockMessagePayloadBuilder();
        builder.sku = template.getSku();
        builder.quantityOnStock = template.getQuantityOnStock();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
