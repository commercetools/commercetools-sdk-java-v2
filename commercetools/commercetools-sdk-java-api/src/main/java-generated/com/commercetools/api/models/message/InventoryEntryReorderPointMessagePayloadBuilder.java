
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryReorderPointMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryReorderPointMessagePayload inventoryEntryReorderPointMessagePayload = InventoryEntryReorderPointMessagePayload.builder()
 *             .sku("{sku}")
 *             .quantityOnStock(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryReorderPointMessagePayloadBuilder
        implements Builder<InventoryEntryReorderPointMessagePayload> {

    private String sku;

    private Integer quantityOnStock;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> reached the configured reorder point level.</p>
     * @param sku value to be set
     * @return Builder
     */

    public InventoryEntryReorderPointMessagePayloadBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> at the time the reorder point level was reached.</p>
     * @param quantityOnStock value to be set
     * @return Builder
     */

    public InventoryEntryReorderPointMessagePayloadBuilder quantityOnStock(final Integer quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured reorder point level.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryReorderPointMessagePayloadBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured reorder point level.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryReorderPointMessagePayloadBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured reorder point level.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public InventoryEntryReorderPointMessagePayloadBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> reached the configured reorder point level.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> at the time the reorder point level was reached.</p>
     * @return quantityOnStock
     */

    public Integer getQuantityOnStock() {
        return this.quantityOnStock;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured reorder point level.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds InventoryEntryReorderPointMessagePayload with checking for non-null required values
     * @return InventoryEntryReorderPointMessagePayload
     */
    public InventoryEntryReorderPointMessagePayload build() {
        Objects.requireNonNull(sku, InventoryEntryReorderPointMessagePayload.class + ": sku is missing");
        Objects.requireNonNull(quantityOnStock,
            InventoryEntryReorderPointMessagePayload.class + ": quantityOnStock is missing");
        return new InventoryEntryReorderPointMessagePayloadImpl(sku, quantityOnStock, supplyChannel);
    }

    /**
     * builds InventoryEntryReorderPointMessagePayload without checking for non-null required values
     * @return InventoryEntryReorderPointMessagePayload
     */
    public InventoryEntryReorderPointMessagePayload buildUnchecked() {
        return new InventoryEntryReorderPointMessagePayloadImpl(sku, quantityOnStock, supplyChannel);
    }

    /**
     * factory method for an instance of InventoryEntryReorderPointMessagePayloadBuilder
     * @return builder
     */
    public static InventoryEntryReorderPointMessagePayloadBuilder of() {
        return new InventoryEntryReorderPointMessagePayloadBuilder();
    }

    /**
     * create builder for InventoryEntryReorderPointMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryReorderPointMessagePayloadBuilder of(
            final InventoryEntryReorderPointMessagePayload template) {
        InventoryEntryReorderPointMessagePayloadBuilder builder = new InventoryEntryReorderPointMessagePayloadBuilder();
        builder.sku = template.getSku();
        builder.quantityOnStock = template.getQuantityOnStock();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
